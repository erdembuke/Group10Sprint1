package StepDefinitions;

import Pages.DialogItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UserStory11_Steps {

    DialogItems di=new DialogItems();
    @And("user send less keys to password box")
    public void userSendLessKeysToPasswordBox() {
        di.sendKeysFunction(di.formPassword,"12345");
    }

    @Then("Eight charachter notification message should be displayed")
    public void charachterNotificationMessageShouldBeDisplayed() {
        di.verifyContainsTextFunction(di.atLeast8Char, "at least 8");

    }
}
