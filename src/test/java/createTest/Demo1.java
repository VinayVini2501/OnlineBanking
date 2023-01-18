package createTest;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test(groups= {"Smoke"})
	public void modify1()
	{
		System.out.println("Success test 3");
	}
	
	@Test(groups= {"regression"})
	public void modify12()
	{
		System.out.println("Success test 4");
	}
	

	

}
