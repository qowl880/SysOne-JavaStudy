package Super;


class A3{
	A3(){
		this(3);
		System.out.println("A 생성자");
	}
	
	A3(int a){
		System.out.println("A 생성자 2");
	}
}

class B3 extends A3{
	B3(){
		this(3);
		System.out.println("B 생성자");
	}
	
	B3(int a){
		System.out.println("B 생성자 2");
	}
}

class C3{
	C3(int a){
		System.out.println("C 생성자");
	}
}

class D3 extends C3{
	D3(){
		super(3);
	}
}

public class SuperMethod_1 {
	public static void main(String[] args) {
		A3 aa = new A3();
		System.out.println();
		
		B3 bb = new B3();
		System.out.println();
		
		C3 cc = new C3(3);
		C3 cd = new D3();
		
	}
}
