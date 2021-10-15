package com.backend.selenium.facebook.testes;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.backend.selenium.facebook.senha.Bot;

class Teste2 extends BaseTest {
	

	//	WebDriver webDriver;
//	HomePage homePage;
//	LoginPage loginPage;
	String email = "matheus-vieira12@hotmail.com";


	@Test
	void test2() throws IOException {
//		driver.get("https://facebook.com");
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Bot.password);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		loginPage.abrirPagina("https://facebook.com");
//		loginPage.maximizarPagina();
		loginPage.informarLogin(email, Bot.password);
		loginPage.clicarLogin();
		homePage.abrirSearch();
		homePage.digitarNome("Matheus");
		homePage.clicarEmPesquisar();
		homePage.resultadoEsperado();
		homePage.rolarBarra();
		homePage.tirarScreenshot();
		
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
