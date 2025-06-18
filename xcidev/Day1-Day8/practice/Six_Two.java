package practice;

class A{
	int m;
	void method() {
		System.out.println("A의 메서드");
	}
}

public class Six_Two {
	public static void main(String[] args) {
		A a = new A();
		a.m = 5;
		System.out.println(a.m);
		a.method();
	}
}
