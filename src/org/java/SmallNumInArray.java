package org.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallNumInArray {
	static Integer givenArray[]= {5,6,4,7,8};
	/*public static void SmallNum() {
		int maxValue = Integer.MAX_VALUE;
		for(int i=0;i<givenArray.length;i++) {
			if(givenArray[i]<maxValue) {
				maxValue=givenArray[i];
			}
		}
		System.out.println("smallest"+maxValue);
	}
		
*/		public void method2() {
		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);
		}
		//collections
		private void method3() {
			List<Integer> asList = Arrays.asList(givenArray);
			Collections.sort(asList);
			System.out.println(asList.get(0));

		}


	public static void main(String[] args) {
		SmallNumInArray s=new SmallNumInArray();
		s.method3();
	}

}
