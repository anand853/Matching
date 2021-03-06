package com.base.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	static WebDriver driver;
	static WebElement element;

	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();

	}

	public static void getURL(WebDriver driver, String url) {

		driver.get(url);
	}

	public static void quitDriver() {
		driver.quit();
	}

	public static void quitClose() {
		driver.close();
	}

	static String getCurrentPageUrl() {
		return driver.getCurrentUrl();

	}

	public static WebDriver getBrowser(String browser) {
		if (browser == null) {
			return null;
		}
		if (browser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "C:/Building/WebDriver/chromedriver_win32/chromedriver.exe");

			return new ChromeDriver();

		} else if (browser.equalsIgnoreCase("FF")) {
			return new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:/Building/WebDriver/IEDriverServer_x64_2.49.0/IEDriverServer.exe");
			return new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("HTML")) {
			return driver = new HtmlUnitDriver();

		}

		return null;
	}

	public static void findElementbyIdAndSendKeys(WebDriver driver, String id, String searchText) {
		waitTime(driver, 10);
		driver.findElement(By.id(id)).sendKeys(searchText);
	}

	public static void waitTime(WebDriver driver, int secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	}

	public static void findElementbyNameAndSendKeys(WebDriver driver, String name, String searchText) {
		waitTime(driver, 10);
		driver.findElement(By.name(name)).sendKeys(searchText);
	}

	public static void findElementByXpathAndSendKeys(WebDriver driver, String xpath, String searchText) {
		waitTime(driver, 10);
		driver.findElement(By.xpath(xpath)).sendKeys(searchText);
	}

	public static WebElement findElementByXpath(WebDriver driver, String xpath) {
		waitTime(driver, 10);
		return driver.findElement(By.xpath(xpath));
	}

	public static WebElement findElementByLinkText(WebDriver driver, String linkText) {
		waitTime(driver, 10);
		return driver.findElement(By.linkText(linkText));
	}

	public static WebElement findElementByID(WebDriver driver, String id) {
		waitTime(driver, 10);
		return driver.findElement(By.id(id));
	}

	public static void findElementbyNameAndClick(WebDriver driver, String buttonName) {
		waitTime(driver, 10);
		driver.findElement(By.name(buttonName)).click();

	}

	public static WebElement findElementbyName(WebDriver driver, String buttonName) {
		waitTime(driver, 10);
		return driver.findElement(By.name(buttonName));

	}

	public static String findPageTitle(WebDriver driver) {
		return driver.getTitle();

	}

	public static void findElementbyClassAndClick(WebDriver driver, String amazonSearchBtn) {
		waitTime(driver, 10);
		driver.findElement(By.className(amazonSearchBtn)).click();

	}

	public static void ExplicitWaitTimeByXpath(WebDriver driver, String locator, int secs) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}

	public static void ExplicitWaitTimeByID(WebDriver driver, String locator, int secs) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	}

	public static void ExplicitWaitTimeByName(WebDriver driver, String locator, int secs) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
	}

	private static void ExplicitWaitTimeByLinkText(WebDriver driver2, String linkText, int i) {
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)));

	}

}
