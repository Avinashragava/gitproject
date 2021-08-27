package org.java;

import java.util.Scanner;

public class TriangleNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of lines");
		int lines = s.nextInt();
		int num=1;
		for(int i=0;i<lines;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(num+" ");
				num+=1;
			}
			System.out.println();
		
		}
		}

	}
