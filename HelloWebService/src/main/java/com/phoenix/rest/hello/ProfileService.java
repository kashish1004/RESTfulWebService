package com.phoenix.rest.hello;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/profile")
public class ProfileService {
	@POST
	@Path("/add")
	@Produces("text/html")
	public Response addProfile(@FormParam("p_name") String name,@FormParam("p_age") int age,@FormParam("city") String city) {
		return Response.status(200).entity("<body><h2>Profile is Created Successfully"
				+ "<br>Name: "+name+
				"<br>Age: "+age+
				"<br>City: "+city+"</h2></body>").build();
	}
}
