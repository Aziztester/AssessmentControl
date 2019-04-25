package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static study.qa.automation.utils.TestContext.getDriver;

public class UserPwDefs {
    @And("^Click on Register Now button$")
    public void clickOnRegisterNowButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Now')]")).click();
        Thread.sleep(2000);
    }

    @Then("^an error message \"([^\"]*)\" for password field is displayed$")
    public void anErrorMessageForPasswordFieldIsDisplayed(String arg0) throws Throwable {
        assert(getDriver().findElement(By.xpath("//*[contains(text(),'This field is required')]"))).isDisplayed();
        Thread.sleep(2000);
    }

    @Then("^Message \"([^\"]*)\" appears$")
    public void messageAppears(String arg0) throws Throwable {
        assert(getDriver().findElement(By.xpath("//*[contains(text(),'You have been registered')]"))).isDisplayed();
        Thread.sleep(2000);
    }

    @Then("^Message \"([^\"]*)\" displayed$")
    public void messageDisplayed(String arg0) throws Throwable {
        assert (getDriver().findElement(By.xpath("//*[contains(text(),'Too short. Should be at least 5 characters')]"))).isDisplayed();
        Thread.sleep(2000);
    }

    @Then("^an error message \"([^\"]*)\" for password field displayed$")
    public void anErrorMessageForPasswordFieldDisplayed(String arg0) throws Throwable {
        assert(getDriver().findElement(By.xpath("//*[contains(text(),'Whitespaces are not allowed')]"))).isDisplayed();
        Thread.sleep(2000);
    }

    @Then("^an error message \"([^\"]*)\" for confirm password field should displayed$")
    public void anErrorMessageForConfirmPasswordFieldShouldDisplayed(String arg0) throws Throwable {
        assert(getDriver().findElement(By.xpath("//*[contains(text(),'Entered passwords should match')]"))).isDisplayed();
        Thread.sleep(2000);

    }

    @Then("^error message \"([^\"]*)\" should appears$")
    public void errorMessageShouldAppears(String arg0) throws Throwable {
        assert(getDriver().findElement(By.xpath("//*contains(text(),'Non allowable characters')]"))).isDisplayed();
        Thread.sleep(2000);

    }
}
