package Collection;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {
	
	/*
	 * HashTable은 HashMap과 같은 기능을 수행하는데 sycronized가 포함되어 있음
	 */
	public static void main(String[] args) {
		Map<Integer, String> hTable1 = new Hashtable<Integer, String>();
		
		// 1. put
		hTable1.put(2,"나다라");
		hTable1.put(1,"가나다");
		hTable1.put(3,"다라마");
		System.out.println(hTable1.toString());
		
		// 2. putAll
		Map<Integer, String> hTable2 = new Hashtable<Integer,String>();
		hTable2.putAll(hTable1);
		System.out.println(hTable2.toString());
		
		// 3. replace
		hTable2.replace(1,  "가가가");
		hTable2.replace(4,  "라라라");		// 동작 안함
		System.out.println(hTable2.toString());
		
		// 4. repalce
		hTable2.replace(1,  "가가가", "나나나");
		hTable2.replace(4,  "라라라", "다다다");		// 동작 안함
		System.out.println(hTable2.toString());
		
		// 5. V get
		System.out.println(hTable2.get(1));
		System.out.println(hTable2.get(2));
		System.out.println(hTable2.get(3));
		
		// 6. containsKey
		System.out.println(hTable2.containsKey(1));
		System.out.println(hTable2.containsKey(5));
		
		// 7. containsValue
		System.out.println(hTable2.containsKey("나나나"));
		System.out.println(hTable2.containsKey("다다다"));
		
		// 8. Set
		Set<Integer> keySet = hTable2.keySet();
		System.out.println(keySet.toString());
		
		// 9. Set entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet.toString());
		
		// 10. size()
		System.out.println(hTable2.size());
		
		// 11. remove
		hTable2.remove(1);
		hTable2.remove(4);				// 동작 안함
		System.out.println(hTable2.toString());
		
		
		// 12.remove
		hTable2.remove(2,"나다라");
		hTable2.remove(3, "다다다");			// 동작 안함
		System.out.println(hTable2.toString());
		
		// 13. clear
		hTable2.clear();
		System.out.println(hTable2.toString());
	}
}
