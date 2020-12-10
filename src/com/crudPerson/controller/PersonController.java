package com.crudPerson.controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.crudPerson.config.Config;
import java.sql.Statement;

public class PersonController {
	
	Config config;
	
	public PersonController() throws SQLException {
		
		config= new Config("jdbc:mysql://localhost/testConnect","root","");
		
	}
	
	public void display() throws SQLException {
		
		String query = "Select * from person";
		Statement statement = config.connect().createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		
		while (resultSet.next()) {
			
			System.out.println(resultSet.getString("name"));
			
		}
	     
		
	}

}
