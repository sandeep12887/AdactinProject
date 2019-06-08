package org.adactin.helper;

import org.adactin_pom.LoginPage;
import org.adactin_pom.SearchHotel;
import org.adactin_pom.Select_BookHotel;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;

	public PageObjectManager(WebDriver fdriver) {
		this.driver = fdriver;
	}

	public LoginPage lp;

	public LoginPage getLp() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}

	public SearchHotel sh;

	public SearchHotel getSh() {
		if (sh == null) {
			sh = new SearchHotel(driver);
		}
		return sh;
	}

	public Select_BookHotel sb;

	public Select_BookHotel getSb() {
		if (sb == null) {
			sb = new Select_BookHotel(driver);
		}
		return sb;
	}
	

	
}
