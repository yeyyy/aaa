package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.LogConfiguration;
import util.SeleniumUtil;
/**
 * Created by Administrator on 2018/5/7.
 */
public class JD_login {
    public WebDriver driver = null ;
    SeleniumUtil seleniumUtil = null;
    @BeforeMethod
    public void setUp(){
        LogConfiguration.initLog();
        seleniumUtil = new SeleniumUtil();
        String path = "D:\\chrome\\chrome&driver\\chrome&driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        driver = seleniumUtil.getDriver("chrome");
    }
    @Test
    public void login(){
        seleniumUtil.url("https://www.jd.com");
        seleniumUtil.click(By.className("link-login"));
        seleniumUtil.click(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/a"));
        seleniumUtil.sendKeys(By.xpath("//*[@id=\"loginname\"]"),"15735046520");
        seleniumUtil.sendKeys(By.xpath("//*[@id=\"nloginpwd\"]"),"cz5211314**");
        seleniumUtil.click(By.id("loginsubmit"));
    }
    @AfterMethod
    public void tearDown(){

        driver.quit();
    }
}
