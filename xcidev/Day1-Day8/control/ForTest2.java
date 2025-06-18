package control;

public class ForTest2 {
	public static void main(String[] args) {
		int result = 0;
		
		for(int n=3; n<=1000; n+=3) {
			result += n;
		}
		System.out.println(result);
	}
}
