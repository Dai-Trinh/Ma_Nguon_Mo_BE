package com.example.manguonmo_be.controller.administrator;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.manguonmo_be.controller.BaseController;
import com.example.manguonmo_be.model.CategoryTourEntity;
import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.model.SystemPlanEntity;
import com.example.manguonmo_be.service.CategoryTourService;
import com.example.manguonmo_be.service.ProductTourService;
import com.example.manguonmo_be.service.SystemPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class AdminProductTourController extends BaseController {
	@Autowired
	private CategoryTourService categoryTourService;
	@Autowired
	private ProductTourService productTourService;
	@Autowired
	private SystemPlanService systemPlanService;
	
	@RequestMapping(value = {"/admin/categorytour"}, method = RequestMethod.GET)
	public String list_category_tour(final Model model, final HttpServletRequest request, final HttpServletResponse response) throws IOException{
		
		List<CategoryTourEntity> categoryTour = categoryTourService.findAll();
		model.addAttribute("categoryTour", categoryTour);
		
		return "administrator/danhmuc";
	}
	@RequestMapping(value = { "/admin/categorytour/delete" }, method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> delete_product(final Model model, 
																	   final HttpServletRequest request,
																   	   final HttpServletResponse response, 
																   	   final @RequestBody CategoryTourEntity categoryTour) {
		CategoryTourEntity categoryTourInDb = categoryTourService.getById(categoryTour.getId());
		categoryTourInDb.setStatus(false);
		categoryTourService.saveOrUpdate(categoryTourInDb);
		
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		jsonResult.put("code", 200);
		jsonResult.put("message", "Đã xóa thành công!");
		return ResponseEntity.ok(jsonResult);
	}
	
	
	@RequestMapping(value = {"/admin/addcategorytour"}, method = RequestMethod.GET)
	public String add_category_tour(final Model model, final HttpServletRequest request, final HttpServletResponse response) throws IOException{
		CategoryTourEntity newCategoryTour = new CategoryTourEntity();
		model.addAttribute("categoryTour", newCategoryTour);
		return "administrator/themdanhmuc";
	}
	@RequestMapping(value = {"/admin/addcategorytour/saveOrUpdate"}, method = RequestMethod.POST)
	public String addOrUpdate_category_tour(final Model model, final HttpServletRequest request, final HttpServletResponse response,
											@ModelAttribute("categoryTour") CategoryTourEntity categoryTour,
											@RequestParam("categoryTourAvatarRq") MultipartFile categoryTourAvatarRq) throws IOException{
		if(categoryTour.getId() == null || categoryTour.getId() <=0) {
			categoryTourService.addCategoryTour(categoryTour, categoryTourAvatarRq);
		}else {
			categoryTourService.editCategoryTour(categoryTour, categoryTourAvatarRq);
		}	
		return "redirect:/admin/categorytour";
	}
	@RequestMapping(value= {"/amdin/addcategorytour/{categoryTourId}"}, method = RequestMethod.GET)
	public String getId_categoryTour(final Model model, final HttpServletRequest request, final HttpServletResponse response,
									@PathVariable("categoryTourId") Integer categoryTourId) {
		CategoryTourEntity categoryTour = categoryTourService.getById(categoryTourId);
		model.addAttribute("categoryTour", categoryTour);
		return "administrator/themdanhmuc";
	}
	
	
	
	
	
	
	
	//--------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(value = {"/admin/producttour"}, method = RequestMethod.GET)
	public String list_product_tour(final Model model, final HttpServletRequest request, final HttpServletResponse response) throws IOException{
		
		List<ProductTourEntity> productTour = productTourService.findAll();
		model.addAttribute("productTour", productTour);
		
		return "administrator/sanpham";
	}
	@RequestMapping(value = { "/admin/producttour/delete" }, method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> delete_producttour(final Model model, 
																	   final HttpServletRequest request,
																   	   final HttpServletResponse response, 
																   	   final @RequestBody ProductTourEntity producttour) {
		ProductTourEntity productTourInDb = productTourService.getById(producttour.getId());
		productTourInDb.setStatus(false);
		productTourService.saveOrUpdate(productTourInDb);
		
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		jsonResult.put("code", 200);
		jsonResult.put("message", "Đã xóa thành công!");
		return ResponseEntity.ok(jsonResult);
	}
	@RequestMapping(value = {"/admin/addproducttour"}, method = RequestMethod.GET)
	public String add_producttour_get(final Model model, final HttpServletRequest request, final HttpServletResponse response) {
		ProductTourEntity productTour = new ProductTourEntity();
		model.addAttribute("productTour", productTour);
		return "administrator/themsanpham";
	}
	@RequestMapping(value = {"/admin/addproducttour/saveOrUpdate"}, method = RequestMethod.POST)
	public String add_producttour_save(final Model model, final HttpServletRequest request, final HttpServletResponse response,
									   @ModelAttribute("productTour") ProductTourEntity productTour,
										@RequestParam("productTourAvatarRq") MultipartFile productTourAvatarRq,
										@RequestParam("productTourImageEntitySetRq") MultipartFile[] productTourImageEntitySetRq) throws IllegalStateException, IOException {
		if(productTour.getId() == null || productTour.getId() <= 0) {
			productTourService.addProduct(productTour, productTourAvatarRq, productTourImageEntitySetRq);
			systemPlanService.editNumberTourModel();
		}else {
			productTourService.editProduct(productTour, productTourAvatarRq, productTourImageEntitySetRq);
		}
		return "redirect:/admin/producttour";
	}
	@RequestMapping(value= {"/admin/addproducttour/{productTourId}"}, method = RequestMethod.GET)
	public String update_producttour_save(final Model model, final HttpServletRequest request, final HttpServletResponse response,
											@PathVariable("productTourId") Integer productTourId) {
		ProductTourEntity productTour = productTourService.getById(productTourId);
		model.addAttribute("productTour", productTour);
		return "administrator/themsanpham";
	}
	
	
}
