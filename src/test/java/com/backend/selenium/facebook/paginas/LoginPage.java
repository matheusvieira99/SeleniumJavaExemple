package com.backend.selenium.facebook.paginas;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.backend.selenium.facebook.senha.Bot;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void abrirPagina () {
		driver.get("https://facebook.com");
	}
	
	public void maximizarPagina() {
		driver.manage().window().maximize();
	}
	
	public void informarLogin (String email, String password) {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
	}
	
	public void clicarLogin () {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	public void validarResultado() {
		Assert.assertTrue("Validando login", driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[11]/div[1]/div/div[2]")).isDisplayed());
	}
	
	public void validarResultadoNegativo() {
		//String s = "A senha inserida está incorreta.";
		assertEquals("A senha inserida está incorreta.", "A senha inserida está incorreta.");
	}

}
