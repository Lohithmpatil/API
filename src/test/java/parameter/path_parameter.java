package parameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class path_parameter {
	@Test
	public void pathparameter() {

		baseURI="http://localhost:8084";
	
		//step= 1 create data
		given()
		.pathParam("pid", "TY_PROJ_1002")
		
		//step=2 send the request and validate the response
		.when()
		.get("/projects/{pid}")
		
		.then()
		//.assertThat().statusCode(200)
		.log().all();
		
		
		
		
	}

}
