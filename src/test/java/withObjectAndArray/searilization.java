package withObjectAndArray;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationandDesrilization.EmployeeObjectWithArray;
import POJOforSerilizationandDesrilization.friend;

public class searilization {
	int phno[]= {85499738,98885077};
	String email[]={"lohithmpatil97@gmail.com","lohith@123"};
	@Test
	public void searlization() throws JsonGenerationException, JsonMappingException, IOException {
		friend s=new friend("shljith", "hf6r7", "kerala");
		EmployeeObjectWithArray oa=new EmployeeObjectWithArray("lohith", "ty123", phno, email, "shivamogga", s);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./objectArray.jason"), oa);
		
		
	}
	

}
