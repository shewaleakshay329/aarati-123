package com.vtiger.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import com.vtiger.crm.generic.fileutility.FileUtility;


public class DatabaseUtility {
	public Statement stat = null;
	public Connection conn = null;
    public void getConnectTodata() throws Throwable {
    	try {
    		Driver d = new Driver();
        	DriverManager.registerDriver(d);
        	FileUtility fiu = new FileUtility();
        	String Dburl = fiu.getDataFromProperties("DBurl");
        	String Dbuser = fiu.getDataFromProperties("Dbusername");
        	String Dbpassw = fiu.getDataFromProperties("Dbpassword");
        	conn = DriverManager.getConnection(Dburl, Dbuser, Dbpassw);
        	stat= conn.createStatement();
    	}
    	catch (Exception e) {
		}
    	
    	
    	}
    public String getExecuteQuery(String query, int inexc) throws Throwable {
    	String data="";
    	try {
    		ResultSet r = stat.executeQuery(query);
    		while(r.next()) {
    			data = r.getString(inexc);
    			
    		}
    	}
    	catch(Exception e){
    		
    	}
    	return data;

    	 }
    public int getExecuteUpdate(String query) throws Throwable {
    	int r = 0 ;
    	try {
    	 r = stat.executeUpdate(query);
        	
    	}
    	catch(Exception e) {
    		
    	}
    	return r;
    }
    public void close() throws Throwable {
    	try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	finally {
    		conn.close();
		}
    	

    }
}
