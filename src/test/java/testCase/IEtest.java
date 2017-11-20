package testCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePage.BasePage;



public class IEtest extends BasePage {
	String test_url = "http://192.168.101.192:81/wz/login";

	@BeforeMethod
	public void setUp() throws Exception {
		setupChrome(test_url);
	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

	@Test
	public void testFF() {
		
	}

}


