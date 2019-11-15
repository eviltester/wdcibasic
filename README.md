# wdci

A sample set of @Test methods for demo of WebDriver in CI.

Run automatically on TravisCi using HTMLUnit and Internal Firefox Driver.

[![Build Status](https://travis-ci.org/eviltester/wdci.svg?branch=master)](https://travis-ci.org/eviltester/wdci)

This code also run successfully on:

* [SauceLabs](https://saucelabs.com):
    * Windows 10 - Edge v 14.14393
    * Windows 10 - Chrome v 53.0
    * Windows 10 - IE v 11.103
    * Windows 10 - FIREFOX v 49.0
    * Apple Mac - OS X 10.11, Safari 9.0
* [BrowserStack](https://www.browserstack.com):
    * Windows 10 - Edge v 13
    * Windows 10 - Chrome v 53.0
    * Windows 10 - IE v 11
    * Windows 10 - FIREFOX v 49.0
    * Apple Mac - "El Capitan", Safari 9.1

Read my blog on Selenium WebDriver:

* [http://seleniumsimplified.com](SeleniumSimplified.com)

---

# History

## 19th October 2016 updated to use Selenium 3.0.1

Selenium 3.0.1 has changed to allow HTMLUnit to work again. HTMLUnit 2.23 has been re-enabled in the build.

* [SauceLabs](https://saucelabs.com):
    * Windows 10 - Edge v 14.14393
    * Windows 10 - Chrome v 53.0
    * Windows 10 - IE v 11.103
    * Windows 10 - FIREFOX v 49.0
    * Apple Mac - OS X 10.11, Safari 9.0
* [BrowserStack](https://www.browserstack.com):
    * Windows 10 - Edge v 13
    * Windows 10 - Chrome v 53.0
    * Windows 10 - IE v 11
    * Windows 10 - FIREFOX v 49.0
    * Apple Mac - "El Capitan", Safari 9.1

## 14th October 2016 updated to use Selenium 3.0.0

Could not get HTMLUnit working with Selenium 3.0.0. If you want to use HTMLUnit, suggest you drop down to v 2.53.1 of WebDriver. Have removed HTMLUnit from the Travis build for Selenium 3.0.0.

All tests passed on Selenium 3.0.0 on Windows 10 for:

- FIREFOXMARIONETTE, MarionetteDriver with Firefox 49.0.1, v 0.11.1 geckodriver.exe
- FIREFOXPORTABLE, legacy FirefoxDriver && Firefox 47.0.1
- FIREFOXPORTABLE, legacy FirefoxDriver && Firefox 46.0.1
- FIREFOX, FirefoxDriver with Firefox 49.0.1, v 0.11.1 geckodriver.exe
- CHROME, chromedriver v 2.24, Chrome v 53.0.2785.143 m
- EDGE, v 14393
- IE, driver v 2.53.1 32 bit



### run and passing against

Selenium 2.53.1 on Windows 10

	* FirefoxDriver && Firefox 47.0.1
	* FirefoxDriver && Firefox 46.0.1
	* ChromeDriver v2.22.397933 && Chrome Version 52.0.2743.82 m
	* IEDriverServer (32 bit) v2.53.1 && IE 11.494.10586
	* HTMLUnit 2.21
	* Marionette v 0.9.0 (64 bit) && Firefox 48
	* Edge v 10586

Selenium 3.0.0-beta1 on Windows 10

	* Marionette v 0.9.0 (64 bit) && Firefox 47.0.1
	* Marionette v 0.9.0 (64 bit) && Firefox 46.0.1
	* ChromeDriver v2.22.397933 && Chrome Version 52.0.2743.82 m
	* IEDriverServer (32 bit) v2.53.1 && IE 11.494.10586
	* HTMLUnit 2.21
	* Marionette v 0.9.0 (64 bit) && Firefox 48
	* Edge v 10586
