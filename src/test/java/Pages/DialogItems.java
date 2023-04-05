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

    @FindBy(xpath = "//button[text()=' Add ']")
    public WebElement addBtn;

    @FindBy(css = "div[class='orangehrm-card-container']>h6")
    public WebElement addUserText;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]")
    public WebElement userRole;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
    public WebElement status;

    @FindBy(css = "input[autocomplete='off']")
    public WebElement userUsername;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement userPassword;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement userConfirmPassword;

    @FindBy(css = "input[placeholder='Type for hints...']")
    public WebElement userEmployeeName;

    @FindBy(xpath = "//button[text()=' Save ']")
    public WebElement saveBtn;

    public WebElement getElement(String element) {
        switch (element) {
            case "addBtn":
                return addBtn;
            case "addUserText":
                return addUserText;
            case "userRole":
                return userRole;
            case "status":
                return status;
            case "userUsername":
                return userUsername;
            case "userPassword":
                return userPassword;
            case "userConfirmPassword":
                return userConfirmPassword;
            case "userEmployeeName":
                return userEmployeeName;
            case "saveBtn":
                return saveBtn;
        }
        return null;
    }

}
