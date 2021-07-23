package Pages;

import org.openqa.selenium.By;

public class PagePrice {
	private By selectOption = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1) > span");
	private By next = By.id("nextsendquote");
	
	public By getSelectOption() {
		return selectOption;
	}
	public By getNext() {
		return next;
	}

}
