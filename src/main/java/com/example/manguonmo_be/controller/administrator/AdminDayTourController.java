package com.example.manguonmo_be.controller.administrator;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.manguonmo_be.controller.BaseController;
import com.example.manguonmo_be.model.DayEntity;
import com.example.manguonmo_be.service.DayTourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class AdminDayTourController extends BaseController {
//	@Autowired
//	private ProductTour productTour;
	@Autowired
	private DayTourService dayTourService;
	
	
	@RequestMapping(value= {"/admin/adddaytour"}, method= RequestMethod.GET)
	public String add_day_tour(final Model model, final HttpServletRequest request, final HttpServletResponse response, @PathVariable("productTourId") Integer id) throws IOException {
		
		List<DayEntity> dayTour = dayTourService.getEntitiesByNativeSQL("SELECT * FROM tbl_day p where product_tour_id = "+id);
		model.addAttribute("dayTour", dayTour);
		return "administrator/themlichtrinh";
	}
	@RequestMapping(value = {"/admin/adddaytour/saveOrUpdate"}, method = RequestMethod.POST)
	public String addOrUpdate_category_tour(final Model model, final HttpServletRequest request, final HttpServletResponse response,
											@ModelAttribute("daytour") DayEntity dayTour ) throws IOException{
		if(dayTour.getId() == null || dayTour.getId() <=0) {
			dayTourService.addDayTour(dayTour);		
		}else {
			dayTourService.editDayTour(dayTour);
		}	
		return "redirect:/admin/adddaytour";
	}

}
