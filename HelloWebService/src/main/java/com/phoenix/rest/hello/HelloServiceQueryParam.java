package com.phoenix.rest.hello;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/helloquery")
public class HelloServiceQueryParam {
	@GET
	@Path("/greet")
	@Produces("text/plain")
	public String greetUser(@QueryParam("nm") String name) {
		return "Hello " + name;
	}
	@GET
	@Path("/user")
	@Produces("text/html")
	public Response greetUserWithResponse(@QueryParam("nm") String name) {
		return Response.status(200).entity("<h2>Hello "+name+"</h2>").build();
	}
	@GET
	@Path("/date")
	@Produces("text/html")
	public Response getDate(@QueryParam("dd") int day,@QueryParam("mm") int month,@QueryParam("yy") int year) {
		return Response.status(200).entity("<h2>Date is: "+LocalDate.of(year, month, day)+"</h2>").build();
	}
}
