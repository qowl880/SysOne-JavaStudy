package operation;

public class OpTest3 {
	public static void main(String[] args) {
		boolean b1 = true, b2 = false;
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
		System.out.println(!b2);
		
		int n1 = 5, n2 = 3;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		
		/* 변수 2개의 값을 변환 하는 방법
		 * 1. temp 임시공간 변수를 생성하여 변환
		 * 2. XOR를 통한 치환
		 */
		
		n1 = n1^n2;
		n2 = n2^n1;
		n1 = n1^n2;
		
		System.out.println(n1 + "," + n2);
	}

}
