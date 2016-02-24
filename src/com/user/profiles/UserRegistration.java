package com.user.profiles;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.utils.Constants;
import com.base.utils.Util;

public class UserRegistration {

	static Logger logger = Logger.getLogger(UserRegistration.class);
	static WebDriver driver;
	static WebElement element;
	static String name = "";
	static String[] args;

	static void clickOnMyFav() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);

		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.USER_FAV_LINK).click();

		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.USER_FAV_LINK_2).click();

		logOut();

	}

	static void clickOnUserName() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.USER_NAME).click();

	}

	static void LogIn() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		openBrowser();
		acessToMatchSite();
		maximizePage();
		clickOnMemberSignLink();
		enterUserNamePass();

	}

	static void enterUserNamePass() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByID(driver, "email").sendKeys("KK_194k35113@gmail.com");
		Util.findElementByID(driver, "password").sendKeys("password");
		Util.findElementByID(driver, "password").sendKeys(Keys.ENTER);

	}

	static void logOut() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(Constants.USER_HOVER));
		action.moveToElement(element).moveToElement(driver.findElement(By.xpath(Constants.USER_LOGOUT))).click().build()
				.perform();

	}

	static void clickOnFavMe() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.FAV_ME_BTN).click();

	}

	static void clickOnSaveButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.SEARCH_RESULTS).click();

	}

	static void enterTextSearchBox() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByID(driver, Constants.SEARCH_TXT).clear();
		Util.findElementByID(driver, Constants.SEARCH_TXT).sendKeys("marilyn");
		Util.findElementByID(driver, Constants.SEARCH_TXT).sendKeys(Keys.ENTER);

	}

	static void clickOnSearchBox() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByID(driver, Constants.SEARCH_ID).click();

	}

	static void clickOnAddAPicButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "/html/body/div[4]/div/div/div[1]/div[3]/a").click();

	}

	static void clickOnAddProfilePicButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a").click();

	}

	static void clickOnFirstMatchesButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementbyName(driver, "Next").click();

	}

	static void clickOnProfilePicButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		retryingFindClick(By.xpath("//*[@id='progress']/a[1]"));

	}

	static void clickOnAboutYouButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		driver.findElement(By.xpath(Constants.SELFESSAY_TEXT)).sendKeys(
				"INFO:" + " Pawan Kalyan is an Indian film actor, director, screenwriter, stunt coordinator, writer, "
						+ "and politician. His film works are predominantly in Telugu cinema. He is the younger"
						+ " brother of actor turned politician Chiranjeevi. ");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnHeadLinesButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.SELFHEADLINETEXT).sendKeys("hi ih");

		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnSalaryButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnRelationShipKidsButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);

		retryingFindClick(By.xpath("//*[@id='progress']/a[1]"));

	}

	static void clickOnEthinicButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnEducationLangButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnHairEyeColorButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnInterestButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnFavButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnBackgrounButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnSmokeButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnEducationButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnRelationshipButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOnHairColorButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, "//*[@id='progress']/a[1]").click();

	}

	static void clickOngetStartedButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.BTN_ONE).click();

	}

	static void clickOnContinuewUserButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.CONTINUE_USERNAME).click();

	}

	static void enterUserName() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementbyNameAndSendKeys(driver, Constants.USER_NAME_TXT, "anadn853");

	}

	static void clickOnContinuewPassButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.CONTINUE_BTN_PASS).click();

	}

	static void enterPassword() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementbyNameAndSendKeys(driver, Constants.PASSWORD_TXT, "password");

	}

	static void cilckOnContinuewButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.CONTINUE_BTN).click();

	}

	static void enterEmailId() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		driver.findElement(By.xpath(Constants.EMAIL_ID)).sendKeys("KK_1564k35113@gmail.com");

	}

	static void clickOnViewSinglesButton() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByXpath(driver, Constants.VIEW_SINGLE_BTN).click();

	}

	static void enterZipCode() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementbyIdAndSendKeys(driver, "postalCode", "33605");

	}

	static void clickOnRegistartionLink() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByLinkText(driver, Constants.RESGISTARTION_LINK_TXT).click();
	}

	static void clickOnMemberSignLink() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.findElementByLinkText(driver, Constants.SIGNIN_TXT).click();

	}

	static void maximizePage() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		driver.manage().window().maximize();

	}

	static void acessToMatchSite() {
		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		logger.info("----We are in-----" + name);
		Util.waitTime(driver, 10);
		Util.getURL(driver, Constants.MATCH_COM);

	}

	static void openBrowser() {

		name = new Object() {
		}.getClass().getEnclosingMethod().getName();

		driver = Util.getBrowser(args[0]);

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
