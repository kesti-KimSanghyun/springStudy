package kr.ksh.study.controller;

import kr.ksh.study.chapterThree.runTime.ExpressiveConfig;
import kr.ksh.study.chapterThree.runTime.SpEL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RunTimeController {
	private static final Logger logger = LoggerFactory.getLogger(RunTimeController.class);
	
	@Autowired private ExpressiveConfig expressiveConfig;
	@Autowired private SpEL spel;
	
	@RequestMapping("/runtime")
	public String runtime(){
		logger.info(expressiveConfig.getTitle());
		return "runtime";
	}
	@RequestMapping("/spel")
	public String spel(){
		logger.info(spel.getTitle());
		return "runtime";
	}
}
