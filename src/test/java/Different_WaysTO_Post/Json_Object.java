package Different_WaysTO_Post;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

import java.util.Random;

public class Json_Object {
	
@Test
public void jsonobject() {
	
	Random r=new Random();
	int random=r.nextInt(100);
	
	
	baseURI="http://localhost:8084";
	
	
  //step = 1 create json object
	JSONObject obj = new JSONObject();
	obj.put("createdBy", "LohithMpatil1");
	obj.put("status" , "created");
	obj.put("projectName", "TTs14"+random);
	obj.put("team size",100);
	
	//step= 2 send a request and validate the response
	
	given()
	.body(obj)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.log()
	.all();
	
}

}
