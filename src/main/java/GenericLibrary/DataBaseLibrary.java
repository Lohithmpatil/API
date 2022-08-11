package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

import net.bytebuddy.asm.Advice.Return;

public class DataBaseLibrary {

	Driver driverRef;
	Connection conn;
	/**
	 * This method will establish the connection sql DB
	 * @throws SQLException
	 */


	public void connectToDataBase() throws SQLException {
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		conn=DriverManager.getConnection(IContants.dbURL, IContants.appUsename, IContants.dbPassword);

	}

	/**
	 * This method will close the db connection
	 * @throws SQLException 
	 */
	public void closeDb() throws SQLException {
		conn.close();
	}

	/**
	 * This method will execute the query and return validation if the validation success
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException 
	 */
	public String readDataFromDBAndValidate(String query ,int columnIndex , String expData) throws SQLException {
		boolean flag=false;
		ResultSet result=conn.createStatement().executeQuery(expData);
		while(result.next())
				{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
			{
				flag= true;
				break;
			}
				}
		if(flag)
		{
			System.out.println("data is verified");
			return expData;
		}
		else
		{
			System.out.println("Data is not verified");
			return "";
		}
	}
}
