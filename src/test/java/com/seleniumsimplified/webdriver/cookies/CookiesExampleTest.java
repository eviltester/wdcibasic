package com.seleniumsimplified.webdriver.cookies;

import com.seleniumsimplified.webdriver.manager.Driver;
import com.seleniumsimplified.webdriver.manager.TestEnvironment;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class CookiesExampleTest {

    @Test
    public void visitSearchPageAndCheckNoLastSearchCookie(){

        WebDriver driver;
        driver = Driver.get();
        driver.get(TestEnvironment.getUrl("/styled/search"));
        // old version
        // driver = Driver.get(TestEnvironment.getUrl("search.php"));

        driver.manage().deleteAllCookies();

        driver.navigate().refresh();

        Cookie aCookie = driver.manage().getCookieNamed("SeleniumSimplifiedLastSearch");

        assertEquals("Should be no last search cookie", null, aCookie);

        driver.close();
    }
}
