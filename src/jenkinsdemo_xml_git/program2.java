package jenkinsdemo_xml_git;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class program2 {
@Test
   public void ab() {
    	 System.setProperty("webdriver.chrome.driver", "D:\\jar\\chromedriver_win32\\chromedriver.exe");
		    	 WebDriver driver=new ChromeDriver();
			
			driver.get("https://plus.com.sg/apply/banking/plus-savings-account");
			
			System.out.println("plus_1");
}

}