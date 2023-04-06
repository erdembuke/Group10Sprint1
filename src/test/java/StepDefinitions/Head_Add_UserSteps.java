package StepDefinitions;


import Pages.DialogItems;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Head_Add_UserSteps {

    DialogItems di = new DialogItems();

    @When("User click Add buton on the page User Management Page")
    public void userClickAddButonOnThePageUserManagementPage() {

        di.clickFunction(di.addBtnUserManag);
    }

    @Then("Verify Add User heading is displayed")
    public void verifyAddUserHeadingIsDisplayed() {

        di.verifyElementDisplayed(di.AddUserMessaj);


    }
}

