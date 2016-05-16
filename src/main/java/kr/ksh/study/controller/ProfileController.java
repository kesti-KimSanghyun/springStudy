package kr.ksh.study.controller;

import kr.ksh.study.chapterThree.profile.ProfileTestBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ConfigurableWebApplicationContext;

@Controller
public class ProfileController {
	@Autowired ConfigurableWebApplicationContext subContext;
	@Autowired private ProfileTestBean profileTestBean;
	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);
	
	@Autowired private Environment env;
	/**
	 * 현재 profile 보기
	 * @param model
	 */
	@RequestMapping("/profile")
	public void profile(Model model){
		logger.debug(profileTestBean.getRootPath());
		model.addAttribute("currentProfile", currentProfile());
		model.addAttribute("rootPath", profileTestBean.getRootPath());
	}
	
	/**
	 * 현재 프로파일 가져오기
	 * @return
	 */
	private String currentProfile(){
		String[] profiles = subContext.getEnvironment().getActiveProfiles();
		if( profiles.length==0 ){
			profiles = subContext.getEnvironment().getDefaultProfiles();
		}
		return profiles[0];
	}
}
