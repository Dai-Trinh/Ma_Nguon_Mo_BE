package com.example.manguonmo_be.controller.administrator;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.manguonmo_be.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



//Tất cả các Controller cho Admin UI thì class phải có tiền tố Admin
//Tất cả các request mapping cho Admin UI thì phải có tiền tố /admin
@Controller
public class AdminControllerTrangChu extends BaseController {
	@RequestMapping(value = {"/admin/index"}, method = RequestMethod.GET)
	public String test (final Model model, final HttpServletRequest request, final HttpServletResponse response)
	throws IOException{
		//đường dẫn tới file view 
		return "administrator/index";   ///WEB-INF/views/customer/grabfood.jsp;
	};
	
}