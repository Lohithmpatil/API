package GenericLibrary;

import io.restassured.response.Response;
/**
 * This class contains rest assured use specific method
 * @author Lohith
 *
 */

public class RestAssuredLibrary 
{
	/**
	 * This method will get the json data through  json path from the response the response body
	 * @param response
	 * @param path
	 * @return
	 */
	
	public String getJsonData(Response  response ,String path){
   String jsonData=response.jsonPath().get(path);
   return jsonData;
	}
}
