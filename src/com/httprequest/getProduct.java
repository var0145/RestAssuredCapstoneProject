package com.httprequest;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

	
public class getProduct {

	
	 @Test
     public void GetBookDetails()
	 {  
  // Specify the base URL to the RESTful web service
  RestAssured.baseURI = "http://localhost:8081/medicare/show/all/products";
  // Get the RequestSpecification of the request to be sent to the server
  RequestSpecification httpRequest = RestAssured.given();

  Response response = httpRequest.get("");

  // Get the status code of the request. 
  //If request is successful, status code will be 200
  int statusCode = response.getStatusCode();

  // Assert that correct status code is returned.
  Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, 
   "Correct status code returned");
  	System.out.println("Correct status code returned"+ " "+statusCode);
 
 
	
	
}
	
}
