package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass_01 {


   public  PageClass_01(){
       PageFactory.initElements(Driver.getDriver(),this);
   }




}
