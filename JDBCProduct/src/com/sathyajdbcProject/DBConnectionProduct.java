package com.sathyajdbcProject;

import java.sql.Connection;
import java.util.Iterator;

public class DBConnectionProduct {
	public static Connection creteConnection ()
	{
		Connection connection=null;
		
		try
		
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			connection = DriverManager.getConnection("jdbc:oracle:thin:@loacalhost:1521:xe","satya","satya");
			
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace() ;;
		}
			
		
	}
	}

