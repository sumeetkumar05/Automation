package rough;

import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class FirstTest {
	
	@BeforeClass
	public static void init() {
		
		RestAssured.baseURI="http://localhost:8080";
		RestAssured.basePath="/api/users/";
		
	}
	
	
	@Title("Sending Get request test")
	@Test
	public void testGetRequest() {
		
		
		Response response = SerenityRest.given().when().get("4");
		response.prettyPrint();
		response.then().statusCode(200);
		response.then().body("firstName", equalTo("Chris"));
		
	}
	
	

	@Title("Sending POST request test")
	@Test()
	public void testPostRequest() {
		
		
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("email", "dummy1@user.com");
		map.put("firstName", "Dummy");
		map.put("lastName", "User");
		
		Response response = SerenityRest.given()
				.contentType(ContentType.JSON)
				.body(map).log().all().post();
				;
		response.prettyPrint();
		System.out.println(response.getStatusCode());
	
		
	}
	
	
	@Title("Sending Delete request test")
	@Test()
	public void testDeleteRequest() {
		
		Response response = SerenityRest.given().when().delete("11");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		response.then().statusCode(200);
		
	}
	
	
	

}
