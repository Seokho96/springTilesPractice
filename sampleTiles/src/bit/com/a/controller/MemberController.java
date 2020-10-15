package bit.com.a.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bit.com.a.dto.MemberDto;
import bit.com.a.service.MemberService;

@Controller
public class MemberController {
	
	Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "login.com", method = RequestMethod.GET)
	public String loginView() {    // (외부로부터 들어오는 값(object, string), Model, HttpServletRequest)
		logger.info(" loginView " + new Date());
		
		return "login.tiles";
	}
	
	@RequestMapping(value = "logout.com", method = RequestMethod.GET)
	public String logout( HttpServletRequest req ) {    // (외부로부터 들어오는 값(object, string), Model, HttpServletRequest)
		logger.info(" logout " + new Date());
		req.getSession().removeAttribute("login");
		  	
		return "redirect:/login.com";
	}
	
	@RequestMapping(value = "loginAf.com", method = RequestMethod.POST)
	public String login(MemberDto dto, HttpServletRequest req) throws Exception {   
		logger.info(" login " + new Date());
		MemberDto rdto = memberService.loginMember(dto);
		if(rdto != null && !rdto.getId().equals("")) {
			logger.info("login success");
			req.getSession().setAttribute("login", rdto);
			//req.getSession().setMaxInactiveInterval(60 * 60);
		}
		return "login.tiles";
	}
	
	@RequestMapping(value = "regi.com", method = RequestMethod.GET)
	public String regiView() {    
		logger.info(" regiView " + new Date());
		
		return "regi.tiles";
	}
	
	@RequestMapping(value = "regiAf.com", method = RequestMethod.POST)
	public String regi( MemberDto dto ) throws Exception{    
		logger.info(" regiView " + new Date());
		
		boolean b = memberService.addMember(dto); 
		if(b) {
			logger.info("회원가입되었습니다");
			return "login.tiles";
			
		}
		logger.info("가입실패");
		return "regi.tiles";
	}
	

}
