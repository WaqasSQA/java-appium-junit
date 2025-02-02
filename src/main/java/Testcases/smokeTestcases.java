package Testcases;

import Pages.loginRepo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class smokeTestcases {
    public AndroidDriver driver;
    public loginRepo loginDetails;

    @Test
    public void testCases01() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("Pixel_4_API_34");
        options.setApp(System.getProperty("user.dir" + "/apps/Preseus project.apk"));

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        loginDetails = PageFactory.initElements(driver, loginRepo.class);

        loginDetails.clickAllowBtn();
        loginDetails.clickCloseBtn();
        loginDetails.firstLoginBtn();
        loginDetails.loginCreds("3067496061", "password");
        loginDetails.clickLoginBtn();
    }
}
