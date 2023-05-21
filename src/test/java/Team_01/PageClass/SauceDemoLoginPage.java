package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {
    public SauceDemoLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user-name")
    private WebElement usernameInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginClickButton;

    public void setUsername(String username) {
        usernameInput.sendKeys(username);
    }
    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLogin(){
        loginClickButton.click();
    }

}
