package OverlapInstanceField;

class A2{
	static int m = 3;
}

class B2 extends A2{
	static int m = 4;
}


public class OverlapStaticField {
	public static void main(String[] args) {
		System.out.println(A2.m);
		System.out.println(B2.m);
		System.out.println();
		
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
	}
}
