package com.ponmaran.session3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aList = new ArrayList<String>();
		System.out.println("What fruits you like..? Press ; to stop entry");
		Scanner scn = new Scanner(System.in);
		String inp = new Scanner(System.in).nextLine();
		while(inp.charAt(0) != ';'){
			aList.add(inp);
			System.out.println(inp + " added to list");
			inp = new Scanner(System.in).nextLine();
		};
		
		System.out.println("Here are your fruits.");
		Iterator<String> itr = aList.iterator();
		for(int i=0;itr.hasNext();i++){
			System.out.println(i + 1 + ". " + itr.next());
		}
		System.out.println("Do you want to delete any? Enter the number.. ; to exit");
		
		scn = new Scanner(System.in);

		while(scn.hasNextInt() && aList.size()>0){
			try{
				int i = scn.nextInt();
				System.out.println(i + ". " + aList.get(i-1));
				aList.remove(i-1);
			}catch(Exception e){
				System.out.println("Invalid entry. Try again..");
			}
			scn.reset();
			itr = aList.iterator();
			for(int i=0;itr.hasNext();i++){
				System.out.println(i + 1 + ". " + itr.next());
			}
			scn = new Scanner(System.in);
		}

		System.out.println("Final list:");
		itr = aList.iterator();
		for(int i=0;itr.hasNext();i++){
			System.out.println(i+1 + ". " + itr.next());
		}
	}
}
