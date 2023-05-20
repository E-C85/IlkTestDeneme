package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceDemoMyCartPage {
    public SauceDemoMyCartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".inventory_item_name")
   private WebElement myCartItems;

    public void validateItemsInInventory(){
        Assert.assertTrue(myCartItems.isDisplayed());
    }
}
