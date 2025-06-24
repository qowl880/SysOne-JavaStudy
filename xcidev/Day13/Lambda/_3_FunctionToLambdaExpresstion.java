package Lambda;

interface A2{
	void method1();
}

interface B2{
	void method2(int a);
}

interface C2{
	int method3();
}

interface D2{
	double method4(int a, double b);
}

public class _3_FunctionToLambdaExpresstion {
	public static void main(String[] args) {
		// 1. 입력 x , 리턴 x
		// 1-1. 익명 이너 클래스
		A2 a1 = new A2() {
			@Override
			public void method1() {
				System.out.println("입력 x 리턴 x 함수");
			}
		};
		
		// 1-2 람다식 표현
		A2 a2 = () -> {System.out.println("입력 x 리턴 x 함수");};
		A2 a3 = () -> System.out.println("입력 x 리턴 x 함수");
		
		// 2. 입력 O, 리턴 x
		// 2-1. 익명 이너 클래스 방식
		B2 b1 = new B2() {
			@Override
			public void method2(int a) {
				System.out.println("입력 O 리턴 x 함수");
			}
		};
		
		// 2.2 람다식 표현
		B2 b2 = (int a) -> {System.out.println("입력 o 리턴 x 함수");};
		B2 b3 = (a) -> {System.out.println("입력 o 리턴 x 함수");};
		B2 b4 = (a) -> System.out.println("입력 o 리턴 x 함수");
		B2 b5 = a -> System.out.println("입력 o 리턴 x 함수");
		
		
		// 3. 입력 x 리턴 o
		// 3-1 익명 이너 클래스 방식
		C2 c1 = new C2() {
			@Override
			public int method3() {
				return 4;
			}
		};
		
		// 3-2 람다식 표현
		C2 c2 = () -> {return 4;};
		C2 c3 = () -> 4;
		
		// 4. 입력 o, 리턴 o
		// 4.1 익명 이너 클래스 방식
		D2 d1 = new D2() {
			@Override
			public double method4(int a, double b) {
				return a + b;
			}
		};
		
		// 4.2 람다식 표현
		D2 d2 = (int a, double b) -> {return a+b;};
		D2 d3 = (a,b) -> {return a + b;};
		D2 d4 = (a,b) -> a+b;
	}
}
