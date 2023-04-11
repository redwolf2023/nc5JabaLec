package chap20_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import chap20_lambda.clazz.UserCharString;

public class _11_lambdaEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<UserCharString> ucs = new ArrayList<UserCharString>();
		
		for(int i = 0; i < 3; i++) {
		System.out.println("문자열을 입력하세요");
		String str = sc.nextLine();
		UserCharString ucsObj = new UserCharString(str);
		ucs.add(ucsObj);
		}
		System.out.println("찾을 문자를 입력하세요.");
		char findCh = sc.next().charAt(0);
		
		
		for(UserCharString ucsobj : ucs ) {
			ucsobj.changeStr(findCh, (c, s)->{ 
			String returnStr = "";
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == c) {
					returnStr = s;
				}
			}
			return returnStr;
			});
					
		}	
	}

}
