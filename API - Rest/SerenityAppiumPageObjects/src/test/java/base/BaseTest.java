package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import utilities.AppiumServer;

public class BaseTest {
	
	
	@BeforeClass
	public static void setUp() {
		
		AppiumServer.start();
		
	}
	
	@AfterClass
	public static void tearDown() {
		
		AppiumServer.stop();
	}
	

}
