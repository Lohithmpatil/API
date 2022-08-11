package Different_WaysTO_Post;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Random;


public class Hash_map {
	@Test
	public void hashmap() {
		
		

		Random r=new Random();
		int random=r.nextInt(100);
				
				
		baseURI = "http://localhost:8084";
	//port=8084;
		//crete the data
		
   HashMap map=new HashMap();
	map.put("createdBy", "karthik");
	map.put("projectName", "Tss123"+random);
	map.put("status", "done");
	map.put("teamSize",10);
	
	//send the requet and validate the response
	given()
	.body(map)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.log()
	.all();
	
	}

}
