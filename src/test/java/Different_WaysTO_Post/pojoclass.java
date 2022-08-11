package Different_WaysTO_Post;

import org.testng.annotations.Test;

import POJOforSerilizationandDesrilization.PojoRestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class pojoclass {

	@Test
	public void pojoclass() {
		
		baseURI="http://localhost:8084";
		
		Random r=new Random();
		int random=r.nextInt(100);
		
		PojoRestAssured as=new PojoRestAssured("shiljith", "ty123", "testyantar"+random, 12);
		
		
		given()
		.body(as)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		//.assertThat().statusCode(201)
		.log()
		.all();
				
		
		
		
	}
}
