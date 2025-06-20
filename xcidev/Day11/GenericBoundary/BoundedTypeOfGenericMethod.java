package GenericBoundary;


class A2{			// Number를 상속받아 Number안에 있는 실수, 정수 등 숫자 모두 사용 가능
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}

interface MyInterface{
	public abstract void print();
}

class B2{		// MyInterface를 상속받아 print()메서드만 사용 가능
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A2 a = new A2();
		a.method1(5.8);
		a.method1(3);
		
		B2 b = new B2();
		b.method1(new MyInterface() {
			@Override
			public void print() {
				System.out.println("print() 구현");
			}
		});
	}
}
