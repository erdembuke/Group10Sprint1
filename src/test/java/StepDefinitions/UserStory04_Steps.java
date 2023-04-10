package StepDefinitions;

import Pages.DialogItems;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UserStory04_Steps {

    DialogItems di=new DialogItems();
    @And("user send keys to password box")
    public void userSendKeysToPasswordBox() {
        di.sendKeysFunction(di.formPassword, "01Softskills!");
    }

    @And("user send keys to confirm password box")
    public void userSendKeysToConfirmPasswordBox() {
        di.sendKeysFunction(di.confirmPassword, "01Softskills");
    }

    @Then("notification message should be displayed")
    public void notificationMessageShouldBeDisplayed() {

        di.verifyContainsTextFunction(di.PasswordMatchError, "do not match");
    }
}
