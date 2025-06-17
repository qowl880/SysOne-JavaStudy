package Exception;

class A{}

class B extends A{}


public class UncheckedException {
	public static void main(String[] args) {
		// ArithmeticException
		System.out.println(3/0);
		
		// ClassCastException
		A a = new A();
		B b = (B)a;
		
		
		// ArrayIndexOutOfBoundsException
		int[] array = {1,2,3};
		System.out.println(array[3]);
		
		// NumberFormatException
		int num = Integer.parseInt("10!");
		
		// NullPointerException
		String str = null;
		System.out.println(str.charAt(2));
	}
}
