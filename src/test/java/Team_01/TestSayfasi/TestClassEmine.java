package Team_01.TestSayfasi;

import Team_01.PageClass.PageClass_01Emine;
import Team_01.Utilities.Driver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassEmine {


    PageClass_01Emine page=new PageClass_01Emine();

    @Test(dataProvider="data")
    @Parameters("searchword")
    public void test(String searchword){
        Driver.getDriver().get(" https://www.amazon.com/");
        page.search.sendKeys(searchword);
        page.clickbutton();


    }
    @DataProvider
    public Object [][] data(){
        Object [][] data=new Object[3][1];
        data[0]=new Object[]{"Java"};
        data[1]=new Object[]{"JavaScript"};
        data[2]=new Object[]{"  Phyton"};

        return data;

    }


}
