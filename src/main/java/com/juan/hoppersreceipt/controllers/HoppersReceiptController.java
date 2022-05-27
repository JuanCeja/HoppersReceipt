package com.juan.hoppersreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HoppersReceiptController {
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("customerName", "Grace Hopper");
		model.addAttribute("itemName", "Copper wire");
		model.addAttribute("price", "5.25");
		model.addAttribute("description", "Metal strips. Also an illustration of nanoseconds");
		model.addAttribute("vendor", "Little Things Corner Store");
		return "index.jsp";
	}
}
