package practice;

class A3{
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	
	void print(int num) {
		System.out.println("정수 입력값 : "+num);
	}
	
	void print(double num) {
		System.out.println("실수 입력값 : "+num);
	}
	
	void print(String str) {
		System.out.println("문자열 입력값 : "+str);
	}
}

public class Seven_two {
	public static void main(String[] args) {
		A3 a = new A3();
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("안녕");

			
	}

}

