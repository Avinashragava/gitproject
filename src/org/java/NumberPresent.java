package org.java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NumberPresent {
	static int array[]= {1,2,3,4,5,6,7};
		static Scanner obj=new Scanner(System.in);
	    static int num=obj.nextInt(); 
public static void numFind() {
		for (int i : array) {
			if(i==num) 
				System.out.println("number 4 present");
			else
				System.out.println("not present");
		}
	}
public static void method2() {
	
	boolean anyMatch = IntStream.of(array).anyMatch(element->element==num);
	if(anyMatch)
		System.out.println("present");
	else
		System.out.println("not present");

}
public static void main(String[] args) {
	
	method2();
	
}
}



