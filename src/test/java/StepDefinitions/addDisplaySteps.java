package StepDefinitions;

import Pages.DialogItems;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addDisplaySteps {

    DialogItems di = new DialogItems();
    @When("user click the addButton")
    public void user_click_the_add_button() {

    }
    @Then("user should see addBtn displayed")
    public void user_should_see_add_btn_displayed() {

        di.verifyElementDisplayed(di.addBtnDisplay);

    }

}
