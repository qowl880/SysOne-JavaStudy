package overloading;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		method1(1,2);
		method1(1,2,3);
		method1();
		
		method1("안녕", "방가");
		method1("땡큐", "베리", "감사");
		method1();
	}
	
	public static void method1() {
		System.out.println("배열의 길이: ");
		
		System.out.println();
	}
	
	public static void method1(int...values) {
		System.out.println("배열의 길이: "+values.length);
		
		for(int k:values) {
			System.out.println(k + " ");
		}
		
		System.out.println();
	}
	
	public static void method1(String...values) {
		System.out.println("배열의 길이: "+values.length);
		
		for(String k:values) {
			System.out.println(k + " ");
		}
		System.out.println();
	}
}
