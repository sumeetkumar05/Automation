package multithreadingconcepts;

public class MyThread extends Thread {

	/*
	 * 
	 * Class --> extends Thread --> override run() --> create instance of your
	 * thread class start()
	 * 
	 */

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("Child thread  "+Thread.currentThread().getName());
		}

	}

}
