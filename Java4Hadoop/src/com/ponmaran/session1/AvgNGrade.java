package com.ponmaran.session1;

import java.util.Scanner;

public class AvgNGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float hindi, english, maths, sci, soc;
		Scanner markIn = new Scanner(System.in);

		System.out.println("Hindi: ");
		hindi = markIn.nextFloat();

		System.out.println("English: ");
		english = markIn.nextFloat();

		System.out.println("Mathematics: ");
		maths = markIn.nextFloat();

		System.out.println("Science: ");
		sci = markIn.nextFloat();

		System.out.println("Social Science: ");
		soc = markIn.nextFloat();
		
		System.out.println("Marks:\nHindi: " + hindi + "\nEnglish: " + english + "\nMathematics: " + maths + "\nScience: " + sci + "\nSocial Science: " + soc);
		float avg = (hindi + english + maths + sci + soc)/5;
		System.out.println("Average: " + avg + "\nCategory: ");

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
	}

}
