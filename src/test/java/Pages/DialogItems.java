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

    @FindBy(xpath = "//div[@class='orangehrm-header-container']/button")
    public WebElement addButton;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    public WebElement userRoleButton;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[3]")
    public WebElement userRoleButtonEss;

    @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    public WebElement statusButton;
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    public WebElement employeeName;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement inputEmployeeName;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;
    @FindBy(css = "[role='listbox']")
    public WebElement employeeNameListBox;
    @FindBy(css = "[class*=message]")
    public WebElement usernameError;
    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[2]")
    public WebElement statusSelectsEnable;
    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[2]")
    public WebElement formUsername;

    @FindBy(xpath = "(//div[@class='oxd-form-row']//input)[1]")
    public WebElement verifyUsername;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement formsSearchButton;
    @FindBy(xpath = "//div[@class='oxd-table-card']//div[@class='oxd-table-cell oxd-padding-cell'][2]")
    public WebElement verifyNameLocator;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addBtnDisplay;

    @FindBy(xpath = "//input[@type='password'][1]")
    public WebElement formPassword;

    @FindBy(xpath = "(//div[@class='oxd-form-row user-password-row']//span)[2]")
    public WebElement formPasswordError;

    @FindBy(xpath = "//span[text()='Required']")
    public WebElement verifyNotSave;

}
