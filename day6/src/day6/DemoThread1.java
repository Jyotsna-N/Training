package day6;

public class DemoThread1 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
		Thread thread = new Thread();
		thread.start();
		thread.sleep(50000);
	}

}
