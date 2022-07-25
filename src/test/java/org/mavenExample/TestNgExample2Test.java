package org.mavenExample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgExample2Test {
	@Test
	public void practice1Test() {
		Reporter.log("Tyss--> test3",true);
	}
	@Test 
	public void practice2Test() {
		Reporter.log("Tyss--> test4",true);
		String url=System.getProperty("URL");
		System.out.println(url);
		String pwd = System.getProperty("BROWSER");//password changed
		System.out.println(pwd);
	}
}
