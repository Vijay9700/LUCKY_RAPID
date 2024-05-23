package learning_testng;

import org.testng.annotations.Test;

public class DummyScripts {
	@Test()
	public void register()
	{
		System.out.println("register completed");
	}
	
	@Test(dependsOnMethods = "register")
	public void login()
	{
		System.out.println("login completed");
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		System.out.println("logout completed");
	}
	
	

}
