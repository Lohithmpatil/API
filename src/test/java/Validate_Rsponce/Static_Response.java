package Validate_Rsponce;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class Static_Response {
	@Test
	public void staticResponse()
	{
		baseURI="http://localhost:8084";
		
		String expected="TY_PROJ_002";
		
			//step=1 send the request and validate response
		Response res= when().get("/projects");
		 
		String actual=res.jsonPath().get("[0].projectId");
		
		System.out.println(actual);
		  Assert.assertEquals(expected, actual);
		 
		 
		 
		//  .then().log().all();
		
	}
}
