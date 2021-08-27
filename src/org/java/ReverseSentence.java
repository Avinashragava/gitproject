package org.java;

public class ReverseSentence {
	static String sen="me love java";
	static String reverse="";
	public static void rev() {
		String[] split = sen.split(" ");
		for(int i=split.length-1;i>=0;i--) {
     	reverse=reverse+" "+split[i];
		}
		System.out.println(reverse);
	}
public static void main(String[] args) {
	rev();
					
				}
}
	

