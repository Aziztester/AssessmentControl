package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static study.qa.automation.utils.TestContext.getDriver;

public class test {
    @Then("^I click I forgot password$")
    public void iClickIForgotPassword() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'I forgot my password')]")).click();
    }

    @Then("^\"([^\"]*)\" massage appears$")
    public void massageAppears(String massage) throws Throwable {
        assert(getDriver().findElement(By.xpath("//*[contains(text(),'" + massage + "')]"))).isDisplayed();
        System.out.println("Done");
        Thread.sleep(1000);
        }

    @Then("^I type Email in Request password reset window \"([^\"]*)\"$")
    public void iTypeEmailInRequestPasswordResetWindow(String email) throws Throwable {
        getDriver().findElement(By.xpath("//*[@placeholder='Email']")).sendKeys(email);
    }

    @And("^I push button \"([^\"]*)\"$")
    public void iPushButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Request Password Reset')]")).click();
    }
}
