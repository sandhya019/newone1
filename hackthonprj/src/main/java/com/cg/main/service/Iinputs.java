package com.cg.main.service;

import javax.validation.Valid;

import com.cg.main.entity.Inputs;

public interface Iinputs {

	Inputs createInputs(@Valid Inputs input);

	Inputs addInput(Inputs input);



		
		
	}


