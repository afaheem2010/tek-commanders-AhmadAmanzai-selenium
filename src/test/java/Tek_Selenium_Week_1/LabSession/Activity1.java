package Tek_Selenium_Week_1.LabSession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Activity1 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        System.out.println("Chrome Title: " + driver.getTitle());

        driver.quit();


        EdgeDriver driver1 = new EdgeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        System.out.println(" Edge driver: " + driver1.getTitle());
        driver1.quit();




    }
}
