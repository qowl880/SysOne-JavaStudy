package ThreadState;

class DataBox{
	/*
	 * synchronized만을 통한 쓰레드 실행
	 */
	int data;
	synchronized void inputData(int data) {
		this.data = data;
		System.out.println("입력 데이터 : "+data );
	}
	
	synchronized void outputData() {
		System.out.println("출력 데이터 : " +data);
	}
}

public class SynchronizedWaitRunnableState {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 1; i<9; i++) {
					dataBox.inputData(i);;
				}
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 1; i<9; i++) {
					dataBox.outputData();
				}
			};
		};
		
		t1.start();
		t2.start();
	}
}
