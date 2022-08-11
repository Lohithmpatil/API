package Authentication;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

public class Basic_Auth {
	@Test
	public void BasicAuth()
	{
		baseURI="http://localhost:8084";
	 given()
	 .auth().basic("rmgyantra", "rmgy@9999")
	 .when()
	 .get("/login")
	 .then()
	 .assertThat().statusCode(202)
	 .log().all();
	}

	
	@Test
	public  void basicPreEmpltiveAuthTest()
	{
		baseURI="http://localhost:8084";
		
		given()
		.auth()
		.preemptive().basic("rmgyantra", "rmgy@9999")
		.when()
		.get("/login")
		.then().log().all();
		}
	
	@Test
	public void digestAuth()
	{
		baseURI="http://localhost:8084";
		
		given()
		.auth()
		.digest("rmgyantra","rmgy@9999")
		.when()
		.get("/login")
		.then()
		.log().all();
		
	}
}
