package threadLearning;

public class TestingInterrupt {
	
	public static void main(String[] args) {
		Thread threadOne = new Thread(() -> {
			for(int i=0; i<5; i++) {
				System.out.println(".");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					System.out.println(Thread.currentThread().getName() + " is interuppted.");
					return;
				}
			}
		});
		
		threadOne.start();
		
		Thread threadTwo = new Thread(() -> {
			for(int i=0; i<5; i++) {
				System.out.println("*");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println(Thread.currentThread().getName() + " is interuppted.");
					return;
				}
			}
		});
		
		threadTwo.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		threadOne.interrupt();
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			System.out.println("isInterrupted: " + threadOne.isInterrupted() + ", state: " + threadOne.getState());
			threadOne.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Code Chalega");
		//Thread.currentThread().getName();
	}
	
}
