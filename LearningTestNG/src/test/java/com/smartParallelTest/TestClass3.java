package com.smartParallelTest;



	import org.testng.annotations.Test;
////before & sign there was >> sign 
//+ Thread.currentThread().getId() is also added later
	public class TestClass3{
	@Test (groups= {"Smoke","Regression","E2E"})
	public void testMethod8() {
		System.out.println("TestClass3 & testMethod 15"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Regression"})
	public void testMethod2() {
		
		System.out.println("TestClass3 & testMethod 16"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Smoke","Regression"})
	public void testMethod3() {
		System.out.println("TestClass3 & testMethod 17"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Regression"})
	public void testMethod4() {
		System.out.println("TestClass3 & testMethod 18"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Smoke","Regression"})
	public void testMethod5() {
		System.out.println("TestClass3 & testMethod 19"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Regression"})
	public void testMethod6() {
		System.out.println("TestClass3 & testMethod 20"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Smoke","Regression","E2E"})
	public void testMethod7() {
		System.out.println("TestClass3 & testMethod 21"+ Thread.currentThread().getId());
	}
}

