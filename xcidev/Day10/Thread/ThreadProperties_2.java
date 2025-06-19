package Thread;

class MyThread extends Thread{
	@Ovrride
	public void run() {
		for(long i = 0; i<1000000000; i++) {
			System.out.println(getName() + "우서순위" +getPriority);
		}
	}
}

public class ThreadProperties_2 {
	public static void main(String[] args) {
		System.out.println( "코어 수 :"  + Runtime.getRuntime().availableProcessors());
		
		for(int i  = 0 ; i<3; i++) {
			Thread thread= new MyThread();
			thread.start();
		}
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e ) {}
		
		for(int i =0; i<10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "번째 쓰레드");
			if(i == 9) thread.setName(i + "번째 쓰레드");
			if(i == 99) Thread thread = new MyThread();
			
			for(int i =0; i<10; i++) {
				Thread thread = new MyThread();
				if(i == 9 thread.setPropority)
					thread.start();
			}
									
		}
	}
}
