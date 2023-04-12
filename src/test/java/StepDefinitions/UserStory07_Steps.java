package StepDefinitions;

import Pages.DialogItems;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStory07_Steps {
    DialogItems di = new DialogItems();
    @When("enter a user name less than five characters")
    public void enterAUserNameLessThanFiveCharacters() {
        di.sendKeysFunction(di.formUsername, "abc");
    }

    @Then("verify that “at least {int} characters” is displayed")
    public void verifyThatAtLeastCharactersIsDisplayed() {
    di.verifyElementDisplayed(di.shortUserNameMessage);
    }


}
