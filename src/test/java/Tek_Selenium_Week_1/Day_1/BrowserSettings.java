package Tek_Selenium_Week_1.Day_1;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSettings {
    public static void main(String[] args) {

        EdgeDriver edgeDriver = new EdgeDriver();

        edgeDriver.get("https://www.google.com/");
    }
}
