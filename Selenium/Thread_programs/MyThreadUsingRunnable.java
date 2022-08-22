package multithreadingconcepts;

public class MyThreadUsingRunnable implements Runnable {

	@Override
	public void run() {
		
		
		for (int i = 1; i <= 10; i++) {

			System.out.println("Child thread  "+Thread.currentThread().getName());
		}
		
	}

}
