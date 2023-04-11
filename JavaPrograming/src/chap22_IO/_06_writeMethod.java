package chap22_IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class _06_writeMethod {

	public static void main(String[] args) {

		try {
			Writer writer =
					new FileWriter(
							"D:/java/wr01.txt");

			//1. 문자 하나씩 입력
			char ch1 = 'A';
			char ch2 = 'b';
			
			writer.write(ch1);
			writer.write(ch2);
			
			//2. 문자 배열로 출력
			char[] chArr = new char[26];
			
			for(int i = 65; i <= 90; i++) {
				chArr[i - 65] = (char)i;
			}
			writer.write(chArr);
			
			for(int i = 97; i <= 122; i++) {
				chArr[i - 97] = (char)i;
				
			}
			writer.write(chArr, 20, 3);
			
			//3. 문자열 출력
			String str = "가나다라";
			
			writer.write(str);
			writer.write(str, 2, 1);
			
			writer.flush();
			
			writer.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
