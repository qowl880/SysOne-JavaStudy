package Exception;

class A2  implements AutoCloseable{
	String resource;
	A2(String resource){
		this.resource = resource;
	}
	
	@Override
	public void close() throws Exception {
		if(resource != null) {
			resource = null;
			System.out.println("리소스가 해제되었습니다");
		}
		
	}
}

public class TryWithResources2 {
	public static void main(String[] args) {
		
		// 1. 리소스 사용하고 finally에서 리소스 수동 해제
		A2 a1 = null;
		try {
			a1 = new A2("특정 파일");
			System.out.println(a1.resource);
		}catch(Exception e) {
			System.out.println("예외 처리");
		}finally {
			if(a1.resource != null) {
				try {
					a1.close();
				}catch(Exception e) {}
			}
		}
		
		
		// 2. 리소스 자동 해제 - try() 괄호 안에 있는 값은 AutoCloseable를 상속받은 객체만 들어올 수 있음
		// 따라서, try가 끝날 시점 자동으로 모든 close를 호출하여 종료 시킴  1번방법보다 2번방법이 더 좋음
		try(A2 a2 = new A2("특정 파일2")) {
			System.out.println(a2.resource);
		}catch(Exception e) {
			System.out.println("예외 처리2");
		}
	}
}
