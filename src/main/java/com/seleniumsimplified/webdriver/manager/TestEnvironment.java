package com.seleniumsimplified.webdriver.manager;

import java.net.MalformedURLException;
import java.net.URL;

public class TestEnvironment {

    public static URL url;

    public static String getUrl(String page){

        if(url==null){
            try {
                // test pages are located at
                // http://compendiumdev.co.uk/selenium/testpages/
                // http://compendiumdev.co.uk/selenium/
                // http://seleniumsimplified.com/testpages/
                // or you can download and install for yourself from
                //    https://github.com/eviltester/seleniumTestPages
                //    either as a java app which you can run and connect to on localhost:4567 or as a set of html and php pages
                url = new URL(EnvironmentPropertyReader.getPropertyOrEnv("seleniumsimplified.environment", "http://compendiumdev.co.uk/selenium/testpages/"));
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
