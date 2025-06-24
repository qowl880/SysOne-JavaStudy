package Lambda;

interface A{
	void abc();
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("메서드 내용 1");
	}
}

public class _1_OOPcsFP {
	public static void main(String[] args) {
		// 1. 객체 지향 문법
		A a1  = new B();
		a1.abc();
		
		// 2. 익명 이너 클래스 사용
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
		
		a2.abc();
		
		// 3. 람다식
		A a3 = () -> {
			System.out.println("메서드 내용 3");
		};
		a3.abc();
	}
}
