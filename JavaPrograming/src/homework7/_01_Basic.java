package homework7;


public class _01_Basic {

	public static String getMiddleChars(String s) {
		
        int length = s.length();
        int midIndex = length / 2;
        if (length % 2 == 0) {
            return s.substring(midIndex - 1, midIndex + 1);
        } else {
            return s.substring(midIndex, midIndex + 1);
        }
	}
}


