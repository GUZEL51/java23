package com.smart.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest {
	
	
	
	@Test(dataProvider= "getData")
	public void testData_Provider(String uName,String uPass) {
		System.out.println("User name is >" + "password is >>" +uPass);
	
	
	}
	@DataProvider (name= "getData")
	public Object[][] testData() {
		return new Object[][] {
			{"user name1","password1"},
			{"user name2","password2"},
			{"user name3","password3"},
		};
	}

}
