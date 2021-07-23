package Pages;

import org.openqa.selenium.By;

public class PageSend {
	private By email = By.id("email");
	private By username = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmpassword");
	private By send = By.id("sendemail");
	
	public By getEmail() {
		return email;
	}
	public By getUsername() {
		return username;
	}
	public By getPassword() {
		return password;
	}
	public By getConfirmPassword() {
		return confirmPassword;
	}
	public By getSend() {
		return send;
	}
	
}
