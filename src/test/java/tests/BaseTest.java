package tests;

import config.ConfigManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public void init(){
        ConfigManager.setUp("chrome"); //getDriver();
    }

    @AfterSuite
    public void stop(){
        ConfigManager.tearDown();
    }

}
