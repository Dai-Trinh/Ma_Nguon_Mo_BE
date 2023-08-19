package com.example.manguonmo_be.service;


import com.example.manguonmo_be.model.CategoryTourEntity;
import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.model.ProductTourImageEntity;
import com.example.manguonmo_be.model.QProductTourEntity;
import com.example.manguonmo_be.repository.ProductTourImageRepository;
import com.example.manguonmo_be.repository.ProductTourRepository;
import com.example.manguonmo_be.service.dto.ProductTourDTO;
import com.example.manguonmo_be.service.dto.ProductTourImageDTO;
import com.example.manguonmo_be.service.input.PageInput;
import com.example.manguonmo_be.service.mapper.ProductTourImageMapper;
import com.example.manguonmo_be.service.mapper.ProductTourMapper;
import com.example.manguonmo_be.service.respone.CommonResponse;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductTourService extends BaseService<ProductTourEntity> {

    @Autowired
    ProductTourRepository productTourRepository;
    @Autowired
    private ProductTourImagesService productTourImagesService;

    @Autowired
    ProductTourImageRepository productTourImageRepository;

    @Override
    protected Class<ProductTourEntity> clazz() {
        return ProductTourEntity.class;
    }

    @PersistenceContext
    EntityManager entityManager;


    public CommonResponse getAllProductTour(PageInput<ProductTourDTO> input){
        Pageable pageable = Pageable.unpaged();

        List<ProductTourDTO> productTourDTOList = new ArrayList<>();

        if(input.getPageSize() != 0){
            pageable = PageRequest.of(input.getPageNumber(), input.getPageSize());
        }

        QProductTourEntity qProductTourEntity = QProductTourEntity.productTourEntity;

        JPAQuery query = new JPAQueryFactory(entityManager)
                .selectFrom(qProductTourEntity);

        BooleanBuilder booleanBuilder = new BooleanBuilder();
        booleanBuilder.and(qProductTourEntity.status.eq(true));
        ProductTourDTO productTourDTO = input.getFilter();

        if(!StringUtils.isEmpty(productTourDTO.getProductTourName())){
            booleanBuilder.and(qProductTourEntity.productTourName.containsIgnoreCase(productTourDTO.getProductTourName()));
        }
        if(!StringUtils.isEmpty(productTourDTO.getCategoryTourDTO())){
            booleanBuilder.and(qProductTourEntity.categoryTourEntity.categoryTourName.eq(productTourDTO.getCategoryTourDTO()));
        }

        if(!StringUtils.isEmpty(productTourDTO.getProductTourCode())){
            booleanBuilder.and(qProductTourEntity.productTourCode.eq(productTourDTO.getProductTourCode()));
        }

        query.where(booleanBuilder);

        List<ProductTourEntity> productTourEntities = query.fetch();
        long count = query.fetchCount();

        Page<ProductTourEntity> productTourEntityPage = new PageImpl<>(productTourEntities, pageable, count);

        for (ProductTourEntity productTourEntity : productTourEntityPage.getContent()){
            List<ProductTourImageDTO> productTourImageDTOS = new ArrayList<>();
            for (ProductTourImageEntity productTourImageEntity : productTourImageRepository.getProductTourImageEntitiesByIdProductTour(productTourEntity.getId())){
                productTourImageDTOS.add(ProductTourImageMapper.INSTANCE.convertToDTO(productTourImageEntity));
            }
            ProductTourDTO productTourDTO1 = ProductTourMapper.INSTANCE.convertToDTO(productTourEntity);
            productTourDTO1.setCategoryTourDTO(productTourEntity.getCategoryTourEntity().getCategoryTourName());
            Set<ProductTourImageDTO> productTourImageDTOSet = new HashSet<>(productTourImageDTOS);
            productTourDTO1.setProductTourImageDTOS(productTourImageDTOSet);
            productTourDTOList.add(productTourDTO1);
        }

        return new CommonResponse().success()
                .data(productTourDTOList)
                .dataCount(productTourEntityPage.getTotalElements());

    }

    //	dùng để kiểm tra xem admin có upload ảnh product hay không
    private boolean isEmptyUploadFile(MultipartFile[] images) {
        if(images == null || images.length <= 0) {
            return true;
        }
        if(images.length == 1 && images[0].getOriginalFilename().isEmpty()) {
            return true;
        }
        return false;
    }
    //
    private boolean isEmptyUploadFile(MultipartFile image) {
        return image == null || image.getOriginalFilename().isEmpty();
    }
    //tạo tên file upload
    private String getUniqueUploadFileName(String fileName) {
        String[] splitFileName = fileName.split("\\.");
        return splitFileName[0]  + System.currentTimeMillis() + "."+ splitFileName[1];
    }


    //thêm mới sản phẩm
    @Transactional
    public ProductTourEntity addProduct(ProductTourEntity productTour, MultipartFile productAvatar, MultipartFile[] productPictures) throws IllegalStateException, IOException, IOException {
        //kiểm tra xem admin có đẩy avatar lên không ???
        if(!isEmptyUploadFile(productAvatar)) {
            String fileName = getUniqueUploadFileName(productAvatar.getOriginalFilename());
            //tạo đường dẫn tới file chứa avatar
            String pathToAvatar = "D:/Computer/Pictures-admin/upload/productTour/avatar/" + fileName;

            //luu avatar vào đường dẫn trên
            productAvatar.transferTo(new File(pathToAvatar));

            productTour.setProductTourAvatar("productTour/avatar/"+fileName);
        }
        if(!isEmptyUploadFile(productPictures)) {
            for(MultipartFile pic : productPictures) {
                String fileName = getUniqueUploadFileName(pic.getOriginalFilename());
                //lưu ảnh admin đẩy lên server
                pic.transferTo(new File("D:/Computer/Pictures-admin/upload/productTour/pictures/" + fileName));

                //tạo mới 1 bản ghi
                ProductTourImageEntity productTourImages = new ProductTourImageEntity();
                productTourImages.setProductTourImagePath("productTour/pictures/"+fileName);
                productTourImages.setProductTourImageTiltle(fileName);

                productTour.addProductTourImages(productTourImages);
            }
        }
        //tạo seo: bổ sung thêm thời gian tính bằng miliseconds để tránh trùng seo
//        Slugify slugify = new Slugify();
//        productTour.setSeo(slugify.slugify(productTour.getName()+"-"+System.currentTimeMillis()));
        //lưu vào database
        return super.saveOrUpdate(productTour);
    }


    //chỉnh sửa sản phẩm
    @Transactional
    public ProductTourEntity editProduct(ProductTourEntity productTour,MultipartFile productAvatar, MultipartFile[] productPictures) throws IllegalStateException, IOException{
        //lấy thông tin cũ của product theo id
        ProductTourEntity productTourInDb = super.getById(productTour.getId());

        //có đẩy lại avatar thì ta cần xóa avatar cũ thêm avatar mới
        if(!isEmptyUploadFile(productAvatar)) {
            //xóa avatar trong folder
            new File("D:/Computer/Pictures-admin/upload/"+productTourInDb.getProductTourAvatar()).delete();

            //update avatar mới
            String fileName = getUniqueUploadFileName(productAvatar.getOriginalFilename());
            //khi update thì ta phải lưu vào trong ổ cứng đã
            productAvatar.transferTo(new File("D:/Computer/Pictures-admin/upload/productTour/avatar/"+fileName));
            //sau đó thiết lập đường dẫn mới cho file ảnh mới
            productTour.setProductTourAvatar("productTour/avatar/"+fileName);
        }else {
            //sử dụng lại avatar cũ
            productTour.setProductTourAvatar(productTourInDb.getProductTourAvatar());
        }

        //có đẩy lai pictures
        if(!isEmptyUploadFile(productPictures)) {
            // xóa pictures cũ
            if (productTourInDb.getProductTourImageEntitySet() != null && productTourInDb.getProductTourImageEntitySet().size() > 0) {
                for (ProductTourImageEntity opi : productTourInDb.getProductTourImageEntitySet()) {
                    // xóa avatar trong folder lên
                    new File("D:/Computer/Pictures-admin/upload/" + opi.getProductTourImagePath()).delete();

                    // xóa dữ liệu trong database
                    productTourImagesService.delete(opi);
                }
            }

            // update pictures mới
            for (MultipartFile pic : productPictures) {
                String fileName = getUniqueUploadFileName(pic.getOriginalFilename());

                pic.transferTo(new File("D:/Computer/Pictures-admin/upload/productTour/pictures/" + fileName));

                ProductTourImageEntity pi = new ProductTourImageEntity();
                pi.setProductTourImagePath("product/pictures/" + fileName);
                pi.setProductTourImageTiltle(fileName);

                productTour.addProductTourImages(pi);
            }
        }
        //tạo seo
//        Slugify slugify = new Slugify();
//        productTour.setSeo(slugify.slugify(productTour.getName() + "-" + System.currentTimeMillis()));

        return super.saveOrUpdate(productTour);
    }
//    public PagerData<ProductTour> searchProduct(ProductSearch searchModel) {
//        // khởi tạo câu lệnh
//        String sql = "SELECT * FROM tbl_product_tour p WHERE 1=1";
//
//        if (searchModel != null) {
//
//            // tìm kiếm theo category
//            if(searchModel.getCategoryId() != null && !"0".equals(searchModel.getCategoryId())) {
//                sql += " and category_id = " + searchModel.getCategoryId();
//            }
//
//
//            // tìm kiếm theo title và description
//            if (!StringUtils.isEmpty(searchModel.getKeyword())) {
//                sql += " and (p.name like '%" + searchModel.getKeyword() + "%'" +
//                        " or p.code like '%" + searchModel.getKeyword() + "%'" +
//                        " or p.name_detail like '%" + searchModel.getKeyword() + "%')";
//            }
//            // tìm kiếm theo seo
//            if(!StringUtils.isEmpty(searchModel.getSeo())) {
//                sql += " and seo = '" + searchModel.getSeo() + "'";
//            }
//        }
//
//        return getEntitiesByNativeSQL(sql, searchModel.getPage());
//    }

}
