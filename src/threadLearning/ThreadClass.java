package threadLearning;

import java.util.concurrent.TimeUnit;

class SecondThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("0");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadClass {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
//		System.out.println(currentThread);
		SecondThread secondThread = new SecondThread();
		secondThread.setPriority(10); // it's not working
		secondThread.start();
//		System.out.println(secondThread);
		for(int i=0; i<5; i++) {
			System.out.println("1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


// Read about functional interfaces
