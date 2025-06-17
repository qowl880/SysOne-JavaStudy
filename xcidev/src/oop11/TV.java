package oop11;

public interface TV {
	
	// 원래는 TV를 상속 받은 클래스들에서는 TV에서 설정한 메서드를 모두 사용해야 하는데
	// default와 {}를 작성해주면 해당 메서드는 상속 받은 클래스에서 오버라이딩 하지 않아도 된다.
	public default void setSpeaker(Speaker speaker) {}
	
	public void powerOn();
	public void powerOff();
	public void soundUp();
	public void soundDown();
	public void channelUp();
	public void channelDown();
	
	
}
