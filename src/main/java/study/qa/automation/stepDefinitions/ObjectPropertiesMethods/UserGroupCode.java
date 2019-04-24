package study.qa.automation.stepDefinitions.ObjectPropertiesMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import static study.qa.automation.utils.TestContext.getDriver;

public class UserGroupCode {
    @Given("^I open URL \"([^\"]*)\"$")
    public void iOpenURL(String url) throws Throwable {
        getDriver().get(url);
        Thread.sleep(1000);
    }

    @When("^I type First name \"([^\"]*)\"$")
    public void iTypeFirstName(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Last name \"([^\"]*)\"$")
    public void iTypeLastName(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Email \"([^\"]*)\"$")
    public void iTypeEmail(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Group Code \"([^\"]*)\"$")
    public void iTypeGroupCode(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Password \"([^\"]*)\"$")
    public void iTypePassword (String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Confirm Password \"([^\"]*)\"$")
    public void iTypeConfirmPassword (String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I push \"([^\"]*)\" button$")
    public void iPushButton (String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Me')]/..")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @Then("^\"([^\"]*)\" successful message appears$")
    public void successfulMessageAppears(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[@class='mat-card']/*[contains(text(),'You have been Registered.')]")).isDisplayed();
        Thread.sleep(1000);

    }

    @Then("^Error message \"([^\"]*)\" appears under Group code field$")
    public void errorMessageAppearsUnderGroupCodeField(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[@id='mat-error-4'][contains(text(), 'This field is required')]")).isDisplayed();
        Thread.sleep(1000);
    }


    @When("^I move input focus to password$")
    public void iMoveInputFocusToPassword() {
        getDriver().findElement(By.xpath("//input[@id='mat-input-4']")).click();
    }


    @Then("^Error message \"([^\"]*)\" appears under field Group Code$")
    public void errorMessageAppearsUnderFieldGroupCode(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Too long. Should be no more than 6 characters')]")).isDisplayed();
        Thread.sleep(1000);
    }


    @Then("^Error WhiteSpace message \"([^\"]*)\" appears under field Group Code$")
    public void errorWhiteSpaceMessageAppearsUnderFieldGroupCode(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'White spaces are not allowed')]")).isDisplayed();
        Thread.sleep(1000);
    }

}
