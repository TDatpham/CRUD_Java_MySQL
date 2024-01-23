import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class CRUD_Java_MySQL {
	private static String DB_URL = "jdbc:mysql://localhost:3306/sampledb";
    private static String USER_NAME = "root";
    private static String PASSWORD = "1234567890";
 
    /**
     * main
     * 
     * @author viettuts.vn
     * @param args
     */
    public static void main(String args[]) {
    	try {
    		 
    	    Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
    	    
    	    //CREATE
    	    /*
    	    String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
    	    
    	    PreparedStatement statement = conn.prepareStatement(sql);
    	    statement.setString(1, "bill");
    	    statement.setString(2, "secretpass");
    	    statement.setString(3, "Bill Gates");
    	    statement.setString(4, "bill.gates@microsoft.com");
    	     
    	    int rowsInserted = statement.executeUpdate();
    	    if (rowsInserted > 0) {
    	        System.out.println("A new user was inserted successfully!");
    	    }
    	    */
    	    
    	    //READ
    	    /*
    	    String sql = "SELECT * FROM Users";
    	    
    	    Statement statement = conn.createStatement();
    	    ResultSet result = statement.executeQuery(sql);
    	     
    	    int count = 0;
    	     
    	    while (result.next()){
    	        String name = result.getString(2);
    	        String pass = result.getString(3);
    	        String fullname = result.getString("fullname");
    	        String email = result.getString("email");
    	     
    	        String output = "User #%d: %s - %s - %s - %s";
    	        System.out.println(String.format(output, ++count, name, pass, fullname, email));
    	    }
    	    */
    	    
    	    //UPDATE
    	    /*
    	    String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";
    	    
    	    PreparedStatement statement = conn.prepareStatement(sql);
    	    statement.setString(1, "123456789");
    	    statement.setString(2, "William Henry Bill Gates");
    	    statement.setString(3, "bill.gates@microsoft.com");
    	    statement.setString(4, "bill");
    	     
    	    int rowsUpdated = statement.executeUpdate();
    	    if (rowsUpdated > 0) {
    	        System.out.println("An existing user was updated successfully!");
    	    }
    	    */
    	    
    	    //DELETE
    	    /*
    	    String sql = "DELETE FROM Users WHERE username=?";
    	    
    	    PreparedStatement statement = conn.prepareStatement(sql);
    	    statement.setString(1, "bill");
    	     
    	    int rowsDeleted = statement.executeUpdate();
    	    if (rowsDeleted > 0) {
    	        System.out.println("A user was deleted successfully!");
    	    }
    	    */
    	    
    	    if (conn != null) {
    	        System.out.println("Connected");
    	    	}
    	}	catch (SQLException ex) {
    	    ex.printStackTrace();
    	    }
    	}
    }