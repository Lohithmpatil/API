     package SerializationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationandDesrilization.EmployeeDeatails;

public class Deserilization {
	@Test
	public void deserilization() throws JsonParseException, JsonMappingException, IOException {
		
		
	//	step-1 :create object of object mapper - jackson mapper
		ObjectMapper obj=new ObjectMapper();
		
	// read the value from the object mapper 
		EmployeeDeatails el=obj.readValue(new File(".\\EmployeeDetails.json"), EmployeeDeatails.class);
		
	//fetch the required value from class
		System.out.println(el.getEname());
		System.out.println(el.getId());
		System.out.println(el.getPhno());
		System.out.println(el.getEmail());
		System.out.println(el.getAddress());
	}

}
