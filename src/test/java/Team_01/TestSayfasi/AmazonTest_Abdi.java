package Team_01.TestSayfasi;

import Team_01.PageClass.AmazonHomePage_Abdi;
import Team_01.PageClass.AmazonResultPage_Abdi;
import Team_01.Utilities.Driver;
import org.testng.annotations.Test;

public class AmazonTest_Abdi {




    @Test
public void testAmazon() throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com/");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().navigate().refresh();

        AmazonHomePage_Abdi hp = new AmazonHomePage_Abdi();
        hp.sarchProduct("Salesforce Apex Questions Bank");
        Thread.sleep(1000);
        AmazonResultPage_Abdi rp= new AmazonResultPage_Abdi();
            System.out.println(rp.resultGetText());


            Driver.getDriver().quit();


    }


}
