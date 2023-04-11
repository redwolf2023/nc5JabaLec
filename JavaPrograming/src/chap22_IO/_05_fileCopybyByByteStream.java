package chap22_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _05_fileCopybyByByteStream {

	public static void main(String[] args) {

		String originFileNm = 
				"D:/java/LinkedList.jpg";
		String copyFileNm =
				"D:/java/LinkedListCopy.jpg";
		
		try {
			InputStream is =
					new FileInputStream(originFileNm);
			OutputStream os =
					new FileOutputStream(copyFileNm);
			
			byte[] readData = new byte[1024];
			
			while(true) {
				int cnt = is.read(readData);
				
				if(cnt == -1) {
					break;
				}
				
				os.write(readData);
			}
			os.flush();
			
			is.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
