package thiskeyword;

class A4{
	A4() {
		System.out.println("첫 번째 생성자");
	}
	
	A4(int a){
		this();
		System.out.println("두 번째 생성자");
	}
}

public class ThisMethod_1 {
	public static void main(String[] args) {
		A4 a1 = new A4();
		System.out.println();
		A4 a2 = new A4(3);
	}
}
