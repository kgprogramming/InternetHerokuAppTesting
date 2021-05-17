package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class FormAuthentication extends MainMethods {
    private final By textLoginPage=By.xpath("//h2");
    private final By usernameInputField=By.xpath("//input[@id='username']");
    private final By passwordInputField=By.xpath("//input[@id='password']");
    private final By buttonLogin=By.xpath("//button");
    private final By textYouAreLogedIn=By.xpath("//h4");
    private final By buttonLogout=By.xpath("//a[@href='/logout']");
    public FormAuthentication typeUsernameInInputField() throws InterruptedException {
        type(usernameInputField,"tomsmith");
        Thread.sleep(300);
        type(passwordInputField,"SuperSecretPassword!");
        test.log(LogStatus.INFO, "Username is typed in input field");
        return this;
    }
    public FormAuthentication clickOnLoginButton(){
        click(buttonLogin);
        test.log(LogStatus.INFO, "Button [login] is clicked");
        return this;
    }
    public FormAuthentication verifyTextLoginPage(){
        verifyThatElementIsVisible(textLoginPage);
        test.log(LogStatus.INFO, "Title login page is visible");
        return this;
    }
    public FormAuthentication verifyTextWelcometoSecureArea() throws InterruptedException {
        Thread.sleep(500);
        verifyThatElementIsVisible(textYouAreLogedIn);
        test.log(LogStatus.INFO, "Text welcome to secure area is visible");
        return this;
    }
    public FormAuthentication clickOnLogoutButton(){
        click(buttonLogout);
        test.log(LogStatus.INFO, "Button [logout] is clicked");
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }
}

