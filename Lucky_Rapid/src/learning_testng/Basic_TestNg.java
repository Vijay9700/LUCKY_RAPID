package learning_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic_TestNg {
	
	@Test
	public void login()
	{
		//System.out.println("login completed");
		Reporter.log("login completed",true);
	}
	
	@Test
	public void logout()
	{
		//System.out.println("log out completed");
		Reporter.log("logout completed",true);
	}

}
