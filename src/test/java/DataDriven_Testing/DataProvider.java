package DataDriven_Testing;

import org.testng.annotations.Test;

import POJOforSerilizationandDesrilization.POJO_DataDriven;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class DataProvider {
	
	@Test(dataProvider = "dataprovider")
	public void DataProvider(String createdBy, String projectName, String status, int teamSize)
	{
		
		Random r=new Random();
		int ran=r.nextInt(100);
		
		
		baseURI="http://localhost:8084";
		//pre requests
		POJO_DataDriven data=new POJO_DataDriven(createdBy, projectName+ran, status, teamSize);
		  
		
		given().body(data).contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		
		.then().log().all();
		
		
		
		
		}
   @org.testng.annotations.DataProvider
	public Object[][] dataprovider(){
	Object[][] prv=new Object[2][4];
	
	prv[0][0]="lohith";
	prv[0][1]="xylem";
	prv[0][2]="on going";
	prv[0][3]=20;
	
	prv[1][0]="karthik";
	prv[1][1]="xylem1";
	prv[1][2]="going";
	prv[1][3]=22;
	
	return prv;
	
	
	
	}

}
