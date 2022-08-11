package Authentication;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;





public class Barear_Token {
	
    @Test
	public void BarearToken()
	{
	HashMap mp=new HashMap();
	mp.put("name", "SDET-123");
	
	given()
	.body(mp).auth().oauth2("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")
	.contentType(ContentType.JSON)
	
	.when().post("https://api.github.com/user/repos")
	.then().log().all();
	
	
	}

}
