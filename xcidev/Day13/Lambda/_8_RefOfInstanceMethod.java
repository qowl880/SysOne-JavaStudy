package Lambda;

interface A8{
	String abc(String str);
}

public class _8_RefOfInstanceMethod {
	public static void main(String[] args) {
		
		A8 a1 = new A8() {
			@Override
			public String abc(String str) {
				return str.toLowerCase();
			}
		};
		
		A8 a2 = (String str) -> str.toLowerCase();
		
		A8 a3 = String::toUpperCase;
		
		
		System.out.println(a1.abc("Hello"));
		System.out.println(a2.abc("Hello"));
		System.out.println(a3.abc("Hello"));
	}
}
