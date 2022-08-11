package Different_WaysTO_Post;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

import java.util.Random;

public class FormParmeter {
@Test
	public void Formparmter()
	{
	
	Random r=new Random();
	int random=r.nextInt(100);
	
      baseURI="http://localhost:8084";
      
      
      given().formParam("createdBy", "sanjay")
      .formParam("projectId", "TY123")
      .formParam("projectName", "testyantra"+random)
      .formParam("status", "ongoing")
      .formParam("teamSize", 10)
      .contentType(ContentType.JSON)
      
      .when()
      .post("/addProject")
      .then()
     //.assertThat().statusCode(201)
      .log()
      .all();
      
      
      
	}
}
