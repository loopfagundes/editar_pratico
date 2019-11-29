package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameworks.utils.WaitElementFw;

public class EditaCustomerAppObject {
	private WebDriver driver;
	
	public EditaCustomerAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBootstrapCombobox() {
		return driver.findElement(By.id("switch-version-select"));
	}
	
	public WebElement getEditButton() {
		return driver.findElement(By.cssSelector("tr:nth-child(1) td:nth-child(2) div.only-desktops > a"));
	}
	
	public WebElement getNameTextField() {
		return driver.findElement(By.id("field-customerName"));
	}
	
	public WebElement getUpdateChangesButton() {
		return driver.findElement(By.id("form-button-save"));
	}
	
	public WebElement getValidarSucessLabel() {
		WaitElementFw.visibilityOfElementLocated(driver, By.cssSelector("div#report-success > p > a"));
		return driver.findElement(By.cssSelector("div#report-success > p"));
	}
}