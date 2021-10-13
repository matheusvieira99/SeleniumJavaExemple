package com.backend.selenium.insta;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.backend.selenium.insta.Teste;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void abreSearch() {
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[11]/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/label/input")).click();
	}
	
	public void digitaNome(String nome) {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys(nome);
	}
	
	public void clicaEmPesquisar() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/div/ul/li[9]/div/a/div")).click();
	}
	
	public void resultadoEsperado() {
		Assert.assertTrue("Validando pesquisa", driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div/span/h1")).isDisplayed());
	}

}
