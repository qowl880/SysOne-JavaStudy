package control;

import java.util.Scanner;

public class ForGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("가위는 1, 바위는 2, 보는 3을 입력 >");
		int input = sc.nextInt();

		int com = (int) (Math.random() * 3) + 1;

		if (input == 1) {
			System.out.println(com == 1 ? "비겼습니다" : com == 2 ? "졌습니다" : "이겼습니다");
		}
		if (input == 2) {
			System.out.println(com == 1 ? "이겼씁니다" : com == 2 ? "비겼습니다" : "졌습니다");
		}
		if (input == 3) {
			System.out.println(com == 1 ? "졌습니다" : com == 2 ? "이겼습니다" : "비겼습니다");
		}

	}
}



/*
	결과 값을 하나로 통일해서 결과를 출력하는 것이 좋음 따라서 하나로 통일 시킬 공식을 찾아야함
	1. (YOU - COM +3) %3
	2. COM % 3 +1
	

*/