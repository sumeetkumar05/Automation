package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.W2AAPISteps;

@RunWith(SerenityRunner.class)
public class DeleteUserTest extends BaseTest {
	
	
	@Steps
	W2AAPISteps api;
	
	
	@Title("Deleting the user details")
	@Test
	public void deleteUserTest() {
		
		api.sendDeleteRequestForUser("12");
		api.validateStatusCodeToBe(200);
	}

}
