package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	//Configurando a chamada do navegador utilizado "Chrome"
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void abrirNavegador () {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void fechaNavegador() {
		driver.quit();
	}

}
