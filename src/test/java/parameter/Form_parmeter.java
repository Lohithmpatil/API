package parameter;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Form_parmeter {
	@Test
	public void form_parameter()
	{
		
		baseURI="http://localhost:8084";
		//step=1 create the pre requests
		given()
		.formParam("createdBy", "shilLohi")
		.formParam("projectName", "amdocs")
		.formParam("status", "done")
		.formParam("teamSize", 10)
		.contentType(ContentType.JSON)
		
		//step= 2 send the request and validate response
		.when()
		.post("/addProject")
		.then()
		.log().all();
		
	}

}
