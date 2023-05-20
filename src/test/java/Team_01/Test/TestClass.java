package Team_01.Test;

import Team_01.Utilities.Driver;
import org.testng.annotations.Test;

public class TestClass {

    @Test

    public void test(){
        Driver.getDriver().get("http://www.google.com");
    }
}
