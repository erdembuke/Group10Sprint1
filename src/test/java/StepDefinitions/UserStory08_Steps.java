package StepDefinitions;

import Pages.DialogItems;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UserStory08_Steps {

    DialogItems dt = new DialogItems();

    @Then("Verify that “Already exists” displayed")
    public void verifyThatAlreadyExistsDisplayed() {

        dt.sendKeysFunction(dt.formUsername,"rauf444");
        dt.verifyContainsTextFunction(dt.usernameError,"Already exists");
    }
}
