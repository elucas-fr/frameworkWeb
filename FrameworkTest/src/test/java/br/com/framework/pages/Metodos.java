package br.com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {

	
	//Abrir nevegador

WebDriver driver;

public void navegador(String site, String navegador) {
	
	if(navegador == "CHROME" || navegador == "FIREFOX") {
		switch (navegador) {
		
		case "CHORME":
		System.setProperty("webdriver.chorme.driver", "./Driver/chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		break;
		
		case "FIREFOX":
			System.setProperty("webdriver.chorme.driver", "./Driver/chromedriver.exe");		
			driver = new FirefoxDriver();
			driver.get(site);
			driver.manage().window().maximize();
			break;
			
		
		}
		
	
		
	} else {
	System.out.println("Navegador não suprimido, digite CHROME e FIREFOX ");
		
			
		
	}
	
}

}
	

	
	




	
	

