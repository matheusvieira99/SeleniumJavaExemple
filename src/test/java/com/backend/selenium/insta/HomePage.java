package com.backend.selenium.insta;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

public class HomePage {
	
	WebDriver driver;
	

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void abrirSearch() {
		driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[11]/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/label/input")).click();
	}
	
	public void digitarNome(String nome) {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys(nome);
	}
	
	public void clicarEmPesquisar() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/div/ul/li[9]/div/a/div")).click();
	}
	
	public void tirarScreenshot() throws IOException {
		String path;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		path = "C:\\Users\\mathe\\Downloads\\" + scrFile.getName();
        FileUtils.copyFile(scrFile, new File(path)); 
//		FileUtils.copyFile(scrFile, new File("C:\\Users\\mathe\\Downloads"));
	}
	
	public void salvarScreenshot() {
	}
	
	public void rolarBarra() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement Element = driver.findElement(By.xpath("//*[@id=\"mount_0_0_po\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div[5]/div/div/div/div/div/div/div[2]/a/span"));
		////*[@id="mount_0_0_po"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div[5]/div/div/div/div/div/div/div[2]/a/span
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
	}
	
	public void resultadoEsperado() {
		Assert.assertTrue("Validando pesquisa", driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div/span/h1")).isDisplayed());
	}

}
