package com.crudPerson.app;

import java.sql.SQLException;

import com.crudPerson.controller.PersonController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			PersonController personController = new PersonController();
			personController.display();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
