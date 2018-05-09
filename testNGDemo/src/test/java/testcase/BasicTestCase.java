package testcase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/7.
 */
public class BasicTestCase {
    public WebDriver driver;
    public SeleniumUtil seleniumUtil;
    private static Logger logger = Logger.getLogger(BasicTestCase.class);

    @BeforeMethod
    public void initTest(){
        System.setProperty("webdriver.chrome.driver","D:\\chrome\\chrome&driver\\chrome&driver\\chromedriver.exe");
        PropertyConfigurator.configure("./log4j.properties");
        seleniumUtil = new SeleniumUtil();
        driver=seleniumUtil.getDriver("chrome");
        driver.manage().window().maximize();

        seleniumUtil.url("https://www.jd.com");
        seleniumUtil.click(By.partialLinkText("请"));

    }
}
