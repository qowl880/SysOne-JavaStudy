package CustomException;

class A2{
	void abc() throws NumberFormatException{
		bcd();
	}
	
	void bcd() throws NumberFormatException{
		cde();
	}
	
	void cde() throws NumberFormatException{
		int num = Integer.parseInt("10A");
	}
	
}
public class ExceptionMethod_2 {
	public static void main(String[] args) {
		A2 a = new A2();
		
		try {
			a.abc();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
