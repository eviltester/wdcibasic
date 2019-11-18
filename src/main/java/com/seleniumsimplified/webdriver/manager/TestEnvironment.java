package com.seleniumsimplified.webdriver.manager;

import java.net.MalformedURLException;
import java.net.URL;

public class TestEnvironment {

    public static URL url;

    public static String getUrl(String page){

        if(url==null){
            try {
                // newest test pages are deployed online at
                // https://testpages.herokuapp.com
                // or you can download as an app from
                // https://github.com/eviltester/TestingApp
                // and you would want a release for a version of
                // seleniumtestpages-x-x-x-jar-with-dependencies.jar
                // where x-x-x is a version number
                url = new URL(EnvironmentPropertyReader.getPropertyOrEnv("seleniumsimplified.environment",
                        "https://testpages.herokuapp.com"));
                //
                // older versions of the test pages are at
                // test pages are located at
                // http://compendiumdev.co.uk/selenium/testpages/
                // http://compendiumdev.co.uk/selenium/
                // http://seleniumsimplified.com/testpages/
//                url = new URL(EnvironmentPropertyReader.getPropertyOrEnv("seleniumsimplified.environment",
//                        "http://compendiumdev.co.uk/selenium/testpages/"));

            } catch (MalformedURLException e) {
                throw new RuntimeException(String.format("You have an invalid url in the property or environment variable %s", url));
            }
        }

        URL aURL;

        try {
            aURL = new URL(url, page);
        } catch (MalformedURLException e) {
            // since the URLs aren't going to change much use a RuntimeException so people don't have
            // to keep coding for try/catch or throws
            throw new RuntimeException(String.format("You tried to construct an incorrect URL %s%s", url, page));
        }

        return aURL.toString();
    }
}
