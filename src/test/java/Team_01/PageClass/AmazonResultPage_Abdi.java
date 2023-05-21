package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonResultPage_Abdi {

    public AmazonResultPage_Abdi() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[text()='7 results for']")
    WebElement result;


    public String resultGetText(){
        return result.getText();

    }
}
