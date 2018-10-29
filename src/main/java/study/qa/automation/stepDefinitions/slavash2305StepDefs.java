package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static study.qa.automation.utils.TestContext.getDriver;

public class slavash2305StepDefs {

    @Then ("I find \"([^\"]*)\" in one of the elements with xpath \"([^\"]*)\", scroll to it with offset (\\d+) and click it$")
    public void iFindInOneOfTheElementsWithXpathAndClickIt(String text, String xpath, Integer offset)
    {
        String elementText;
        List<WebElement> elements = getDriver().findElements(By.xpath(xpath));
        for (WebElement elem: elements) {
            elementText = elem.getText();
            if (elementText.contains(text))
            {
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].scrollIntoView(true);", elem);
                executor.executeScript("window.scrollBy(0, " + offset + ");", elem);
                elem.click();
                return;
            }
        }
        System.out.println("Error! The element with xpath \"" + xpath + "\" containing text \"" + text + "\" has not found!");
    }

    private boolean isElementUnClickable(WebElement element){
        try {
            element.click();
        } catch (WebDriverException ex) {
            if (ex.getMessage().contains("is not clickable")) {
                return true;
            }
        }
        return false;
    }

    @Then ("^I try to click on element with xpath \"([^\"]*)\"$")
    public void iTryClickOnElementWithXpath(String xpath) {
        WebElement element = getDriver().findElement(By.xpath(xpath));
        if (!isElementUnClickable(element)) {
            System.out.println("Failed: Element with xpath \"" + xpath + "\" is clickable");
        }
    }

    @Then("^\"([^\"]*)\" should display at the left top corner$")
    public void usernameShouldDisplayAtTheLeftTopCorner(String userName) {
        assertThat(getDriver().findElement(By.xpath("//h3[contains(text(),'" + userName + "')]")).isDisplayed()).isTrue();
   }

    @Given("^I login with E-mail \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void iLoginWithAndValid(String email, String pwd) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys(email);
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys(pwd);
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
    }

    @When("^I click Menu Item \"([^\"]*)\"$")
    public void iClickMenuItem(String itemText) {
        getDriver().findElement(By.xpath("//h5[contains(text(),'" + itemText + "')]")).click();
    }

    @When("^I click Menu Item \"([^\"]*)\" and wait for \"([^\"]*)\" sec$")
    public void iClickMenuItemAndWaitForSecText(String itemText, String secText) throws Throwable {
        iClickMenuItemAndWaitForSec(itemText, Integer.valueOf(secText));
    }

    @When("^I click Menu Item \"([^\"]*)\" and wait for (\\d+) sec$")
    public void iClickMenuItemAndWaitForSec(String itemText, int sec) throws Throwable {
        iClickMenuItem(itemText);
        Thread.sleep(1000 * sec);
    }
    @When("^I click Logout$")
    public void iClickLogout(){
        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
    }

    @When("^I decline to Logout$")
    public void iDeclineToLogout(){
        getDriver().findElement(By.xpath("//span[contains(text(),'No, Thanks')]/..")).click();
    }

    @Then("^Confirmation pop-up window should display$")
    public void confirmationPopUpWindowShouldDisplay() throws Throwable {
        assertThat(getDriver().findElement(By.xpath("//h1[contains(text(),'Confirmation')]")).isDisplayed()).isTrue();
        Thread.sleep(1000);
    }

    @When("^I confirm Logout$")
    public void iConfirmLogout() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]/..")).click();
        Thread.sleep(1000);
    }

    @Then("^Element with xpath \"([^\"]*)\" should contain text \"([^\"]*)\"$")
    public void elementWithXpathShouldContainText(String xpath, String text) throws Throwable {
        WebElement element = getDriver().findElement(By.xpath(xpath));
        String foundText = element.getText();
        assertThat(foundText.contains(text)).isTrue();
    }
}