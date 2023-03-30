package homework0329.study;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class Varible2 {

	public static void main(String[] args) {

		//2.사용자가 입력한 두개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫번째 정수 하나를 입력하시오");
//		int a = sc.nextInt();
//		System.out.println("두번째 정수 하나를 입력하시오.");
//		int b = sc.nextInt();
//		char c = '\0';
		
//		System.out.println(a + b);
		
		//4.사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		
//			System.out.println("정수5개를 입력하세요");
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int c = sc.nextInt();
//			int d = sc.nextInt();
//			int e = sc.nextInt();
//			int sum = a+b+c+d+e;
//			int avg = sum / 5;
//			
//			System.out.println("합계:" + sum);
//			System.out.println("평균" + avg);
//			
		//5.사용자가 입력한 세 정수의 최소값, 중간값, 최대값을 출력하세요.	
			
//		int[] num = new int[3];
//        System.out.println("정수 3개를 입력하세요.");
//        for (int i = 0; i < 3; i++) {
//            System.out.print("num[" + i + "] = ");
//            num[i] = sc.nextInt();
//        }
//
//        // 최소값, 중간값, 최대값 계산
//        Arrays.sort(num);
//        int min = num[0];
//        int max = num[num.length - 1];
//        int middle = num[1];
//
//        // 결과 출력
//        System.out.println("최소값: " + min);
//        System.out.println("중간값: " + middle);
//        System.out.println("최대값: " + max);
//
//        sc.close();
//			
		//6.사용자가 입력한 정수의 구구단을 출력하세요.
        
//        System.out.println("구구단을 실행할 숫자를 입력하세요 :");
//        int i = sc.nextInt();
//        for(int j = 1; j < 10; j++) {
//        	System.out.println(i + "*" + j + "=" + i * j);
//        }
		
        //7.사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.
        
//		System.out.println("팩토리얼값을 원하는 숫자를 입력하세요.");
//		System.out.print(">>>");
//		int n = Integer.parseInt(sc.nextLine());
//		long result = 1l;
//		
//		for(int i = 1; i <= n; i++) {
//			result *= i;
//		}
//		System.out.println(n + "! = " + result);
		
		//8.사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요. 사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		double[] Arr = new double[10];
		int count = 0;
		int primeCount = 0;
		
		while(count < 10) {
			System.out.println("2~30 사이의 정수를 입력하세요(" + (count + 1) + "/10) : ");
			double input = sc.nextDouble();
			
			if(input < 2 || input > 30) {
				System.out.println("잘못된 입력입니다. 2~30 사이의 정수를 입력하세요.");
				continue;
			}
		Arr[count] = input;
		count++;
		}		
		
		for(int i = 0; i < Arr.length; i++) {
			double num = Arr[i];
			boolean isPrime = true;
			
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime && num > 1) {
				primeCount++;
			}
		}
		System.out.println("입력한 수 중 소수의 개수" + primeCount);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
