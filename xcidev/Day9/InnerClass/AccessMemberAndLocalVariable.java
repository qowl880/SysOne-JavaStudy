package InnerClass;

class A4{
	int a = 3;
	void abc() {
		int b = 5;
		
		class B4 {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
				// b = 7;	지역 이너 클래스에서 시용하는 지역 변수는 자동 final 선언
			}
		}
		
		B4 bb = new B4();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A4 a = new A4();
		a.abc();
	}
}
