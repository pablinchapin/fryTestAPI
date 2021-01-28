package com.pc.service.info.controller;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pc.service.info.models.entity.Info;
import com.pc.service.info.models.service.InfoService;


@RestController
public class InfoController {
	
	
	@Autowired
	private InfoService infoService;
	
	
	//private static Logger log = LoggerFactory.getLogger(InfoController.class);
	
	
	@GetMapping("mostrarInfo/{query}")
	public Info mostrarInfo(@PathVariable String query) {
		
		return infoService.findByData(query);
		
	}
	
	

}
