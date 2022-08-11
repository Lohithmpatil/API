package GenericLibrary;

import java.util.Random;
/**
 * This class contains all java specific generic methods
 * @author Lohith
 *
 */

public class JavaLibrary {

	/**
	 * This method will generate random no for every execution
	 * @return
	 */
	
	public int getRandomNo() 
	{
		Random ran=new Random();
		 return ran.nextInt(1000);
		 
		
		
	}
}
