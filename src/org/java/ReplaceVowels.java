package org.java;

public class ReplaceVowels {
	public static void main(String[] args) {
		String str="i love india";
		String str1="i love india";
		/*String ans = str.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(ans);*/
		
		
		///anothermethod
		char[] charArray = str.toCharArray();
		for (int i=0;i<str.length();i++) {
			if(charArray[i]=='a' || charArray[i]=='e'||charArray[i]=='i'|| charArray[i]=='o'||charArray[i]=='u' ||  charArray[i]=='A' || charArray[i]=='E'||  charArray[i]=='O'|| charArray[i]=='U'|| charArray[i]=='I') {
				str1.replace(charArray[i],'*');
		
		}
		}
		System.out.println(str1);
	}
}
		
	
