package StepDefinitions;

import Pages.DialogItems;
import Pages.MenuItems;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataTableSteps {
    DialogItems di = new DialogItems();
    MenuItems mi = new MenuItems();

    @And("Click the element in MenuItems")
    public void clickTheElemenInMenuItems(DataTable items){
        List<String> list = items.asList(String.class);

        for (String abd : list){
            WebElement element = mi.getElement(abd);
            mi.clickFunction(element);
        }
    }

    @And("Click the element in DialogItems")
    public void clickTheElementInDialogItems(DataTable items){
        List<String> list = items.asList(String.class);

        for (String abd : list){
            WebElement element = di.getElement(abd);
            di.clickFunction(element);
        }
    }

    @And("User sendKeys in DialogItems")
    public void userSendkeysInDialogItems(DataTable items){
        List<List<String>> lists = items.asLists(String.class);

        for (int i = 0; i < lists.size(); i++) {
            WebElement element = di.getElement(lists.get(i).get(0));
            di.sendKeysFunction(element , lists.get(i).get(1));
        }
    }
}
