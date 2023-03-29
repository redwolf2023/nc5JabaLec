package homework0315;

import java.util.Random;
import java.util.Scanner;

public class HomeworkDay_02_ {

	public static void main(String[] args) {

		
		//1.while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
		//while문내에 조건문을 넣어주면 됨
		
//		int i = 0;
//		while(i <= 10) {
//			i++;
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		//2.1000이하의 자연수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고,
		//그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 2 == 0 && i % 7 == 0){
				System.out.println(i);
				sum += i;
			} 
		}
			System.out.println("1000이하인 2와 7의 공배수의 합 : " + sum);
		
		 //3.구구단을 이렇게 출력하세요	
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
				System.out.println("\n");
		}
		//4.가위,바위,보 게임을 만드세요.
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int com = rd.nextInt(3);
		
		System.out.print("가위, 바위, 보 중 하나를 입력하세요. :");
		String input = sc.nextLine();
		
			
			
			
			
			
		}	
}
