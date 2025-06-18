package object;

class A2{
	String name;
	A2(String name){
		this.name = name;
	}
}

class B2 {
	String name;
	B2(String name){
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B2)obj).name) {
			return true;
		}else
			return false;
	}
}

public class ObjectMethod_equals {
	public static void main(String[] args) {
		A2 a1 = new A2("안녕");
		A2 a2 = new A2("안녕");
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		B2 b1 = new B2("안녕");
		B2 b2 = new B2("안녕");
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}
}
