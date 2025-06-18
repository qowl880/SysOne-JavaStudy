package thiskeyword;

class A5{
	int m1,m2,m3,m4;
	A5(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	A5(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	A5(int a, int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
}

class B2{
	int m1, m2, m3, m4;
	B2(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	B2(int a){
		this();
		m1 = a;
	}
	
	B2(int a, int b){
		this(a);
		m2 = b;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

public class ThisMethod {
	public static void main(String[] args) {
		A5 a1 = new A5();
		A5 a2 = new A5(10);
		A5 a3 = new A5(10,20);
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		B2 b1= new B2();
		B2 b2= new B2(10);
		B2 b3= new B2(10,20);
		b1.print();
		b2.print();
		b3.print();
	}
}
