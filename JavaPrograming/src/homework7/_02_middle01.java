package homework7;

import java.util.Scanner;

public class _02_middle01 {
	
	 public static String replaceString(String s) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            if ((i + 1) % 3 == 0) {
	                sb.append('3');
	            } else if ((i + 1) % 5 == 0) {
	                sb.append('5');
	            } else {
	                sb.append(c);
	            }
	        }
	        return sb.toString();
	    }

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요: ");
        String s = scanner.nextLine();
        String result = replaceString(s);
        System.out.println("변경된 문자열: " + result);
        scanner.close();

	}

}
