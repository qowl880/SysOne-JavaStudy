package InnerClass;

class A3{
	int a = 3;
	static int b =4;
	
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	
	// 정적 이너 클래스
	static class B3{
		void bcd() {
			// System.out.println(a);  오류 발생
			System.out.println(b);
			
			// method1();  오류 발생
			method2();
		}
	}
}


public class StaticCreateObjectAndAccessMember {
	public static void main(String[] args) {
		// 정적 이너 클래스의 객체 생성 - 외부 클래스 객체 생성 필요 없이 바로 생성 가능
		A3.B3 b = new A3.B3();
		
		b.bcd();
	}
}
