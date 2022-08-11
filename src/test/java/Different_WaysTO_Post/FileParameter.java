package Different_WaysTO_Post;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;


public class FileParameter {
	
	@Test
	public void fileparameter()
	{
		
		baseURI="http://localhost";
		port=8084;
		//step create data
		File file =new File(".\\src\\test\\resources\\file\\form.json");
		
		
		given()
		.body(file)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		//.assertThat().statusCode(201)
		.log().all();
	}

}
