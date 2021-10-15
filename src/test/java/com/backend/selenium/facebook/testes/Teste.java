package com.backend.selenium.facebook.testes;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.backend.selenium.facebook.paginas.HomePage;
import com.backend.selenium.facebook.paginas.LoginPage;
import com.backend.selenium.facebook.senha.Bot;

class Teste extends BaseTest {

	//LoginPage loginPage;
	String email = "matheus-vieira12@hotmail.com";

	@BeforeEach
	void setUp() throws Exception {
		//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\webdriver\\msedgedriver.exe");
//		webDriver = new EdgeDriver();
//		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		loginPage = new LoginPage(webDriver);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	void test() {
//		loginPage.abrirPagina("https://facebook.com");
//		loginPage.maximizarPagina();
		loginPage.informarLogin(email, Bot.password);
		loginPage.clicarLogin();
		loginPage.validarLoginSucesso();
		
//		driver.get("https://facebook.com");
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Bot.password);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
////		wait(4);
//		Assert.assertTrue("Validando login", driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[11]/div[1]/div/div[2]")).isDisplayed());
	}

}
