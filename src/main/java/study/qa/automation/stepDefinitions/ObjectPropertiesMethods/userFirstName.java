package study.qa.automation.stepDefinitions.ObjectPropertiesMethods;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static study.qa.automation.utils.TestContext.getDriver;

public class userFirstName {



    @Given("^I open url \"([^\"]*)\"$")
    public void iOpenUrl(String url) throws Throwable {
        getDriver().get(url);
        Thread.sleep(2000);
    }

    @Then("^I type First Name: \"([^\"]*)\"$")
    public void iTypeFirstName(String fname) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
    }

    @And("^I type Last Name: \"([^\"]*)\"$")
    public void iTypeLastName(String lname) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
        Thread.sleep(1000);
    }

    @And("^I type Email: \"([^\"]*)\"$")
    public void iTypeEmail(String Email) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(Email);
        Thread.sleep(1000);
    }

    @And("^I type Group Code: \"([^\"]*)\"$")
    public void iTypeGroupCode(String Gcode) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Group Code']")).sendKeys(Gcode);
        Thread.sleep(1000);
    }

    @And("^I type Password:\"([^\"]*)\"$")
    public void iTypePassword(String Pwd) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Pwd);
        Thread.sleep(1000);
    }

    @And("^I type Confirm Password: \"([^\"]*)\"$")
    public void iTypeConfirmPassword(String CPwd) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(CPwd);
        Thread.sleep(1000);
    }

    @And("^Push Register Me button$")
    public void pushRegisterMeButton() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Register Me')]")).click();
        Thread.sleep(1000);
    }

    @Then("^\"([^\"]*)\" is displayed$")
    public void isDisplayed(String Dis) throws Throwable {
        assert (getDriver().findElement(By.xpath("//h4[contains(text(),'Registered')]"))).isDisplayed();
        System.out.println("You have been registered");
        Thread.sleep(1000);
    }


    @Then("^\"([^\"]*)\" message is displayed under \"([^\"]*)\"$")
    public void messageIsDisplayedUnder(String dis, String FN) throws Throwable {
        assert(getDriver().findElement(By.xpath("//input[@id='mat-input-18']"))).isDisplayed();
        System.out.println("This field is required");
        Thread.sleep(1000);
    }

    @Then("^\"([^\"]*)\" message appears$")
    public void messageAppears(String Data) throws Throwable {
        assert (getDriver().findElement(By.xpath("//*[contains(text(), 'visually-hidden')]"))).isDisplayed();
        System.out.println("Data too long for column 'name' at row 1");
        Thread.sleep(1000);
    }

    @Then("^I enter FirstName:\"([^\"]*)\"$")
    public void iEnterFirstName(String fn) throws Throwable {
       getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fn);
        Thread.sleep(1000);
    }

    @And("^Click on \"([^\"]*)\" field$")
    public void clickOnField(String ln) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(ln);
        Thread.sleep(1000);
    }

    @Then("^\"([^\"]*)\" message appears under the \"([^\"]*)\"$")
    public void messageAppearsUnderThe(String White, String space) throws Throwable {
       assert (getDriver().findElement(By.xpath("//mat-error[contains(text(),'Whitespaces are not allowed')]"))).isDisplayed();
        Thread.sleep(1000);
    }

    @Then("^I type \"([^\"]*)\"$")
    public void iType(String First) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(First);
        Thread.sleep(1000);
    }

    @And("^Click \"([^\"]*)\" on left navigation panel$")
    public void clickOnLeftNavigationPanel(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//mat-sidenav[@class='mat-drawer mat-sidenav ng-tns-c2-1 ng-trigger ng-trigger-transform ng-tns-c0-0 mat-drawer-side ng-star-inserted']//a[5]")).click();
        Thread.sleep(1000);

    }

    @And("^Click \"([^\"]*)\"$")
    public void click(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//div[contains(text(),'Teachers')]")).click();
        Thread.sleep(1000);
    }


    @And("^Look for user \"([^\"]*)\" and click$")
    public void lookForUserAndClick(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h4[contains(text(),'Diana Brown')]")).click();
        Thread.sleep(1000);
    }

    @And("^Push \"([^\"]*)\"$")
    public void push(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
        Thread.sleep(1000);
    }

    @Then("^Push \"([^\"]*)\" option$")
    public void pushOption(String arg0) throws Throwable {
       getDriver().findElement(By.xpath("//body//button[3]")).click();
        Thread.sleep(1000);
    }


}
