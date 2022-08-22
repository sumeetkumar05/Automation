package steps;

import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class W2AAPISteps {
	
	private Response response;
	
	@Step("Send get request for user id: {0}")
	public void sendGetRequestForUser(String userId) {
		
		response = SerenityRest.given().when().get(userId);
		response.prettyPrint();
	}
	
	
	@Step("Send POST request for user creating with email: {0}, firstname {1} and lastname {2}")
	public void sendPOSTRequest(String email,String firstName, String lastName) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("email", email);
		map.put("firstName", firstName);
		map.put("lastName", lastName);
		
		response = SerenityRest.given()
				.contentType(ContentType.JSON)
				.body(map).log().all().post();
				;
		response.prettyPrint();
	}
	
	
	
	@Step("Send Delete request for user id: {0}")
	public void sendDeleteRequestForUser(String userId) {
		
		response = SerenityRest.given().when().delete(userId);
		response.prettyPrint();
	}
	
	@Step("Validate status code to be {0}")
	public void validateStatusCodeToBe(int code) {
		
		response.then().statusCode(code);
	}

	@Step("Verify reponse body for key {0} and value {1}")
	public void verifyResponseBody(String key,String value) {
		
		response.then().body(key, equalTo(value));
		
		
	}
	
	
}
