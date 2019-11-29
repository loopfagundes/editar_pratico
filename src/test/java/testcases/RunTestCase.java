package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import frameworks.utils.BaseTestFw;
import tasks.EditaCustomerTask;

public class RunTestCase extends BaseTestFw {
	private WebDriver driver = getDriver();
	  private EditaCustomerTask editaCustomerTask = new EditaCustomerTask(driver);
	  
	  @Test
	  public void test() {
		  driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
		  editaCustomerTask.alterarCombobox();
		  editaCustomerTask.acessarEditar();
		  editaCustomerTask.alterarCadastrar("Luciano");
		  editaCustomerTask.validar();
	  }
}