package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.QuizesPage;
import study.qa.automation.utils.TestContext;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class TeacherCreateQuizzesPODef {

    @When("^Teacher Create Quiz \"([^\"]*)\" with (\\d+) Textual, (\\d+) Single-Choice, (\\d+) Multiple-Choice questions$")
    public void teacherCreateQuizWithTextualSingleChoiceMultipleChoiceQuestions(String arg0, int arg1, int arg2, int arg3) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        QuizesPage page = new QuizesPage();
        page.clickQuizzes();
        page.buttonCreateNewQuiz();
        page.fillTitleofQuiz(arg0);
        page.clickAddQuestion();
        Thread.sleep(1000);
        page.clickTextual("Q1");
        String text1 = "Explain SDLC methodology?";
        page.fillQuestion("Q1",text1);
        Thread.sleep(1000);
        page.clickAddQuestion();
        Thread.sleep(1000);
        page.clickTextual("Q2");
        page.fillQuestion("Q2",text1);
        page.clickAddQuestion();
        Thread.sleep(1000);
        page.clickTextual("Q3");
        page.fillQuestion("Q3",text1);
        //Singlechoice
        page.clickAddQuestion();
        Thread.sleep(1000);
        page.clickSingleChoise("Q4");
        String text2 = ("What is a Test Scenario?");
        String option1 = "Identifying all the possible areas to be tested";
        String option2 = "specifice areas only";
        page.fillQuestion("Q4",text2);
        page.fillOption1("Q4",option1);
        page.fillOption2("Q4",option2);
        Thread.sleep(1000);
        page.clickopt1Q4();
        Thread.sleep(1000);
        page.clickAddQuestion();
        Thread.sleep(1000);
        page.clickSingleChoise("Q5");
        page.fillQuestion("Q5",text2);
        page.fillOption1("Q5",option1);
        page.fillOption2("Q5",option2);
        page.clickopt1Q5();
        Thread.sleep(2000);
        page.clickAddQuestion();
        Thread.sleep(1000);
        page.clickSingleChoise("Q6");
        page.fillQuestion("Q6",text2);
        page.fillOption1("Q6",option1);
        page.fillOption2("Q6",option2);
        page.clickopt1Q6();
        Thread.sleep(1000);
        //MultipleChoice
        page.clickAddQuestion();
        String text3 = ("What is a prime objective of a bug tracking database?");
        String option3 = "Tracking the bugs";
        String option4 = "To get a bug fixed";
        Thread.sleep(5000);
        page.clickMultipleChoise("Q7");
        page.fillQuestion("Q7",text3);
        page.fillOption1("Q7",option3);
        page.fillOption2("Q7",option4);
        Thread.sleep(5000);
        getDriver().findElement(By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")).click();
        Thread.sleep(5000);
        page.clickAddQuestion();
        Thread.sleep(5000);
        page.clickMultipleChoise("Q8");
        page.fillQuestion("Q8",text3);
        page.fillOption1("Q8",option3);
        page.fillOption2("Q8",option4);
        Thread.sleep(5000);
        getDriver().findElement(By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[4]")).click();
        Thread.sleep(5000);
        page.clickAddQuestion();
        Thread.sleep(5000);
        page.clickMultipleChoise("Q9");
        page.fillQuestion("Q9",text3);
        page.fillOption1("Q9",option3);
        page.fillOption2("Q9",option4);
        Thread.sleep(5000);
        getDriver().findElement(By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[6]")).click();
        Thread.sleep(5000);
        page.clickSave();
        Thread.sleep(5000);

    }

    @Then("^I verify that the quiz \"([^\"]*)\" is in the List of Qiuzzes$")
    public void iVerifyThatTheQuizIsInTheListOfQiuzzes(String arg0) throws Throwable {
        String quiz = getDriver().findElement(By.xpath("//*[contains(text(),'"+arg0+"')]")).getText();
        assertThat(quiz).contains(arg0);
    }

    @And("^I delete \"([^\"]*)\" quiz$")
    public void iDeleteQuiz(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'"+arg0+"')]")).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'"+arg0+"')]/../../..//*[contains(text(),'Delete')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
        Thread.sleep(4000);
    }


    @When("^I check if quiz \"([^\"]*)\" in the list of quizes If so I delete those quizzes$")
    public void iCheckIfQuizInTheListOfQuizesIfSoIDeleteThoseQuizzes(String arg0) throws Throwable {
        QuizesPage page = new QuizesPage();
        page.clickQuizzes();
        Thread.sleep(5000);
        boolean x = getDriver().findElement(By.xpath("//*[contains(text(),'"+arg0+"')]")).isDisplayed();
        assertThat(x).isFalse();
        //String q = getDriver().findElement(By.xpath("//*[contains(text(),'"+arg0+"')]")).getText();
//        while (q.equals(arg0)){
//            getDriver().findElement(By.xpath("//*[contains(text(),'"+arg0+"')]")).click();
//            getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'"+arg0+"')]/../../..//*[contains(text(),'Delete')]")).click();
//            getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
            Thread.sleep(5000);
        }



    }





