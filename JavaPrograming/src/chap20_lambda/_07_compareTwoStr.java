package chap20_lambda;

import chap20_lambda.clazz.CompareStr;

public class _07_compareTwoStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		action(String :: equals);
	}

	

	public static void action(CompareStr cst) {
		
		boolean result = cst.compareTwoStr("bit", "naver");
		if(result == true) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
				
			
	}
}
