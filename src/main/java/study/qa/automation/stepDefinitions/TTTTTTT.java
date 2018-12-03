package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import study.qa.automation.utils.TestContext;

import java.util.concurrent.TimeUnit;

import static study.qa.automation.utils.TestContext.getDriver;

public class TTTTTTT {
    @Given("^Teacher navig to login page$")
    public void teacherNavigToLoginPage() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        throw new PendingException();
    }

    @Then("^teacher type email$")
    public void teacherTypeEmail() throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("umoha@jerapah993r.gq");
        throw new PendingException();
    }

    @Then("^Teacher type password$")
    public void teacherTypePassword() throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("12345");
        throw new PendingException();
    }

    @Then("^pushes \"([^\"]*)\" button$")
    public void pushesButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        throw new PendingException();
    }
}
