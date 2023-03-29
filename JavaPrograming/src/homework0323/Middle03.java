package homework0323;

import java.util.Scanner;

public class Middle03 {
	static int f(int num ) {
		if(num == 0)return 0;
		return f(num-1)+num;
	}

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자까지의 합을 구하는 정수를 입력하시오");
		int num = sc.nextInt();
		System.out.println(f(num));
	}

}
