package com.cg.main.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.main.entity.Inputs;
import com.cg.ship.xml.AddressType;

@Service

public class InputImpl {	
		
	
	public Inputs createInputs(@RequestBody Inputs input) throws JsonGenerationException, JsonMappingException, IOException {
		
		FileWriter file=new FileWriter("inp.yaml");
		BufferedWriter bw=new BufferedWriter(file);
		//BufferedReader br=new BufferedReader();
	    bw.write("swaggerVersion :" +input.getVersion());
	    bw.newLine(); 
	    bw.write("swaggerhost :" +input.getHost());
 		bw.newLine(); 
 		bw.write("swaggerbasepath :" +input.getBasePath());
 		bw.newLine(); 
 		bw.write("swaggerTitle :" +input.getTitle());
 		bw.close();
 		
		//System.out.println(bw);
		return input;
		

		}
	public AddressType createAddress(@RequestBody AddressType ad) throws JsonGenerationException, JsonMappingException, IOException {
		FileWriter file=new FileWriter("inp.yaml");
		BufferedWriter bw1=new BufferedWriter(file);
		//BufferedReader br=new BufferedReader();
	    bw1.write("swaggerVersion :" +ad.get);
	    bw1.newLine(); 
	    bw1.write("swaggerhost :" +input.getHost());
 		bw1.newLine(); 
 		bw1.write("swaggerbasepath :" +input.getBasePath());
 		bw1.newLine(); 
 		bw1.write("swaggerTitle :" +input.getTitle());
 		bw1.close();
 		
		
		return ad;



	}
	}
		


