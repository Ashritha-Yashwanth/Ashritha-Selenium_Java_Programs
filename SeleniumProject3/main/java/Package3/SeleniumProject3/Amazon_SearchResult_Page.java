package Package3.SeleniumProject3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page 
{
 WebDriver driver;
 @FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
 WebElement first_prod;
 
 
 
 public void click_first_prod()
 {
	 first_prod.click();
 }
 public Amazon_SearchResult_Page(WebDriver driver)
 {
 	  PageFactory.initElements(driver,this);
 }
	
}
