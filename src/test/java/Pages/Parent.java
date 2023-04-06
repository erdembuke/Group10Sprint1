package Pages;

import Utilities.WD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(WD.getDriver(), Duration.ofSeconds(30));

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) WD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitUntilDisable(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    public void waitUntilTextTobe(WebElement element,String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String text) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void verifyContainsTextFunction(WebElement element, String content) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, content));
        Assert.assertTrue(element.getText().toLowerCase().contains(content.toLowerCase()), "not contains text");
        new Actions(WD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void verifyElementDisplayed(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());
    }
    public void actionsSendKeys(String str){
        Actions action=new Actions(WD.getDriver());
        switch (str.toLowerCase()){
            case "down":action.sendKeys(Keys.DOWN).build().perform();
            break;
            case "enter":action.sendKeys(Keys.ENTER).build().perform();
            break;
            case "tab":action.sendKeys(Keys.TAB).build().perform();
                break;
            case "space":action.sendKeys(Keys.SPACE).build().perform();
                break;
        }

    }
    public void actionWriteText(String text){
        new Actions(WD.getDriver()).sendKeys(text).build().perform();
    }
    public void actionClick(WebElement element){
       new Actions(WD.getDriver()).click(element).build().perform();
    }
}
