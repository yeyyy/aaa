package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

/**
 * Created by Administrator on 2018/5/7.
 */

public class LoginPage_Login extends BasicTestCase{
    @Test
    public void login(){
        HelperLoginPage.login(seleniumUtil,"15735046520","cz5211314**");
    }


    @AfterMethod


    public void tearDown(){

        driver.quit();
    }

}
