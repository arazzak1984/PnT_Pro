package JavaBasics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_of_ArrayList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String cw=driver.getWindowHandle();
		System.out.println(cw);
		
		// For opening new tab:---->>
		String opentab= Keys.chord(Keys.CONTROL,Keys.ENTER);
        driver.findElement(By.linkText("Forgot Password?")).sendKeys(opentab);	
        
        // // For handling tab:---->>
        ArrayList<String> tab= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));

	}

}
