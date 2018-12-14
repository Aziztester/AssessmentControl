package study.qa.automation.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import study.qa.automation.utils.TestContext;

import static java.lang.Thread.sleep;
import static study.qa.automation.utils.TestContext.getDriver;

public class MyStepdefs {
    @Given("Open url {string}")
    public void openUrl(String arg0) throws InterruptedException {
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(1000);
    }

    @When("I click on element with xpath {string}")
    public void iClickOnElementWithXpath(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Now')]")).click();
        Thread.sleep(1000);
    }

    @And("I click element with xpath {string}")
    public void iClickElementWithXpath(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@placeholder ='First Name']")).click();
        Thread.sleep(1000);
    }

    @Then("I type {string} with xpath {string}")
    public void iTypeWithXpath(String arg0, String arg1) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("Ivan");
        Thread.sleep(1000);
    }

    @And("I type Last name, Email, Group Code")
    public void iTypeLastNameEmailGroupCode() throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("Ivanov");
        getDriver().findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys("usergalina1@gmail.com");
        getDriver().findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys("A001");
        Thread.sleep(1000);


    }

    @When("I type password and confirm password")
    public void iTypePasswordAndConfirmPassword() throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@id='mat-input-6']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("12345");
        Thread.sleep(1000);


    }

    @Then("I click {string}")
    public void iClick(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Me')]")).click();
        Thread.sleep(1000);
    }

    @When("I Open url{string}")
    public void iOpenUrl(String arg0) throws InterruptedException {
        getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(1000);
    }

    @Then("I type email address, password")
    public void iTypeEmailAddressPassword() {
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("umoha@jerapah993r.gq");
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("12345");
    }

    @Then("I Click button {string}")
    public void iClickButton(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
    }

    @When("I Click on {string}")
    public void iClickOn(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[contains(text(),\"User's Management\")]")).click();
        Thread.sleep(1000);
    }

    @And("I Find Student")
    public void iFindStudent() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),\"User's Management\")]/../..//*[contains(text(),\"Group: A001\")]/../..//*[contains(text(),'Ivan Ivanov')]")).click();
        Thread.sleep(1000);
    }

    @And("I click {string} button")
    public void iClickButtonOption(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
        Thread.sleep(1000);
    }

    @Then("I click  on {string}")
    public void iClickOnDelete(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//div[@class='mat-menu-content ng-trigger ng-trigger-fadeInItems']//button[4]")).click();
        Thread.sleep(1000);
    }

    @Then("I click {string} {string}")
    public void iClick(String arg0, String arg1) throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
        Thread.sleep(1000);
    }
}
