package com.backend.selenium.facebook.paginas;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	public LoginPage (WebDriver driver) {
		super(driver);
	}
	
	public void informarLogin (String email, String password) {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
	}
	
	public void clicarLogin () {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	public void validarLoginSucesso() {
		Assert.assertTrue("Validando login", driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[11]/div[1]/div/div[2]")).isDisplayed());
	}
	
	public void validarMensagemSenhaIncorreta() {
		//String s = "A senha inserida está incorreta.";
		assertEquals("A senha inserida está incorreta. Esqueceu a senha?", driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]")).getText());
		
	}
	

}
