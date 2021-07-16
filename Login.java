package com.te.gmail;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Login {

	static Scanner scanner=new Scanner(System.in);
	public static void login() {	
		EntityManagerFactory factory=null;
		EntityManager manager=null;
	
		System.out.println("enter user name and password");
		String User_name=scanner.next();
		String password=scanner.next();
		try {
			factory=Persistence.createEntityManagerFactory("gmaildb");
			manager=factory.createEntityManager();
			
			Gmail gmail=manager.getReference(Gmail.class, 100);
			if(gmail.getUser_name().equalsIgnoreCase(User_name) && gmail.getPassword().equalsIgnoreCase(password) ){
			
				
			System.out.println("1. compose");
			System.out.println("2. display");
			int choice =scanner.nextInt();
				switch (choice) {
				case 1:
					Compose.mail();
					break;
				case 2: 
					Inbox.allmails();
				default:
					break;
				}
				
			System.out.println(gmail);
			System.out.println("the gmail id"+ gmail.getUser_id());
			System.out.println("the user name"+ gmail.getUser_name());
			System.out.println("the password "+ gmail.getPassword());
			System.out.println("the email "+ gmail.getEmail());
			}else {
				System.out.println("data not found");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			if(manager!=null) {
				manager.close();
				
			}if(factory!=null) {
				factory.close();
			}
		}
	}
}