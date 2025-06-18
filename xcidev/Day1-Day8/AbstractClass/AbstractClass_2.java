package AbstractClass;

abstract class A2{
	abstract void abc();
}

public class AbstractClass_2 {
	public static void main(String[] args) {
		A2 a1 = new A2() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		A2 a2 = new A2(){
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		a1.abc();
		a2.abc();
	}
}
