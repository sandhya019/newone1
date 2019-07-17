package com.cg.main.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.entity.Inputs;
import com.cg.main.service.InputImpl;
import com.cg.ship.xml.AddressType;

@RestController
public class MainController {
	
	
	@Autowired
	InputImpl inputImpl;
	
	@RequestMapping(value = "/input", method = RequestMethod.POST)
	@ResponseBody 
	
	public Inputs addInputs( @RequestBody Inputs input,AddressType address) throws JsonGenerationException, JsonMappingException, IOException {
	return inputImpl.createInputs(input);
//		
	}

  
  }
 
