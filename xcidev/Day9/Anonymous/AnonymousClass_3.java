package Anonymous;

interface A3{
	public abstract void abc();
}

class B2 implements A3{
	public void abc() {
		System.out.println("입력매개변수 전달");
	}
}

class C3{
	void cde(A3 a) {
		a.abc();
	}
}


public class AnonymousClass_3 {
	public static void main(String[] args) {
		C3 c = new C3();
		A3 a = new B2();
		c.cde(a);
		c.cde(new B2());
	}
}
