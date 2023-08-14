package com.example.manguonmo_be.controller.administrator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.manguonmo_be.controller.BaseController;
import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.model.SaleOrderEntity;
import com.example.manguonmo_be.service.ProductTourService;
import com.example.manguonmo_be.service.respone.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



//Tất cả các Controller cho Admin UI thì class phải có tiền tố Admin
//Tất cả các request mapping cho Admin UI thì phải có tiền tố /admin
@Controller
public class AdminControllerTrangChu extends BaseController {
	@Autowired
	private ProductTourService productTourService;
	@Autowired
	private SaleOrderService saleOrderService;

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
		List<ProductTourEntity> listProductTourEntities = productTourService.findAll();
		int numberProductTour = listProductTourEntities.size();
		request.setAttribute("numberProductTour", numberProductTour);

		List<SaleOrderEntity> listSaleOrderEntities = saleOrderService.findAll();
		int numberSaleOrder = listSaleOrderEntities.size();
		request.setAttribute("numberSaleOrder", numberSaleOrder);
		return "administrator/baiviet";   ///
	};
}