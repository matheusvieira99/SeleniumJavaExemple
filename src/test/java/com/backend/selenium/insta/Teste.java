package com.backend.selenium.insta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class Teste {
	WebDriver driver;
	LoginPage loginPage;
	String email = "matheus-vieira12@hotmail.com";

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mathe\\Desktop\\SERRATEC\\API JAVA WORKSPACE\\InstagramTestLogin\\webdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPage = new LoginPage(driver);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws InterruptedException {
		loginPage.abrirPagina();
		loginPage.informarLogin(email, Bot.password);
		loginPage.clicarLogin();
		loginPage.validarResultado();
		
//		driver.get("https://facebook.com");
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Bot.password);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
////		wait(4);
//		Assert.assertTrue("Validando login", driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[11]/div[1]/div/div[2]")).isDisplayed());
	}

}
