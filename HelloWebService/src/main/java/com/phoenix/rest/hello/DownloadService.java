package com.phoenix.rest.hello;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/downloads")
public class DownloadService {
	@GET
	@Path("/textfile")
	@Produces("text/html")
	public Response getTextFile() {
		File file = new File("E:\\Kashish\\files\\hello.txt");
		return Response.ok(file).header("Content-Disposition","attachment; filename = 'helloclient.txt'").build();
	}
	
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getPdf() {
		File file = new File("E:\\Kashish\\files\\document.pdf");
		return Response.ok(file).header("Content-Disposition","attachment; filename = 'docs.pdf'").build();
	}
	
	@GET
	@Path("/photo")
	@Produces("image/jpg")
	public Response getImage() {
		File file = new File("E:\\Kashish\\files\\image.jpg");
		return Response.ok(file).header("Content-Disposition","attachment; filename = 'picture.jpg'").build();
	}
}
