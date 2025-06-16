package oop8;

public class AnimalTest {
	public static void main(String[] args) {
		/*
		 	클래스 , 인터페이스 사이의 형변환
		 	1. 반드시 extends, implements 관계에서 가능
		 	2. UpCasting은 무조건 가능.
		 	3. DownCasting은 원래 인스턴스가 현재 다운캐스팅 하려는 타입 또는 서브타입(자식 클래스)일 경우 가능 즉, 부모 객체로 변환 불가
		 	4. 현재 참조하는 타입에 정의되었거나 상속받은 멤버에만 접근 가능.
		 */
		Animal a = new Animal();
		System.out.println(a);
		
		Animal a2 = new Bird();
		System.out.println(a2);
		
		Animal a3 = new Condor();
		System.out.println(a3);
		
		Bird b = new Condor();
		System.out.println(b);
		
		Bird b2 = (Bird) a2;
		System.out.println(b2);
		
		Bird b3 = (Bird) a3;
		System.out.println(b3);
		
		Bird b4 = new Bird();
		System.out.println(b4);
	
		
		Condor c = (Condor) a3;
		System.out.println(c.wings());
		System.out.println(c.attack());
		
		Animal a4 = new Cat();
		System.out.println(a4);
		
		Bird b5= (Bird) a4;
	}
}
