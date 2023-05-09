package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testing {
	@AfterTest
	public void Demo1() {
		System.out.println("hi1");
	}
	@Test
	public void Demo2() {
		System.out.println("hi2");
	}
	@Test
	public void Demo3() {
		System.out.println("hi3");
	}
	@BeforeTest
	public void Demo4() {
		System.out.println("before");
	}
}