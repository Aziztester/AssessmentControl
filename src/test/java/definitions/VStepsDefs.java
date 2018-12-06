package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.AbstractBooleanAssert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
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

//    @Then("V in question {string} option {string} should be {string}")
    @Then("^V in question \"([^\"]*)\" option \"([^\"]*)\" should be \"([^\"]*)\"$")
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

    @When("V open Assignments list")
    public void vOpenAssignmentsList() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Assignments')]")).click();
        vWaitFor("//*[contains(text(),'List of Assignments')]");
    }

    @And("V click on element with xpath {string}")
    public void vClickOnElementWithXpath(String xpath) {
        getDriver().findElement(By.xpath(xpath)).click();
    }

    @And("V wait for {int} msec")
    public void vWaitForMsec(int time) throws Exception {
        Thread.sleep(time);
    }

    @And("V assign quiz {string} to student {string}")
    public void vAssignQuizToStudent(String quizName, String studentName) throws InterruptedException {
        Boolean found = false;
        int i;
        String pathStudents = "//div[@class='mat-list-text']";
        List<WebElement> studentList = getDriver().findElements(By.xpath(pathStudents));
        for (i = 0; i < studentList.size(); i++){
            String currentStudentName = studentList.get(i).getText();
            if (currentStudentName.contains(studentName)){
                found = true;
                break;
            }
        }
        assertThat(found).isTrue();
        getDriver().findElement(By.xpath("(" + pathStudents + ")[" + (i+1) + "]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Select Quiz To Assign')]")).click();
        List<WebElement> quizList = getDriver().findElements(By.xpath("//mat-option"));
        found = false;
        for (i = 0; i < quizList.size(); i++){
            if (quizList.get(i).getText().trim().equals(quizName)){
                found = true;
                break;
            }
        }
        assertThat(found).isTrue();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("("+"//mat-option" + ")[" + (i+1) + "]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@type='submit']")).click();
    }

    @Then("V verify if quiz {string} assigned to student {string} in the List of Assignments")
    public void vVerifyIfQuizAssignedToStudentInTheListOfAssignments(String quizName, String studentName) throws Exception {
        int i;
        String s, path;
        boolean isAssignmeentExist = false;
        String pathAssignments = "//mat-expansion-panel";
        List<WebElement> assignments = getDriver().findElements(By.xpath(pathAssignments));
        for (i=0; i<assignments.size(); i++){
            path = "(//mat-expansion-panel)[" + (i+1) + "]";
            s = "(" + path + "//mat-panel-title)[3]";
            s = getDriver().findElement(By.xpath(s)).getText();
            s = s.substring("Quiz: ".length());
            if (s.equals(quizName)){
                vWaitForMsec(500);
                getDriver().findElement(By.xpath(path)).click();
                path = "(//*[@role='region'])["+ (i+1) + "]//td[@class='name']";
                vWaitForMsec(500);
                s = getDriver().findElement(By.xpath(path)).getText();
                if (s.equals(studentName)){
                    isAssignmeentExist = true;
                    break;
                }
            }
        }
        assertThat(isAssignmeentExist).isTrue();
    }

    @And("V create {int} textual question {string}")
    public void vCreateTextualQuestion(int numbersOfQuestions, String questionText) throws InterruptedException {
        String path;
        int questionNumber = 1;
//        now just for 1 question
        path = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//div[contains(text(), 'Textual')]";
        Thread.sleep(300);
        getDriver().findElement(By.xpath(path)).click();
        path = "//*[contains(text(), 'Q" + questionNumber + ":')]/../../..//*[@placeholder='Question *']";
        getDriver().findElement(By.xpath(path)).sendKeys(questionText);
    }

    @And("V verify {string} is not displayed")
    public void vVerifyIsNotDisplayed(String path) {
        assertThat(getDriver().findElements(By.xpath(path))).hasSize(0);
    }

    @And("V type {string} into the element with xpath {string}")
    public void vTypeIntoTheElementWithXpath(String text, String xpath) {
        getDriver().findElement(By.xpath(xpath)).sendKeys(text);
    }
    @Then("^I switch to new window$")
    public void iSwitchToNewWindow() {
        Iterator<String> iterator = getDriver().getWindowHandles().iterator();
        String newWindow = iterator.next();
        while(iterator.hasNext()) {
            newWindow = iterator.next();
        }
        getDriver().switchTo().window(newWindow);
    }

    @And("V login to yandex mail with login {string} and password {string} and activate account")
    public void vLoginToYandexMailWithLoginAndPasswordAndActivateAccount(String login, String password) {
        getDriver().findElement(By.xpath("//*[@name='login']")).sendKeys(login);
        String passwordPath = "//*[@name='passwd']";
        List<WebElement> el = getDriver().findElements(By.xpath(passwordPath + "[@class='passport-Input-Controller']"));
        if ( el.size() == 0){
            getDriver().findElement(By.xpath("//*[@type='submit']")).click();
        }
        vWaitFor(passwordPath);
        getDriver().findElement(By.xpath(passwordPath)).sendKeys(password);
        getDriver().findElement(By.xpath("//*[@type='submit']")).click();
        String mailPath = "(//div[contains(@data-key,'view=messages-item-wrap')])[1]";
        vWaitFor(mailPath);
        getDriver().findElement(By.xpath(mailPath)).click();
        getDriver().findElement(By.xpath("//a[contains(text(),'Confirm email address')]")).click();
        iSwitchToNewWindow();
        vVerifyIsDisplayed("//h4[contains(text(),'Account was Activated')]");
    }

    @And("V delete account {string}, if exist")
    public void vDeleteAccountIfExist(String account) throws Exception {
        vLoginAsTeacherWithPassword("VladimirTeacher.test@gmail.com","12345");
        vWaitFor("//p[contains(text(),'TEACHER')]");
        vVerifyIsDisplayed("//p[contains(text(),'TEACHER')]");
        String path = "//*[contains(text(),\"User's Management\")]";
        vWaitFor(path);
        getDriver().findElement(By.xpath(path)).click();
        vWaitFor(path);
        List<WebElement> student = getDriver().findElements(By.xpath("//*[contains(text(),'" + account + "')]"));
        if (student.size() > 0){
            for (int i=0; i < student.size(); i++){
                student.get(i).click();
                vWaitForMsec(1000);
                getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper']/..")).click();
                vWaitForMsec(1000);
                getDriver().findElement(By.xpath("//*[text()='delete']/..")).click();
                vWaitForMsec(1000);
                getDriver().findElement(By.xpath("//*[contains(text(),'Delete')]/..")).click();
                vWaitForMsec(1000);
            }
        }
    }

    @And("V logout")
    public void vLogout() throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]/..")).click();
        Thread.sleep(1000);
    }

//    @Then("V verify that student {string} is not in the list")
    @Then("^V verify that student \"([^\"]*)\" is not in the list$")
    public void vVerifyThatStudentIsNotInTheList(String studentName) {
        boolean found = false;
        int i;
        String pathStudents = "//div[@class='mat-list-text']";
        List<WebElement> studentList = getDriver().findElements(By.xpath(pathStudents));
        for (i = 0; i < studentList.size(); i++){
            String currentStudentName = studentList.get(i).getText();
            if (currentStudentName.contains(studentName)){
                found = true;
                break;
            }
        }
        assertThat(found).isFalse();
//
    }
}
