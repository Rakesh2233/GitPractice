package org.gridPractice;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridPracticeTest {
public static void main(String[] args) throws MalformedURLException {
	URL url=new URL("http://localhost:3333/wd/hub");
DesiredCapabilities cap=new DesiredCapabilities();
cap.setBrowserName("chrome");
cap.setPlatform(Platform.WINDOWS);
RemoteWebDriver driver=new RemoteWebDriver(url,cap);
driver.get("https://gmail.com");
}
}