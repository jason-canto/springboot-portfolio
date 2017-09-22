package com.canto.jason.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@RequestMapping("teste")
	public String teste() {
		return "teste";
	}

}
