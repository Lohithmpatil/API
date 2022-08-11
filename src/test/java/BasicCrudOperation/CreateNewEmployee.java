package BasicCrudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateNewEmployee {
	@Test
	public void createNewEmployee() {
		
		baseURI = "http://localhost";
		port  = 8084;
		
	//step=1 create the jason object
		

		Random r=new Random();
		int random=r.nextInt(100);
		
		JSONObject obj=new JSONObject(); 
		

		obj.put("designation" , "QA");
		  obj.put(  "dob" , "01/11/1111");
		  obj.put("email" , "john123@gmail.com");
		  obj.put("empId","string");
		  obj.put("empName", "john"+random);
		  obj.put("experience", 2);
		  obj.put("mobileNo", "1234567890");
		
		
		  //step=2 
		  given()
		  .body(obj)
		  .contentType(ContentType.JSON)
		  .when()
		  .post("/addProject")
		  .then()
		  .log().all();
		 
	}

}
