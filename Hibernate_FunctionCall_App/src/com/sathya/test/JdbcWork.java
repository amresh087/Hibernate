package com.sathya.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.jdbc.Work;


	public class JdbcWork implements Work
	{
		public void execute(Connection con)throws SQLException
		{
			try
			{
			CallableStatement cstmt=con.prepareCall("{?= call emp_bonus(?)}");
			cstmt.registerOutParameter(1,Types.DOUBLE);
			cstmt.setInt(2,78798);
		
			
			cstmt.execute();
			double bonus=cstmt.getDouble(1);
			System.out.println("Bonus is ="+bonus);
			cstmt.close();
		}
			catch(Exception e)
			{
				
			}
			
	}

}

