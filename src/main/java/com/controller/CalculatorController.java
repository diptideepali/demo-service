package com.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/math")
public class CalculatorController {

	
	
	@GetMapping("/add")
	public double add(@RequestParam double operand1, @RequestParam double operand2) {
	    System.out.println("Inside      jjjjjjj   Addition 11    87");
		return operand1 + operand2;
	}

	@GetMapping("/subtract")
	public double subtract(@RequestParam double operand1, @RequestParam double operand2) {
		System.out.println("Inside   substraction");
		return operand1 - operand2;
	}

	@GetMapping("/multiply")
	public double multiply(@RequestParam double operand1, @RequestParam double operand2) {
		System.out.println("Inside      vvvvvv    Multiplication");
		return operand1 * operand2;
	}

	@GetMapping("/divide")
	public double divide(@RequestParam double operand1, @RequestParam double operand2) {
		System.out.println("Inside Division");
		if (operand2 == 0) {
	        throw new IllegalArgumentException("Cannot divide by zero");
	    }
	    return operand1 / operand2;
	}
	
	
	
}
