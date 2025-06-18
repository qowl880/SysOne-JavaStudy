package field;


class A2{
	// 필드는 초기화하지 않아도 값이 강제 초기화 돼 출력 가능
	boolean m1;
	int m2;
	double m3;
	String m4;
	
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
	void printLocalVariable() {
		int k;
//		System.out.println(k);		오류 발생 지역변수는 자동초기화가 되지 않음
	}
}

public class InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {
		A2 a = new A2();
		a.printFieldValue();
	}
}
