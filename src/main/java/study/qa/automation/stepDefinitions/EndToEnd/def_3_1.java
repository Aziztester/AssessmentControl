package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
        getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
        Thread.sleep(1000);
    }

    @And("^I type Last Name \"([^\"]*)\"$")
    public void iTypeLastName(String lname) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
        Thread.sleep(1000);
    }

    @And("^I type Email \"([^\"]*)\"$")
    public void iTypeEmail(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Group Code \"([^\"]*)\"$")
    public void iTypeGroupCode(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Group Code']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Password \"([^\"]*)\"$")
    public void iTypePassword(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I type Confirm Password \"([^\"]*)\"$")
    public void iTypeConfirmPassword(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[@placeholder='Confirm Password']")).sendKeys(arg0);
        Thread.sleep(1000);
    }

    @And("^I push button Register me$")
    public void iPushButtonRegisterMe() throws Throwable {
      getDriver().findElement(By.xpath("//span[contains(text(),'Register Me')]")).click();
       Thread.sleep(2000);
    }

    @Then("^I receive message You've been registered$")
    public void iReceiveMessageYouVeBeenRegistered() throws Throwable {
        assert (getDriver().findElement(By.xpath("//h4[contains(text(),'Registered')]"))).isDisplayed();
        System.out.println("You have been registered");
        Thread.sleep(2000);
    }

    @And("^I push on \"([^\"]*)\" button$")
    public void iPushOnButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Back to')]")).click();
    }

    @And("^click on User's Managment on the left navigational panel$")
    public void clickOnUserSManagmentOnTheLeftNavigationalPanel() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Management')]")).click();
        Thread.sleep(2000);
    }

    @And("^select Sudent \"([^\"]*)\" from Students List$")
    public void selectSudentFromStudentsList(String nameStudent) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Lena1 Shain1')]")).click();
        Thread.sleep(2000);
    }

    @When("^push “Options” button on the right side$")
    public void pushOptionsButtonOnTheRightSide() throws Throwable {
        getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//*[@role='menuitem'][4]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Delete')]")).click();
        Thread.sleep(2000);
    }
}

