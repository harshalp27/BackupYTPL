package org.arpit.java2blog.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//@RequestMapping("/hello")
//public class SpringRestController {
// @RequestMapping(value = "/{name}", method = RequestMethod.GET)
// public String hello(@PathVariable String name) {
//  String result="Hello "+name;  
//  return result;
// }
//}

@RestController
@RequestMapping(value ="/list")
@CrossOrigin(origins = {"http://localhost:4200"})
public class SpringRestController {
	

	 @RequestMapping(value ="/show", method = RequestMethod.GET, produces = "application/json")
	    public ResponseEntity<List<Integer>> listAllValues() {
		 HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/json");
		 //logger.info("------DesignationController Get method start------");
	        List values = new ArrayList(Arrays.asList(1,2,3,"Str"));
	        if(values.isEmpty()){
	            return new ResponseEntity<List<Integer>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
	        }
	        System.out.println(values);
	       // logger.info("------DesignationController Get method end------");
	        return new ResponseEntity<List<Integer>>(values, headers, HttpStatus.OK);
	    }
	 
}