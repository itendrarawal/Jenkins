package maven;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {
    @Test
    public void test3(){
        WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.youtube.com/");

        System.out.println("Test Case 3");
    }
    @Test
    public void test4(){
        System.out.println("Test Case 4");
    }
}