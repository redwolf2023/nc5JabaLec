package homework0316;

import java.util.Random;

public class ArrayEx2 {

	public static void main(String[] args) {

		int[] arr = new int[20];
		Random rd = new Random();
		
		for(int i = 0; i < 20; i++) {
			arr[i] = rd.nextInt(101);
			arr[i] = (int)(Math.random() * 101);
		}
		
		System.out.print("홀수번째: ");
		for(int i = 0; i < 20; i += 2) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("짝수번째: ");
		for(int i = 19; i >= 0; i -= 2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
