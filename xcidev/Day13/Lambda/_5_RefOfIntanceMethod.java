package Lambda;

interface A4{
	void abc(int k);
}


public class _5_RefOfIntanceMethod {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A4 a1 = new A4() {
			@Override
			public void abc(int k) {
				System.out.println(k);
			}
		};
		
		// 2. 람다식으로 표현
		A4 a2 = k ->{
			System.out.println(k);
		};
		
		// 3. 정의된 인스턴스 메서드 참조
		A4 a3 = System.out::println;			// A4 a2 = k -> System.out.println(k);
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
	}
}
