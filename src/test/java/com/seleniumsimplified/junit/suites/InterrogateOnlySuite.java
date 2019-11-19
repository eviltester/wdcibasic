package com.seleniumsimplified.junit.suites;

import com.seleniumsimplified.webdriver.basics.interrogate.WebElementInterrogationTest;
import com.seleniumsimplified.webdriver.basics.interrogate.findby.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A simple suite that contains just the Interrogation tests
 * as an example of how to collate specific Test Classes into
 * a Suite
 *
 * Can run the suite with
 *
 * mvn clean -Dtest=InterrogateOnlySuite test
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AFirstFindByExampleTest.class,
        ChainingFindByExampleTest.class,
        FindByCssSelectorExampleTest.class,
        FindByCSSSelectorPathsExampleTest.class,
        FindByIDOrNameExampleTest.class,
        FindByXpathExampleTest.class,
        FindElementsExampleTest.class,
        WebElementInterrogationTest.class
})
public class InterrogateOnlySuite {
}
