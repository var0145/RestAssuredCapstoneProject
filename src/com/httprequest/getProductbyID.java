package com.httprequest;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class getProductbyID {

	@Test
    public void getProductbyID()
	 {  
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://localhost:8081/medicare/show/category/2/products";
		// Get the RequestSpecification of the request to be sent to the server
		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("");
		
		// Retrieve the body of the Response
		ResponseBody body = response.getBody();
		
		// Get the status code of the request. 
		//If request is successful, status code will be 200
		int statusCode = response.getStatusCode();

		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, 
				"Correct status code returned");
		System.out.println("Correct status code returned"+ " "+statusCode);
		
		// To check for sub string presence get the Response body as a String.
		// Do a String.contains
		String reponseBody = response.asString();
		 Assert.assertEquals(reponseBody.contains("Analgesics") /*Expected value*/, true /*Actual Value*/, "Response body contains Analgesics");
		 System.out.println("Response body contains Analgesics");
		 
			System.out.println(reponseBody);
	 }
}
	

				
