package Homework0404;

import Homework0404.clazz.EvenNumPrint;
import Homework0404.clazz.StbCombine;

public class homework0404 {

	public static void main(String[] args) {

		
		action1((arr)->{
			for(int i : arr) {
				if(i % 2 == 0)
					System.out.println(i);
			}
		});
		
		System.out.println("-------------");
		
		action2((sb1, sb2) -> {
			StringBuilder returnSb = sb1.append(sb2);
			return returnSb.reverse();
		});
		
	}
	
	public static void action1(EvenNumPrint enp) {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println("-------------------");
		enp.printEvenNum(arr);
	}
	
	public static void action2(StbCombine sc) {
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("DEF");
		
		System.out.println(sc.combineStringBuilder(sb1, sb2));
		
		
		
		
		
		
		
		
		
	}
		
}
