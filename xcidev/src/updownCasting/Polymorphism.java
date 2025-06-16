package updownCasting;

/*
 * 			A
 * 		    |
 * 			B
 * 		  /   \
 * 		 C	   D
 */
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism {
	public static void main(String[] args) {
		A a1 = new A();		// A는 A이다
		A a2 = new B();		// B는 A이다
		A a3 = new C();		// C는 A이다
		A a4 = new D();		// D는 A이다  
		
//		B b1 = new A();		부모 클래스 변형 불가
		B b2 = new B();
		B b3 = new C();
		B b4 = new D();
		
//		C c1 = new A();		부모 클래스 변형 불가
//		C c2 = new B();		부모 클래스 변형 불가
		C c3 = new C();
//		C c4 = new D();		관계없는 클래스 변형 불가
		
//		D d1 = new A();		부모 클래스 변형 불가
//		D d2 = new B();		부모 클래스 변형 불가
//		D d3 = new C();		관계없는 클래스 변형 불가
		D d4 = new D();
	}
}
