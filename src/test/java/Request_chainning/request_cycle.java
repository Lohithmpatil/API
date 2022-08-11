package Request_chainning;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class request_cycle {
	@Test
	public void request_cycle() {
		
		
		Random r=new Random();
		int random=r.nextInt(100);
		
		
		baseURI="http://localhost:8084";
		//step=1 create the project
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "LOHITHMPATIL");
		jobj.put("projectName", "TYSS12"+random);
		jobj.put("status", "created");
		jobj.put("teamSize", 13);
		
		
	//step=1 send the request
		
		 Response  resp=given()
				 .body(jobj).contentType(ContentType.JSON)
		
		.when().post("/addProject");
		
		 //step=3mcapture project id from the rsponse body using json path
		 
		 String proId=resp.jsonPath().get("projectId");
		System.out.println(proId);
		
		//step=4 use the captured project id in get request
		//when().get("/projects/"+proId)
		//.then().log().all();
		
		given()
		.pathParam("pid", proId)
		.when().get("/projects/{pid}")
		.then().log().all();
		
	//step=5 use the project id and delete the request
		given()
		.pathParam("pid", proId)
		.when().delete("/projects/{pid}")
.then().log().all();
		
	
		
		
	}

}
