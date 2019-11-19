package com.seleniumsimplified.webdriver.basics.interrogate.findby;

import com.seleniumsimplified.webdriver.manager.Driver;
import com.seleniumsimplified.webdriver.manager.TestEnvironment;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class FindByCSSSelectorPathsExampleTest {

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
    public void directDescendant(){

        assertEquals("div > li", 0,
                driver.findElements(By.cssSelector("div > li")).size());

    }

    @Test
    public void anyDescendant(){

        assertEquals("div li", 25,
                driver.findElements(By.cssSelector("div li")).size());

    }

    @Test
    public void siblingOfPreceding(){

        assertEquals("li + li", 24,
                driver.findElements(By.cssSelector("li + li")).size());

        // li are in a big list so li + li skipped the first one
        assertEquals("li", 25,
                driver.findElements(By.cssSelector("li")).size());

    }

    @Test
    public void firstChild(){

        // get the first child li we missed out in the test before
        assertEquals("li:first-child", 1,
                driver.findElements(By.cssSelector("li:first-child")).size());

    }



    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}
