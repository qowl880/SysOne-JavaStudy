package CustomException;

public class ExceptionTest4 {
    public static void main(String[] args) {
        try {
            System.out.println("a() 호출전");
            a();								// b메서드 <-> a메서드 에서 오류가 발생했기에 해당 오류를 catch에서 잡기 위해 시도
            									// catch에 Exception를 통해 해당 오류 잡음
            									// 이후 e.printStackTrace();를 통해 오류 경로 출력
            									// finally 실행 , 나머지 값 출력
            System.out.println("a()호출후");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("메인 메서드의 catch블럭");
            e.printStackTrace();
        } finally {
            System.out.println("메인 메서드의 finally블럭");
        }
        System.out.println("수행완료");
    }

    public static void a() {
        try {
            System.out.println("b() 호출전");
            b();								// b 메서드에서 오류가 발생했지만 catch에서 오류를 잡지 못했기 떄문에
            									// 현재 a 메서드 catch에서 오류를 잡기 위해 시도함.
            									// 발생한 오류와 catch의 오류는 다르기 때문에 finally 실행
            System.out.println("b()호출후");
        } catch (ClassCastException e) {
            e.printStackTrace();
            System.out.println("a메서드의 catch블럭");
        } finally {
            System.out.println("a메서드의 finally블럭");
        }
    }

    public static void b() {
        try {
            System.out.println("c() 호출전");
            int x = 1;
            int y = 0;
            int z;					
            z = x / y;				// 에러발생 지점 catch 예외처리로 이동
            						// catch에 설정한 예외처리와 실제로 발생한 예외처리는 다른 것이므로 예외를 잡지 못함
            						// 따라서 finally 실행됨
            System.out.println(z);
            c();
            System.out.println("c()호출후");
        } catch (NumberFormatException e) {
            e.printStackTrace();

        } finally {
            System.out.println("b메서드의 finally블럭");
        }
    }

    public static void c() {
        try {
            System.out.println("d() 호출전");
            d();
            System.out.println("d()호출후");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("c블럭");
        }
    }

    public static void d() {
        try {
            System.out.println("나누기전");
            int x = 1;
            int y = 1;
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("d블럭");
        }
    }
}