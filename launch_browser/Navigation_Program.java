package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Program {

	public static void main(String[] args) throws InterruptedException
	{
       
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
	}

}
