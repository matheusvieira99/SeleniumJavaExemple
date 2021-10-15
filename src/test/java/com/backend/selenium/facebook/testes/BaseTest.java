package com.backend.selenium.facebook.testes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.backend.selenium.facebook.paginas.HomePage;
import com.backend.selenium.facebook.paginas.LoginPage;

class BaseTest {
	WebDriver webDriver;
	HomePage homePage;
	LoginPage loginPage;
	
	

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\webdriver\\msedgedriver.exe");
		webDriver = new EdgeDriver();
		webDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		homePage = new HomePage(webDriver);
		loginPage = new LoginPage(webDriver);
		loginPage.abrirPagina("https://facebook.com");
		loginPage.maximizarPagina();
	}

	@AfterEach
	void tearDown() throws Exception {
		webDriver.quit();
	}

}
