package com.user.profiles;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.utils.Constants;
import com.base.utils.Util;

public class UserRegistration {
	static WebDriver driver;
	static WebElement element;

	static void clickOnMyFav() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.USER_FAV_LINK).click();

		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.USER_FAV_LINK_2).click();

		logOut();

	}

	static void clickOnUserName() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.USER_NAME).click();

	}

	static void LogIn() {
		openBrowser();
		acessToMatchSite();
		maximizePage();
		clickOnMemberSignLink();
		enterUserNamePass();

	}

	static void enterUserNamePass() {
		Util.waitTime(driver, 10);
		Util.findElementByID(driver, "email").sendKeys("KK_194k35113@gmail.com");
		Util.findElementByID(driver, "password").sendKeys("password");
		Util.findElementByID(driver, "password").sendKeys(Keys.ENTER);

	}

	static void logOut() {
		Util.waitTime(driver, 10);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(Constants.USER_HOVER));
		action.moveToElement(element).moveToElement(driver.findElement(By.xpath(Constants.USER_LOGOUT))).click().build()
				.perform();

	}

	static void clickOnFavMe() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.FAV_ME_BTN).click();

	}

	static void clickOnSaveButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.SEARCH_RESULTS).click();

	}

	static void enterTextSearchBox() {
		Util.waitTime(driver, 10);
		Util.findElementByID(driver, Constants.SEARCH_TXT).clear();
		Util.findElementByID(driver, Constants.SEARCH_TXT).sendKeys("marilyn");
		Util.findElementByID(driver, Constants.SEARCH_TXT).sendKeys(Keys.ENTER);

	}

	static void clickOnSearchBox() {
		Util.waitTime(driver, 10);
		Util.findElementByID(driver, Constants.SEARCH_ID).click();

	}

	static void clickOnAddAPicButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "/html/body/div[4]/div/div/div[1]/div[3]/a").click();

	}

	static void clickOnAddProfilePicButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a").click();

	}

	static void clickOnFirstMatchesButton() {
		Util.waitTime(driver, 10);
		Util.findElementbyName(driver, "Next").click();

	}

	static void clickOnProfilePicButton() {
		Util.waitTime(driver, 10);
		retryingFindClick(By.xpath("//*[@id='progress']/a[1]"));

	}

	static void clickOnAboutYouButton() {
		Util.waitTime(driver, 10);
		driver.findElement(By.xpath(Constants.SELFESSAY_TEXT)).sendKeys(
				"NFO:" + " Pawan Kalyan is an Indian film actor, director, screenwriter, stunt coordinator, writer, "
						+ "and politician. His film works are predominantly in Telugu cinema. He is the younger"
						+ " brother of actor turned politician Chiranjeevi. ");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnHeadLinesButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.SELFHEADLINETEXT).sendKeys("hi ih");

		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnSalaryButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnRelationShipKidsButton() {
		Util.waitTime(driver, 10);

		retryingFindClick(By.xpath("//*[@id='progress']/a[1]"));

	}

	static void clickOnEthinicButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnEducationLangButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnHairEyeColorButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnInterestButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnFavButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnBackgrounButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnSmokeButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnEducationButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnRelationshipButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnHairColorButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOngetStartedButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.BTN_ONE).click();

	}

	static void clickOnContinuewUserButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.CONTINUE_USERNAME).click();

	}

	static void enterUserName() {
		Util.waitTime(driver, 10);
		Util.findElementbyNameAndSendKeys(driver, Constants.USER_NAME_TXT, "anadn853");

	}

	static void clickOnContinuewPassButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.CONTINUE_BTN_PASS).click();

	}

	static void enterPassword() {
		Util.waitTime(driver, 10);
		Util.findElementbyNameAndSendKeys(driver, Constants.PASSWORD_TXT, "password");

	}

	static void cilckOnContinuewButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.CONTINUE_BTN).click();

	}

	static void enterEmailId() {
		Util.waitTime(driver, 10);
		driver.findElement(By.xpath(Constants.EMAIL_ID)).sendKeys("KK_1564k35113@gmail.com");

	}

	static void clickOnViewSinglesButton() {
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.VIEW_SINGLE_BTN).click();

	}

	static void enterZipCode() {
		Util.waitTime(driver, 10);
		Util.findElementbyIdAndSendKeys(driver, "postalCode", "33605");

	}

	static void clickOnRegistartionLink() {
		Util.waitTime(driver, 10);
		Util.findElementByLinkText(driver, Constants.RESGISTARTION_LINK_TXT).click();
	}

	static void clickOnMemberSignLink() {
		Util.waitTime(driver, 10);
		Util.findElementByLinkText(driver, Constants.SIGNIN_TXT).click();

	}

	static void maximizePage() {
		driver.manage().window().maximize();

	}

	static void acessToMatchSite() {
		Util.waitTime(driver, 10);
		Util.getURL(driver, Constants.MATCH_COM);

	}

	static void openBrowser() {
		driver = Util.getBrowser("FF");

	}

	private static boolean retryingFindClick(By by) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				driver.findElement(by).click();
				result = true;
				break;
			} catch (Exception e) {
			}
			attempts++;
		}
		return result;
	}
}
