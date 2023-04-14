package StepDefinitions;

import Pages.DialogItems;
import io.cucumber.java.en.Then;

public class mert_user_story {

    DialogItems di=new DialogItems();
    @Then("all elements need displayed")
    public void allElementsNeedDisplayed() {

       di.sendKeysFunction(di.usernamee, "mert");
       di.sendKeysFunction(di.passwordd, "13456");
       di.sendKeysFunction(di.passworddcon, "12346");
    }
}
