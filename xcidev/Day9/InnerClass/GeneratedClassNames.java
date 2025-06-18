package InnerClass;


class A5{
	void abc() {
		class B{}		// A$1B.class
		class C{}		// A$1C.class
	}
	
	void bcd() {
		class C{}		// A$2C.class
		class D{}		// A$1D.class
	}
}

public class GeneratedClassNames {
	public static void main(String[] args) {
		
	}
}
