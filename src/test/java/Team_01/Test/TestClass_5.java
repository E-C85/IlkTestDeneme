package Team_01.Test;

import Team_01.PageClass.PageClass_05;
import Team_01.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.time.Duration;

@Test
public class TestClass_5 {

    //case5:
//1-Test01 isimli bir class olusturun
//2- https://www.amazon.com/ adresine gidin
//3- Browseri tam sayfa yapin
//4-Sayfayi "refresh" yapin
//5-"Salesforce Apex Questions Bank" icin arama yapiniz
//6- Kac sonuc bulundugunu yaziniz
//7-Sayfayi kapatin

    @Test
    public static void test01() throws InterruptedException {

        Driver.getDriver().get("https://www.amazon.com/ ");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().navigate().refresh();

        PageClass_05 pc=new PageClass_05();
        pc.searchFor("Salesforce Apex Questions Bank");

        Thread.sleep(3000);

        System.out.println("pc.salesForceGetText() = " + pc.salesForceGetText());

        Driver.getDriver().close();

    }
}
