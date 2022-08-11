package SerializationAndDeserilization;


import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationandDesrilization.EmployeeDeatails;

public class serilazationEmployeDeatails {

	
	// step-1 create the object of pojo and provide name
@Test
public void serilization() throws JsonGenerationException, JsonMappingException, IOException
{
EmployeeDeatails emp=new EmployeeDeatails("Lohith", "ty123", 854997370, "lohithmpatil97@gmail.com", "shivamogga");

//step-2 create object  of object mapper of jackson  mapper 
ObjectMapper obj=new ObjectMapper();

//step-3 write data into jason file
obj.writeValue(new File("./EmployeeDetails.json"), emp);
}


}
