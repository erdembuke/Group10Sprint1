package StepDefinitions;

import Pages.DialogItems;
import Pages.MenuItems;
import Utilities.WD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FundementalSteps {
    DialogItems di = new DialogItems();
    MenuItems mi = new MenuItems();
    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        WD.getDriver().navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter username and password correctly then click login button")
    public void enterUsernameAndPasswordCorrectlyThenClickLoginButton() {
        di.sendKeysFunction(di.username , "Admin");
        di.sendKeysFunction(di.password , "admin123");
        di.clickFunction(di.loginBtn);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        di.verifyElementDisplayed(mi.adminTab);
    }

    @And("User clicks Admin Tab on the menu and navigates User Management Page")
    public void userClicksAdminTabOnTheMenuAndNavigatesUserManagementPage() {
        mi.clickFunction(mi.adminTab);
    }
}
