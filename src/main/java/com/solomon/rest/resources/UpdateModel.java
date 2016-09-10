package com.solomon.rest.resources;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solomon.rest.model.SolomonRecord;

@Path("/updateModel")
public class UpdateModel {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
 
	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateModelResponse(InputStream incomingData) {
		
		StringBuilder jsonTextString = new StringBuilder();
		ObjectMapper mapper=new ObjectMapper();
		SolomonRecord solomonObj = new SolomonRecord();
		
		try {
			
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			
			//Write JSON data to jsonTextString
			String line = null;
			while ((line = in.readLine()) != null) {
				jsonTextString.append(line);
			}
			
			
			StringReader jsonData = new StringReader(jsonTextString.toString());		
			solomonObj = mapper.readValue(jsonData, SolomonRecord.class);
			
			solomonObj.setJsonText(jsonTextString.toString());
			
		} 
		catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error Parsing: - "+e.getMessage());
		}
		
		System.out.println("Data Received: " + jsonTextString.toString());
 
		// return HTTP response 200 in case of success
		return Response.status(200).entity(solomonObj.toString()).build();
	}
	
	@GET
	@Path("/verify")
	@Produces(MediaType.TEXT_PLAIN)
	public String verifyRESTService() {
 
		// return HTTP response 200 in case of success
		return "All ok bhosadike" ;
	}
}