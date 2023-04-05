package StepDefinitions;

import Utilities.ExcelReport;
import Utilities.WD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

    @After
    public void after(Scenario scenario) {
        ExcelReport.writeExcel("src/test/java/Reports/ScenarioStatus.xlsx" , scenario , WD.threadBrowserGet());
        WD.quitDriver();
    }
}
