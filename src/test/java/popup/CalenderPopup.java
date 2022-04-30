package popup;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[@class='xtXmba' and text()='Travel']")).click();
		//Thread.sleep(4000);
				//driver.findElement(By.xpath("//div[.='Round Trip']")).click();
				//driver.findElement(By.xpath("//label[.='From']")).click();
				//driver.findElement(By.xpath("//label[.='To']")).sendKeys("BOM");
		driver.findElement(By.name("0-datefrom")).click();
		String monthYear = driver.findElement(By.className("_1oqlzu")).getText();
		
        System.out.println(monthYear);
        String month = monthYear.split(" ")[0].trim();
        String year = monthYear.split(" ")[1].trim();
        String[] cln = date().split("/");
       // System.out.println(cln[0]);
        Thread.sleep(1000);
        while (!(month.equalsIgnoreCase("January") && year.equals("2023"))) {
        	driver.findElement(By.name("0-datefrom")).click();
        	WebDriverWait wait=new WebDriverWait(driver,10);
        	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='_3hsbax']/button[@class='_3CTB5G']"))));
        	driver.findElement(By.xpath("//div[@class='_3hsbax']/button[@class='_3CTB5G']")).click();	
        	//driver.findElement(By.name("0-datefrom")).click();
    		 monthYear = driver.findElement(By.className("_1oqlzu")).getText();
            //System.out.println(monthYear);
             month = monthYear.split(" ")[0].trim();
             year = monthYear.split(" ")[1].trim();
		}
        driver.findElement(By.xpath("//button[text()='20']")).click();
	}
     public static String date() {
    	 SimpleDateFormat format=new SimpleDateFormat("dd/MMMM/yyyy/hh-mm-ss");
 		String date = format.format(new Date());
 
 		return date;
     }
}
