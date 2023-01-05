package org.lib;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.Scenario;

public class LibGobal {
	
	public static WebDriver driver;

	public static WebDriver launchbrower() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver107new.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver launchsite(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static Actions getactions() {
		Actions builder = new Actions(driver);
		return builder;
	}

	public static WebElement chooseElement(int x, String path) {

		WebElement element = null;

		switch (x) {
		case 1:
			element = driver.findElement(By.id(path));
			break;
		case 2:
			element = driver.findElement(By.name(path));
			break;
		case 3:
			element = driver.findElement(By.xpath(path));
		case 4:
			element = driver.findElement(By.linkText(path));
			break;
		case 5:
			element = driver.findElement(By.partialLinkText(path));
			break;
		}
		return element;
	}

	public static void sendkey(int x, String path, String text) {
		chooseElement(x, path).sendKeys(text);
	}

	public static void clickbtn(int x, String path) {
		chooseElement(x, path).click();
	}

	public static WebDriver closebrower() {
		driver.close();
		return driver;
	}

	public static WebDriver implicitywait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	public static WebElement mouseover(int x, String path) {
		WebElement mO = chooseElement(x, path);
		getactions().moveToElement(mO).perform();
		return mO;
	}
	public static void sendinput(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void buttonclick(WebElement element) {
		element.click();
	}
    public static void verifypage(String input ) {
    	driver.getPageSource().contains(input);
    }
    public static void teamdown( ) throws IOException {
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
    LocalDateTime ldt=LocalDateTime.now();
    String time=dtf.format(ldt);
    String option=time.replace("/", "-").replace(",", "-");
    File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileHandler.copy(scrfile, new File("C:\\Users\\peter anthony\\eclipse-workspace\\com.cucumberproject\\src\\test\\resources\\screenshotfile\\"+time+"peter.png"));
    
    	}
    }





