package SynchronizedTest;

class MyData2{
	int data =3;
	
	/*
	 * public synchronized void plusData()를 통해 메서드를 동기화 하거나
	 * synchronized (this) { ... } 처럼 블록단위를 동기화 할 수 있음
	 */
	public void plusData() {
		synchronized (this) {
			int mydata = data;
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
			data = mydata + 1;
		}
	}
}


class PlusThread extends Thread{
	MyData2 mydata;
	public PlusThread(MyData2 myData) {
		this.mydata = myData;
	}
	
	@Override
	public void run() {
		mydata.plusData();
		System.out.println(getName() + "실행 결과 :" +mydata.data);
	}
}

public class TheNeedsForSynchronized {
	public static void main(String[] args) {
		MyData2 mydata = new MyData2();
		
		// plusThread1
		Thread plusThread1 = new PlusThread(mydata);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		// plusThread2
		Thread plusThread2 = new PlusThread(mydata);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
