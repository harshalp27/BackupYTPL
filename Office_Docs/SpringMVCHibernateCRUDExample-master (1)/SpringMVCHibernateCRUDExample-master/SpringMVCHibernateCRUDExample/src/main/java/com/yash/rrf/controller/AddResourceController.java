package com.yash.rrf.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itextpdf.text.DocumentException;
import com.yash.rrf.model.ResourceDetails;
import com.yash.rrf.service.AddResourceService;


@Controller
public class AddResourceController {
	
	@Autowired 
	AddResourceService addResourceService;
	
	@RequestMapping(value = "/addResource", method = RequestMethod.GET)
	public String showResourceForm(@ModelAttribute("resource") ResourceDetails resDetails) {	
		System.out.println("In method");
		return "addResource";
	}
	
	 
	 @RequestMapping(value = "/success", method = RequestMethod.POST)
		public String addResourceForm(@ModelAttribute("resource") ResourceDetails resDetails) {	
		 System.out.println(resDetails);
		 addResourceService.saveResourceDetails(resDetails);	
		 return "success";
		}
	
	 @RequestMapping(value = "/download", method = RequestMethod.POST)
		public String generatePdf(@ModelAttribute("resource") ResourceDetails resDetails) {	
		 //System.out.println(resDetails);
		 try {
			addResourceService.generatePdf();
		} catch (DocumentException | IOException e) {
			e.printStackTrace();
		}	
		 return "success";
		}
}
