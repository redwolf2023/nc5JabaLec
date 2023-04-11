package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _05_arrayToString {

	public static void main(String[] args) {

		int[] intArr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			intArr[i] = (int)(Math.random() * 10) + 1;
			
		}
							//IntStream.of(intArr);
		 IntStream intStream = Arrays.stream(intArr);
		 							 
		 //5이상인 값들만 스트림으로 
		 intStream.filter(i -> i >= 5)
		 		  .map(i -> i * 4)
		 		  .forEach(i -> System.out.print(i + ", "));
		 //* 4 새로운 스트림 만들기
		 
	}

}
