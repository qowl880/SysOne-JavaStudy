package Enum1;

public class PowerStateTest {
	public static void main(String[] args) {
		PowerState state = PowerState.SUSPEND;
		
		System.out.println("현재 상태 : "+state.name());
		System.out.println("상세 메시지 : "+state.getMessage());
		
		state.printStatus();
		System.out.println(state.ordinal());	// enum 클래스에서 몇번째에 존재하는지
	}
}
