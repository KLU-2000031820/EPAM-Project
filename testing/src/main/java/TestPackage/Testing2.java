package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing2 {
	@AfterTest
	public void Demo1() {
		System.out.println("t1");
	}
	@Test
	public void Demo2() {
		System.out.println("t2");
	}
	@BeforeSuite
	public void Demo3() {
		System.out.println("t3");
	}
	@BeforeMethod
	public void Demo4() {
		System.out.println("before2");
	}
}
