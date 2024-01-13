package threePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sevenclass {

	
	@Parameters({"URL"})
	@Test
	public void testSevenA(String url) throws InterruptedException {
		System.out.println("testSevenA Test of Sevenclass");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
		
	}
	@Parameters({"URL"})
@Test
	public void testSevenB(String url) throws InterruptedException {
		System.out.println("testSevenB Test of Sevenclass");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}
	
	@Parameters({"URL"})
@Test
	public void testSevenC(String url) throws InterruptedException {
		System.out.println("testSevenC Test of Sevenclass");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}
	
	@Parameters({"URL"})
@Test
	public void testSevenD(String url)throws InterruptedException {
		System.out.println("testSevenD Test of Sevenclass");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}

}
