package Request_chainning;


import POJOforSerilizationandDesrilization.PojoRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;


public class Request_Chaning {

    @Test
	public void requestChaining()
	{

		baseURI="http://localhost:8084";
		
		Random r=new Random();
		int random=r.nextInt(100);
		
		PojoRestAssured res=new PojoRestAssured("lohi", "xylem"+random, "created", 20);
		//step= create the project /post
       Response resp=given().body(res).contentType(ContentType.JSON)
    		   	.when()
    		   		.post("/addProject");
       
       //capture the project id
       
       String proid=resp.jsonPath().get("projectId");
       System.out.println(proid);
       String prname=resp.jsonPath().get("projectName");
      
//.then().log().all();
       
       //step= 2 update the project
       
       PojoRestAssured res1=new PojoRestAssured("lohi", prname, "completed", 20); 
       given().body(res1).contentType(ContentType.JSON)
       .pathParam("pid", proid)
       
       .when()
       .put("/projects/{pid}")
       .then().log().all();
       
       //get the project
       
       given()
        .pathParam("pid", proid)
       
       .when()
       .get("projects/{pid}")
       .then()
       .log().all();
       
       //Delete the project
       given()
       .pathParam("pid", proid)
       
       .when()
       .delete("projects/{pid}")
       .then().assertThat().statusCode(204).log().all();

	}
}
