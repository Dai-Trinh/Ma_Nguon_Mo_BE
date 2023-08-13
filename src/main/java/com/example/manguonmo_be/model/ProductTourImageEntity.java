package com.example.manguonmo_be.model;


import javax.persistence.*;

@Entity
@Table(name = "tblt_product_tour_images")
public class ProductTourImageEntity extends AttributesCommon{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    public Integer productTourImageId;

    @Column(name="title", length=500, nullable=false)
    private String productTourImageTiltle;

    @Column(name = "path", length = 200)
    private String productTourImagePath;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_tour_id")
    private ProductTourEntity productTourEntity;

//    public Integer getProductTourImageId() {
//        return productTourImageId;
//    }
//
//    public void setProductTourImageId(Integer productTourImageId) {
//        this.productTourImageId = productTourImageId;
//    }

    public String getProductTourImageTiltle() {
        return productTourImageTiltle;
    }

    public void setProductTourImageTiltle(String productTourImageTiltle) {
        this.productTourImageTiltle = productTourImageTiltle;
    }

    public String getProductTourImagePath() {
        return productTourImagePath;
    }

    public void setProductTourImagePath(String productTourImagePath) {
        this.productTourImagePath = productTourImagePath;
    }

    public ProductTourEntity getProductTourEntity() {
        return productTourEntity;
    }

    public void setProductTourEntity(ProductTourEntity productTourEntity) {
        this.productTourEntity = productTourEntity;
    }
}
