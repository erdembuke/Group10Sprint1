package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuItems extends Parent{

    public MenuItems(){
        PageFactory.initElements(WD.getDriver() , this);
    }

    @FindBy(linkText = "Admin")
    public WebElement adminTab;

}
