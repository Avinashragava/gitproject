package org.java;

public class Swapping {
	static int a=50;
	static int b= 20;
	public static void usingThirdVar() {
		int c=a;
		a=b;
		b=c;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void addAndSub() {
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("a="+a+"b="+b);
	}
	public static void mulAndDiv() {
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a="+a+"b="+b);
		

	}
	

	public static void main(String[] args) {
		mulAndDiv();
		
		
		
		
		

		
	}

}
