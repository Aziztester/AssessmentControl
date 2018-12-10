package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import study.qa.automation.utils.TestContext;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class TextualQuestionShowstopper {
    @When("^Open url f rf\"([^\"]*)\"$")
    public void openUrlFRf(String arg0) throws Throwable {
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
    }

    @Then("^Type email address and password$")
    public void typeEmailAddressAndPassword() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("umoha@jerapah993r.gq");
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("12345");
    }

    @Then("^Click on the element with xpath \"([^\"]*)\"$")
    public void clickOnTheElementWithXpath(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(1000);
    }

    @When("^Click on the element \"([^\"]*)\"$")
    public void clickOnTheElement(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(1000);
    }

    @Then("^Click quiz \"([^\"]*)\" with path \"([^\"]*)\"$")
    public void clickQuizWithPath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        Thread.sleep(1000);
    }

    @And("^Type the title of Quiz  \"([^\"]*)\" with path \"([^\"]*)\"$")
    public void typeTheTitleOfQuizWithPath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Textual Question: With Show-stopper");
        Thread.sleep(1000);
    }

    @And("^Click \"([^\"]*)\" with path \"([^\"]*)\"$")
    public void clickWithPath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        Thread.sleep(1000);
    }

    @And("^Click Element \"([^\"]*)\" with path \"([^\"]*)\"$")
    public void clickElementWithPath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        Thread.sleep(1000);
    }

    @And("^Type question in text field with path \"([^\"]*)\"$")
    public void typeQuestionInTextFieldWithPath(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys("What is testing");
        Thread.sleep(1000);
    }

    @And("^Click checkbox \"([^\"]*)\"Show-Stopper\"([^\"]*)\" with path \"([^\"]*)\"$")
    public void clickCheckboxShowStopperWithPath(String arg0, String arg1, String arg2) throws Throwable {
        getDriver().findElement(By.xpath("//*[@class='mat-checkbox-inner-container']")).click();
        Thread.sleep(1000);
    }

    @Then("^Click button \"([^\"]*)\"  with path \"([^\"]*)\"$")
    public void clickButtonWithPath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(1000);
    }

    @Then("^Verify the quiz \"([^\"]*)\" with path \"([^\"]*)\" is displayed$")
    public void verifyTheQuizWithPathIsDisplayed(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Textual Question: With Show-stopper')]")).isDisplayed();
        Thread.sleep(1000);
    }
}
