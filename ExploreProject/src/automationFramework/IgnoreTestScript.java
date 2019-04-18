package automationFramework;

import org.testng.annotations.Test;

public class IgnoreTestScript {

	@Test
	public void first(){
		System.out.println("first");
	}
	
	@Test
	public void second(){
		System.out.println("Second");
	}
	
	@Test(groups = "one")
	public void third(){
		System.out.println("Third");
	}
	
	@Test(groups = "one")
	public void fourth(){
		System.out.println("fourth");
	}
	
}
