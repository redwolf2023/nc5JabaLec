package chap22_IO;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

public class _03_inputStreamRead {

	public static void main(String[] args) {

		try {
			InputStream is =
					new FileInputStream("D:/java/ex01.txt");
			while(true) {
				//byte로 입력한 데이터라 byte로 받아와야
				//부호가 정확하게 출력된다.
				int data = (byte)is.read();
				
				//더 이상 읽을 데이터가 없을 때는 -1 리턴
				if(data == -1) {
					break;
				}
				
				System.out.println(data);
			}
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
