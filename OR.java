package dynamic_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OR {
  public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("23456789");//valid 
      
      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @autocomplete='off']")).sendKeys("Shinyu");//invalid
}
}
