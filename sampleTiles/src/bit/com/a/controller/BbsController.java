package bit.com.a.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import bit.com.a.dto.BbsDto;
import bit.com.a.dto.BbsParam;
import bit.com.a.service.BbsService;

@Controller
public class BbsController {

	@Autowired
	BbsService bbsService;
	
	private static Logger logger = LoggerFactory.getLogger(BbsController.class);
	
	@RequestMapping(value = "bbslist.com", method = RequestMethod.GET)
	public String bbslist (Model model, BbsParam search) throws Exception {
		
        logger.info(" BbsListView " + new Date());
		
		List<BbsDto> list = bbsService.BbsList(search);
		// logger.info(search.getS_category());
		model.addAttribute("list", list); 
		
		return "bbslist.tiles";
	}
	
	@RequestMapping(value = "bbsDetail.com", method = RequestMethod.GET)
	public String bbsDetail (Model model, int seq) throws Exception {
		
        logger.info(" bbsDetail " + new Date());
		
		BbsDto bbsDetail = bbsService.BbsDetail(seq);
		// logger.info(search.getS_category());
		model.addAttribute("bbsDetail", bbsDetail); 
		
		return "bbsdetail.tiles";
	}
	
	@RequestMapping(value = "bbsWrite.com", method = RequestMethod.GET)
	public String bbsWriteView () throws Exception {
		
        logger.info(" bbsWriteView " + new Date());
		
		return "bbswrite.tiles";
	}
	
	@ResponseBody
	@RequestMapping(value = "bbsWrite.com", method = RequestMethod.POST)
	public String bbsWrite (BbsDto dto) throws Exception {
		
        logger.info(" bbsWrite " + new Date());
        
        boolean isS = bbsService.BbsWrite(dto);
      
        String a = null;
        if(isS) {
        	a = "yes";
        }else {
        	a= "no";
        }
        System.out.println(a);
        Gson gson = new Gson();
        
		return gson.toJson(a);
	}
	
	@RequestMapping(value = "bbsUpdate.com", method = RequestMethod.GET)
	public String bbsUpdateView( Model model, int seq) throws Exception {
		
        logger.info(" bbsUpdateView " + new Date());
		
        BbsDto bbsDetail = bbsService.BbsDetail(seq);
		
		model.addAttribute("bbsDetail", bbsDetail); 
        
		return "bbsupdate.tiles";
	}
	
	@RequestMapping(value = "bbsUpdate.com", method = RequestMethod.POST)
	public String bbsUpdate(BbsDto dto) throws Exception {
		
        logger.info(" bbsUpdate " + new Date());
		System.out.println(dto.getTitle());
        bbsService.BbsUpdate(dto);
        
		return "redirect:/bbslist.com";
	}
	
	@RequestMapping(value = "bbsDelete.com", method = RequestMethod.POST)
	public String bbsDelete(int seq) throws Exception {
		
        logger.info(" bbsDelete " + new Date());
	
        bbsService.BbsDelete(seq);
        
		return "redirect:/bbslist.com";
	}
}























