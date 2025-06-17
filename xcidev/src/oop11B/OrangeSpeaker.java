package oop11B;

public class OrangeSpeaker implements Speaker{
	
	public OrangeSpeaker() {
		System.out.println("OrangeSpeaker에서 소리를 출력시킵니다");
	}
	@Override
	public void soundUp() {
		System.out.println("OrangeSpeaker : 소리를 키웁니다." );
	}

	@Override
	public void soundDown() {
		System.out.println("OrangeSpeaker : 소리를 내립니다." );
	}
	
}
