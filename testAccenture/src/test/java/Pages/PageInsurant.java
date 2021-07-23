package Pages;

import org.openqa.selenium.By;

public class PageInsurant {
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By dateBirth = By.id("birthdate");
	private By country = By.id("country");
	private By zipCode = By.id("zipcode");
	private By occupacion = By.id("occupation");
	private By hobbies = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	private By next = By.id("nextenterproductdata");
	
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getDateBirth() {
		return dateBirth;
	}
	public By getCountry() {
		return country;
	}
	public By getZipCode() {
		return zipCode;
	}
	public By getOccupacion() {
		return occupacion;
	}
	public By getHobbies() {
		return hobbies;
	}
	public By getNext() {
		return next;
	}


}
