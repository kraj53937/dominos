package org.dominos_Real_baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Real_baseclass_dominos {

	public static WebDriver driver;

	// actions
	public static void rightClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void doubleclick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void toMoveToElement(WebDriver driver, WebElement ref) {
		Actions a = new Actions(driver);
		a.moveToElement(ref).perform();

	}

	public static void toDragAndDrop(WebDriver driver, WebElement s, WebElement d) {
		Actions a = new Actions(driver);
		a.dragAndDrop(s, d).perform();
	}

	public static void toTakeSnap(WebDriver driver, String picname) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File(picname);
		FileUtils.copyFile(s, d);// d means path of screenshot saver
	}

	public static void toGetText(WebDriver driver) {
		Alert a1 = driver.switchTo().alert();
		String t = a1.getText();
		System.out.println(t);
	}

	public static void toPressEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void toPressTab() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void toSelectAll() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_A);
	}

	public static void getwindowhandles(WebDriver driver) {
		Set<String> allWindowId = driver.getWindowHandles();
		Iterator<String> itr = allWindowId.iterator();
		String parent = itr.next();
		String child = itr.next();
		System.out.println(allWindowId);
		driver.switchTo().window(child);
	}

	public static void toScrollUp(WebDriver driver, WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ref);
	}

	public static void toScrollDown(WebDriver driver, WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ref);

	}

	public static void jsclick(WebDriver driver, WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ref);

	}

	public static void implicitWait(WebDriver driver, int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	public void explicitWait(WebElement element) {

		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofMinutes(1));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	public void explicitWaitClick(WebElement element) {

		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofMinutes(1));
		driverWait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void dropdownselectbyvalue(WebDriver driver, WebElement element, String s) {
		Select slcvalue = new Select(element);
		slcvalue.selectByValue(s);
	}

	public void dropdownselectbyindex(WebDriver driver, WebElement element, int index) {
		Select slcindex = new Select(element);

		slcindex.selectByIndex(index);

	}

	public void Downkeybutton(WebDriver driver, WebElement element) throws AWTException {
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

	}

	public void Downkeybuttonloop(WebDriver driver, WebElement element) throws AWTException {
		// Actions act=new Actions(driver);
		Robot rb = new Robot();
		for (int i = 0; i < 3; i++) {
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);

		}

	}

}
