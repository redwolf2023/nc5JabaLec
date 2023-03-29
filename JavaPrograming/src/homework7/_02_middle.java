package homework7;

import java.util.Scanner;

public class _02_middle {
	
	public static String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
			
		}
		return answer;
	}
	
	

	public static void main(String[] args) {
		_02_middle m = new _02_middle();
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오.");
		String str = sc.nextLine();
		System.out.println("결과 : " + m.solution(str));

	}

}
