package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.junit.Assertions;
import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebElement;




import static study.qa.automation.utils.TestContext.getDriver;

public class logindef {
    @Given("^I Navigate to login page$")
    public void iNavigateToLoginPage() {
        getDriver().get("http://local.school.portnov.com:4520/#/login");
    }

    @Then("^I Type Email \"([^\"]*)\"$")
    public void iTypeEmail(String email) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys(email);
        Thread.sleep(3000);

    }

    @And("^I Type Password \"([^\"]*)\"$")
    public void iTypePassword(String pass) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys(pass);
    }

    @Then("^I Push \"([^\"]*)\" button$")
    public void iPushButton() throws Throwable {
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
    }

    @Then("^I logged in and user's name appears on top left corner of account$")
    public void iLoggedInAndUserSNameAppearsOnTopLeftCornerOfAccount() {
        getDriver().findElement(By.xpath("//h3[contains(text(),'Riseka ZH')]")).isDisplayed();


    }
}
