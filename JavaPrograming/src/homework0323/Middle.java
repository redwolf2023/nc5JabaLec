package homework0323;

import java.util.Arrays;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
//
		StringBuffer sb = new StringBuffer(30);
		sb.append("hello");
		String repeat[] = {"b","i","t"};
		int i = 0;
		while(sb.capacity() != sb.length()) {
			sb.append(repeat[i++]);
			
			if(i == repeat.length)
				i = 0;
		}
		System.out.println(sb.toString());
//		
//		System.out.println(sb.toString());
		
		
		//2.
//		StringBuffer sb = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
//		String str = sb.reverse().toString();
//		Scanner sc = new Scanner(System.in);
//		System.out.println(str);
//		int inputNum = sc.nextInt();
//		System.out.println(str.charAt(inputNum));
//		sc.close();
		
		//3.
//		
//		double money = 10000;
//		double rate = 0.1;
//		int year = 10;
//		
//		money = money + (money * rate);
//		
//		double total = money * Math.pow(1 + rate, year);
//		int totalInt = (int) total;
//		
//		System.out.println("10년 후 금액:" + totalInt + "원");
		
		}
	
	}



