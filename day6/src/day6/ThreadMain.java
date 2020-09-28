package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ThreadMain {
	public static void main(String[] args) {
	LocalTime time = null;
    new Thread(()->System.out.println(time.now())).start();
    try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println(time.now());
}   
}
