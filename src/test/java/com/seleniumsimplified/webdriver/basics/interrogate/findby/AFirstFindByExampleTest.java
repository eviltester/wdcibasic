package com.seleniumsimplified.webdriver.basics.interrogate.findby;

import com.seleniumsimplified.webdriver.manager.Driver;
import com.seleniumsimplified.webdriver.manager.TestEnvironment;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class AFirstFindByExampleTest {

    static WebDriver driver;

    @BeforeClass
    public static void createDriverAndVisitTestPage(){
        driver = Driver.get();
        driver.get(TestEnvironment.getUrl("/styled/find-by-playground-test.html"));
        // old version
        //driver = Driver.get(TestEnvironment.getUrl("find_by_playground.php"));
    }

    @Test
    public void findByID(){
        WebElement cParagraph = driver.findElement(By.id("p3"));
        assertEquals("pName3",
                     cParagraph.getAttribute("name"));
    }

    @AfterClass
    public static void closeDriver(){
        driver.close();
    }

}
