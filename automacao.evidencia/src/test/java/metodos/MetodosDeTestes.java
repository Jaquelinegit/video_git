package metodos;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MetodosDeTestes extends DriversFactory{

	public void abrirNavegador() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://saucedemo.com");
		}catch (Exception e) {
			System.err.println("*************ERRO AO ABRIR NAVEGADOR*******");
			System.err.println("*************CAUSA DO ERRO************" + e.getCause());					
		}
	}
		
	public void printScreen(String nomeEvidencia) {
		try {
			TakesScreenshot srcShot = (TakesScreenshot) driver;
			File scrFile = srcShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e)  {
			System.err.println("*************ERRO AO GERAR A EVIDENCIA*******"+ nomeEvidencia);
			System.err.println("*************CAUSA DO ERRO************" + e.getCause());
		}
	}
	
	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("*************ERRO AO TENTAR FECHAR NAVEGADOR*******");
			System.err.println("*************CAUSA DO ERRO************" + e.getCause());
		}
	}

	
}
