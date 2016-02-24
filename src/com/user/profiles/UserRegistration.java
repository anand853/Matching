package com.user.profiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.utils.Constants;
import com.base.utils.Util;

public class UserRegistration {
	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) {

		openBrowser();
		acessToMatchSite();
		maximizePage();
		clickOnMemberSignLink();
		clickOnRegistartionLink();
		enterZipCode();
		clickOnViewSinglesButton();
		enterEmailId();
		cilckOnContinuewButton();
		enterPassword();
		clickOnContinuewPassButton();
		enterUserName();
		clickOnContinuewUserButton();
		clickOngetStartedButton();
		clickOnHairColorButton();
		clickOnRelationshipButton();
		clickOnEducationButton();
		clickOnSmokeButton();
		clickOnBackgrounButton();
		clickOnFavButton();
		clickOnInterestButton();
		clickOnHairEyeColorButton();
		clickOnEducationLangButton();
		clickOnEthinicButton();
		clickOnRelationShipKidsButton();
		clickOnSalaryButton();
		clickOnHeadLinesButton();
		clickOnAboutYouButton();
		clickOnProfilePicButton();
		clickOnFirstMatchesButton();
		clickOnAddProfilePicButton();
		clickOnAddAPicButton();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();
		//
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.name("Next")).click();
		//
		// String iUserName =
		// driver.findElement(By.xpath("//*[@id='progress']/a[1]")).getText();
		// if (iUserName.equals(Constants.USERNAME_VALUE)) {
		// System.out.println("test case pass");
		//
		// } else {
		// System.out.println("test case failed");
		// }
		//
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath(Constants.SEARCH_BTN)).click();
		//
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.id("username-search")).sendKeys("Florida");
		//
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.id("btn-username-search")).click();
		//
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath(Constants.SAVE_XPATH)).click();
		//
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.xpath(Constants.FAV_LINK)).click();
		//
		// // sign out here
		// Actions action = new Actions(driver);
		// WebElement element =
		// driver.findElement(By.xpath(Constants.USER_HOVER));
		// action.moveToElement(element).moveToElement(driver.findElement(By.xpath(Constants.USER_LOGOUT))).click().build()
		// .perform();
	}

	private static void clickOnAddAPicButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div[3]/a")).click();

	}

	private static void clickOnAddProfilePicButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a")).click();

	}

	private static void clickOnFirstMatchesButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("Next")).click();

	}

	private static void clickOnProfilePicButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		retryingFindClick(By.xpath("//*[@id='progress']/a[1]"));

	}

	private static void clickOnAboutYouButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Constants.SELFESSAY_TEXT)).sendKeys(
				"NFO:" + " Pawan Kalyan is an Indian film actor, director, screenwriter, stunt coordinator, writer, "
						+ "and politician. His film works are predominantly in Telugu cinema. He is the younger"
						+ " brother of actor turned politician Chiranjeevi. ");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnHeadLinesButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Constants.SELFHEADLINETEXT)).sendKeys("hi ih");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnSalaryButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnRelationShipKidsButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// retry
		retryingFindClick(By.xpath("//*[@id='progress']/a[1]"));
		// driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnEthinicButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnEducationLangButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnHairEyeColorButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnInterestButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnFavButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnBackgrounButton() {
		System.out.println("-----------clicked---started-5-----");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnSmokeButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnEducationButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnRelationshipButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOnHairColorButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='progress']/a[1]")).click();

	}

	private static void clickOngetStartedButton() {
		Util.findElementByXpath(driver, Constants.BTN_ONE).click();

	}

	private static void clickOnContinuewUserButton() {
		Util.findElementByXpath(driver, Constants.CONTINUE_USERNAME).click();

	}

	private static void enterUserName() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Util.findElementbyNameAndSendKeys(driver, Constants.USER_NAME_TXT, "anadn853");

	}

	private static void clickOnContinuewPassButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Util.findElementByXpath(driver, Constants.CONTINUE_BTN_PASS).click();

	}

	private static void enterPassword() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Util.findElementbyNameAndSendKeys(driver, Constants.PASSWORD_TXT, "password");

	}

	private static void cilckOnContinuewButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Util.findElementByXpath(driver, Constants.CONTINUE_BTN).click();

	}

	private static void enterEmailId() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Constants.EMAIL_ID)).sendKeys("KK_154k235113@gmail.com");

	}

	private static void clickOnViewSinglesButton() {
		Util.findElementByXpath(driver, Constants.VIEW_SINGLE_BTN).click();

	}

	private static void enterZipCode() {
		Util.findElementbyIdAndSendKeys(driver, "postalCode", "33605");

	}

	private static void clickOnRegistartionLink() {
		Util.findElementByLinkText(driver, Constants.RESGISTARTION_LINK_TXT).click();
	}

	private static void clickOnMemberSignLink() {
		Util.findElementByLinkText(driver, Constants.SIGNIN_TXT).click();

	}

	private static void maximizePage() {
		driver.manage().window().maximize();

	}

	private static void acessToMatchSite() {
		Util.getURL(driver, Constants.MATCH_COM);

	}

	private static void openBrowser() {
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
