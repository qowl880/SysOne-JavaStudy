package Lambda;

interface A7{
	void abc(B7 b, int k);
}

class B7{
	void bcd(int k) {
		System.out.println(k);
	}
}
public class _7_RefOfInstanceMethod {
	public static void main(String[] args) {
		A7 a1 = new A7(){
			@Override
			public void abc(B7 b, int k) {
				b.bcd(k);
			}
		};
		
		A7 a2 = (B7 b, int k) -> {b.bcd(k);};
		
		A7 a3 = B7::bcd;
		a1.abc(new B7(), 3);
		a2.abc(new B7(), 3);
		a3.abc(new B7(), 3);
	}
}
