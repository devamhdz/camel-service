package com.example.service;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class GetEmployees implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Peticion recivida");
	}
	
	private List<String> getEmployees(){
		return null;
	}

}
