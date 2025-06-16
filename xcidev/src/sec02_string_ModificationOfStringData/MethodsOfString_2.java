package sec02_string_ModificationOfStringData;

public class MethodsOfString_2 {
	public static void main(String[] args) {
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.replace("Study", "공부"));
		
		System.out.println(str1.substring(0,5));
		
//		String[] strArray = "abc/def-ghi"
	}
}
