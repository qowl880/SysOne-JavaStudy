package Exception;

//1. 하위 메서드에 직접 예외를 처리할 때
class A5{
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		}catch(InterruptedException | ClassNotFoundException e) {
			
		}
	}
}

//2. 예외를 호출 메서드로 전가할 때
class B5{
	void abc() {
		try{
			bcd();
		}catch(InterruptedException | ClassNotFoundException e) {}
	}
	
	void bcd() throws InterruptedException, ClassNotFoundException{
		Class cls= Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}

public class ThrowsException_3 {
	public static void main(String[] args) {
		
	}
}
