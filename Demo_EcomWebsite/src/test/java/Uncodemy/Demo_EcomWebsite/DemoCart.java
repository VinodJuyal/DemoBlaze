package Uncodemy.Demo_EcomWebsite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoCart {
	WebDriver driver ;
	@BeforeTest
	public void Pre_Req() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String BaseURL = "https://www.demoblaze.com/index.html";
		driver.get(BaseURL);
	}
	@Test (priority = 1)
	public void Validation() 
	{
		Boolean DisplayedLoginButton = driver.findElement(By.xpath("//div[@id = 'navbarExample' ]/child::ul/child::li[5]/child::a")).isDisplayed();
		if(DisplayedLoginButton = true) 
		{
		  System.out.println("Logo is Displayed");
		
		}
		}
	
	@Test (priority =3 )
	public void SecondTestCase() throws InterruptedException
	{
	    WebElement LoginButton = driver.findElement(By.xpath("//div[@id = 'contcar']/preceding::div[@id ='navbarExample']/child::ul[1]/child::li[5]/a"));
	    LoginButton.click();
	    /*Set<String> SetHandles= driver.getWindowHandles();
	    List<String> ListHandles = new ArrayList<String>();
	    ListHandles.addAll(SetHandles); 
	    Thread.sleep(2000);
	    driver.switchTo().window(ListHandles.get(1));*/
	    Thread.sleep(3000);
	    WebElement UsernameField = driver.findElement(By.xpath("//div[@id = 'logInModal']/div[1]/div/div[2]/descendant::div/input[@id = 'loginusername']"));
	    UsernameField.sendKeys("Vinod.juyal95@gmail.com",Keys.TAB,"Vinod@1997");
	    driver.findElement(By.xpath("//div[@id = 'logInModal']/div/div/descendant::button[3]")).click();
	    
		
		
	}
	@Test (priority = 2 )
	public void ThirdTestCase() throws InterruptedException 
	{
		//Sign In Details
		Thread.sleep(2000);
		WebElement SignIn = driver.findElement(By.xpath("//div[@id = 'contcar']/preceding-sibling::div/ul/li[8]/a[@class = 'nav-link']"));
	    SignIn.click();
	    Thread.sleep(3000);
	    WebElement Username_SignIn = driver.findElement(By.xpath("//div[@id = 'signInModal']/div[1]/descendant::div[4]/input[@id = 'sign-username']"));
	    Username_SignIn.sendKeys("Vinod.juyal95@gmail.com",Keys.TAB, "Vinod@1997");
	    WebElement SignUp_Button = driver.findElement(By.xpath("//div[@id = 'logInModal']/preceding-sibling::div[1]/descendant::div[@class = 'modal-footer']/button[2]"));
	    SignUp_Button.click();
	    //Alert For Sign In
	    Thread.sleep(3000);
	    Alert alert = driver.switchTo().alert();
	    alert.dismiss();
	    driver.findElement(By.xpath("//div[@id = 'signInModal']/div[1]/descendant::button[1]/span")).click();
	    
	   
	}
	@Test(priority = 4)
    public void FourthTetCase() throws InterruptedException
	{
	   Thread.sleep(3000);
	   WebElement product = driver.findElement(By.xpath("//body/child::div[contains(@id , contcont)][5]/descendant::div[3]/a[3]"));
	   product.click();
	   WebElement Sony_vaio_a5 = driver.findElement(By.xpath("//a[text() = 'Sony vaio i5']"));
	   Sony_vaio_a5.click();
	   Thread.sleep(3000);
	   //For navigate backward
	   driver.navigate().back();
	   Thread.sleep(3000);
	   //For navigate forward
	   driver.navigate().forward();
	   Thread.sleep(3000);
	   //For refresh
	   driver.navigate().refresh();
	   Thread.sleep(3000);
	  
	  
	}
	@Test(priority = 5)
	public void FifthTestCase() throws InterruptedException 
	{
		WebElement AddtoCart = driver.findElement(By.xpath("//div[@id = 'footc']/preceding-sibling::div[1]/descendant::div[2]/following::div[1]/child::div[2]/descendant::a[1]"));
	    AddtoCart.click();
	    Thread.sleep(2000);
        Alert alert= driver.switchTo().alert();
	    alert.dismiss();
	    String Text = AddtoCart.getText();
	    System.out.println("Text is : " + Text);
	}
	
	@Test(priority = 6)
	public void SixthTestCase() 
	{
		WebElement CartButton = driver.findElement(By.xpath("//div[@id='navbarExample']/ul[1]/li[4]/a[1]"));
		CartButton.click();
		WebElement PlaceOrder = driver.findElement(By.xpath("//div[@id = 'page-wrapper']/descendant::div[5]/following-sibling::button"));
		PlaceOrder.click();
	}
	
	@Test(priority = 7)
	public void SeventhTestCase() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'name']")).
		sendKeys("Vinod",Keys.TAB,"India",Keys.TAB,"New Delhi",Keys.TAB,"374245455400126", Keys.TAB, "May", Keys.TAB, "2026" );
		Boolean purchase = driver.findElement(By.xpath("//input[@id = 'name']/parent::div/following::div[@class = 'modal-footer'][1]/button[2]")).isSelected();
		if(purchase == true) 
		{
			System.out.println ("Credentials are accpeted");
		}
		WebElement purchaseButton = driver.findElement(By.xpath("//input[@id = 'name']/parent::div/following::div[@class = 'modal-footer'][1]/button[2]"));
		purchaseButton.click();
	}
	@Test(priority = 8)
	public void EightTestCase() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement OKButton = driver.findElement(By.xpath("//div[@id = 'footc']/following-sibling::div[3]/div[7]/descendant::button[2]"));
		OKButton.click();
		
	}

}
