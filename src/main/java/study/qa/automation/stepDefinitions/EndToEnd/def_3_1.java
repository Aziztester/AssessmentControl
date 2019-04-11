package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static study.qa.automation.utils.TestContext.getDriver;

public class def_3_1 {
    @Then("^I push Register now button$")
    public void iPushRegisterNowButton()throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Now')]")).click();
        Thread.sleep(1000);
    }


    @And("^I type First Name \"([^\"]*)\"$")
    public void iTypeFirstName(String fname) throws Throwable {
        getDriver().findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys(fname);
        throw new PendingException();
    }

    @And("^I type Last Name \"([^\"]*)\"$")
    public void iTypeLastName(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Last Name'])"));
        throw new PendingException();
    }

    @And("^I type Email \"([^\"]*)\"$")
    public void iTypeEmail(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder=\"Email\"])"));
        throw new PendingException();
    }

    @And("^I type Group Code \"([^\"]*)\"$")
    public void iTypeGroupCode(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder=\"Group Code\"])"));
        throw new PendingException();
    }

    @And("^I type Password \"([^\"]*)\"$")
    public void iTypePassword(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Password'])"));
        throw new PendingException();
    }

    @And("^I type Confirm Password \"([^\"]*)\"$")
    public void iTypeConfirmPassword(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder=\"confirmPassword\"])"));
        throw new PendingException();
    }

//    @And("^I push button Register me$")
//    public void iPushButtonRegisterMe() {

//    }
}

