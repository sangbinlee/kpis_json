package com.kpis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ThymeleafController {

	@RequestMapping("/upsell/upsell.html")
	public String welcome(Model model) throws Exception {
		log.debug("#################### thymeleaf test");
	    model.addAttribute("greeting", "Hello Thymeleaf!");
//	    return "thymeleaf/upsell";
	    return "thymeleaf/upsell/upsell";
	}
	@RequestMapping("/upsell.html")
	public String upsell(Model model) throws Exception {
		log.debug("#################### thymeleaf test");
		model.addAttribute("greeting", "Hello Thymeleaf!");
	    return "thymeleaf/upsell";
//		return "thymeleaf/upsell/upsell";
	}
}
