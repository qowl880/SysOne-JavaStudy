package oop11B;

public class HarmanSpeaker implements Speaker{

	public HarmanSpeaker() {
		System.out.println("HarmanSpeaker에서 소리를 출력시킵니다");
	}
	@Override
	public void soundUp() {
		System.out.println("HarmanSpeaker : 소리를 키웁니다." );
	}

	@Override
	public void soundDown() {
		System.out.println("HarmanSpeaker : 소리를 내립니다." );
	}
	
}
