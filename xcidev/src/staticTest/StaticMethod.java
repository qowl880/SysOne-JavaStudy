package staticTest;

class A2{
	void abc() {
		System.out.println("instance 메서드");
	}
	static void bcd() {
		System.out.println("static 메서드");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		A2 a1 = new A2();
		a1.abc();
		
		A2.bcd();
		
		A2 a2 = new A2();
		a2.bcd();
	}
}
