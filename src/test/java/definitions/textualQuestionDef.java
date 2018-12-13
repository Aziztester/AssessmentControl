package definitions;

import com.gargoylesoftware.htmlunit.Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;
import study.qa.automation.utils.TestContext;

import java.util.concurrent.TimeUnit;

import static study.qa.automation.utils.TestContext.getDriver;
import static org.assertj.core.api.Assertions.assertThat;


public class textualQuestionDef {
    @Given("^I go to Login page and login as a teacher$")
    public void iGoToLoginPageAndLoginAsATeacher() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        getDriver().findElement(By.xpath("//*[@id='mat-input-0']")).sendKeys("lfelipe@gag16dotw7t.tk");
        getDriver().findElement(By.xpath("//*[@id='mat-input-1']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
        Thread.sleep(5000);
    }

    @When("^I create a quiz with text \"([^\"]*)\"$")
    public void iCreateAQuizWithText(String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("$$000SQA1auto_DONT_TOUCH");
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys(arg0);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(6000);

    }

    @Then("^I verify that the quiz is in the List of Qiuzzes$")
    public void iVerifyThatTheQuizIsInTheListOfQiuzzes() throws Throwable {
        //Assertions.assertThat(getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]")).getText().contains("$$000SQA1auto_DONT_TOUCH"));
        String quiz = getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]")).getText();
        assertThat(quiz).contains("$$000SQA1auto_DONT_TOUCH");

    }

         //DELETING
    @And("^I delete the quiz$")
    public void iDeleteTheQuiz() throws Throwable {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Textual Question: With Show-stopper')]")).click();
        getDriver().findElement(By.xpath("/span[@class='mat-expansion-indicator ng-tns-c23-432 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).click();
        getDriver().findElement(By.xpath("//div[@id='cdk-accordion-child-205']//span[@class='mat-button-wrapper'][contains(text(),'Delete')]")).click();
        Thread.sleep(3000);


    }

    @When("^I create a quiz with (\\d+) characters$")
    public void iCreateAQuizWithCharacters(int arg0) throws Throwable {
        String t = "software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance s";
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("$$000SQA1auto_DONT_TOUCH");
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys(t);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(6000);

    }

    @When("^I create a quiz with empty text field$")
    public void iCreateAQuizWithEmptyTextField() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("$$000SQA1auto_DONT_TOUCH");
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();

    }

    @Then("^I verify there is an error message$")
    public void iVerifyThereIsAnErrorMessage() throws Throwable {
        String error = getDriver().findElement(By.xpath("//*[@class='mat-expansion-panel-header-title error']/../../..//*[contains(text(),'This field is required')]")).getText();
        assertThat(error).contains("This field is required");
    }


    @Then("^I verify that the leading spaces was truncated$")
    public void iVerifyThatTheLeadingSpacesWasTruncated() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Preview')]")).click();
        String text = getDriver().findElement(By.xpath("//h3[contains(text(),'Leading')]")).getText();
        assertThat(text).isEqualToIgnoringCase("LeadingSpace");
        getDriver().findElement(By.xpath("//*[contains(text(),'Close')]")).click();
        Thread.sleep(4000);

    }

