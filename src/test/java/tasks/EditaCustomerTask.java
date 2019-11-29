package tasks;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import appobjects.EditaCustomerAppObject;
import frameworks.utils.WaitElementFw;

public class EditaCustomerTask {
	private WebDriver driver;
	private EditaCustomerAppObject editaCustomerAppObject;
	
	public EditaCustomerTask (WebDriver driver) {
		this.driver = driver;
		this.editaCustomerAppObject = new EditaCustomerAppObject(driver);
	}
	
	public void alterarCombobox() {
		editaCustomerAppObject.getBootstrapCombobox().click();
		editaCustomerAppObject.getBootstrapCombobox().sendKeys(Keys.ARROW_DOWN);
		editaCustomerAppObject.getBootstrapCombobox().sendKeys(Keys.ENTER);
	}
	
	public void acessarEditar() {
		editaCustomerAppObject.getEditButton().click();
	}
	
	public void alterarCadastrar(String name) {
		editaCustomerAppObject.getNameTextField().sendKeys(name);
		editaCustomerAppObject.getUpdateChangesButton().click();
	}
	
	public void validar() {
		WaitElementFw.visibilityOf(driver, editaCustomerAppObject.getValidarSucessLabel());
		String expected = "Your data has been successfully updated. Go back to list";
		String actual = editaCustomerAppObject.getValidarSucessLabel().getText();
		Assert.assertEquals(expected, actual);
	}
}