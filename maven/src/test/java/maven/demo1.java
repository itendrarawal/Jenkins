package maven;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * demo1
 */
public class demo1 {




  @Test
  public void test1(){
    
    WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.google.com");

    System.out.println("hello");
  }
  @Test
  public void test2(){
    //BasicConfigurator.configure();
    WebDriver driver;
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.salesforce.com/");
  }
}