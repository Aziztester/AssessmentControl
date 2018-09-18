package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.*;
import static study.qa.automation.utils.TestContext.getDriver;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class QuizStepDef {
    @Then("^I scroll to the element with xpath \"([^\"]*)\" with offset (\\d+)$")
    public void iScrollToTheElementWithXpathWithOffset(String xpath, int offset) throws Exception {
        WebElement element = getDriver().findElement(By.xpath(xpath));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", element);
        executor.executeScript("window.scrollBy(0, " + offset + ");", element);
        Thread.sleep(500);
    }


    @Then("^I move the slider to rate ([^\"]*)$")
    public void iMoveTheSliderToRate(String Rate) throws Throwable {
        //WebElement slider = getDriver().findElement(By.xpath("//mat-slider[@role='slider'][@aria-valuenow=5]"));
        WebElement slider = getDriver().findElement(By.xpath("//div[@class='controls']//div[@class='mat-slider-thumb']\n"));
        Actions move = new Actions(getDriver());
        int num = (int)Math.round((75 - Double.parseDouble(Rate)) * 1.13);
        move.dragAndDropBy(slider, -num, 0).build().perform();
        Thread.sleep(1000);
    }

   /* @Then("^I move the slider to rate \"([^\"]*)\"$")
    public void iMoveTheSliderToRate(String rate) {
        // Write code here that turns the phrase above into concrete actions
        WebElement slider = getDriver().findElement(By.xpath("//div[@class='controls']//div[@class='mat-slider-thumb']\n"));
        Actions move = new Actions(getDriver());
        int num = (int)Math.round((75 - Double.parseDouble(rate)) * 1.1);
        move.dragAndDropBy(slider, -num, 0).build().perform();
        Thread.sleep(1000);
    }*/
}

