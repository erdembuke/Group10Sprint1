package StepDefinitions;

import Pages.DialogItems;
import io.cucumber.java.en.Then;

public class User8Steps {
    DialogItems di = new DialogItems();
    @Then("User see AddButton")
    public void user_see_add_button() {

        di.verifyElementDisplayed(di.addButtondisplayed);

    }
}
