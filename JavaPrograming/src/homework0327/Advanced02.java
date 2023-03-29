package homework0327;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advanced02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> Num = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요.");
			int input = sc.nextInt();
			Num.add(input);	
		}
		
		int maxSum = Integer.MIN_VALUE;
		int maxIndex = 0;
		
		for(int i = 0; i < Num.size() - 1; i++) {
			int sum = Num.get(i) + Num.get(i + 1);
			if(sum > maxSum) {
				maxSum = sum;
				maxIndex = i;
			}
		}
		
		System.out.println(Num.get(maxIndex) + ", " + Num.get(maxIndex + 1));
		
		
		
		
		
		
	}

}
