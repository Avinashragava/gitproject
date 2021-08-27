package org.java;

import java.util.Scanner;

public class OccurenceOfLetter {
	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner s=new Scanner(System.in);
		String input = s.next();
		System.out.println("enter char to find");
		char chVar = s.next().charAt(0);
		
		char[] charArray = input.toCharArray();
		int count=0;
		for (char c : charArray) {
			if(c==chVar) {
				count++;
				
			}
			
		}
		System.out.println(count);
		
			
		}
		
	}


