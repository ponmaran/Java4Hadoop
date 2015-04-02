package com.ponmaran.session2;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t1\t2\t3\t4\t5\n");
		for(int i=1;i<=5;i++){
			System.out.print(i);
			for(int j=1;j<=5;j++)
				System.out.print("\t" + i*j);
			System.out.println("\n");
		}
	}

}
