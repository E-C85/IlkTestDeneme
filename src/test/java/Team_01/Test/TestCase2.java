package Team_01.Test;

import Team_01.PageClass.Class_Case2;
import Team_01.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 {


    @Test
    public void test01() {

        Driver.getDriver().get("https://editor.datatables.net/");

        Class_Case2 cc = new Class_Case2();

        cc.newButton.click();
        cc.firstName.sendKeys("Hamza");
        cc.lastName.sendKeys("Demirci");
        cc.position.sendKeys("Scrum master");
        cc.office.sendKeys("Main office");
        cc.extension.sendKeys("team");
        cc.startDate.sendKeys("2023-05-19");
        cc.salary.sendKeys("2450");
        cc.createButton.click();

        verfyUserAdded();
        eraseUserAdded();
        verfyErasedUser();



    }

    private void verfyErasedUser() {
        Class_Case2 cc = new Class_Case2();
        Assert.assertTrue(cc.noMatches.getText().equals("No matching records found"),"User is not deleted");
    }

    private void eraseUserAdded() {
        Class_Case2 cc = new Class_Case2();
        cc.verfyName.click();
        cc.deleteButton.click();
        cc.acceptDeleteButton.click();
    }

    private void verfyUserAdded() {
        Class_Case2 cc = new Class_Case2();
        cc.searchBox.sendKeys("Hamza");
        Assert.assertTrue(cc.verfyName.getText().toLowerCase().contains("hamza"));
    }


}
