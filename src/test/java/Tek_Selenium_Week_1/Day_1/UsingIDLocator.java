package Tek_Selenium_Week_1.Day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://retail.tekschool-students.com/auth/login");

        chromeDriver.manage().window().maximize();

         By signInLink = By.id ("signinLink");

         WebElement signInElement = chromeDriver.findElement(signInLink);

         signInElement.click();

        Thread.sleep(1000);

         chromeDriver.quit();

    }
}
