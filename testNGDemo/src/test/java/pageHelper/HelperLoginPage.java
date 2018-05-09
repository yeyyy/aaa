package pageHelper;

import page.PageLogin;
import util.SeleniumUtil;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2018/5/7.
 */
public class HelperLoginPage {
    public static Logger logger = Logger.getLogger("HelperLoginPage");
    //点击登陆按钮
    public static void clickLoginLink(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageLogin.LOGIN_LINK_LOGIN).click();
        //点击账户登陆，不点击默认是二维码登陆
        seleniumUtil.findElement(PageLogin.LOGIN_LINK_ERWEIMA).click();
    }
    //登陆步骤拆分-输入用户名
    public static void inputUsername(SeleniumUtil seleniumUtil, String name){
        seleniumUtil.findElement(PageLogin.LOGIN_LINK_LOGIN).sendKeys("15735046520");
    }
    //输入密码
    public static void inputPwd(SeleniumUtil seleniumUtil,String pass){
        seleniumUtil.findElement(PageLogin.LOGIN_LINK_PWD).sendKeys("cz5211314**");
    }
    //登陆按钮
    private static void clickLoginBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.findElement(PageLogin.LOGIN_LINK_DENGLU).click();
    }
    //重新构造一个登陆方法
    public static void login(SeleniumUtil seleniumUtil,String name,String pass){
        clickLoginLink(seleniumUtil);
        inputUsername(seleniumUtil,name);
        inputPwd(seleniumUtil,pass);
        clickLoginBtn(seleniumUtil);

    }
}
