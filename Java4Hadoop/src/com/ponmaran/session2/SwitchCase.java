package com.ponmaran.session2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select a number from 1 to 10..");
		int selection = new Scanner(System.in).nextInt();
		System.out.println("Selection: " + selection);
		switch(selection){
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		default:
			System.out.println("Read the instruction & better luck next time");
		}
	}
}