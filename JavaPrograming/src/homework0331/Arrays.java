package homework0331;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[10];
//		for(int i = 0; i < 10; i++) {
//			System.out.println("정수 10개를 입력하세요");
//			int num = sc.nextInt();
//			arr[i] = num;
//		}
//		double avg = 0;
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		avg = sum / (double)arr.length;
//		
//		System.out.println("평균 : " + avg);
//		
//		
		
		int[] arr = new int[100];
		int j = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				arr[j] = i;
				j++;
						
			}
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열의 합 :" + sum);
	
	}

}
