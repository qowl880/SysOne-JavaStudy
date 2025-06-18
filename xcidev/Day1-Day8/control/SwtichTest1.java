package control;

public class SwtichTest1 {
	public static void main(String[] args) {
		int n = 2;

		switch (n) {
		case 1,3:			// 최신 자바 버전에서부터 허용해주는 문법이라 대기업이나 공공기관에서는 사용 불가능
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
			break;
		default:
			System.out.println("에러");
			break;
		}

		System.out.println("종료");
	}
}
