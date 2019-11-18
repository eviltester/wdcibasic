package com.seleniumsimplified.webdriver.synchronisation.webDriverWaitBasics;

import com.seleniumsimplified.webdriver.manager.Driver;
import com.seleniumsimplified.webdriver.manager.TestEnvironment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class WebDriverWaitExampleTest {

    WebDriver driver;
    @Before
    public void visitPage(){
        driver = Driver.get(TestEnvironment.getUrl("/styled/basic-html-form-test.html"));
        // old version
        // driver = Driver.get(TestEnvironment.getUrl("basic_html_form.html"));
    }

    @Test
    public void exampleUsingExpectedConditions(){

        new WebDriverWait(driver,10).until(
                ExpectedConditions.titleIs("HTML Form Elements"));

        assertEquals("HTML Form Elements", driver.getTitle());
    }

    @Test
    public void exampleWithSleepTime(){

        new WebDriverWait(driver,10,50).until(
                ExpectedConditions.titleIs("HTML Form Elements"));

        assertEquals("HTML Form Elements", driver.getTitle());
    }

    @After
    public void closeDriver(){
        driver.close();
    }
}
