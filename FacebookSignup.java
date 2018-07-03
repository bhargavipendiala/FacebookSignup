import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {
	public static void main (String[] args)
	{
		System.out.println("Opening Firefox browser");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\manag\\Downloads\\Firefox driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bhargavi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thidiff");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("bhargavi+03071@thidiff.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("bhargavi+03071@thidiff.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("thidiff01*");
		Select day = new Select(driver.findElement(By.xpath("//select[@title='Day']")));
		day.selectByVisibleText("11");
		Select month = new Select(driver.findElement(By.xpath("//select[@title='Month']")));
		month.selectByVisibleText("Dec");
		Select year = new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		year.selectByValue("1989");
		WebElement radio1 = driver.findElement(By.xpath("//span[label[text()='Female']]/input[@type='radio']"));
		radio1.click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		

}
}
