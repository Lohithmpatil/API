package BasicCrudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class LoginRMGYantrawithoutAuthentication {

	
	@Test
	public void LoginRmgwithoutAuthentication() {
		//step =2 send the request
		
				RequestSpecification rest=RestAssured.given().auth().basic("", "").contentType(ContentType.JSON);
						Response resp = rest.get("http://localhost:8084/login") ;
						
						//step=3 validate the response
						ValidatableResponse validate=resp.then();
						validate.log().all();
						
		
	
	}
}
