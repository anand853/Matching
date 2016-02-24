package com.base.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Util {
	static WebDriver driver;
	static WebElement element;

	static java.util.List<String> list1 = new ArrayList<String>();
	static java.util.List<String> list2 = new ArrayList<String>();

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
		driver.findElement(By.id(id)).sendKeys(searchText);
	}

	public static void waitTime(WebDriver driver, int secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	}

	public static void findElementbyNameAndSendKeys(WebDriver driver, String name, String searchText) {
		driver.findElement(By.name(name)).sendKeys(searchText);
	}

	public static void findElementByXpathAndSendKeys(WebDriver driver, String xpath, String searchText) {
		driver.findElement(By.xpath(xpath)).sendKeys(searchText);
	}

	public static WebElement findElementByXpath(WebDriver driver, String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public static WebElement findElementByLinkText(WebDriver driver, String linkText) {
		return driver.findElement(By.linkText(linkText));
	}

	public static WebElement findElementByID(WebDriver driver, String id) {
		return driver.findElement(By.id(id));
	}

	public static void findElementbyNameAndClick(WebDriver driver, String buttonName) {
		driver.findElement(By.name(buttonName)).click();

	}

	public static WebElement findElementbyName(WebDriver driver, String buttonName) {
		return driver.findElement(By.name(buttonName));

	}

	public static String findPageTitle(WebDriver driver) {
		return driver.getTitle();

	}

	public static void findElementbyClassAndClick(WebDriver driver, String amazonSearchBtn) {
		driver.findElement(By.className(amazonSearchBtn)).click();

	}

	public static List<String> addToList(WebDriver driver, String xpath_start, String xpath_end) {

		for (int i = 1; i <= 5; i++) {
			list1.add(driver.findElement(By.xpath(xpath_start + i + xpath_end)).getText());
		}
		System.out.println(list1.size());
		return list1;

	}

}
