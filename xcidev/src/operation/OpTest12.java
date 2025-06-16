package operation;

import java.util.Scanner;

public class OpTest12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		System.out.println(Math.abs(num) % 2 == 0 ? "짝수입니다." : "홀수입니다.");
		// A값이 음수로 들어오게 되면 결과값에도 -가 따라가게 됨 즉, A값을 절대값을 씌워 사용하는 것이 좋음
	}
}
