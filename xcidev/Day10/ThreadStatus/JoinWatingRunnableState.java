package ThreadStatus;

class MyThread3 extends Thread{
	@Override
	public void run() {
		for(long i = 0; i<1000000000000000L; i++) {}
	}
}

class MyThread4 extends Thread{
	MyThread3 myThread3;
	public MyThread4(MyThread3 myThread3) {
		this.myThread3 = myThread3;
	}
	
	@Override
	public void run() {
		try {
			myThread3.join(3000);
		}catch(InterruptedException e) {
			System.out.println(" --join(...) 진행 중 interrupt() 발생");
			for(long i=0; i<1000000000000000L; i++) {
				
			}
		}
	}
}

public class JoinWatingRunnableState {
	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		MyThread4 myThread4 = new MyThread4(myThread3);
		myThread3.start();
		myThread4.start();
		
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {}
		System.out.println("MyThread3 State = "+myThread3.getState());
		System.out.println("MyThread4 State = "+myThread4.getState());
		// Time_waiting
		myThread4.interrupt();
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		System.out.println("MyThread3 State = "+myThread3.getState());
		System.out.println("MyThread4 State = "+myThread4.getState());
	}
}