    @Then("^I verify than the trailing spaces was truncated$")
    public void iVerifyThanTheTrailingSpacesWasTruncated() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1_TRAILING_DONT_TOUCH')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1_TRAILING_DONT_TOUCH')]/../../..//*[contains(text(),'Preview')]")).click();
        String text = getDriver().findElement(By.xpath("//h3[contains(text(),'TrailingSpace')]")).getText();
        assertThat(text).isEqualToIgnoringCase("TrailingSpace");
        getDriver().findElement(By.xpath("//*[contains(text(),'Close')]")).click();
        Thread.sleep(4000);
    }

    @And("^I delete the truncated quiz$")
    public void iDeleteTheTruncatedQuiz() throws Throwable {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1_TRAILING_DONT_TOUCH')]/../../..//*[contains(text(),'Delete')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
        Thread.sleep(4000);

    }

    @Then("^I verify that the whitespaces was truncated$")
    public void iVerifyThatTheWhitespacesWasTruncated() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Preview')]")).click();
        String text = getDriver().findElement(By.xpath("//h3[contains(text(),'Whitespace')]")).getText();
        assertThat(text).isEqualToIgnoringCase("Whitespace character");
        getDriver().findElement(By.xpath("//*[contains(text(),'Close')]")).click();
        Thread.sleep(4000);

    }

    @And("^I create a quiz with whitespaces only$")
    public void iCreateAQuizWithWhitespacesOnly() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("$$000SQA1_WHITE_SPACESONLY");
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys("     ");
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(6000);
    }

    @Then("^I verify if the quiz was created$")
    public void iVerifyIfTheQuizWasCreated() throws Throwable {
        String quiz = getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1_WHITE_SPACESONLY')]")).getText();
        assertThat(quiz).isNotEqualToIgnoringCase("$$000SQA1_WHITE_SPACESONLY");
    }


    @When("^I create a quiz with one thousand and one characters$")
    public void iCreateAQuizWithOneThousandAndOneCharacters() throws Throwable {
        String t = "ssoftware quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance s";
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("$$000SQA1auto_1001");
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys(t);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(6000);
    }

    @Then("^I verify if quiz with one thousand and one characters was created$")
    public void iVerifyIfQuizWithOneThousandAndOneCharactersWasCreated() throws Throwable {
        String quiz = getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1auto_1001')]")).getText();
        assertThat(quiz).isNotEqualToIgnoringCase("$$000SQA1auto_1001");
    }

    @When("^I create a quiz switching to the next line with Enter$")
    public void iCreateAQuizSwitchingToTheNextLineWithEnter() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("$$000SQA1auto_Enter_DONT_TOUCH");
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys("o");
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys(Keys.ENTER);
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys("n");
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys(Keys.ENTER);
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys("e");
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys(Keys.ENTER);
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys(Keys.ENTER);
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys("line");
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(6000);

    }

    @Then("^I verify if text is written in one line$")
    public void iVerifyIfTextIsWrittenInOneLine() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1auto_Enter_DONT_TOUCH')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1auto_Enter_DONT_TOUCH')]/../../..//*[contains(text(),'Preview')]")).click();
        String text = getDriver().findElement(By.xpath("//h3[contains(text(),'line')]")).getText();
        assertThat(text).isEqualToIgnoringCase("o n e line");
        getDriver().findElement(By.xpath("//*[contains(text(),'Close')]")).click();
        Thread.sleep(4000);
    }

    @And("^I delete created quiz$")
    public void iDeleteCreatedQuiz() throws Throwable {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1auto_Enter_DONT_TOUCH')]/../../..//*[contains(text(),'Delete')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
        Thread.sleep(4000);
    }

    @When("^I create a quiz with trailing space$")
    public void iCreateAQuizWithTrailingSpace() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("$$000SQA1_TRAILING_DONT_TOUCH");
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys("TrailingSpace⠀⠀ ");
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(6000);
    }

    @When("^I create a quiz with Whitespaces inside$")
    public void iCreateAQuizWithWhitespacesInside() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("$$000SQA1_SPACES_inside_TOUCH");
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys("TrailingSpace⠀⠀ ");
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(6000);
    }

    @And("^I delete quiz with spaces$")
    public void iDeleteQuizWithSpaces() throws Throwable {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1_SPACES_inside_TOUCH')]/../../..//*[contains(text(),'Delete')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
        Thread.sleep(4000);;
    }

    @And("^I delete the quiz with leading spaces$")
    public void iDeleteTheQuizWithLeadingSpaces() throws Throwable {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Delete')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
        Thread.sleep(3000);
    }

    @When("^I delete quizzes$")
    public void iDeleteQuizzes() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        //String quiz = getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1')]")).getText();
        //if (quiz.equals("$$000SQA1auto_1001")){
        //}
        getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1')]/../../..//*[contains(text(),'Delete')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
        Thread.sleep(4000);
        getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1')]/../../..//*[contains(text(),'Delete')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
        Thread.sleep(4000);
        getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1')]/../../..//*[contains(text(),'Delete')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
        Thread.sleep(4000);
        getDriver().findElement(By.xpath("//*[contains(text(),'$$000SQA1')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'$$000SQA1')]/../../..//*[contains(text(),'Delete')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
        Thread.sleep(4000);

    }

    @Given("^I open urllll$")
    public void iOpenUrllll() throws Throwable {

    }
}

