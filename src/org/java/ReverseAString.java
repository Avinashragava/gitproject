package org.java;

public class ReverseAString {
	public static void main(String[] args) {
	String name="avinash";
	StringBuffer str=new StringBuffer();
	StringBuffer append = str.append(name);
	System.out.println(append.reverse());
	
	char[] charArray = name.toCharArray();
	
	for(int i=charArray.length-1;i>=0;i--) {
		 char c = charArray[i];
		 System.out.print(c);
	}
	
	
	
	}

}
