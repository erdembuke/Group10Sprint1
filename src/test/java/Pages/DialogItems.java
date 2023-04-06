package Pages;

import Utilities.WD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogItems extends Parent {

    public DialogItems() {
        PageFactory.initElements(WD.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()=' Login ']")
    public WebElement loginBtn;

    @FindBy(css = "div[class='orangehrm-header-container']>button")
    public WebElement addBtnUserManag;

    @FindBy(xpath = "//h6[text()='Add User']")
    public WebElement AddUserMessaj;

}
