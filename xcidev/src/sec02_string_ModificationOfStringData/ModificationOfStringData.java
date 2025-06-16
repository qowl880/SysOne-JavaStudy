package sec02_string_ModificationOfStringData;

import java.util.Arrays;

public class ModificationOfStringData {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = str1;
		
		str1 = "안녕하세요";
		
		System.out.println(str1);
		System.out.println(str2);
		
		int[] arr1 = {3,4,5};
		int[] arr2 = arr1;
		arr1[0] = 6;
		arr1[1] = 7;
		arr1[2] = 8;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}
}
