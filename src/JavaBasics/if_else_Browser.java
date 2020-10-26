package JavaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class if_else_Browser {

	public static void main(String[] args) {
		
		String browser = "internet explorer";
		
		if(browser.equals("chromebrowser")) {
			
			System.out.println("This chrome browser");
			
			
		}else if(browser.equals("firefox")) {
			
			System.out.println("firefox browser");
			
		}else if (browser.equals("internet explorer")) {
			
			System.out.println("IE");
		}else {
			System.out.println("problem in the code");
		}

	}

}
