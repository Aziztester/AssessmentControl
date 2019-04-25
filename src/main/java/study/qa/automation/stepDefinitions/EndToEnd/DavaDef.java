package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static study.qa.automation.utils.TestContext.getDriver;

public class DavaDef {
    @And("^Click quiz \"([^\"]*)\" from the list of Assignments$")
    public void clickQuizFromTheListOfAssignments(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h4[contains(text(), 'My Assignment')]/..//*[contains(text(), 'Soccerone')]"));
        throw new PendingException();
    }

    @And("^Click Option (\\d+) radiobutton$")
    public void clickOptionRadiobutton() {
        getDriver().findElement(By.xpath("//*[contains(@id,'mat-radio')][1]/label/div[1]")).click();
    }

    @And("^Click quiz \"([^\"]*)\" from list of Assignments$")
    public void clickQuizFromListOfAssignments(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//a[@href='/#/assessment/21154']"));
        throw new PendingException();

    }

    @And("^Click Option (\\d+) from options list$")
    public void clickOptionFromOptionsList(int arg0) {
        getDriver().findElement(By.xpath("//div[contains(text(),'Option Yes2')]")).click();

    }

    @And("^Click quiz \"([^\"]*)\" in Assignments$")
    public void clickQuizInAssignments(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//a[@href='/#/assessment/21155']"));
        throw new PendingException();
    }

    @And("^I click Option (\\d+) from options$")
    public void iClickOptionFromOptions(int arg0) {
        getDriver().findElement(By.xpath("//div[contains(text(),'Option Yes3')]")).click();

    }

    @Then("^Verify that Quiz \"([^\"]*)\" was submitted by student$")
    public void verifyThatQuizWasSubmittedByStudent(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//td[contains(text(),'Soccer1')]"));
        throw new PendingException();
    }

    @And("^Verify if Quiz \"([^\"]*)\" was submitted by student$")
    public void verifyIfQuizWasSubmittedByStudent(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//td[contains(text(),'Soccer2')]"));
        throw new PendingException();
    }

    @And("^Verify if Quiz \"([^\"]*)\" was submit by student$")
    public void verifyIfQuizWasSubmitByStudent(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//td[contains(text(),'Soccer3')]"));
        throw new PendingException();
    }

    @Then("^Verify that quiz \"([^\"]*)\" was assigned in the list$")
    public void verifyThatQuizWasAssignedInTheList(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Soccerone')]/.."));
        throw new PendingException();
    }

    @And("^Click on Go To Assessment button$")
    public void clickOnGoToAssessmentButton() {
        getDriver().findElement(By.xpath("//a[@href='/#/assessment/21180']//button[@class='mat-raised-button mat-primary']//span[@class='mat-button-wrapper'][contains(text(),'Go To Assessment')]"));
    }

    @And("^Click on Go To Assessment button with a name \"([^\"]*)\"$")
    public void clickOnGoToAssessmentButtonWithAName(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//a[@href='/#/assessment/21187']//button[@class='mat-raised-button mat-primary']//*[contains(text(),'Go To Assessment')]")).click();
        Thread.sleep(3000);
        throw new PendingException();
    }

    @Then("^Click on Option first$")
    public void clickOnOptionFirst() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'Option Yes1')]")).click();
        Thread.sleep(2000);
    }

    @And("^Select Option first as correct$")
    public void selectOptionFirstAsCorrect() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'Option Yes1')]")).click();
        Thread.sleep(2000);
    }
    }
