package parameter;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

public class Querry_parameter {
	
	@Test
	public void queryparameter() {
		
		baseURI="https://reqres.in";
		
		
		//create the pre requested
	given()
	.queryParam("page", 2)
	.queryParam("page", 3)
	
	//send the request and validate the response
	.when()
	.get("/api/users")
	.then().log().all();
	}

}
