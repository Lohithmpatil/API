package BasicCrudOperation;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;





public class UpadateProject {
	@Test
	public void updateProject() {
		
		baseURI = "http://localhost";
		port = 8084;
	//step=1 create the necessary data
	
			JSONObject jobj=new JSONObject();
			jobj.put("createdBy", "Lohith");
			jobj.put("projectName", "Tyss");
			jobj.put("status", "done");
			jobj.put("teamsize", 20);
			
			//step=2 send the request 
		/*	RequestSpecification request=RestAssured.given();
			request.body(jobj);
			request.contentType(ContentType.JSON);
			Response resp=request.put("http://localhost:8084/projects/TY_PROJ_1003");*/
			  given()
			  .body(jobj)
			  .contentType(ContentType.JSON)
			  .when()
			  .put("/projects/TY_PROJ_1003")
			  .then()
			  .log().all();
			
			 
			//step=3 validate the response
			
		// ValidatableResponse validate=resp.then();
		// validate.log().all();
	}	
		}
