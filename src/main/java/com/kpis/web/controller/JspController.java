package com.kpis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class JspController {

//	@RequestMapping("/")
	@GetMapping("/")
	public String index(Model model) {
		log.debug("#################### index jsp test");
		return "index";
	}

	@RequestMapping("/upsell")
	public String upsell(Model model) {
		log.debug("#################### upsell jsp test");
		return "upsell";
	}

	@RequestMapping("upsell/upsell")
	public String upsell2(Model model) {
		log.debug("#################### upsell/upsell jsp test");
		return "upsell/upsell";
	}

}
