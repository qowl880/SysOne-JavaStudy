package constructor;

class A2{
	A2(){
		System.out.println("첫 번째 생성자");
	}
	
	A2(int a){
		System.out.println("두 번째 생성자");
	}
	
	A2(int a, int b){
		System.out.println("세 번째 생성자");
	}
}

public class ConstrictorOverloading {
	public static void main(String[] args) {
		A2 a1  = new A2();
		A2 a2 = new A2(3);
		A2 a3 = new A2(3,5);
	}
}
