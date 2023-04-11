package homework0402;

import java.util.Arrays;

public class Atm {

	public static void main(String[] args) {
		int[] p = {3, 1, 4, 3, 2};
		int sum = 0;
				
		Arrays.sort(p);
		for(int i = 0; i < p.length; i++) {
			for(int j = 0; j <= i; j++) {
				sum = sum + p[j];	
				System.out.println(p[j]);
			}
			System.out.println("----------");
		}
		System.out.println(sum);
	}
}
