package StepDefinitions;

import Pages.DialogItems;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class UserStory_03 {

    DialogItems di=new DialogItems();
    @And("Verify that you are not registered")
    public void verifyThatYouAreNotRegistered() {

        Assert.assertTrue(di.verifyNotSave.isDisplayed());
    }
}
