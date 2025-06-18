package control;

import java.util.Scanner;

public class SwtichTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 : ");
		int n = sc.nextInt();
		
		switch (n/10) {
		case 10:
		case 9:	
			System.out.println("A");
			break;
		case 8:		
			System.out.println("B");
			break;
		case 7:		
			System.out.println("C");
			break;
		case 6:		
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}

		System.out.println("종료");
	}
}
