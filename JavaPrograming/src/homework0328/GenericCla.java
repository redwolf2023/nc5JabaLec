package homework0328;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenericCla<T> {
	
	private T t;
	
	public T getT() {
		return t;
		
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public static <T> String add(T t1, T t2) {
		return t1.toString() + t2.toString();
	}
	
	public static Integer add(List<?> list) {
		
		Integer sum = 0;
		for(Object o : list) {
			if(o instanceof Integer) {
				sum +=(Integer) o;
			}
		}
		return sum;	
	}
	
	public static <T> void printArr(T[] arr1) {
		for(int i = 0; i < arr1.length; i++) {
			if(i % 3 == 0) {
				System.out.println(arr1[i]);
			}
		}
	}
	
	public static <T extends Number> T getMin(T[] arr2) {
		
		if(arr2 == null || arr2.length == 0) {
			return null;
		}
		T min = arr2[0];
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i].doubleValue() < min.doubleValue()) {
				min = arr2[i];
			}
		}
		return min;
	}
	
	public static <K, V> void printOverTen(Map<K, V> map) {
		if(map == null || map.isEmpty()) {
			return;
		}
		
		for(Map.Entry<K, V> entry : map.entrySet()) {
			V value = entry.getValue();
			if(value instanceof String && ((String)value).length() >= 10) {
				System.out.println(entry.getKey());
			}
		}
	}
	
}
