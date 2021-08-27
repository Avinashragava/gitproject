package org.java;

public class LeadingAndTrailing {
	public static void main(String[] args) {
		String str="   i am avinash  ";
		System.out.println(str.trim());
		System.out.println(str.replaceAll("^[ /t]+|[ /t]+$", ""));
	}

}
