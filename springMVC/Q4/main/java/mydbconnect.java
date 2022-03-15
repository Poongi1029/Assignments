package org.example.controller;
import java.sql.*;

public class mydbconnect {

	    public static void main(String args[]) {
            Connection conn = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");

	            conn = DriverManager.getConnection("jdbc:mysql://localhost:8080/emp-details","root", "");
	            if(!conn.isClosed())
	            System.out.print("Database is connected !");
	        }catch(Exception e) {
	        	System.err.println("Exception:"+e.getMessage());
	        }finally {
	        	try {
	        		if(conn!=null)
	        	
	            conn.close();
	        }
	        catch(SQLException e) {   }
	    }
	}
}

 

