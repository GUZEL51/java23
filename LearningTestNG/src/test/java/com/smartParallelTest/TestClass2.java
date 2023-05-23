package com.smartParallelTest;
import org.testng.annotations.Test;
////before & sign there was >> sign 
//+ Thread.currentThread().getId() is also added later
	public class TestClass2{
	@Test (groups= {"Smoke","Regression","E2E"})
	public void testMethod8() {
		System.out.println("TestClass2 & testMethod 8"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Regression"})
	public void testMethod2() {
		
		System.out.println("TestClass2 & testMethod 9"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Smoke","Regression"})
	public void testMethod3() {
		System.out.println("TestClass2 & testMethod 10"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Regression"})
	public void testMethod4() {
		System.out.println("TestClass2 & testMethod 11"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Smoke","Regression"})
	public void testMethod5() {
		System.out.println("TestClass2 & testMethod 12"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Regression"})
	public void testMethod6() {
		System.out.println("TestClass2 & testMethod 13"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Smoke","Regression","E2E"})
	public void testMethod7() {
		System.out.println("TestClass2 & testMethod 14"+ Thread.currentThread().getId());
	}
}

