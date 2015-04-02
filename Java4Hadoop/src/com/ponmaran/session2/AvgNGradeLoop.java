package com.ponmaran.session2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AvgNGradeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float hindi, english, maths, sci, soc;
//		Scanner markIn = new Scanner(System.in);

		char cont = 'n';
		do{
			hindi= english= maths= sci= soc = 101;
			System.out.println("Enter the marks");
			do{
				System.out.println("Hindi: ");
				try{
					hindi = new Scanner(System.in).nextFloat();
//					System.out.println("Hindi: "+hindi);
				}catch(InputMismatchException e){
					System.out.println("Invalid input. Try again..");
				}
			}while(!(hindi >=0 && hindi <=100));

			do{
				System.out.println("English: ");
				try{
					english = new Scanner(System.in).nextFloat();
				}catch(InputMismatchException e){
					System.out.println("Invalid input. Try again..");
				}
			}while(!(english>=0 && english <=100));

			do{
				System.out.println("Mathematics: ");
				try{
					maths = new Scanner(System.in).nextFloat();
				}catch(InputMismatchException e){
					System.out.println("Invalid input. Try again..");
				}
			}while(!(maths>=0 && maths<=100));

			do{
				System.out.println("Science: ");
				try{
					sci = new Scanner(System.in).nextFloat();
				}catch(InputMismatchException e){
					System.out.println("Invalid input. Try again..");
				}
			}while(!(sci>=0 && sci<=100));

			do{
				System.out.println("Social Science: ");
				try{
					soc = new Scanner(System.in).nextFloat();
				}catch(InputMismatchException e){
					System.out.println("Invalid input. Try again..");
				}
			}while(!(soc>=0 && soc<=100));
			
//			System.out.println("Marks:\nHindi: " + hindi + "\nEnglish: " + english + "\nMathematics: " + maths + "\nScience: " + sci + "\nSocial Science: " + soc);
			float avg = (hindi + english + maths + sci + soc)/5;
			System.out.print("Average: " + avg + "\nCategory:\t");

			if(avg >=90)
				System.out.println("Excellent");
			else
				if(avg >= 80)
					System.out.println("Very Good");
				else
					if(avg >= 60)
						System.out.println("Good");
					else
						if(avg >= 50)
							System.out.println("Average");
						else
							System.out.println("Poor");
			System.out.println("Press 'y' to continue..");
			cont = new Scanner(System.in).next().charAt(0);
		}while(cont == 'y');
	}

}
