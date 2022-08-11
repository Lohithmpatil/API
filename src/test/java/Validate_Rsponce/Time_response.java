package Validate_Rsponce;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Time_response {
	@Test
	public void TimeResponse()
	{
		
		//pre Rquests
	baseURI="http://localhost:8084";
	
	//action
	when().get("/projects")
	
	//validation
	.then()
	.assertThat().time(Matchers.lessThan(50L),TimeUnit.MILLISECONDS)
	.log().all();
	
	}

}
