package page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/5/7.
 */
public class PageLogin {
//    页面顶部登陆
    public static final By LOGIN_LINK_TITLE = By.className("link-login");
    //二维码登陆
    public static final By LOGIN_LINK_ERWEIMA = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[5]/div/div[2]/div[1]");
    //点击账户登陆
    public static final By LOGIN_LINK_LOGIN = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/a");
    //填写账号
    public static final By LOGIN_LINK_USER = By.xpath("//*[@id=\"loginname\"]");
    //填写密码
    public static final By LOGIN_LINK_PWD = By.xpath("//*[@id=\"nloginpwd\"]");
    //忘记密码

    //点击登陆按钮
    public static final By LOGIN_LINK_DENGLU = By.xpath("//*[@id=\"loginsubmit\"]");
    //注册

}
