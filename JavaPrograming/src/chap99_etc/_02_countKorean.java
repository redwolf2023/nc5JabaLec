package chap99_etc;

public class _02_countKorean {

	public static void main(String[] args) {

		String str = "가A나B다C라D";
		char ch;
		int kCnt = 0;
		int eCnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(ch >= 44032 && ch <= 55203)
				kCnt++;
			else if (ch >= 32 && ch <= 126)
				eCnt++;
		}System.out.println(kCnt+eCnt);
	}

}
