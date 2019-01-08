package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import study.qa.automation.utils.TestContext;

import static study.qa.automation.utils.TestContext.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class UserFirstName {
    @When("^Navigate to registration page \"([^\"]*)\"$")
    public void navigateToRegistrationPage(String arg0) throws Throwable {
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
    }
    @And("^Click on \"([^\"]*)\" with xpath\"([^\"]*)\"$")
    public void clickOnWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath(arg1)).click();
        Thread.sleep(1000);
    }
    @And("^Type First name \"([^\"]*)\" into First name field with x-path \"([^\"]*)\"$")
    public void typeFirstNameIntoFirstNameFieldWithXPath(String First, String arg1) throws Throwable {
        getDriver().findElement(By.xpath(arg1)).sendKeys(First);
    }
    @And("^Type Last name \"([^\"]*)\" into Last name field with x-path \"([^\"]*)\"$")
    public void typeLastNameIntoLastNameFieldWithXPath(String Last, String arg1) throws Throwable {
        getDriver().findElement(By.xpath(arg1)).sendKeys(Last);
    }
    @And("^Type Email \"([^\"]*)\" into Email field with x-path \"([^\"]*)\"$")
    public void typeEmailIntoEmailFieldWithXPath(String Email, String arg1) throws Throwable {
        getDriver().findElement(By.xpath(arg1)).sendKeys(Email);
    }
    @And("^Type Group Id \"([^\"]*)\" into Group Id field with x-path \"([^\"]*)\"$")
    public void typeGroupIdIntoGroupIdFieldWithXPath(String Group, String arg1) throws Throwable {
        getDriver().findElement(By.xpath(arg1)).sendKeys(Group);
    }
    @And("^Type Password \"([^\"]*)\" into Password field with x-path \"([^\"]*)\"$")
    public void typePasswordIntoPasswordFieldWithXPath(String Password, String arg1) throws Throwable {
        getDriver().findElement(By.xpath(arg1)).sendKeys(Password);
    }
    @And("^Type Confirm password \"([^\"]*)\" into Confirm Password field with x-path \"([^\"]*)\"$")
    public void typeConfirmPasswordIntoConfirmPasswordFieldWithXPath(String Confirm, String arg1) throws Throwable {
        getDriver().findElement(By.xpath(arg1)).sendKeys(Confirm);
    }
    @And("^Push \"([^\"]*)\" button with x-path \"([^\"]*)\"$")
    public void pushButtonWithXPath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath(arg1)).click();
        Thread.sleep(1000);
    }
    @Then("^Verify the message \"([^\"]*)\" with path \"([^\"]*)\" is displayed$")
    public void verifyTheMessageWithPathIsDisplayed(String arg0, String arg1) throws Throwable {
       Assertions.assertThat(getDriver().findElement(By.xpath(arg1)).getText().contains(arg0));
//        String Registred=getDriver().findElement(By.xpath(arg1)).getText();
  //      assertThat(Registred).contains(arg0);
    }
    @And("^Click on Last Name field with x-path \"([^\"]*)\"$")
    public void clickOnLastNameFieldWithXPath(String arg0) throws Throwable {
        getDriver().findElement(By.xpath(arg0)).click();
    }
}
