package com.xworkz.press.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.press.dto.PressOrderDTO;
import com.xworkz.press.service.PressOrderService;

@Component
@RequestMapping("/")
public class PressOrderComponent {

	@Autowired
	private PressOrderService pressOrderService;
	public PressOrderComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	// @RequestMapping(value="/order.do",method = RequestMethod.POST) in older versions
	@PostMapping("/order.do")
	public String onOrder(PressOrderDTO dto, Model model) {
		System.out.println("Invoked onOrder in PressOrderComponent" + dto);

		boolean saved = this.pressOrderService.validateAndSave(dto);
		if (saved) {
			System.out.println("Data saved successfully, will navigate to order success");
			model.addAttribute("message1", "Order Successfull!!");
			model.addAttribute("dto", dto);
			return "OrderSuccess";
			}
			else {
			System.out.println("Data could not be saved, will navigate to Order Page");
			model.addAttribute("message2", "Order Failed, please try again!!");
			return "PressOrder";
			}

	}
	@GetMapping("/search.do")
	public String onSearchByOrderFrom(PressOrderDTO pressOrderdto,String orderFrom, Model model) {
		System.out.println("From is here "+orderFrom);
		System.out.println("Invoked onSearchByOrderFrom in PressOrderComponent");
		PressOrderDTO dto = pressOrderService.validateAndSearchByOrderFrom(orderFrom);
		if (dto!= null) {
			model.addAttribute("dto", dto);
			System.out.println("Printing dto "+dto);
			model.addAttribute("msg", "Search record found!");
			model.addAttribute("mssg", "The details of the record are retrieved below:");
		} else {
			model.addAttribute("noRecordsFoundmessage", "No Records Found!!");
		}
		return "OrderSearch";
	}
	@GetMapping("/displayAll.do")
	public String onSearchByDisplayAll(PressOrderDTO pressOrderdto, Model model) {
		System.out.println("Invoked onSearchByDisplayAll in PressOrderComponent");
		List<PressOrderDTO> Listdto = pressOrderService.validateAndSearchByDisplayAll();
		if (Listdto!= null) {
			model.addAttribute("Listdto", Listdto);
			System.out.println("Printing dto "+Listdto);
			model.addAttribute("displayAllMsg", "The details of all the records are retrieved below:");
			return "DisplayAll";
		} else {
			model.addAttribute("noRecordsFoundmsg", "No Records Found!!");
		}
		return "PressOrder";
	}
}
