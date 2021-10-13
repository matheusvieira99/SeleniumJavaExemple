package com.backend.selenium.insta;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void abrirPagina () {
		driver.get("https://facebook.com");
	}
	
	public void informarLogin (String email, String password) {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Bot.password);
	}
	
	public void clicarLogin () {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	public void resultadoEsperado() {
		Assert.assertTrue("Validando login", driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[11]/div[1]/div/div[2]")).isDisplayed());
	}

}
