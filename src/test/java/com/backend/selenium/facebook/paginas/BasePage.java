package com.backend.selenium.facebook.paginas;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

public class BasePage {
	
	protected WebDriver driver;
	
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void tirarScreenshot() throws IOException {
		String path;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		path = "C:\\Users\\Matheus\\Downloads\\" + scrFile.getName();
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

}
