package com.helloWorld1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("produce")
public class ProducesExample    
{
	@Path("xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Student getXMLResponse()
	{
		Student s = new Student();
		s.setAge(10);
		s.setName("JavaInterviewPoint");

		return s;
	}
	
	@Path("json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getJSONResponse()
	{
		Student s = new Student();
		s.setAge(11);
		s.setName("JavaInterviewPoint");

		return s;
	}
}

