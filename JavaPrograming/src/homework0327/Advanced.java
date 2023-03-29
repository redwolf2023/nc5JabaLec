package homework0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class Advanced {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String input = sc.nextLine();
		
		Map<Character, Integer> str = new HashMap<Character, Integer>();
		
		for(char c : input.toCharArray()) {
			if(str.containsKey(c)) {
				str.put(c, str.get(c) + 1);
			} else {
				str.put(c, 1);
			}
		}
		char mostFrequentChar = '\0';
		int maxCount = 0;
		for(Entry<Character, Integer> entry : str.entrySet()) {
			if(entry.getValue() > maxCount) {
				mostFrequentChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		
		System.out.println("가장 많이 등장한 문자: " + mostFrequentChar);
		System.out.println("등장 횟수 : " + maxCount);
		
	}

}
