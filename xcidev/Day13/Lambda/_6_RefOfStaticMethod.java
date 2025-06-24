package Lambda;


interface A5{
	void abc();
}

class B5{
	static void bcd() {
		System.out.println("메서드");
	}
}

public class _6_RefOfStaticMethod {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A5 a1 = new A5() {
			@Override
			public void abc() {
				B5.bcd();
			}
		};
		
		// 2. 람다식 표현
		A5 a2 = () -> {B5.bcd();};
		
		// 3. 정적 메서드 참조
		A5 a3 = B5::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
