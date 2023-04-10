package StepDefinitions;

import Pages.DialogItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UserStory05_Steps {
    DialogItems di = new DialogItems();
    @And("User fills employee name with invalid admin name")
    public void userFillsEmployeeNameWithInvalidAdminName() {
        di.sendKeysFunction(di.inputEmployeeName, "Alexander Xow");
    }

    @Then("User see invalid notification message")
    public void userSeeInvalidNotificationMessage() {
        di.verifyContainsTextFunction(di.employeeNameListBox , "No Records");
    }
}
