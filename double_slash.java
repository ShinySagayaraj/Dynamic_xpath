package dynamic_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class double_slash {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/textarea[1]")).sendKeys("Yuvan");
	}

}
