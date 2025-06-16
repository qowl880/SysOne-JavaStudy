package control;

import java.util.Scanner;

public class BaseBallGame {
	public static void main(String[] args) {
		// 0 ~ 9까지 중복되지 않은 숫자 3개
		
		int s,b;	
		int c1,c2,c3;		// 컴퓨터 난수 발생
		int h1,h2,h3;		// 사용자 입력 값
		int count = 0;
		
		c1 = (int)(Math.random() * 10);
		
		do {
			c2 = (int) (Math.random() * 10);
		} while (c2 == c1);
		
		do {
			c3 = (int) (Math.random() * 10);
		} while (c1 == c3 || c2 == c3);
		
		Scanner sc = new Scanner(System.in);
		
		do {
			s = b = 0;
			System.out.print("0 ~ 9 중에 중복되지 않는 숫가 3개 입력하세요 ex. 7 0 2  > ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			if(h1 == c1) s++;
			else if(h1 == c2 || h1 == c3) b++;
			if(h2 == c2) s++;
			else if(h2 == c1 || h2 == c3) b++;
			if(h3 == c3) s++;
			else if(h3 == c1 || h3 == c2) b++;
			System.out.println(s + "S " + b + "B");
			count++;
			
		}while(s != 3);
		
		System.out.println(count+"번 만에 맞추셨습니다!");
		
		sc.close();
	}
}
