package practice;

class A2 {
	boolean a;
	int b;
	double c;
	String d;
	
	void abc() {
		System.out.println(b + c);
		System.out.println(c + d);
		System.out.println(d + a);
	}
}

public class Seven_one {
	public static void main(String[] args) {
		A2 a = new A2();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		System.out.println();
		
		a.abc();
	}
}
