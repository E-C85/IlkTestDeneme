package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ZeroBankHP {
    private WebDriver driver = Driver.getDriver();
    //WebDriverWait wait = new WebDriverWait(driver,10);



    public ZeroBankHP(){
        PageFactory.initElements(driver,this);
    }
    ////////////////////// Functions  //////////////////////////////

    public void sendKeys(WebElement element, String input){
        element.sendKeys(input);
    }
    public void clickFunction(WebElement element){
        element.click();
    }

    ////////////////////////////////////////////////////

    @FindBy(xpath = "//button[@id='signin_button']")
    private WebElement signinButton;

    public void clickSigninButton(){
        signinButton.click();
    }


    //////////////////////////////////////////////////////
    @FindBy (xpath = "//input[@id='user_login']")
    private WebElement inputLogin;

    public void sendKeysInput(){
        inputLogin.sendKeys("username");
    }

    //////////////////////////////////////////////////////

    @FindBy (xpath = "//input[@id='user_password']")
    private WebElement inputPassword;

    public void sendKeysPassword(){
        inputPassword.sendKeys("password");
    }

    ////////////////////////////////////////////////////////

    @FindBy (xpath = "//input[@value='Sign in']")
    private WebElement submitButton;

    public void clickSubmitButton(){
        submitButton.click();
    }

    ////////////////////////////////////////////////////////

    @FindBy (xpath = "//li[@id='onlineBankingMenu']")
    private WebElement bankingLink;

    public void clickBankingLink(){
        bankingLink.click();
    }

    ////////////////////////////////////////////////////////

    @FindBy (xpath = "//span[@id='pay_bills_link']")
    private WebElement payBillsLink;

    public void clickPayBillLink(){
        payBillsLink.click();
    }

    ////////////////////////////////////////////////////////

    @FindBy (xpath = "//input[@id='sp_amount']")
    private WebElement amountInput;

    public void sendKeysAmount(){
        amountInput.sendKeys("200");
    }
    ////////////////////////////////////////////////////////

    @FindBy(xpath = "//input[@id='sp_date']")
    private WebElement date;

    public void sendKeysDate(){
        date.sendKeys("2020-09-10");
    }

    ////////////////////////////////////////////////////////

    @FindBy(xpath = "//input[@id='pay_saved_payees']")
    private WebElement payButton;

    public void clickPayButton(){
        payButton.click();
    }

    ////////////////////////////////////////////////////////

    public void verifyPayment(){
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[@title='$ 200 payed to payee sprint']")).isDisplayed());
    }
}
