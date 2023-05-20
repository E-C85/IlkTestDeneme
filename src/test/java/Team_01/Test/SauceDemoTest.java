package Team_01.Test;

import Team_01.PageClass.SauceDemoCartPage;
import Team_01.PageClass.SauceDemoInventoryPage;
import Team_01.PageClass.SauceDemoLoginPage;
import Team_01.PageClass.SauceDemoMyCartPage;
import Team_01.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SauceDemoTest {
    SauceDemoLoginPage loginPage = new SauceDemoLoginPage();
    SauceDemoInventoryPage inventoryPage = new SauceDemoInventoryPage();
    SauceDemoCartPage cartPage = new SauceDemoCartPage();
    SauceDemoMyCartPage myCartPage = new SauceDemoMyCartPage();

    WebDriver driver = Driver.getDriver();

    @Test
    public void testSauceDemo(){
        driver.get("https://www.saucedemo.com/");
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();
        inventoryPage.getProductNameAndClick(1);
        cartPage.clickOnCartButton();
        cartPage.clickOnShoppingCartButton();
        myCartPage.validateItemsInInventory();
        Driver.getDriver().close();
    }
}
