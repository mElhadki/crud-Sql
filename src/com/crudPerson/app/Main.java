package com.crudPerson.app;
import java.sql.SQLException;
import java.util.Scanner;
import com.crudPerson.controller.PersonController;


public class Main {
	
	//Create the menu
	
	public static int menu () {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("+-------------------------+ :");
        System.out.println("| You Welcome in Our Application|");
        System.out.println("+-------------------------+ :");
        System.out.println("1 - list students ");
        System.out.println("2 - ADD STUDENT ");
        System.out.println("3 - UPDATE STUDENT ");
        System.out.println("4 - DELETE STUDENT ");
        System.out.println("5 - Quit");
        selection = input.nextInt();
        return selection;    
    }
	
	

	public static void main(String[] args) {
		
		PersonController personController = new PersonController();
		
		// TODO Auto-generated method stub
		
		Boolean out = true;
		
		while(out) {
			
			switch (menu()) {
			
			case 1 : 
				
				try {
					
					
					personController.display();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				
				break;
				
			case 2 : 
				
	            try {
					
					
					personController.add();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				
				break;
				
	        case 3 : 
				
	            try {
					
					
					personController.update();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				
				break;
				
            case 4 : 
				
	            try {
					
					
					personController.delete();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				
				break;
				
            case 5: 
            	System.exit(0);
            	
            	break;
            	
            default:
				System.out.println("Oups une erreur est trouvé");
				break;
			}
		}
		
	}

}
