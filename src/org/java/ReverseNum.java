package org.java;

public class ReverseNum {
	public static void main(String[] args) {
		
	long inputNum=9876543210l;
	long revNum = 0;
	while(inputNum!=0) {
	revNum=revNum*10;
	revNum=revNum+inputNum%10;
	inputNum=inputNum/10;
	}
	System.out.println(revNum);
	}
	
	

}
