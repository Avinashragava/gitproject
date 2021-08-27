package org.java;

import java.util.Scanner;

public class asciivalue {
	public static void main(String[] args) {
		System.out.println("enter a char");
				 Scanner obj=new Scanner(System.in);
	     char ch=obj.next().charAt(0);
	     Character.toUpperCase(ch);
	     int asciiValue=(int)ch;
	     System.out.println(asciiValue);
	    int position= asciiValue-96;
	    System.out.println(position);
	    
	     
	}

}
