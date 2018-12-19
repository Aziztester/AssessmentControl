
package study.qa.automation.stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static study.qa.automation.utils.TestContext.getDriver;

public class TeacherLoginStepsDefs {
    @Given("^I Opened url \"([^\"]*)\"$")
    public void iOpenedUrl(String url) throws Throwable {
        getDriver().get(url);
        Thread.sleep(3000);

    }

    @Then("^I logged in with Email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoggedInWithEmailAndPassword(String email, String password) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(email);
        getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(password);
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(3000);

    }
}