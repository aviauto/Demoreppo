package website;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CRM {
	@Test
public void web() {

	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sumithra\\\\Downloads\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.get("https://www.testandquiz.com/selenium/testing.html");
driver.manage().window().maximize();
JavascriptExecutor js = (JavascriptExecutor)driver;
//*[@id="customers"]/tbody/tr[2]/td[2]

//String data1 = driver.findElementByXPath("//*[@id=\"customers\"]/tbody/tr[2]/td[2]").getText();
//String data2 = driver.findElementByXPath("//*[@id=\"customers\"]/tbody/tr[2]/td[2]").getTagName();
//System.out.println(data1);
//System.out.println(data2);
//driver.close();
Select dropdown = new Select(driver.findElement(By.id("testingdropDown")));
dropdown.selectByVisibleText("Performance Testing"); 
dropdown.selectByIndex(2);  
dropdown.selectByValue("Database");  

String title=driver.getCurrentUrl();
String current=driver.getCurrentUrl();
System.out.println(title);
System.out.println(current);
//String pageSource = driver.getPageSource();  
//System.out.println(pageSource);
int titleLength = driver.getTitle().length();  
System.out.println(titleLength); 
 //driver.findElement(By.linkText("This is a link")).click();
//String currenti = driver.getCurrentUrl();
//System.out.println(currenti);
WebElement a=driver.findElementByXPath("//input[@id='fname']");
boolean status = a.isDisplayed(); 
boolean statuss = a.isEnabled(); 
System.out.println(status);
System.out.println(statuss);
WebElement element = driver.findElementByXPath("//button[@title='Click me!!']");  
String attValue = element.getAttribute("id"); 
//This will return "SubmitButton"
Dimension dimensions = element.getSize();  
System.out.println(dimensions);
Point point = element.getLocation();  
System.out.println("X cordinate : " + point.x + " Y cordinate: " + point.y); 
js.executeScript("arguments[0].click();", element);
System.out.println("yes");
System.out.println(attValue);
js.executeScript("scrollBy(0, 5000)");  
WebElement from= driver.findElementById("sourceImage");
WebElement to=driver.findElementById("targetDiv");
Actions act=new Actions(driver);
act.dragAndDrop(from,to).build().perform();
System.out.println("ending");
//driver.quit();


	
}
}
