package Lambda;

interface A10{
	B10 abc();
}

class B10{
	B10() {
		System.out.println("첫 번째 생성자");
	}
	B10(int k){
		System.out.println("두 번째 생성자");
	}
}

public class _11_RefOfClassConstructor {
	public static void main(String[] args) {
		A10 a1 = new A10() {
			@Override
			public B10 abc() {
				return new B10();
			}
		};
		
		A10 a2 = () -> new B10();
		
		A10 a3 = B10::new;
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
