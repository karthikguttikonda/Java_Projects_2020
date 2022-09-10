package com.app;
import java.sql.*;
public class Values {

	public static void main(String[] args) throws SQLException {
		String Drive ="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "admin";
		
		Connection conn =null;
        Statement stmt =null;
        
        try {
        	Class.forName(Drive);
        	conn = DriverManager.getConnection(url,username,password);
        	
        	stmt = conn.createStatement();
        	
        	String sql = "INSERT INTO employee" + "(empid, empname, empsal)" + "Values('1','tommy','30000')";
        	String amt = "INSERT INTO employee" + "(empid, empname, empsal)" + "Values('2','john','60000')";
        	String bmt = "INSERT INTO employee" + "(empid, empname, empsal)" + "Values('3','mike','70000')";
        	
        	String cmt= "INSERT INTO student" + "(stdid, stdname,stdfee)" + "Values('1','phill','2000')";
        	String dmt= " INSERT INTO student" + "(stdid, stdname,stdfee)" + "Values('2','ram','4000')";
        	String emt= "INSERT INTO student" + "(stdid, stdname,stdfee)" + "Values('3','kumar','3000')";
        	
        	String fmt= "INSERT INTO items" + "(itemno, itemname,itemcost)" + "Values('1','tv','22000')";
        	String gmt= "INSERT INTO items" + "(itemno, itemname,itemcost)" + "Values('2','fridge','35000')";
        	String hmt= "INSERT INTO items" + "(itemno, itemname,itemcost)" + "Values('3','machine','30600')";
        	
        	stmt.execute(fmt);
//        	stmt.execute(gmt);
//        	stmt.execute(hmt);
        	System.out.println("insert complete");
        	
        }catch (Exception e){
        	e.printStackTrace();
        }finally{
        	if(stmt !=null){
        		stmt.close();
        	}if(conn !=null){
        		conn.close();
        	}
        }
	}

}
