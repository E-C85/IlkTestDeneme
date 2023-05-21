package Team_01.Test;

import Team_01.PageClass.ZeroBankHP;
import Team_01.Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ZeroBankTest {
    ZeroBankHP homePage = new ZeroBankHP();

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("http://zero.webappsecurity.com");
        homePage.clickSigninButton();
        homePage.sendKeysInput();
        homePage.sendKeysPassword();
        homePage.clickSubmitButton();
        Thread.sleep(5000);
        Driver.getDriver().navigate().back();

        homePage.clickBankingLink();
        homePage.clickPayBillLink();
        homePage.sendKeysAmount();
        homePage.sendKeysDate();
        homePage.clickPayButton();
        homePage.verifyPayment();

    }
}
