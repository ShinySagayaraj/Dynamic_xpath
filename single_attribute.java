package dynamic_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class single_attribute {
public static void main(String[] args) {
      WebDriver	driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shiny@gmail.com");
}
}
