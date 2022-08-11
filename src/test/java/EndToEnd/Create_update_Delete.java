package EndToEnd;

import org.codehaus.jackson.map.deser.ValueInstantiators.Base;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.Base_API_class;
import GenericLibrary.DataBaseLibrary;
import GenericLibrary.EndPointsLibrary;
import GenericLibrary.JavaLibrary;
import GenericLibrary.RestAssuredLibrary;
import POJOforSerilizationandDesrilization.EmployeeDeatails;
import POJOforSerilizationandDesrilization.PojoRestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static  io.restassured.RestAssured.*;

import java.sql.SQLException;

public class Create_update_Delete extends Base_API_class {
	@Test
	public void crete() throws SQLException {
		
	
	//step=1 create the request
	PojoRestAssured res=new PojoRestAssured("lohith", "Tyss"+jlib.getRandomNo(), "done", 20);
    	
			//step=2 send the request
	 Response response = given()
	.body(res)
	.contentType(ContentType.JSON)
.when()
.post(EndPointsLibrary.createproject);
	 

	
	//step =3 capture the project id 
	
String expDta=rslib.getJsonData(response, "TY_PROJ_002");
Reporter.log("expData", true);

//step=4 validate id in data in database

String query="select * from projrct;";
String acdata=dlib.readDataFromDBAndValidate(query, 1, expDta);
Assert.assertEquals(expDta, acdata);


}
}
