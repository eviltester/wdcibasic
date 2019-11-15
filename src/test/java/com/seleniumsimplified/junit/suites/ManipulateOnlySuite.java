package com.seleniumsimplified.junit.suites;

import com.seleniumsimplified.webdriver.basics.manipulate.ManipulateExampleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A simple suite that contains just a Manipulation test
 * as an example of how to collate specific Test Classes into
 * a Suite
 *
 * Can run the suite with
 *
 * mvn clean -Dtest=ManipulateOnlySuite test
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ManipulateExampleTest.class,
})
public class ManipulateOnlySuite {
}
