package Final;

class A{
	void abc() {

	}
	final void bcd() {
		System.out.println("test1");
	}
}

class B extends A {
	void abc() {}
	void bcd(int a) {
		System.out.println("test2");
	}
	// void bcd() {} -> final 메서드는 오버라이딩 불가
}

final class C{}		

// class D extends C{}	class D extends C -> final 클래스는 상속 자체가 불가능

public class FinalModifier_2 {
	public static void main(String[] args) {

	}
}
