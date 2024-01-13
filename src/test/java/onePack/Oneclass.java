package onePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Oneclass {
	
	
	@Parameters({"URL"})
	@Test
	public void testOneA(String url) throws InterruptedException {
		
		System.out.println("testOneA Test of Oneclass");
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
	public void testOneB(String url) throws InterruptedException {
		
		System.out.println("testOneB Test of Oneclass");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}
	@Parameters({"URL"})
	@Test
	public void testOneC(String url) throws InterruptedException {
		
		System.out.println("testOneC Test of Oneclass");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}
	@Parameters({"URL"})
	@Test
	public void testOneD(String url) throws InterruptedException {
		
		System.out.println("testOneD Test of Oneclass");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
