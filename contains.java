package dynamic_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains {
public static void main(String[] args) {
      WebDriver driver =new ChromeDriver();
      driver.get("https://www.amazon.com/");
      driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("shoe");
}
}
