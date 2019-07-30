package jenkinsdemo_xml_git;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class program {
@Test
   public void ab() {
    	 System.setProperty("webdriver.chrome.driver", "D:\\jar\\chromedriver_win32\\chromedriver.exe");
		    	 WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			System.out.println("google");
}

}