package com.smart.test2;

import org.testng.annotations.Test;
////before & sign there was >> sign 
// + Thread.currentThread().getId() is also added later
public class TestClass1 {
	@Test (groups= {"Smoke","Regression","E2E"})
	public void testMethod1() {
		System.out.println("TestClass1 & testMethod1"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Regression"})
	public void testMethod2() {
		
		System.out.println("TestClass1 & testMethod2"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Smoke","Regression"})
	public void testMethod3() {
		System.out.println("TestClass1 & testMethod3"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Regression"})
	public void testMethod4() {
		System.out.println("TestClass1 & testMethod4"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Smoke","Regression"})
	public void testMethod5() {
		System.out.println("TestClass1 & testMethod5"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Regression"})
	public void testMethod6() {
		System.out.println("TestClass1 & testMethod6"+ Thread.currentThread().getId());
	}
	@Test(groups= {"Smoke","Regression","E2E"})
	public void testMethod7() {
		System.out.println("TestClass1 & testMethod7"+ Thread.currentThread().getId());
	}
}
