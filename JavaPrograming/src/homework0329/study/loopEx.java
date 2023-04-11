package homework0329.study;

import java.util.Scanner;

public class loopEx {

	public static void main(String[] args) {
		
		//1. 1부터 10까지의 정수의 합을 출력하세요.
//		int sum = 0;
//
//		for(int i = 0 ;  i < 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		//2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
		
//		int num1 = 2;
//		
//		int result = num1;
//		
//		for(int i = 0; i < 10; i++) {
//			result *= num1;
//		}
//		System.out.println(result);
		
		//3.사용자가 입력한 정수까지의 모든 소수를 출력하세요.
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		for(int i = 2; i <= num; i++) {
//			int cnt = 0;
//			for(int j = 2; j <= i; j++) {
//				//자기 자신이 아닌 다른 값으로 나눠 떨어짐
//				if(i % j == 0 && i != j) {
//					cnt++;
//				}
//			}
//			if(cnt == 0) {
//				System.out.println(i);
//			}
//		}
		//7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int min = num1 > num2 ? num2 : num1;
		
		int gcd = 1;
		
		for(int i = 1; i < min; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		int common = num1 * num2 / gcd;
		
		System.out.println("최대공약수 : " + gcd);
		System.out.println("최소공배수 : " + common);
		
		
	}

}
