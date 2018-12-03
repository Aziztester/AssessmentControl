package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import study.qa.automation.utils.TestContext;

import java.util.concurrent.TimeUnit;

import static study.qa.automation.utils.TestContext.getDriver;

public class CreateUser {



    @Given("^I go to Registration page$")
    public void iGoToRegistrationPage() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/reset-password/1206/127210d235fc63d1f53f1f9ef7c59fc090a4b5c6");
        Thread.sleep(5000);
        getDriver().findElement(By.xpath("//h4[contains(text(),'Reset Password')]/..//*[@placeholder='New Password']")).sendKeys("Anna");

    }

    @Then("^I type First name$")
    public void iTypeFirstNa() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anna");
    }

    @Then("^I type Last name,$")
    public void iTypeLastName() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Solovyova");
    }


    @Then("^I type Email$")
    public void iTypeEmail() throws Throwable  {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("helot@1thecity.biz");


    }

    @And("^I type group code$")
    public void iTypeGroupCode() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Group Code']")).sendKeys("A100");
    }

    @Then("^I type password$")
    public void iTypePassword() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345");
    }


    @And("^type password confirmation$")
    public void typePasswordConfirmation() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("12345");
    }

    @Then("^I push submit button$")
    public void iPushSubmitButtonAndCreateANewUserAccount() throws Throwable {
       getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }


    @And("^I open Email$")
    public void iOpenEmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

