package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Hooks extends Base{

    String runType = System.getProperty("runType");
    String browserType= System.getProperty("browser");

    //biplob bhai

    public void init() throws MalformedURLException {

        if(runType =="grid"){
            if(browserType =="chrome"){
                ChromeOptions options = new ChromeOptions();
                options.setPlatformName("Windows 10");
                options.setBrowserVersion("latest");


                //https://oauth-m.raian1593-3bb43:ca8b0921-e6e3-4bcb-a4ec-c802c3fdaf2e@ondemand.us-west-1.saucelabs.com:443/wd/hub
                URL url = new URL("https://oauth-m.raian1593-3bb43:ca8b0921-e6e3-4bcb-a4ec-c802c3fdaf2e@ondemand.us-west-1.saucelabs.com:443/wd/hub");
                //WebDriverManager.chromedriver().setup();
                driver = new RemoteWebDriver(url, options);

            }
            else if(browserType=="firefox"){
                FirefoxOptions options = new FirefoxOptions();
                options.setPlatformName("Windows 10");
                options.setBrowserVersion("latest");


                //https://oauth-m.raian1593-3bb43:ca8b0921-e6e3-4bcb-a4ec-c802c3fdaf2e@ondemand.us-west-1.saucelabs.com:443/wd/hub
                URL url = new URL("https://oauth-m.raian1593-3bb43:ca8b0921-e6e3-4bcb-a4ec-c802c3fdaf2e@ondemand.us-west-1.saucelabs.com:443/wd/hub");
                //WebDriverManager.chromedriver().setup();
                driver = new RemoteWebDriver(url, options);

            }
            else{

            }

        }
        else {

        }




    }

    @Before
    public void setup() throws MalformedURLException {

        init();


    }
    @After
    public void tearDown(){

        driver.quit();
    }
}
