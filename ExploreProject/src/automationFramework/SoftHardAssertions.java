package automationFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHardAssertions {

	@Test
	public void hardAssertMethod(){
		System.out.println("Before hard assrtion");
		Assert.assertEquals(true, false);
		System.out.println("after hard assertion1");
		System.out.println("after hard assertion2");	
	}
	
	@Test
	public void softAssertsMethod(){
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(true, false);
		System.out.println("after soft assertion 1st stmnt");
		System.out.println("after soft assertion 2nd stmnt");
		softAssert.assertAll();
	}
	
	
}
