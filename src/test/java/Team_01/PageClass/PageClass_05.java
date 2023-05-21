package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class PageClass_05 {


    public PageClass_05(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy (id="twotabsearchtextbox")
public WebElement searchBox;

    @FindBy(xpath ="//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
   public WebElement salesforce;


    public void searchFor(String input){
        searchBox.sendKeys(input+ Keys.ENTER);

    }

    public String salesForceGetText(){

        String result=salesforce.getText();

        return result;
    }

}

