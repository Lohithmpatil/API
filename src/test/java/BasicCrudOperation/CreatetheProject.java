package BasicCrudOperation;

import java.util.Random;

import org.apache.commons.lang3.Validate;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreatetheProject 
{
	@Test
	public void CreatetheProject() {
		
		
		//creatye random no
		Random r=new Random();
		int random=r.nextInt(100);
		
     //step=1 create the necessary object
		
		JSONObject obj=new JSONObject();
		obj.put("createdBy" ,"rmg");
		obj.put("createdOn" ,"26/05/2021");
		obj.put("projectId" , "String");
		obj.put("projectName" ,"rmgProject"+random);
		obj.put("status" , "created");
		obj.put("teamSize" , 10);
		
		
	//step=2 send the request
		RequestSpecification request = RestAssured.given();
		request.body(obj);
	    request.contentType(ContentType.JSON);
	   Response resp= request.post("http://localhost:8084/addProject");
	
    //step=3 validate the response
		
		 ValidatableResponse validate=resp.then();
		 validate.log().all();
	}

}
