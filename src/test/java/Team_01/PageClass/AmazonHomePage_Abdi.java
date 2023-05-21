package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage_Abdi {


    public AmazonHomePage_Abdi(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy (id = "twotabsearchtextbox")
    WebElement searchBox;

    public void sarchProduct(String product){
        searchBox.sendKeys(product + Keys.ENTER);
    }

}
