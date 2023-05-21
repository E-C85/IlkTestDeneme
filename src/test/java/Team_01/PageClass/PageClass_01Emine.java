package Team_01.PageClass;

import Team_01.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass_01Emine {


   public PageClass_01Emine(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(id = "twotabsearchtextbox")
    public WebElement search;

   @FindBy(id = "nav-search-submit-button")
   WebElement click;
   public void clickbutton(){
       click.click();
   }








}
