package popup;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TripoDial {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.tripodeal.com/");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[.='Depart Date']"))));
		driver.findElement(By.name("trip_start_date")).click();
		String crtmonth = driver.findElement(By.xpath("//div[@class='picker__month']")).getText();
		String crtyear = driver.findElement(By.xpath("//div[@class='picker__year']")).getText();
		
		SimpleDateFormat format=new SimpleDateFormat("dd/MMMM/yyyy");
		String date1 = format.format(new Date());
		String[] str = date1.split("/");
		String date = str[0];
		String month = str[1].trim();
		String year = str[2].trim();
		//System.out.println(date1+"==="+month1+"===="+year1);
		Thread.sleep(1000);
		while(!(month.equalsIgnoreCase(month))&&year.equals(year)) {
			driver.findElement(By.xpath("//div[@title='Next month']")).click();
			crtmonth = driver.findElement(By.xpath("//div[@class='picker__month']")).getText();
		    crtyear = driver.findElement(By.xpath("//div[@class='picker__year']")).getText();
		}
		driver.findElement(By.xpath("//div[.='"+date+"']")).click();

	}

}
