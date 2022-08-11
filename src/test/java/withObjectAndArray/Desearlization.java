package withObjectAndArray;


import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import POJOforSerilizationandDesrilization.EmployeeObjectWithArray;

public class Desearlization {
	
	public void desearlization() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj=new ObjectMapper();
		EmployeeObjectWithArray  el=obj.readValue(new File("./objectArray.jason"),EmployeeObjectWithArray.class );
		System.out.println(el.getEmail());
		System.out.println(el.getPhno());
		System.out.println(el.getFriend());
		System.out.println(el.getEname());
		
} 
}
