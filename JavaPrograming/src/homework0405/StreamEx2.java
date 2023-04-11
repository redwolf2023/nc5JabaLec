package homework0405;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		
		
		//스트림 05
//		List<String> strList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("문자열을 입력하세요.");
//			String str = sc.nextLine();
//			strList.add(str);
//			
//			Stream<String> filteredStream = 
//					strList.stream().filter(str1 ->
//					str.matches(".*[a-zA-Z]+.*"));
//			filteredStream.forEach(str1 ->
//			System.out.println(str));
			
		//스트림 04
		List<Character> charList = new ArrayList<Character>();
		for(int i = 0; i < 10; i++) {
			System.out.println("영문자를 입력하세요.");
			char ch = sc.next().charAt(0);
			charList.add(ch);
			
			Stream<Character> convertedStream =
					charList.stream().map(c ->{ 
					if(Character.isLowerCase(c)) {
						return Character.toUpperCase(c);
					} else if(Character.isUpperCase(c)) {
						return Character.toLowerCase(c);
					} else {
						return ch;
					}
			});
			
			convertedStream.forEach(c ->System.out.println(c + " "));
		
		}
		
		
		
		
		
	}
}
