package Pages;

import org.openqa.selenium.By;

public class PageVehicle {
	private By make = By.cssSelector("#make");
	private By model = By.cssSelector("#model");
	private By cylinder = By.id("cylindercapacity");
	private By engine = By.id("engineperformance");
	private By date = By.id("dateofmanufacture");
	private By numbers = By.id("numberofseats");
	private By numbersSeats = By.id("numberofseatsmotorcycle");
	private By fuel = By.id("fuel");
	private By payload = By.id("payload");
	private By total = By.id("totalweight");
	private By list = By.id("listprice");
	private By annual = By.id("annualmileage");
	private By next = By.id("nextenterinsurantdata");
	
	public By getPayload() {
		return payload;
	}
	public By getTotal() {
		return total;
	}
	public By getMake() {
		return make;
	}
	public By getEngine() {
		return engine;
	}
	public By getDate() {
		return date;
	}
	public By getNumbers() {
		return numbers;
	}
	public By getFuel() {
		return fuel;
	}
	public By getAnnual() {
		return annual;
	}
	public By getNext() {
		return next;
	}
	public By getModel() {
		return model;
	}
	public By getCylinder() {
		return cylinder;
	}
	public By getNumbersSeats() {
		return numbersSeats;
	}
	public By getList() {
		return list;
	}
	

}
