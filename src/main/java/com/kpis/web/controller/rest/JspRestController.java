package com.kpis.web.controller.rest;

import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpis.web.test.VO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/rest")
public class JspRestController {
//	@RequestMapping("/")
	@GetMapping("/")
	public String index(Model model) {
		log.debug("#################### index jsp test");
		return "index";
	}

	@RequestMapping("/upsell")
	public String upsell(Model model
			, @RequestBody VO param
//			, VO param
//			, @RequestBody Map<String, Object> param2
			) {
		log.debug("#################### upsell jsp test");
		return "upsell";
	}

	@RequestMapping("upsell/upsell")
	public String upsell2(Model model) {
		log.debug("#################### upsell/upsell jsp test");
		return "upsell/upsell";
	}

}
