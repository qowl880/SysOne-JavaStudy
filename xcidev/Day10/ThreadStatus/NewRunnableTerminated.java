package ThreadStatus;

public class NewRunnableTerminated {
	public static void main(String[] args) {
		/*
		 * 쓰레드의 상태는
		 * 1. 쓰레드 객체 생성 단계 (New)
		 * 2. thread.start()이후 단계(Runnable)
		 * - 해당 단계에서 Timed_waiting / Blocked / waiting을 통해 쓰레드 실행대기 <-> 실행 기능 수행
		 * 3. run() 완료 (Terminated)
		 */
		// 쓰레드 상태 저장 클래스
		Thread.State state;
		
		// 1. 객체 생성(New)
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i =0 ; i<1000000000L; i++) {} 	// 시간 지연
			}
		};
		
		state = myThread.getState();
		System.out.println("myThread state = "+state);
		
		
		// 2. myThread 시작
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = "+state);
		
		
		// 3. myThread 종료
		try {
			myThread.join();
		}catch(InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state = "+state);
	}
}
