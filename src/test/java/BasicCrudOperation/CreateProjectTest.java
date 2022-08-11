package BasicCrudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectTest {

	@Test
	public void createProject()
	{
		baseURI="http://localhost";
		port=8084;
		
		
		Random r=new Random();
		int random=r.nextInt(100);
		
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy" ,"rmg");
		obj.put("createdOn" ,"26/05/2021");
		obj.put("projectId" , "String");
		obj.put("projectName" ,"rmgProject"+random);
		obj.put("status" , "created");
		obj.put("teamSize" , 10);
		
		given()
		.body(obj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then()
		//.assertThat().statusCode(201)
		.log().all();
	}
}
