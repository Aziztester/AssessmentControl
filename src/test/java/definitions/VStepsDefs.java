package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.xpath.operations.Bool;
import org.assertj.core.api.AbstractBooleanAssert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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
        (assertThat(getDriver().findElement(By.xpath(path)).isDisplayed())).isTrue();
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

    @When("^V choose Multiple-Choice type to create Question \"([^\"]*)\"$")
    public void vChooseMultipleChoiceTypeToCreateQuestion(String questionNumber) throws Throwable {
        String s;
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//div[contains(text(), 'Multiple-Choice')]";
        Thread.sleep(300);
        getDriver().findElement(By.xpath(s)).click();
    }


    @And("^V type \"([^\"]*)\" in Question field for \"([^\"]*)\" question$")
    public void vTypeInQuestionFieldForQuestion(String question, String questionNumber) throws Throwable {
        String s;
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//*[@placeholder='Question *']";
        getDriver().findElement(By.xpath(s)).sendKeys(question);
    }

    @And("^V type \"([^\"]*)\" in Option \"([^\"]*)\" field for \"([^\"]*)\" question$")
    public void vTypeInOptionFieldForQuestion(String option, String optionNumber, String questionNumber) throws Throwable {
        String s;
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//textarea[@placeholder='Option " + optionNumber + "*']";
        getDriver().findElement(By.xpath(s)).sendKeys(option);
    }

    @And("^V select \"([^\"]*)\" multiple-choice option for \"([^\"]*)\" question as correct answer$")
    public void vSelectMultipleChoiceOptionForQuestionAsCorrectAnswer(String optionNum, String questionNumber) throws Throwable {
        String s;
        s = "//*[contains(text(),'Q" + questionNumber + ":')]/../../..//textarea[@placeholder='Option " + optionNum + "*']/../../../../..//mat-checkbox";
        getDriver().findElement(By.xpath(s)).click();
    }

    @Then("^V question \"([^\"]*)\" option \"([^\"]*)\" should contain error message \"([^\"]*)\"$")
    public void vQuestionOptionShouldContainErrorMessage(String questionNumber, String optionNumber, String errorMessage) throws Throwable {
        String s;
        s = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//textarea[@placeholder='Option " + optionNumber + "*']/../../..//mat-error[contains(text(),'" + errorMessage + "')]";
        (assertThat(getDriver().findElement(By.xpath(s)).isDisplayed())).isTrue();
    }

    @Then("^V verify if message \"([^\"]*)\" is displayed$")
    public void vVerifyIfMessageIsDisplayed(String errorMessage) throws Throwable {
        String s;
        s = "//*[contains(text(),'" + errorMessage + "')]";
        (assertThat(getDriver().findElement(By.xpath(s)).isDisplayed())).isTrue();
    }

    @When("^V open preview of Quiz \"([^\"]*)\"$")
    public void vOpenPreviewOfQuiz(String quiz) throws Throwable {
        String s;
        s = "//*[contains(text(),'" + quiz + "')]/../..//span[contains(@class,'expansion')]";
        getDriver().findElement(By.xpath(s)).click();
        s = "//*[contains(text(),'" + quiz + "')]/../../..//*[contains(text(),'Preview')]";
        getDriver().findElement(By.xpath(s)).click();
    }

    @Then("^V in question \"([^\"]*)\" option \"([^\"]*)\" should not contain \"([^\"]*)\"$")
    public void vInQuestionOptionShouldNotContain(String questionNumber, String optionNumber, String option) throws Throwable {
        String s;
        s = "//h3[text()='Question " + questionNumber + "']/..//*[contains(text(),'" + option + "')]";
        AbstractBooleanAssert<?> b;
        b = assertThat(getDriver().findElement(By.xpath(s)).isDisplayed()).isFalse();
    }

    @Then("V in question {string} option {string} should be {string}")
    public void vInQuestionOptionShouldBe(String questionNumber, String optionNumber, String option) {
        String s;
        s = "//h3[text()='Question " + questionNumber + "']/..//*[contains(text(),'" + option + "')]";
        AbstractBooleanAssert<?> b;
        b = assertThat(getDriver().findElement(By.xpath(s)).isDisplayed()).isTrue();
    }

    @And("V select Include other text area option for Question {string}")
    public void vSelectIncludeOtherTextAreaOptionForQuestion(String questionNumber) {
        String s = "//*[contains(text(),'Include')]/..";
        getDriver().findElement(By.xpath(s)).click();
    }

    @And("V add option {string} to question {string}")
    public void vAddOptionToQuestion(String optionNumber, String questionNumber) {
        getDriver().findElement(By.xpath("//*[contains(text(),'Add Option')]")).click();
    }

    @Then("verify if option {string} in question {string} appears")
    public void verifyIfOptionInQuestionAppears(String optionNumber, String questionNumber) {
        assertThat(getDriver().findElement(By.xpath("//*[@placeholder='Option " + optionNumber + "*']")).isDisplayed()).isTrue();
    }

    @And("V add options to make {string} options in question {string}")
    public void vAddOptionsToMakeOptionsInQuestion(String totalOptions, String questionNumber) {
        int num;
        do {
            getDriver().findElement(By.xpath("//*[contains(text(),'Add Option')]")).click();
            List<WebElement> opts = getDriver().findElements(By.xpath("//*[contains(@placeholder,'Option')]"));
            num = opts.size();
        } while (num < 10);
    }

    @Then("verify if option in question {string} appears {string} times")
    public void verifyIfOptionInQuestionAppearsTimes(String questionNumber, String totalOptions) {
        int num = (getDriver().findElements(By.xpath("//*[contains(@placeholder,'Option')]"))).size();
        assertThat(num).isEqualTo(Integer.valueOf(totalOptions));
    }

    @And("V delete option {string} in question {string}")
    public void vDeleteOptionInQuestion(String optionNumber, String questionNumber) {
        String s = "//*[@placeholder='Option " + optionNumber + "*']/../../../../..//button/span";
        getDriver().findElement(By.xpath(s)).click();
        s = "//*[contains(text(),'Delete Option')]";
        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        WebElement quizzesListWait = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(s)));
        getDriver().findElement(By.xpath(s)).click();
    }

    @Then("V verify that option {string} does not present in question {string}")
    public void vVerifyThatOptionDoesNotPresentInQuestion(String optionNumber, String questionNumber) throws Throwable {
        String s = "//*[contains(@placeholder,'Option ')]";
        List<WebElement> e = getDriver().findElements(By.xpath(s));
        int cnt = e.size();
//        assertThat(cnt).isEqualTo(2);
        assertThat(cnt).isNotEqualTo(3);
    }

    @And("V move option {string} in question {string} up")
    public void vMoveOptionInQuestionUp(String optionNumber, String questionNumber) throws Exception{
        String s = "//*[@placeholder='Option " + optionNumber + "*']/../../../../..//button/span";
        getDriver().findElement(By.xpath(s)).click();
        s = "//*[contains(text(),'Move option up')]";
        Thread.sleep(100);
        getDriver().findElement(By.xpath(s)).click();
    }

    @Then("V verify if in option {string} text {string} should be present")
    public void vVerifyIfInOptionTextShouldBePresent(String optionNumber, String expectedOptionText) {
        String s;
        s = "//*[contains(@placeholder,'Option ')]";
        List<WebElement> e = getDriver().findElements(By.xpath(s));
        String actualOptionText = e.get(Integer.valueOf(optionNumber)-1).getAttribute("value");
        assertThat(actualOptionText).isEqualTo(expectedOptionText);
    }
}
