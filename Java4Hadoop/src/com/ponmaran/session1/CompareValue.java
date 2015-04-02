package com.ponmaran.session1;

import java.util.Scanner;

public class CompareValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Mike,Bruce;
		Scanner scn = new Scanner(System.in);
		System.out.print("Mike's number: ");
		Mike = scn.nextInt();
		System.out.print("Bruce's number: ");
		Bruce = scn.nextInt();
		if(Mike>Bruce)
			System.out.print("Mike is the lucky one");
		else
			System.out.print("Bruce is the lucky one");
	}

}
