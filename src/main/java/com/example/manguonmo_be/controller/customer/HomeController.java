package com.devpro.SkyTour.controller.customer;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devpro.SkyTour.controller.BaseController;

@Controller
public class HomeController extends BaseController{
	@RequestMapping(value = {"/skytour"}, method = RequestMethod.GET)
	public String display_danhmuc(final Model model, final HttpServletRequest request, final HttpServletResponse response)
	throws IOException{
		//đường dẫn tới file view 
		return "customer/index";   ///WEB-INF/views/customer/grabfood.jsp;
	};
	
}
