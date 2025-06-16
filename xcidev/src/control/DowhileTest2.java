package control;

public class DowhileTest2 {
	public static void main(String[] args) {
		
		
		int i=4;
		int sum = 0;
		do {
			sum += i;
			i+=4;
		}while(i<=1000);

		System.out.println(sum);
	}
}
