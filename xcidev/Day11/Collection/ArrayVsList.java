package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {
	public static void main(String[] args) {
		
		// 배열
		String[] arr = new String[] {"가","나","다","라","마","바","사"};
		System.out.println(arr.length);
		arr[2] = null;
		arr[5] = null;
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
		// 리스트
		List<String> aList = new ArrayList<>();
		System.out.println(aList.size());
		aList.add("가");
		aList.add("나");
		aList.add("다");
		aList.add("라");
		aList.add("마");
		aList.add("바");
		aList.add("사");
		System.out.println(aList.size());
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList.size());
		System.out.println(aList);
	}
}
