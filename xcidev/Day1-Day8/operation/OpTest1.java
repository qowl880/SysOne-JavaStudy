package operation;

import java.util.Scanner;

public class OpTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A의 값을 입력해주세요:");
		int a = sc.nextInt();
		System.out.print("B의 값을 입력해주세요:");
		int b = sc.nextInt();

		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / (double) b));
		System.out.println(a + "%" + b + "=" + (a % b));

		sc.close();
	}
}

// Ctrl + Shift + F 자동 정렬