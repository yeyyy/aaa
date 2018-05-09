import org.openqa.selenium.WebDriver;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by Administrator on 2018/5/4.
 */
public class TestMain {
    public static void main(String[] args) {
        LogConfiguration.initLog();
        SeleniumUtil seleniumUtil = new SeleniumUtil();
//        System.setProperty("webdriver.chrome.driver",)
        WebDriver driver = seleniumUtil.getDriver("chrome");

        seleniumUtil.url("");

    }
}
