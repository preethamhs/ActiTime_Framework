package popup;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	/*driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//img[@alt='Travel']")).click();
	driver.findElement(By.xpath("//label[.='Depart On']")).click();*/


	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//step1: mavigate to fipkart
	driver.get("https://www.tripodeal.com/");
	//enter departure date
	driver.findElement(By.id("origin")).sendKeys("BLR");
	//select BLR in suggesstion
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='eac-item']/b[text()='BLR']")).click();
	//enter destination
	Thread.sleep(2000);
	driver.findElement(By.id("destination")).sendKeys("DEL");
	//select the destination
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='eac-item']/b[text()='DEL']")).click();
	//select date feb 16 2022
	Thread.sleep(2000);
	driver.findElement(By.id("dateNew")).click();
	Thread.sleep(2000);
	/*String[] caledar=getDate().split(" ");
	String date=caledar[0];
	String month=caledar[1];
	String year=caledar[2];
	int NoOfmonth=12;
	while(NoOfmonth>=0) {
	try {
	driver.findElement(By.xpath("//div[text()='"+month+"']"+ "/following-sibling::div[text()='"+year+"']"
			+ "/ancestor::div[@class='picker__box']"
			+ "/descendant::div[text()='"+date+"']")).click();
	}
	catch (Exception e) {
		//driver.findElement(By.xpath("div[@title]"))
	}
	}
	*/
	//Fri Feb 11 16:48:24 IST 2022
}
	/**
	 * returs the current date 
	 * @return format dd MMMM  YYYY
	 */
	public String getDate() {
		SimpleDateFormat format=new SimpleDateFormat("dd MMMM yyyy");
		String date = format.format(new Date());
		return date;
	}
}



