package sealizationAndDesrilizationWithARRAY;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerilizationandDesrilization.POJOclasswithARRAY;

public class Searlization {
	int phno[]= {85499738,98885077};
	String email[]={"lohithmpatil97@gmail.com","lohith@123"};
	
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		POJOclasswithARRAY arr=new POJOclasswithARRAY("LOHITH", "TY465", phno, email, "shivamogga");
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./POJOclasswithARRAY.json"), arr);
	}

}
