package homework0331;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Middle02 {

	public static void main(String[] args) {
		
		int totalPrice;
		String foodName;
		int foodPrice;
		int count;
		
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("라면", 2000);
		map.put("떡볶이", 4000);
		
		
		System.out.println("음식을 입력하세요");
		foodName = sc.nextLine();
		if(map.containsKey(foodName) == false) {
			System.out.println("해당 메뉴가 없습니다. 메뉴를 보시고 다시 입력하세요.");
			foodName = sc.nextLine();
		}
		
		System.out.println("수량을 입력하세요");
		count = sc.nextInt();
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getKey().equals(foodName)) {
				totalPrice = entry.getValue() * count;
				System.out.println("총 금액은 " + totalPrice + "입니다.");
	
			} 
			
		}
		
		String studentName;
		int score;
		int max;
		
		Map<String,Integer> mp = new HashMap<String,Integer>();
		mp.put("홍길동", 100);
		mp.put("세종대왕", 90);
		mp.put("이순신", 80);
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() >= 90) {
				max = entry.getKey().to
			}
		}
		

	}
	
}
