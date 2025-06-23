package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> hMap1 = new HashMap<Integer, String>();
		
		// 1. put
		hMap1.put(2,"나다라");
		hMap1.put(1,"가나다");
		hMap1.put(3,"다라마");
		System.out.println(hMap1.toString());
		
		// 2. putAll
		Map<Integer, String> hMap2 = new HashMap<Integer,String>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2.toString());
		
		// 3. replace
		hMap2.replace(1,  "가가가");
		hMap2.replace(4,  "라라라");		// 동작 안함
		System.out.println(hMap2.toString());
		
		// 4. repalce
		hMap2.replace(1,  "가가가", "나나나");
		hMap2.replace(4,  "라라라", "다다다");		// 동작 안함
		System.out.println(hMap2.toString());
		
		// 5. V get
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		// 6. containsKey
		System.out.println(hMap2.containsKey(1));
		System.out.println(hMap2.containsKey(5));
		
		// 7. containsValue
		System.out.println(hMap2.containsKey("나나나"));
		System.out.println(hMap2.containsKey("다다다"));
		
		// 8. Set
		Set<Integer> keySet = hMap2.keySet();
		System.out.println(keySet.toString());
		
		// 9. Set entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet.toString());
		
		// 10. size()
		System.out.println(hMap2.size());
		
		// 11. remove
		hMap2.remove(1);
		hMap2.remove(4);				// 동작 안함
		System.out.println(hMap2.toString());
		
		
		// 12.remove
		hMap2.remove(2,"나다라");
		hMap2.remove(3, "다다다");			// 동작 안함
		System.out.println(hMap2.toString());
		
		// 13. clear
		hMap2.clear();
		System.out.println(hMap2.toString());
	}
}
