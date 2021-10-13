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

class Teste2 {
	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	String email = "matheus-vieira12@hotmail.com";

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\mathe\\Desktop\\SERRATEC\\API JAVA WORKSPACE\\InstagramTestLogin\\webdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
//		driver.get("https://facebook.com");
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Bot.password);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		loginPage.abrirPagina();
		loginPage.informarLogin(email, Bot.password);
		loginPage.clicarLogin();
		homePage.abreSearch();
		homePage.digitaNome("Matheus");
		homePage.clicaEmPesquisar();
		homePage.resultadoEsperado();
		
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[11]/div[1]/div/div[2]")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/label/input")).click();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("Matheus");
//		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/div/ul/li[9]/div/a/div")).click();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		Assert.assertTrue("Validando pesquisa", driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div/span/h1")).isDisplayed());
	}

}
