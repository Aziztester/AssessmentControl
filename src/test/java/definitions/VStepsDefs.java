package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.platform.commons.util.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

import static study.qa.automation.utils.TestContext.getDriver;

public class VStepsDefs {
    @Given("^V get url \"([^\"]*)\"$")
    public void vGetUrl(String url) {
        getDriver().get(url);
    }

    @When("^V login as teacher \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void vLoginAsTeacherWithPassword(String userName, String password) {
        getDriver().findElement(By.xpath("//*[@formcontrolname='email']")).sendKeys(userName);
        getDriver().findElement(By.xpath("//*[@type='password']")).sendKeys(password);
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }

    @When("^V open quizzes list$")
    public void vOpenQuizzesList() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Quizzes')]")).click();
//        Wait until "List of Quizzes" will be displayed
        vWaitFor("//*[contains(text(),'Quizzes')]");
    }

    @And("^V wait for \"([^\"]*)\"$")
    public void vWaitFor(String path) {
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        WebElement quizzesListWait = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
    }

    @Then("^V verify \"([^\"]*)\" is displayed$")
    public void vVerifyIsDisplayed(String path) {
        assertThat(getDriver().findElement(By.xpath(path)).isDisplayed());
    }

    @When("^V create quiz \"([^\"]*)\"$")
    public void vCreateQuiz(String quizName) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        vVerifyIsDisplayed("//*[contains(text(),'Title Of The Quiz *')]");
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys(quizName);
        getDriver().findElement(By.xpath("//*[contains(text(),'add_circle')]")).click();
    }

    @And("^V create textual question \"([^\"]*)\" number \"([^\"]*)\"$")
    public void vCreateTextualQuestionNumber(String question, String questionNumber) throws Throwable {
        String s;
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//div[contains(text(), 'Textual')]";
        Thread.sleep(300);
        getDriver().findElement(By.xpath(s)).click();
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//*[@placeholder='Question *']";
        getDriver().findElement(By.xpath(s)).sendKeys(question);
        getDriver().findElement(By.xpath("//*[contains(text(),'add_circle')]")).click();
        vWaitFor("//*[contains(text(),'new empty question')]");
    }

    @Then("^V create single-option question \"([^\"]*)\" number \"([^\"]*)\" with options \"([^\"]*)\", \"([^\"]*)\"$")
    public void vCreateSingleOptionQuestionNumberWithOptions(String question, String questionNumber, String option1, String option2) throws Throwable {
        String s;
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//div[contains(text(), 'Single-Choice')]";
        Thread.sleep(300);
        getDriver().findElement(By.xpath(s)).click();
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//*[@placeholder='Question *']";
        vWaitFor(s);
        getDriver().findElement(By.xpath(s)).sendKeys(question);
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//*[@placeholder='Option 1*']/../../../../..//mat-radio-button";
        vWaitFor(s);
        getDriver().findElement(By.xpath(s)).click();
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//textarea[@placeholder='Option 1*']";
        getDriver().findElement(By.xpath(s)).sendKeys(option1);
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//textarea[@placeholder='Option 2*']";
        getDriver().findElement(By.xpath(s)).sendKeys(option2);
        getDriver().findElement(By.xpath("//*[contains(text(),'add_circle')]")).click();
        vWaitFor("//*[contains(text(),'new empty question')]");
    }

    @Then("^V create multiple-choice question \"([^\"]*)\" number \"([^\"]*)\" with options \"([^\"]*)\", \"([^\"]*)\"$")
    public void vCreateMultipleChoiceQuestionNumberWithOptions(String question, String questionNumber, String option1, String option2) throws Throwable {
        String s;
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//div[contains(text(), 'Multiple-Choice')]";
        Thread.sleep(300);
        getDriver().findElement(By.xpath(s)).click();
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//*[@placeholder='Question *']";
        getDriver().findElement(By.xpath(s)).sendKeys(question);
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//textarea[@placeholder='Option 1*']";
        getDriver().findElement(By.xpath(s)).sendKeys(option1);
        s = "//*[contains(text(),'Q" + questionNumber + ":')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox";
        getDriver().findElement(By.xpath(s)).click();
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//textarea[@placeholder='Option 2*']";
        getDriver().findElement(By.xpath(s)).sendKeys(option2);
        if (!questionNumber.equals("9")) {
            getDriver().findElement(By.xpath("//*[contains(text(),'add_circle')]")).click();
            vWaitFor("//*[contains(text(),'new empty question')]");
        }
    }

    @When("^V increase passing rate to \"([^\"]*)\"$")
    public void vIncreasePassingRateTo(String newPercent) throws Throwable {
        String s = "//span[text() = '+']/..";
        do {
            getDriver().findElement(By.xpath(s)).click();
        }
        while (!getDriver().findElement(By.xpath("//h1[contains(text(),'%')]")).getText().equals(newPercent));
    }

    @And("^V save$")
    public void vSave() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]/..")).click();
    }
}
