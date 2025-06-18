package updownCasting;

class A3{
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}

class B3 extends A3{
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}


public class Typecasting_2 {
	public static void main(String[] args) {
		A3 aa = new A3();
		System.out.println(aa.m);
		aa.abc();
		
		B3 bb = new B3();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		A3 ab = new B3();
		System.out.println(ab.m);
		ab.abc();
	}
}
