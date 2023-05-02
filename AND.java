package dynamic_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AND {
 public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//input[@id='pass' and @name='pass']")).sendKeys("Passwordddddd");
}
}
