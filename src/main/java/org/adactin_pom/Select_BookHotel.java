package org.adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_BookHotel {
public static WebDriver driver;



public static WebDriver getDriver() {
	return driver;
}

public WebElement getRadioButton_click() {
	return radioButton_click;
}

public WebElement getContinue_click() {
	return continue_click;
}
public WebElement getTotalprice_text() {
	return totalprice_text;
}

public WebElement getTotalprice_book_text() {
	return totalprice_book_text;
}
@FindBy(id="radiobutton_0")
private WebElement radioButton_click;

@FindBy(id="total_price_0")
private WebElement totalprice_text;

@FindBy(id="continue")
private WebElement continue_click;

@FindBy(id="total_price_dis")
private WebElement totalprice_book_text;


public Select_BookHotel(WebDriver vdriver)
{
	this.driver=vdriver;
	PageFactory.initElements(driver, this);
}
}

