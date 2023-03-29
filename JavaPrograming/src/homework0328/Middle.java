package homework0328;

import java.util.Map;

public class Middle {
	
	public <K extends Number, V extends Number> Map.Entry<K, V> getMaxMul(Map<K, V> map) {
		if(map == null || map.isEmpty()) {
			return null;
		}
		
		Map.Entry<K, V>maxEntry = null;
		for(Map.Entry<K, V> entry : map.entrySet()) {
			if(maxEntry == null || getMul(entry) > getMul(maxEntry)) {
				maxEntry = entry;
			}
		}
		return maxEntry;
	}
	private static <K extends>
}
