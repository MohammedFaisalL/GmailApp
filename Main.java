package com.te.gmail;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("WELCOME TO GMAIL");
		System.out.println("1. login ");
		System.out.println("2. register ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			Login.login();
			break;
		case 2:
			Register.register();
		default:
			System.out.println("invalid option");
			break;
		}
	}
}
