package multithreadingconcepts;

public class Home {
	
	
	public synchronized void print(String name){
		
	
		System.out.println("Good Morning : ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name);
		
	}

}
