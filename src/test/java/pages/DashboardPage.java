package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {
    @FindBy(id="welcome")
    public WebElement welcomeMsg;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }
}
