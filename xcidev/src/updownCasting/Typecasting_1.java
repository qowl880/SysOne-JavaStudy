package updownCasting;

/*
 * 			A
 * 		    |
 * 			B
 * 		  /   \
 * 		 C	   D
 */
class A2{}
class B2 extends A2{}
class C2 extends B2{}
class D2 extends B2{}

public class Typecasting_1 {
	public static void main(String[] args) {
		A2 ac = (A2) new C2();		// C -> A 업캐스팅
		B2 bc = (B2) new C2();		// C -> B 업캐스팅
		
		B2 bb = new B2();			
		A2 a = (A2) bb;				// B -> A 업캐스팅
		
		A2 aa = new A2();
//		B2 b = (B2) aa;	 	A -> B 다운캐스팅 불가능
//		C2 c = (C2) aa;	 	A -> C 다운캐스팅 불가능
		
		A2 ab = new B2();
		B2 b = (B2) ab;
//		C2 c = (C2) ab;		A -> C 다운캐스팅 불가능
		
		B2 bd = new D2();
		D2 d = (D2) bd;		// B -> D 다운캐스팅
		
		A2 ad = new D2();	
		B2 b1 = (B2) ad;	// A -> B 다운캐스팅
		D2 d1 = (D2) ad;	// A -> D 다운캐스팅
	}
}
