package com.seleniumsimplified.webdriver.basics.interrogate.findby;

import com.seleniumsimplified.webdriver.manager.Driver;
import com.seleniumsimplified.webdriver.manager.TestEnvironment;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindByCssSelectorExampleTest {

    static WebDriver driver;

    @BeforeClass
    public static void createDriverAndVisitTestPage(){
        //driver = new FirefoxDriver();

        driver = Driver.get();
        driver.get(TestEnvironment.getUrl("/styled/find-by-playground-test.html"));
        // old version
        //driver = Driver.get(TestEnvironment.getUrl("find_by_playground.php"));
    }

    @Test
    public void findByIdUsingCSSId(){

        WebElement element;
        element = driver.findElement(
                By.cssSelector("#p3"));

        assertEquals("expected a match on id",
                "pName3",
                element.getAttribute("name"));
    }

    @AfterClass
    public static void closeDriver(){
        driver.close();
    }

}
