package homework0329.study;

import java.util.Scanner;

import chap18_enum.enums.DefaultMonth;

public class IfEx {

	public static void main(String[] args) {

		//1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요.");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 정수를 입력하세요.");
//		int num2 = sc.nextInt();
//		
//		int max = num1;
//		if(num2 > max) {
//			max = num2;
//		}else {
//			max = num1;
//		}
//		System.out.println("두 정수 중 크기가 큰 값은 : " + max + "입니다.");
		
		//2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
		
//		System.out.println("정수를 입력하세요");
//		int num = sc.nextInt();
//		
//		if(num > 0) {
//			System.out.println("양수입니다");
//		}
//		if(num < 0) {
//			System.out.println("음수입니다.");
//		}
//		sc.close();
		
		//3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, 
		//"Python"인 경우 "공부중인 언어입니다."를 출력하고, 
		//그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
		
//		System.out.println("문자열을 입력하세요");
//		String str = sc.nextLine();
//		
//		switch(str){
//		
//		case "Java" : System.out.println("좋아하는 언어입니다.");
//						break;
//		case "Python" : System.out.println("공부중인 언어입니다.");
//						break;
//		default : System.out.println("다른 언어를 공부해보세요.");				
//		}
		
		//4.사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.
		//(switch~case~default 사용)
		
//		System.out.println("숫자를 입력하세요.");
//		int num = sc.nextInt();
//		
//		switch(num % 3) {
//		case 0 : 
//		System.out.println("3의 배수입니다."); 
//		break;
//		default :
//		System.out.println("3의 배수가 아닙니다.");
//		break;
//		}
		
		//5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
		
//		System.out.println("숫자를 입력하세요.");
//		int num = sc.nextInt();
//		
//		if(num % 2 == 0) {
//			System.out.println("짝수 입니다.");
//		} else if(num % 2 == 1) {
//			System.out.println("홀수 입니다.");
//		} else {
//			System.out.println("아무것도 아닙니다.");
//		}
//		
		//6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
//		int[] arr = new int[5];
//		for(int i = 0; i < 5; i++) {
//			System.out.println("정수를 입력하세요.");
//			arr[i] = sc.nextInt();
//		}
//		int max = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//				
//			}
//		}
//		System.out.println("제일 큰 값은 : " + max);
		
		//7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 
		//그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
		
//		System.out.println("Yes나 No를 입력하세요.");
//		String str = sc.nextLine();
//		
//		if(str.equals("Yes")) {
//			System.out.println("예");
//		} else if(str.equals("No")) {
//			System.out.println("아니요");
//		} else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		//8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.

//		System.out.println("첫번째 정수를 입력하세요.");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 정수를 입력하세요.");
//		int num2 = sc.nextInt();
//		
//		if(num1 == num2) {
//			System.out.println("두 수가 같습니다.");
//		} else if( num1 > num2) {
//			System.out.println("첫번째 수가 더 큽니다");
//		} else if(num2 > num1){
//			System.out.println("두번째 수가 더 큽니다.");
//		}

		//9.사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다." 
		//그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
		System.out.println("정수를 입력하세요");
		arr[i] = sc.nextInt();
		}
		
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {	
				count1++;
		} else if(arr[i] % 2 == 1) {
				count2++;
		} if(count1 == 3) {
			System.out.println("모두 짝수 입니다.");
		} else if(count2 == 3) {
			System.out.println("모두 홀수 입니다.");
		}
			
		}	
		System.out.println("짝수의 개수 : " + count1 + "홀수의 개수 :" + count2);	
	
	}

}
