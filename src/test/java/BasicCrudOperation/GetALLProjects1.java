package BasicCrudOperation;

import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;

public class GetALLProjects1 {

	
	@Test
	public void get() {

		baseURI="http://localhost";
		port=8084;
		
		when()
		.get("/projects")
		.then()
		//.assertThat().statusCode(200)
		.log().all();
	}
}
