package Validate_Rsponce;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertTrue;

import java.util.List;

public class Dynamic {
	
	@Test
	public void DynamicResponse() {
		baseURI="http://localhost:8084";
		String expdata="TY_PROJ_002";
		
		//step = 1send the request
		Response resp=when().get("/projects");
		
		//step = 2 capture the response by writing the json path
		
		boolean flag = false;
		List<String> list=resp.jsonPath().get("projectId");
		for(String data:list)
		{
			if(data.equalsIgnoreCase(expdata))
			{
				System.out.println(data);
				flag = true;//flag rising
				break;
			}		
		}
		//step =3 validate
	Assert.assertTrue(flag);
		
		//resp.then().log().all();
	}

}
