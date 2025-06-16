package overloadandoverriding;

class A{
	void print1() {
		System.out.println("A 클래스 print1");
	}
	void print2() {
		System.out.println("A 클래스 print2");
	}
}

class B extends A{
	@Override
	void print1() {
		System.out.println("B클래스 print");
	}
	void print2(int a) {
		System.out.println("B클래스 print2");
	}
}

public class MethodOverriding_3 {
	public static void main(String[] args) {
		A aa = new A();
		aa.print1();
		aa.print2();
		System.out.println();
		
		B bb = new B();
		bb.print1();
		bb.print2();
		bb.print2(3);
		System.out.println();
		
		A ab = new B();
		ab.print1();
		ab.print2();
	}
}
