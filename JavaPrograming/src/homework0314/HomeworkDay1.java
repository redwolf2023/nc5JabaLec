package homework0314;

public class HomeworkDay1 {

	public static void main(String[] args) {

		//basic
		int num = 10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
		
		int a = 10;
		int b = 20;
		
		if(a < b == true) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		//middle
		int age = 29;
		String message = (age >= 20 && age < 30) ? "20대 입니다" : "20대가 아닙니다.";
		System.out.println(message);
		
		for(int i = 1; i <= 100; i++) {
			if((i%2 == 0) && (i%3 == 0)) {
				System.out.println(i + ",");								
			}
		}
		//advanced
		
		String str = "dBEfIZ";
		String prStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			char convertCh = ch >= 'A' && ch <= 'Z' 
					?
					(ch + 33) > 'z' ? 
							(char)(('a' - 1) + ((ch + 33) - 'z')) :
							(char)(ch + 33)	
					:
					(ch - 33) < 'A' ? 
							(char)(('z' + 1) - ('A' - (ch - 33))) :
							(char)(ch - 33);

			prStr = convertCh + prStr;
		}
		
		System.out.println(prStr);
		
		

			
				
		}
	
		
}
