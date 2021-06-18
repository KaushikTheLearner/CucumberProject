package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforemobilevalidation()
	{
		System.out.println("Before Mobile Hook");
	}
	@After("@Mobiletest")
	public void aftermobilevalidation()
	{
		System.out.println("After Mobile Hook");
	}
	@Before("@WebTest")
	public void beforewebvalidation()
	{
		System.out.println("Before Mobile Hook");
	}
	@After("@WebTest")
	public void afterwebvalidation()
	{
		System.out.println("After Mobile Hook");
	}


}
