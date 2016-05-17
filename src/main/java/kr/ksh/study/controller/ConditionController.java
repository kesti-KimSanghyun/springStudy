package kr.ksh.study.controller;

import kr.ksh.study.chapterThree.condition.MagicBean;
import kr.ksh.study.chapterThree.condition.MagicExistsCondition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Configuration
@Controller
public class ConditionController {
	private static final Logger logger = LoggerFactory.getLogger(ConditionController.class);
	private MagicBean magicbean;
	
	@RequestMapping("/condition")
	public String condition(){
		return "condition";
	}
	@Bean
	@Conditional(MagicExistsCondition.class)
	public MagicBean magicBean() {
		return new MagicBean();
	}
}
