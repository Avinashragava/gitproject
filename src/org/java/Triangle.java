package org.java;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of lines");
		int lines = s.nextInt();
		for(int i=0;i<lines;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
		}
			System.out.println();
		}
		
		
	}

}
