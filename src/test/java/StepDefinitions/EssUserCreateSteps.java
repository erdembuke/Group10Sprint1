package StepDefinitions;

import Pages.DialogItems;
import Utilities.Tools;
import Utilities.WD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class EssUserCreateSteps {
    DialogItems dt = new DialogItems();
    WebDriverWait wait=new WebDriverWait(WD.getDriver(), Duration.ofSeconds(20));

    @When("Click on the Addbutton")
    public void clickOnTheAddbutton() {
        dt.clickFunction(dt.addButton);
    }

    @And("Fill up the form with required information")
    public void fillUpTheFormWithRequiredInformation() {

        dt.clickFunction(dt.userRoleButton);
        dt.clickFunction(dt.userRoleButtonEss);
        dt.sendKeysFunction(dt.inputEmployeeName, dt.employeeName.getText());
        dt.waitUntilVisible(dt.employeeNameListBox);
        Tools.Wait(5);
        dt.clickFunction(dt.employeeNameListBox);
        dt.clickFunction(dt.statusButton);
        dt.clickFunction(dt.statusSelectsEnable);
        dt.sendKeysFunction(dt.formUsername, "group10bench14");
        dt.waitUntilDisable(dt.usernameError);
        dt.actionsSendKeys("tab");
        dt.actionWriteText("Admin.123");
        dt.actionsSendKeys("tab");
        dt.actionWriteText("Admin.123");
    }

    @And("Click on SaveButton")
    public void clickOnSaveButton() {
        dt.clickFunction(dt.saveButton);
    }

    @Then("Verify That ESS user on the List")
    public void verifyThatESSUserOnTheList() {
        wait.until(ExpectedConditions.urlContains("viewSystemUsers"));
        dt.sendKeysFunction(dt.verifyUsername,"group10bench14");
        dt.clickFunction(dt.formsSearchButton);
        dt.verifyContainsTextFunction(dt.verifyNameLocator,"group10bench14");

    }
}
