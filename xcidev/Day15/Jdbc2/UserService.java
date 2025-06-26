package Jdbc2;

import java.sql.ResultSet;

public class UserService {
	private static final UserDAO userDAO  = UserDAO.getInstance();
	
	private static UserService instance;

	private UserService() {
	}

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}

	public boolean signUp(User user) {
		try {
			userDAO.signUp(user);
			return true;
		}catch(Exception e){
			System.out.println("$$ 회원 가입 실패 : "+e.getMessage());
			return false;
		}
	}

	public User login(String username, String password) {
		try {
			return userDAO.getUser(username, password);
		}catch (Exception e) {
			System.out.println("$$ 로그인 실패 : "+e.getMessage());
			return null;
		}
		
	}

	public void updatePassword(String userName, String newPassword) throws Exception{
		try {
			if(newPassword.length() < 3) throw new RuntimeException(MessageUtil.get("error.user.password"));
			int result = userDAO.updatePassword(userName, newPassword );
			if(result > 0) {
				return;
			}else throw new RuntimeException(MessageUtil.get("error.user.password2"));
		}catch(Exception e) {
			System.out.println("$$$패스워드 수정 실패 : " +e.getMessage());
			throw e;			// 위에 메시지는 개발자 전용 에러 메세지이고, 한번더 에러를 던져
								//  MembershipManagementRefactory에서 catch를 통해 잡아 사용자에게 보여줄 메세지를 출력한다.
		}
		
	}

	public void deleteUser(String name) {
		
		try {
			int rowsDeleted = userDAO.deleteUserData(name);
			
			if (rowsDeleted > 0) {
				System.out.println("회원 탈퇴가 완료되었습니다.");
			} else {
				System.out.println("회원 탈퇴 실패.");
			}
		}
		catch(Exception e) {
			System.out.println("$$$유저 정보 삭제 실패 : " + e.getMessage());
		}
		
	}

	public void getUser(String username) {
		try {
			ResultSet rs = userDAO.getUserDetail(username);

			if (rs.next()) {
				System.out.println("아이디: " + rs.getString("USERNAME"));
				System.out.println("이름: " + rs.getString("NAME"));
				System.out.println("이메일: " + rs.getString("EMAIL"));
				System.out.println("생년: " + rs.getInt("BIRTH"));
			} else {
				System.out.println("해당 사용자를 찾을 수 없습니다.");
			}
		}catch(Exception e) {
			System.out.println("$$$ 유저 정보 호출 실패 : "+ e.getMessage());
		}
	}
}