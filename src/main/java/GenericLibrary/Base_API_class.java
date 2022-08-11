package GenericLibrary;

import org.codehaus.groovy.tools.ErrorReporter;
import org.junit.Before;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import  static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class Base_API_class {
	
	       public DataBaseLibrary dlib=new DataBaseLibrary();
	       public JavaLibrary jlib=new JavaLibrary();
	       public RestAssuredLibrary rslib=new RestAssuredLibrary();
	       
	      @BeforeSuite
	       public void beforeConfig() throws SQLException {
	    	   dlib.connectToDataBase();
	    	   Reporter.log("===Connection Successful==", true);
	    	   baseURI="http://localhost";
	    	   port=8084;
	       }
	       @AfterSuite
	       public void asConfig() throws SQLException
	       {
	    	   dlib.closeDb();
	    	   Reporter.log("==Connection Closed==", true);
	  
	    	     }
	             
}
