package singleTonPattern;

/*
 * Singleton Pattern:
하나의 클래스에 대해 오직 하나의 인스턴스만 생성되도록 보장하고, 그 인스턴스를 전역에서 공유하도록 만드는 디자인 패턴.

구현 단계
생성자를 private으로 감춰 외부에서 직접 생성하지 못하도록 막는다.
자기 자신을 참조하는 private static (final) 인스턴스를 클래스 내부에 선언.
정적 메서드 (getInstance())를 통해 단 하나의 인스턴스를 외부에 제공.
Class명.getInstance()로 어디서든 동일한 인스턴스를 사용 가능.
 */
public class Single {
	// Lazy Initialization : 지연 초기화
	private static Single single;
	
	private Single() {}		// 외부에서 접근하지 못하게 private설정
	public static Single getInstance() {		// 메서드를 통해서만 접근이 가능한데 static설정을 통해 하나의 객체만 생성
		if(single == null) {				// 객체가 없는 맨 처음에만 객체 생성
			single = new Single();			//  그 이후부터는 만들어둔 객체 반환
		}
		return single;
	}

}
