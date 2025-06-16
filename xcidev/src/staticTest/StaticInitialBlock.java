package staticTest;

class A3{
	int a;
	static int b;
	static {
		b=5;		// 정적 필드의 초기화는 static{} 내에서 수행
		System.out.println("클래스 A가 로딩됐습니다!!");
	}
	A3(){
		b += 3;
		System.out.println("클래스 A 생성자");
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(A3.b);
		A3 a = new A3();
		System.out.println(A3.b);
	}
}
