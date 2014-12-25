package com.javaindepth.resthelloworld;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
@Path("/hellorest")
public class HelloWorld {
	@GET
	@Path("/{params}")
	public Response getMessage(@PathParam("params") String message){
		String text="Hello "+message;
		return (Response) Response.status(200).entity(text).build();
}
}
