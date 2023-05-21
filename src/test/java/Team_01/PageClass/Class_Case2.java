package Team_01.PageClass;

import Team_01.Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Class_Case2 {
    public Class_Case2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//button)[1]")
    public WebElement newButton;
    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;
    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;
    @FindBy(id = "DTE_Field_position")
    public WebElement position;
    @FindBy(id = "DTE_Field_office")
    public WebElement office;
    @FindBy(id = "DTE_Field_extn")
    public WebElement extension;
    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDate;
    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;
    @FindBy(xpath = "(//button)[4]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchBox;
    @FindBy(xpath = "//td[@class=\"sorting_1\"]")
    public WebElement verfyName;
    @FindBy(xpath = "(//button)[3]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class=\"btn\"]")
    public WebElement acceptDeleteButton;

    @FindBy(xpath = "//td[text()='No matching records found']")
    public WebElement noMatches;
}
