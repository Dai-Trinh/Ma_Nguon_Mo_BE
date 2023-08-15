package com.example.manguonmo_be.controller.administrator;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.manguonmo_be.controller.BaseController;
import com.example.manguonmo_be.model.CategoryTourEntity;
import com.example.manguonmo_be.model.SaleOrderEntity;
import com.example.manguonmo_be.model.SystemPlanEntity;
import com.example.manguonmo_be.service.ProductTourService;
import com.example.manguonmo_be.service.SystemPlanService;
import com.example.manguonmo_be.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


//Tất cả các Controller cho Admin UI thì class phải có tiền tố Admin
//Tất cả các request mapping cho Admin UI thì phải có tiền tố /admin
@Controller
public class AdminControllerTrangChu extends BaseController {
	@Autowired
	private ProductTourService productTourService;
	@Autowired
	private SaleOrderService saleOrderService;
	@Autowired
	private SystemPlanService systemPlanService;

	@RequestMapping(value = {"/admin/index"}, method = RequestMethod.GET)
	public String test (final Model model, final HttpServletRequest request, final HttpServletResponse response)
	throws IOException{
		//đường dẫn tới file view 
		return "administrator/index";   ///WEB-INF/views/customer/grabfood.jsp;
	};
	@RequestMapping(value = {"/admin/system"}, method = RequestMethod.GET)
	public String system_plan (final Model model, final HttpServletRequest request, final HttpServletResponse response)
			throws IOException{
		//đường dẫn tới file view

		SystemPlanEntity systemPlanEntities = systemPlanService.getById(1);
		model.addAttribute("systemPlanEntities", systemPlanEntities);
		return "administrator/baiviet";   ///
	};
	@RequestMapping(value = {"/admin/system/saveOrUpdate"}, method = RequestMethod.POST)
	public String addOrUpdate_system(final Model model, final HttpServletRequest request, final HttpServletResponse response,
											@RequestParam("numberGuideModel") Integer numberGuideModel) throws IOException{
		systemPlanService.editNumberGuideModel(numberGuideModel);
		return "redirect:/admin/system";
	}

	@RequestMapping(value = {"/admin/saleOder"}, method = RequestMethod.GET)
	public String list_saleoder (final Model model, final HttpServletRequest request, final HttpServletResponse response)
			throws IOException{
		//đường dẫn tới file view

		List<SaleOrderEntity> saleOrderEntities = saleOrderService.findAll();
		model.addAttribute("saleOrderEntities", saleOrderEntities);
		return "administrator/danhsachhoadon";   ///
	};

}