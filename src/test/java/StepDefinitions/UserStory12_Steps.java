package StepDefinitions;

import Pages.DialogItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UserStory12_Steps {
    DialogItems di = new DialogItems();
    @And("User fills password field without lower case character")
    public void userFillsPasswordFieldWithoutLowerCaseCharacter() {
        di.sendKeysFunction(di.formPassword , "ERDEM-34");
    }

    @Then("User see must contain lower case notification")
    public void userSeeMustContainLowerCaseNotification() {
        di.waitUntilTextTobe(di.formPasswordError , "lower-case letter");
    }
}
