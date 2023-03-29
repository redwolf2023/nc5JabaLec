package homework0314;

public class Advancedif {

	public static void main(String[] args) {

		
		String str = "dBEfIZ";
		String prStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			char convertCh; 
			 if (ch >= 'A' && ch <= 'Z') {
			        if ((ch + 33) > 'z') {
			            convertCh = (char)(('a' - 1) + ((ch + 33) - 'z'));
			        } else {
			            convertCh = (char)(ch + 33);
			        }
			    } else {
			        if ((ch - 33) < 'A') {
			            convertCh = (char)(('z' + 1) - ('A' - (ch - 33)));
			        } else {
			            convertCh = (char)(ch - 33);
			        }
			    }
			    prStr = convertCh + prStr;
			}
			System.out.println(prStr);
	}

}
