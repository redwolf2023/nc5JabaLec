package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		
		
		//사용자가 5개 정수 입력 => 배열에 저장
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
	
		for(int i = 0; i <num.length; i++) {
			System.out.println("5개의 정수를 입력하시오");
			num[i] = sc.nextInt(); // 입력 받은 정수를 배열에 저장
			}
		int max = num[0];
		int min = num[0];
		for(int i = 0; i < num.length; i++) {
			max = Math.max(max, num[i]);
			max = Math.min(min, num[i]);
		}
		
		System.out.println(max);
		System.out.println(min);
		sc.close();
		
		//Math.max와 Math.min을 이용하여
		//최소값, 최대값 구하기
	}

}
