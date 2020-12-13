package com.crudPerson.controller;
import com.crudPerson.config.Config;
import com.crudPerson.models.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class PersonController extends Person{
	
	Config config;
	Scanner scanner;
	public PersonController(int id, String name, String description, String CIN) throws SQLException {
		super(id, name, description, CIN);
		
	}
	public PersonController() {
		config = new Config("jdbc:mysql://localhost/testConnect","root","");
		scanner = new Scanner(System.in);
	}
	
	public void display() throws SQLException {
		
		String query = "Select * from person";
		Statement statement = config.connect().createStatement();
		ResultSet resultSet = statement.executeQuery(query);
		String leftAlignFormat = "| %-15s | %-15s | %-15s | %-15s |%n";
		
		System.out.format("+-----------------+-----------------------------------------------------+%n");
		System.out.format("|       ID        |       name      |   Description   |       C.I.N     |%n");
		System.out.format("+-----------------+-----------------------------------------------------+%n");
		
		while (resultSet.next()) {
			
			    System.out.format(leftAlignFormat, resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("description"), resultSet.getString("CIN"));

			}
			
			System.out.format("+---------------------------------+-------------------------------------+%n");
			
			
		}
	
	  
	  public void add() throws SQLException {
		  
		 
		  System.out.println("Enter the Name");
		  this.name = scanner.next();
		  System.out.println("Enter the description");
		  this.description = scanner.next();
		  System.out.println("Enter the cin");
		  this.CIN = scanner.next();
		  String sqlString = "INSERT into person (name, description, CIN)" + " values(?,?,?)";
		  java.sql.PreparedStatement statement = config.connect().prepareStatement(sqlString, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, this.name);
			statement.setString(2, this.description);
			statement.setString(3, this.CIN);
			statement.executeUpdate();
		 
		System.out.println("Student added");;
	  }
		 public void update() throws SQLException{
			 System.out.println("Enter the id");
			  this.id = scanner.nextInt(); 
			 System.out.println("Enter the Name");
			  this.name = scanner.next();
			  System.out.println("Enter the description");
			  this.description = scanner.next();
			  System.out.println("Enter the cin");
			  this.CIN = scanner.next();
			  String sqlString = "update  person SET "+" name=?, description=?, CIN=? WHERE id=?";
			  java.sql.PreparedStatement statement = config.connect().prepareStatement(sqlString);
				statement.setString(1, this.name);
				statement.setString(2, this.description);
				statement.setString(3, this.CIN);
				statement.setInt(4, this.id);
				statement.executeUpdate();
		   System.out.println("Student Updeted");;
		 }
		public void delete() throws SQLException {
			 System.out.println("Enter the id");
			  this.id = scanner.nextInt(); 
			  String sqlString = "delete from  person"+ " WHERE id=?";
			  java.sql.PreparedStatement statement = config.connect().prepareStatement(sqlString);
				statement.setInt(1, this.id);
				statement.executeUpdate();
		  
			  System.out.println("Student Deleted");;


		}
	}


