package array;

import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		String[] words = {
				"Java",
				"James Gosling",
				"Green Project",
				"Java Development Kit",
				"Spring Framework",
				"React",
				"Node.js",
				"Write once, Run anywhere",
				"Sysone",
				"oracle database"
		};
		
		Scanner sc = new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		for(int i=1; i<=5; i++) {
			int randomNumber =(int)(Math.random() * words.length);
			do {	// 타이핑 실수로 인한 재입력
				System.out.print( i + ":" + words[randomNumber] + ">");
				String keyword = sc.nextLine();
				if(!keyword.equals(words[randomNumber])) {
					System.out.println("오타입니다. 다시 입력하세요.");
				}else {
					break;
				}
			} while (true);
		}
		long endTime = System.currentTimeMillis();
		double runningTime = ((double)endTime - startTime) / 1000;
		
		System.out.printf("총 소요시간은 " + runningTime+"초 입니다.");
	}
}
