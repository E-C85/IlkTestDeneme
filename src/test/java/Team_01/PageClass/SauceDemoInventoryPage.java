package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SauceDemoInventoryPage {
    public SauceDemoInventoryPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private List<WebElement>productsOnPage;







    public void getProductNameAndClick(int productNumber){
        System.out.println(productsOnPage.get(productNumber-1).getText());
        productsOnPage.get(productNumber-1).click();
    }
}
