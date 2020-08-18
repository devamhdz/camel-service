package com.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public interface RestService {
	
	@GET
	@Path("/employees")
	public Response getEmployees();

}
