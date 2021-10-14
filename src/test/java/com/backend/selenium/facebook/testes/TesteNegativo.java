package com.backend.selenium.facebook.testes;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.backend.selenium.facebook.paginas.HomePage;
import com.backend.selenium.facebook.paginas.LoginPage;

class TesteNegativo {
	
	WebDriver webDriver;
	HomePage homePage;
	LoginPage loginPage;
	String email = "matheus-vieira12@hotmail.com";
	String senha = "erro";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\webdriver\\msedgedriver.exe");
		webDriver = new EdgeDriver();
		webDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		homePage = new HomePage(webDriver);
		loginPage = new LoginPage(webDriver);
	}

	@AfterEach
	void tearDown() throws Exception {
		webDriver.quit();
	}

	@Test
	void test() {
		loginPage.abrirPagina();
		loginPage.maximizarPagina();
		loginPage.informarLogin(email, senha);
		loginPage.clicarLogin();
		loginPage.validarResultadoNegativo();
	}

}
