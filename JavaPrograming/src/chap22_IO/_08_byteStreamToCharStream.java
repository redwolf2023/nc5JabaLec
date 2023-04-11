package chap22_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class _08_byteStreamToCharStream {

	public static void main(String[] args) {

		write("aaa");
		write("bbb");
		String str = read();
		System.out.println(str);
		
	}
	
	public static void write(String str) {
		try {
			OutputStream os =
					new FileOutputStream("D:/java/hp01.txt");
			
			//OutputStreamWriter를 이용해서
			//바이트스트림 -> 문자스트림으로 변환
			Writer writer =
					new OutputStreamWriter(os, "UTF-8");
			
			writer.write(str);
			
			writer.flush();
			writer.close();
			
		} catch (FileNotFoundException fne) {
			// TODO Auto-generated catch block
			fne.printStackTrace();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	//InputStreamReader를 이용해서
	//바이트스트림 -> 문자스트림으로 변환 해주는 메소드
	public static String read() {
		String returnStr = "";
		try {
			InputStream is =
					new FileInputStream("D:/java/hp01.txt");
			
			Reader reader =
					new InputStreamReader(is, "UTF-8");
			
			char[] chArr = new char[4096];
			
			
			while(true) {
				int cnt = reader.read(chArr);
				
				if(cnt == -1) {
					break;
				}
				for(int i = 0; i < cnt; i++) {
				returnStr = returnStr + 
						String.valueOf(chArr[i]);
				}
			}
		} catch (FileNotFoundException fne) {
			// TODO Auto-generated catch block
			fne.printStackTrace();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return returnStr;
	}

	
	
}

