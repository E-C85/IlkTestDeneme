package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCartPage {
    public SauceDemoCartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Add to cart']")
    private WebElement addToCartButton;

    @FindBy(css = ".shopping_cart_link")
    private WebElement shoppingCartLink;


    public void clickOnCartButton(){
        addToCartButton.click();
    }
    public void clickOnShoppingCartButton(){
        shoppingCartLink.click();
    }
}
