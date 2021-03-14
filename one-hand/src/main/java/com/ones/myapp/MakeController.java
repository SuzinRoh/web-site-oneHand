package com.ones.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("Make")
public class MakeController {
	private static final Logger log =
			LoggerFactory.getLogger(MakeController.class);
	
	
	@RequestMapping("making_page")
	public void makingPage() {
		log.info("making page");
	}
}
