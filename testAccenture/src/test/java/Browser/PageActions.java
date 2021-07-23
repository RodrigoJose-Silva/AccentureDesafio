package Browser;

import org.openqa.selenium.By;


public class PageActions extends Browser {

	public void escrever(By elemento, String texto) {

		getDriver().findElement(elemento).sendKeys(texto);
	}

	public void selecionar(By elemento) {

		getDriver().findElement(elemento).click();
	}
	
}
