package practice;

class A7{
	int m = 3;
	int n = 5;
	void abc(int m, int n) {
		m = this.m;
		n = n;
	}
}

public class Seven_seven {
	public static void main(String[] args) {
		A7 a = new A7();
		a.abc(7,8);
		System.out.println(a.m);
		System.out.println(a.n);
	}
}
