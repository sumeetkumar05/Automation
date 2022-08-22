package multithreadingconcepts;

public class TestingThreadSyncIssue {

	public static void main(String[] args) {


		Home h = new Home();
		ABC t1 = new ABC(h,"Raman");
		t1.start();
		t1.i=10; 
		System.out.println("Value of i from thread 1 is : "+t1.i);
		t1.threadLocal.set("Raman");
		System.out.println("Printing from 1st thread : "+t1.threadLocal.get());

		ABC t2 = new ABC(h,"Rahul");
		t2.start();
		System.out.println("Value of i from thread 2 is : "+t2.i);
		System.out.println("Printing from 2nd thread : "+t2.threadLocal.get());

	}

}
