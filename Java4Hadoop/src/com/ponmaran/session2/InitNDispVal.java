package com.ponmaran.session2;

public class InitNDispVal {
	int x;
	float y;
	InitNDispVal(){
		System.out.println("No value passed");
	}
	InitNDispVal(int a){
		System.out.println("Integer value passed: " + a);
		x = a;
		y = 0;
	}
	InitNDispVal(float a){
		System.out.println("Float value passed: " + a);
		x = 0;
		y = a;
	}
}
