package SeleniumFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RSATest {

    @Test
    public void checkHomePage() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("firefox");
        caps.setPlatform(Platform.WIN10);
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.183:4444"), caps); //URL = Selenium Hub address

        driver.get("https://rahulshettyacademy.com/#/index");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
