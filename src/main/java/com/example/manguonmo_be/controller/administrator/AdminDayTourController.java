package com.example.manguonmo_be.controller.administrator;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.manguonmo_be.controller.BaseController;
import com.example.manguonmo_be.model.DayEntity;
import com.example.manguonmo_be.model.ProductTourEntity;
import com.example.manguonmo_be.service.DayTourService;
import com.example.manguonmo_be.service.ProductTourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class AdminDayTourController extends BaseController {
//	@Autowired
//	private ProductTour productTour;
	@Autowired
	private DayTourService dayTourService;
	@Autowired
	private ProductTourService productTourService;

	@RequestMapping(value= {"/admin/adddaytour/{productTourId}"}, method= RequestMethod.GET)
	public String add_day_tour_id(final Model model, final HttpServletRequest request, final HttpServletResponse response, @PathVariable("productTourId") Integer productTourId) throws IOException {

		DayEntity dayTourSave = new DayEntity();
		model.addAttribute("dayTourSave", dayTourSave);

		request.setAttribute("productTourId", productTourId);

		List<DayEntity> dayTour = dayTourService.getEntitiesByNativeSQL("SELECT * FROM tbl_day p where product_tour_id = "+productTourId);
		model.addAttribute("dayTour", dayTour);
		return "administrator/themlichtrinh";
	}
	@RequestMapping(value = { "/admin/daytour/delete" }, method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> delete_daytour(final Model model,
																  final HttpServletRequest request,
																  final HttpServletResponse response,
																  final @RequestBody DayEntity dayTour) {
		DayEntity dayTourInDb = dayTourService.getById(dayTour.getId());
		dayTourInDb.setStatus(false);
		dayTourService.saveOrUpdate(dayTourInDb);

		Map<String, Object> jsonResult = new HashMap<String, Object>();
		jsonResult.put("code", 200);
		jsonResult.put("message", "Đã xóa thành công!");
		return ResponseEntity.ok(jsonResult);
	}
	@RequestMapping(value = {"/admin/adddaytour/saveOrUpdate"}, method = RequestMethod.POST)
	public String addOrUpdate_category_tour(final Model model, final HttpServletRequest request, final HttpServletResponse response,
											@ModelAttribute("dayTourSave") DayEntity dayTourSave) throws IOException{
		if(dayTourSave.getId() == null || dayTourSave.getId() <=0) {
			dayTourService.addDayTour(dayTourSave);
		}else {
			dayTourService.editDayTour(dayTourSave);
		}
		int productTourId = dayTourSave.getProductTourEntityDay().getId();
		return "redirect:/admin/adddaytour/"+productTourId;
	}
	@RequestMapping(value= {"/admin/adddaytour/{productTourId}/{dayTourId}"}, method = RequestMethod.GET)
	public String update_adddaytour_save(final Model model, final HttpServletRequest request, final HttpServletResponse response,
										  @PathVariable("productTourId") Integer productTourId,
										  @PathVariable("dayTourId") Integer dayTourId) {
		DayEntity dayTourSave = dayTourService.getById(dayTourId);
		model.addAttribute("dayTourSave", dayTourSave);
		request.setAttribute("productTourId", productTourId);
		return "administrator/themlichtrinh";
	}

}
