package kr.ksh.study.controller;

import kr.ksh.study.chapterThree.condition.MagicConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConditionController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/condition")
	public String condition(){
		logger.info("condition");		
		return "condition";
	}
}
