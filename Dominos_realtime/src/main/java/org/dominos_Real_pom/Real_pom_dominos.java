package org.dominos_Real_pom;

import org.dominos_Real_baseclass.Real_baseclass_dominos;
import org.openqa.selenium.By;

public class Real_pom_dominos extends Real_baseclass_dominos {

	public By online_order = By.xpath("//button[text()='ORDER ONLINE NOW']");
	public By poupupAdd = By.xpath("//span[text()='ADD']");

	public By margeAddtocart = By.xpath("(//div[contains(@data-label,'Margherita')])[2]//span[.='ADD TO CART']");

	public By margeAddtocartincrease = By.xpath("(//div[@data-label=\"increase\"])[2]");

	public By peppypannerAddtocartincrease = By.xpath("(//div[@data-label=\"increase\"])[4]");

	public By pepsiAddtocartbtn = By.xpath("(//parent::div[@data-label='Beverages']//span[.='ADD TO CART'])[1]");

	public By subtotal = By.xpath("(//span[@class='rupee'])[4]");

	public By Taxandcharges = By.xpath("(//span[@class='rupee'])[5]");

	public By grandtotal = By.xpath("(//span[@class='rupee'])[6]");

	public By pepsiAddtocartincrease = By.xpath("(//div[@data-label='increase'])[5]");

	public By margeAddtocartdecrease = By.xpath("(//div[@data-label='decrease'])[6]");

	public By pepsiAddtocartdecrease = By.xpath("(//div[@data-label='decrease'])[5]");

	public By checkoutbtn = By.xpath("(//button[@data-label='miniCartCheckout'])");

	public By beverages = By.xpath("(//span[text()='BEVERAGES'])");

	public By peppypannerAddtocart = By
			.xpath("(//div[contains(@data-label,'Peppy Paneer')])[2]//span[.='ADD TO CART']");

	public By dontallowpopup = By.xpath("//button[text()='Don't Allow']");

	public By locatemebtn2 = By.xpath("//button[@data-label='Locate_Me']");

	public By searchplacepin = By.xpath("//input[@placeholder='Enter Area / Locality']");

	public By veg_pizza = By.xpath("//span[text()='VEG PIZZA']");

	public By firstsrchplace = By.xpath("//input[@placeholder='Enter your delivery address']");

}
