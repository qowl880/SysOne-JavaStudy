package Super;


class A2{
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}

class B2 extends A2{
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	
	void bcd() {
		super.abc();
	}
}

public class SuperKeyword_2 {
	public static void main(String[] args) {
		B2 bb = new B2();
		
		bb.bcd();
	}
}
