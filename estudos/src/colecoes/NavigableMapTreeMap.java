package colecoes;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTreeMap {

	public static void main(String[] args) {
		
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("A","LETRA A");
		map.put("B","LETRA B");
		map.put("C","LETRA C");
		map.put("D","LETRA D");
		map.put("E","LETRA E");
		
		for(Map.Entry<String, String> entry: map.entrySet()){
			System.out.println(entry.getKey() + entry.getValue());
		}
		
		System.out.println(map.headMap("C"));
	}

}
