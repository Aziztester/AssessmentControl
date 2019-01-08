package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import study.qa.automation.utils.TestContext;
import static study.qa.automation.utils.TestContext.getDriver;

public class UserEmail {
    @Given("^Navigate to registration page\"([^\"]*)\"$")
    public void navigateToRegistrationPage(String arg0) throws Throwable {
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/registration");
    }

    @Then("^Type FirstName \"([^\"]*)\" into firstname field with xpath\"([^\"]*)\"$")
    public void typeFirstNameIntoFirstnameFieldWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(arg0);
    }

    @Then("^Type LastName \"([^\"]*)\" into lastname field with xpath\"([^\"]*)\"$")
    public void typeLastNameIntoLastnameFieldWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(arg0);
    }

    @Then("^Type Email \"([^\"]*)\" into email field with xpath\"([^\"]*)\"$")
    public void typeEmailIntoEmailFieldWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(arg0);
    }

    @Then("^Type Group ID \"([^\"]*)\"into group field with xpath\"([^\"]*)\"$")
    public void typeGroupIDIntoGroupFieldWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Group Code']")).sendKeys(arg0);
    }

    @Then("^Type Password \"([^\"]*)\"into password field with xpath\"([^\"]*)\"$")
    public void typePasswordIntoPasswordFieldWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arg0);
    }

    @Then("^Type Confirm Password \"([^\"]*)\" into confirm password field with xpath\"([^\"]*)\"$")
    public void typeConfirmPasswordIntoConfirmPasswordFieldWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(arg0);
    }

    @Then("^Push Register Me button with xpath\"([^\"]*)\"$")
    public void pushRegisterMeButtonWithXpath(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^Verify if \"([^\"]*)\" message appears with xpath\"([^\"]*)\"$")
    public void verifyIfMessageAppearsWithXpath(String arg0, String arg1) throws Throwable {
        Assertions.assertThat(getDriver().findElement(By.xpath(arg1)).getText().contains(arg0));
    }
}

