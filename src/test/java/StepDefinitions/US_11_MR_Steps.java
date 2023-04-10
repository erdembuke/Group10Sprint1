package StepDefinitions;

import Pages.DialogItems;
import io.cucumber.java.en.When;

public class US_11_MR_Steps {


    DialogItems di = new DialogItems();

    @When("user verify that “Add User” heading is displayed")
    public void userVerifyThatAddUserHeadingIsDisplayed() {
        di.verifyElementDisplayed(di.addUserMessaj);
    }
}
