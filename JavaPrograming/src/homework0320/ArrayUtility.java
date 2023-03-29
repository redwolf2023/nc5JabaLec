package homework0320;

public class ArrayUtility {
	

	
	public static int[] doubleTolnt(double[] arr) {
		int[] result = new int[arr.length];//결과 배열 초기화
		for(int i = 0; i < arr.length; i++) {
			result[i] = (int)arr[i];
		}
		return result;
	}
	
	public static double[] intToDouble(int[] arr) {
		double[] result = new double[arr.length];//결과 배열 초기화
		 // s1의 모든 요소를 결과 배열로 복사
		for(int i = 0; i < arr.length; i++) {
			result[i] = (double)arr[i];
		}
		return result;
	}
	 
	
	public static int[] concat(int[] s1, int[] s2) {
		int[] result = new int[s1.length + s2.length]; //결과 배열 초기화
		for(int i = 0; i < s1.length; i++) {
			result[i] = s1[i];
		}
		for(int i = 0; i < s2.length; i++) {
			result[s1.length + i] = s2[i];
		}
		return result;
		
	}
	
	public static  int[] remove(int[] s1, int[] s2) {
		int[] result = new int[s1.length];
		int count = 0;
		for(int i = 0; i < s1.length; i++) {
			boolean found = false;
			for(int j = 0; j < s2.length; i++) {
				if(s1[i] == s2[i]) {
					found = true;
					break;
				}
			}
			if(!found) {
				result[count] = s1[i];
				count++;
			}
		}
		int[] finalResult = new int[count];
		for(int i = 0; i < count; i++) {
			finalResult[i] =result[i];
		}
		return finalResult;
	}
	
	
	
	
	
	
	
	
	
	 public static void main(String[] args) {
		 int[] a = {1,2,3,4,5,6};
		 
	 }

}
