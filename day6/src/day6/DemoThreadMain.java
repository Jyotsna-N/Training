package day6;

public class DemoThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DemoThread demoThread=new DemoThread();
		Thread thread1=new Thread(demoThread);
		Thread thread2=new Thread(demoThread);
		thread1.start();
		thread1.run();
		thread1.sleep(10000000);
		thread2.start();
		thread2.run();
	}
}
