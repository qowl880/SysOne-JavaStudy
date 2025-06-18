package Interface;

interface A3{
	public abstract void abc();
}

interface B3{
	void bcd();
}

class C3 implements A3{
	public void abc() {
		System.out.println("C implemnets A3");
	}
}



public class InheritanceOfInterface_2 {	
	public static void main(String[] args) {
		C3 c = new C3();
		
		c.abc();
	}
}
