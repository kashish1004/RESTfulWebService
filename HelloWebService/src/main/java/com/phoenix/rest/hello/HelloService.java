package com.phoenix.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloService {
	@GET
	@Produces("text/plain")
	public String sayPlainHello() {
		return "Hello!! this is plain text";
	}
	@GET
	@Path("/html")
	@Produces("text/html")
	public String sayHTMLHello() {
		return "<h2>Hello!! this is html text</h2>";
	}
	@GET
	@Path("/xml")
	@Produces("application/xml")
	public String sayXMLHello() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <h2>Hello!! this is xml text</h2>";
	}
	
}
