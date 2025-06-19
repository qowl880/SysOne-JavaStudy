package ThreadStatus;

class MyThread2 extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);				// 2. sleep들어가서 time_waiting 상태
		}catch(InterruptedException e) {
			System.out.println(" -- sleep() 진행 중 interrupt() 발생");		// 4. 3초 이후에 자동으로 runnable로 돌아가는 것을 확인하기 위해 반복문 실행
			for(long i = 0; i<100000000000000000L; i++) {}
		}
	}
}

public class TimeWaitingRunnableState {
	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		myThread.start();		// 1. Thread 시작
		
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {}
		System.out.println("MyThread State =" + myThread.getState());
		
		// TIMED_WAITING
		myThread.interrupt();		// 3. intrrupt를 통해 3초 sleep이 깨지기 전에 TIMED_WAITING -> RUNNABLE 상태 전환
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {}
		System.out.println("MyThread State =" + myThread.getState());		// 4. sleep이 끝나서 runnable로 상태 전환
		
		System.out.println("종료");
	}
}
