package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static study.qa.automation.utils.TestContext.getDriver;

public class def_3_10_1Stepdefs {
    @Given("^I open url\"([^\"]*)\"$")
    public void iOpenUrl(String url) throws Throwable {
        getDriver().get(url);
        Thread.sleep(1000);
    }

    @And("^Click on \"([^\"]*)\" on left navigation panel$")
    public void clickOnOnLeftNavigationPanel(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(1000);
    }

    @Then("^Push \"([^\"]*)\" button$")
    public void pushButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//a[@routerlink='/quiz-builder']//button[@class='mat-raised-button mat-primary']")).click();
        Thread.sleep(1000);
    }

    @And("^Type \"([^\"]*)\" as \"([^\"]*)\"$")
    public void typeAs(String Title, String quiz) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-16']")).sendKeys(Title,quiz);
        Thread.sleep(1000);
    }

    @And("^Select \"([^\"]*)\" question type$")
    public void selectQuestionType(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Textual')]")).click();
        Thread.sleep(1000);
    }

    @And("^Type in question Q(\\d+) \"([^\"]*)\"$")
    public void typeInQuestionQ(int arg0, String Q1) throws Throwable {
        getDriver().findElement(By.xpath("//textarea[@id='mat-input-9']")).sendKeys(Q1);
        Thread.sleep(1000);
    }

    @And("^Type in Options \"([^\"]*)\" and \"([^\"]*)\"$")
    public void typeInOptionsAnd(String op1, String op2) throws Throwable {
        getDriver().findElement(By.xpath("//textarea[@id='mat-input-10']")).sendKeys(op1,op2);
        Thread.sleep(1000);
    }

    @And("^Select \"([^\"]*)\" as correct answer$")
    public void selectAsCorrectAnswer(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//mat-radio-button[@id='mat-radio-6']//div[@class='mat-radio-inner-circle']")).click();
        Thread.sleep(1000);
    }

    @And("^Push \"([^\"]*)\" button \"([^\"]*)\" times$")
    public void pushButtonTimes(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Add Option')]")).click();
        Thread.sleep(1000);
    }

    @And("^Select \"([^\"]*)\" and \"([^\"]*)\"as correct answers$")
    public void selectAndAsCorrectAnswers(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'checkbox-inner-container')]")).click();
        Thread.sleep(1000);
    }

    @Then("^Push \"([^\"]*)\" button for \"([^\"]*)\" times on right side of the page to get \"([^\"]*)\" \"([^\"]*)\"$")
    public void pushButtonForTimesOnRightSideOfThePageToGet(String arg0, String arg1, String arg2, String arg3) throws Throwable {
        for (int i=0;i<=15;i++){
            getDriver().findElement(By.xpath("//form[@class='ng-star-inserted ng-touched ng-dirty ng-invalid']//button[2]")).click();
            Thread.sleep(1000);
        }

    }

    @Then("^Click on \"([^\"]*)\"$")
    public void clickOn(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-257']")).click();
        Thread.sleep(1000);
    }

    @And("^Push \"([^\"]*)\" button on the right side$")
    public void pushButtonOnTheRightSide(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'mat-button-ripple')]")).click();
        Thread.sleep(1000);
    }

    @And("^Push \"([^\"]*)\" button on the Confirmation Pop-up$")
    public void pushButtonOnTheConfirmationPopUp(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'button-wrapper')]")).click();
        Thread.sleep(1000);
    }
}