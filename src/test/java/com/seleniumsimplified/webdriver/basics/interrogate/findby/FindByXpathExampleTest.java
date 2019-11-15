package com.seleniumsimplified.webdriver.basics.interrogate.findby;

import com.seleniumsimplified.webdriver.manager.Driver;
import com.seleniumsimplified.webdriver.manager.TestEnvironment;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindByXpathExampleTest {

    static WebDriver driver;

    @BeforeClass
    public static void createDriverAndVisitTestPage(){
        driver = Driver.get(TestEnvironment.getUrl("find_by_playground.php"));
    }

    @Test
    public void assertNumberOfParagraphs(){

        List<WebElement> elements;
        elements = driver.findElements(By.xpath("//p"));

        assertEquals(41, elements.size());
    }

    @Test
    public void findSpecificPara(){

        WebElement element;
        element = driver.findElement(
                By.xpath("//p[@name='pName5']"));

        assertEquals("Expected matching id",
                "p5",
                element.getAttribute("id"));
    }

    @Test
    public void pathNavigation(){

        WebElement element;
        element = driver.findElement(
                By.xpath("//div[@id='div18']//a[@name='aName26']"));

        assertEquals("Expected matching id",
                "a26",
                element.getAttribute("id"));
    }

    @Test
    public void conditionalAttributes(){

        WebElement element;
        element = driver.findElement(
                By.xpath("//a[@name='aName26' and @class='normal']"));

        assertEquals("Expected matching id",
                     "a26",
                     element.getAttribute("id"));
    }

}
