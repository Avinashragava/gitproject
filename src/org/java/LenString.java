package org.java;

import java.util.Scanner;

public class LenString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String next = s.next();
		char[] charArray = next.toCharArray();
		int len=0;
		for (char c : charArray) {
			len++;
		}
		System.out.println(len);
	}
	

}
