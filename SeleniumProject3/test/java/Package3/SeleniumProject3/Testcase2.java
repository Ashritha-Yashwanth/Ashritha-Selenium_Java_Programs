package Package3.SeleniumProject3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2 extends Screenshot_ITestListerner
{

	 @Test
	 public void login_to_search()
	 {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		 Amazon_Login_Page a1 = new Amazon_Login_Page(driver);
		 a1.un();
		 a1.conti_button();
		 a1.password();
		 a1.sigin_button();
		 Amazon_Home_Page a2 = new  Amazon_Home_Page(driver);
		 a2.searching();
		 Amazon_SearchResult_Page a3 = new Amazon_SearchResult_Page(driver);
		 a3.click_first_prod();
		 
		 Set<String> s2 = driver.getWindowHandles();
	     int count = s2.size();
	     System.out.println("count of Tabs: "+count);
	     Assert.assertEquals(s2.size(),2, "sorry");
}
}
