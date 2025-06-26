package Jdbc2;

import java.util.Scanner;



public class MembershipManagementRefactory {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
	private static final String USER = "ace";
	private static final String PASSWORD = "ace";
	
	private static Scanner sc = new Scanner(System.in);
	private static User loggedInUser = null;
	
	private static final UserService userService  = UserService.getInstance();
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("----------------");
			System.out.println("0. "+ MessageUtil.get("menu.signup"));
			System.out.println("1. "+ MessageUtil.get("menu.login"));
			System.out.println("2. "+ MessageUtil.get("menu.exit"));
			System.out.println("----------------");
			System.out.print("입력 > ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 0 -> signUp();
			case 1 -> {
				if (login()) {
					afterLoginMenu();
				}
			}
			case 2 -> {
				System.out.println("프로그램을 종료합니다.");
				System.exit(1);
			}
			default -> System.out.println("잘못된 입력입니다.");
			}
		}
	}

	private static void signUp() {
		System.out.print("id: ");
		String username = sc.nextLine();
		System.out.print("pw: ");
		String password = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("이메일: ");
		String email = sc.nextLine();

		int birthYear;
		
		System.out.print("생년: ");
		
		birthYear = getNumberInput();
		

		User user = new User(username, password, name, email, birthYear);
		
		
		if (userService.signUp(user)) {
			System.out.println("회원가입 성공.");
		} else {
			System.out.println("회원가입 실패.");
		}
	}

	private static int getNumberInput() {
		do{
			System.out.print("> ");
			try {

				return Integer.parseInt(sc.nextLine());
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능합니다.");
			}
		}while(true);
	}

	private static boolean login() {
		int attempts = 0;
		while (attempts < 3) {
			System.out.print("id: ");
			String username = sc.nextLine();
			System.out.print("pw: ");
			String password = sc.nextLine();
			
			loggedInUser = userService.login(username, password);
			if (loggedInUser != null) {
				System.out.println("로그인 성공: " + loggedInUser.getName());
				return true;
			} else {
				System.out.println("아이디 혹은 패스워드가 틀립니다.");
				attempts++;
			}
		}
		System.out.println("접속을 종료합니다.");
		return false;
	}

	private static void afterLoginMenu() {
		while (true) {
			System.out.println("----------------");
			System.out.println("0. 자기정보보기 및 수정");
			System.out.println("1. 회원 탈퇴");
			System.out.println("2. 회원 검색");
			System.out.println("3. 로그아웃");
			System.out.println("----------------");
			System.out.print("입력 > ");

			int choice = getNumberInput();

			switch (choice) {
			case 0 -> viewAndUpdateProfile();
			case 1 ->deleteUser();
			case 2 ->searchUser();
			case 3 ->loggedInUser = null;
			default ->System.out.println("잘못된 입력입니다.");
			}
		}
	}

	private static void viewAndUpdateProfile() {
		System.out.println("아이디: " + loggedInUser.getUsername());
		System.out.println("이름: " + loggedInUser.getName());
		System.out.println("이메일: " + loggedInUser.getEmail());
		System.out.println("생년: " + loggedInUser.getBirthYear());
		System.out.print("비밀번호를 변경하시겠습니까? (y/n) > ");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			System.out.print("새 비밀번호: ");
			String newPassword = sc.nextLine();
			
			try {
				userService.updatePassword(loggedInUser.getUsername(),newPassword);
			} catch (Exception e) {
				System.out.println(e.getMessage()); // 사용자 에러 메세지 출력
													// service에서 catch부분에서 에러메세지를 출력하지 않고
													// println을 통해 문자열을 출력했기 때문에 아직 e 에러메세지 남아있음
													// 따라서 dao -> service -> maagement로 넘어온 에러메세지를 e.getMessage() 통해 출력시킬 수 있음
			}
		}
	}

	private static void deleteUser() {
		System.out.print("정말로 탈퇴하시겠습니까? (y/n) ");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			String name = loggedInUser.getUsername();
			userService.deleteUser(name);
			System.exit(1);
		}
	}

	private static void searchUser() {
		System.out.print("검색할 아이디: ");
		String username = sc.nextLine();
		userService.getUser(username);
	}
}
