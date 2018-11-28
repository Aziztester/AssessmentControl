package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.qa.automation.utils.TestContext;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class vvvv {
    @When("^I open url f rf\"([^\"]*)\"$")
    public void iOpenUrlFRf(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete action
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(2000);


    }


    @Then("^I type email address and password$")
    public void iTypeEmailAddressAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("umoha@jerapah993r.gq");
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("12345");
        Thread.sleep(1000);

    }

    @Then("^I click on the element with xpath \"([^\"]*)\"$")
    public void iClickOnTheElementWithXpath(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(2000);
    }

    @Then("^I open Quizzes Tab$")
    public void iOpenQuizzesTab() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        Thread.sleep(2000);
    }

    @Then("^list of quizzes should be displayed$")
    public void listOfQuizzesShouldBeDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertThat(getDriver().findElement(By.xpath("//mat-card[@class='page mat-card ng-star-inserted']")).isDisplayed()).isTrue();
    }

    @Then("^I create a new Quiz$")
    public void iCreateANewQuiz() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        Thread.sleep(2000);
    }

    @And("^the Title of the Quize field should be displayed$")
    public void theTitleOfTheQuizeFieldShouldBeDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertThat(getDriver().findElement(By.xpath("//*[@placeholder ='Title Of The Quiz *']")).isDisplayed()).isTrue();
    }

    @And("^I type the Title into a Title of the quiz field$")
    public void iTypeTheTitleIntoATitleOfTheQuizField() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("SQA999");
        Thread.sleep(1000);
    }

    @And("^I click on Add question button$")
    public void iClickOnAddQuestionButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(1000);
    }

    @Then("^the quiz form opens$")
    public void theQuizFormOpens() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertThat(getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']")).isDisplayed()).isTrue();
    }

    @Then("^I choose Textual question type$")
    public void iChooseTextualQuestionType() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]")).click();
        Thread.sleep(1000);
    }


    @Then("^I type first textual question$")
    public void iTypeFirstTextualQuestion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is your favorite milk?");
        Thread.sleep(1000);
        for (int i = 5; i <= 10; i++){
//            getDriver().findElement(By.xpath("//*[contains(text(),'Q1:')]/../../..//div[@class='mat-slider-thumb']")).sendKeys(Character.toString((char)39));
        }


    }

    @And("^click on add a question button$")
    public void clickOnAddAQuestionButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(1000);
    }

    @Then("^I choose a (\\d+) Textual question type$")
    public void iChooseATextualQuestionType(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2')]/../../..//div[contains(text(), 'Textual')]")).click();
        Thread.sleep(1000);
    }

    @And("^I type a second question$")
    public void iTypeASecondQuestion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What do you prefer more cow milk or goat milk?");
        Thread.sleep(1000);
    }

    @And("^I click on add a question button$")
    public void iClickOnAddAQuestionButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(1000);
    }

    @Then("^I choose a Textual question type$")
    public void iChooseATextualQuestionType() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3')]/../../..//div[contains(text(), 'Textual')]")).click();
        Thread.sleep(1000);
    }

    @And("^I type a third question$")
    public void iTypeAThirdQuestion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3')]/../../..//textarea[@placeholder='Question *']")).sendKeys("Why do you love milk?");
        Thread.sleep(1000);
    }

    @And("^click on add question button$")
    public void clickOnAddQuestionButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(1000);
    }

    @When("^I choose a Single question type$")
    public void iChooseASingleQuestionType() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//div[contains(text(), 'Single-Choice')]")).click();
    }

    @Then("^aa question field appears$")
    public void aaQuestionFieldAppears() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertThat(getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']")).isDisplayed()).isTrue();
    }

    @Then("^I type a first single choice question$")
    public void iTypeAFirstSingleChoiceQuestion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is a Defect??");
        Thread.sleep(1000);
    }

    @And("^I type a first option answer$")
    public void iTypeAFirstOptionAnswer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("Any flaw or imperfection in a software work product");
        Thread.sleep(1000);
    }

    @And("^I type a second option answer$")
    public void iTypeASecondOptionAnswer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("Without any issues");
        Thread.sleep(1000);
    }

    @And("^I choose a first option as a true$")
    public void iChooseAFirstOptionAsATrue() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
            String k = n.getAttribute("value");
            System.out.println(k);
        }
        p.get(12).click();
        Thread.sleep(3000);
    }

    @And("^click on add a question button(\\d+)$")
    public void clickOnAddAQuestionButton(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(1000);
    }

    @When("^I choose a (\\d+) Single question type$")
    public void iChooseASingleQuestionType(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//div[contains(text(), 'Single-Choice')]")).click();
    }

    @Then("^I type a second single choice question$")
    public void iTypeASecondSingleChoiceQuestion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is the difference between static testing?");
        Thread.sleep(1000);
    }

    @And("^I type a first option answerr$")
    public void iTypeAFirstOptionAnswerr() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("without code executing the program is called as Static Testing.");
        Thread.sleep(1000);
    }

    @And("^I type a second option answerr$")
    public void iTypeASecondOptionAnswerr() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("with code");
        Thread.sleep(1000);
    }

    @And("^I choose a first option as a truee$")
    public void iChooseAFirstOptionAsATruee() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
//        for (int j = 0; j < p.size(); j++) {
//            WebElement n = p.get(j);
//            String k = n.getAttribute("value");
//            System.out.println(k);
//        }
//        p.get(17).click();
//        Thread.sleep(3000);
        getDriver().findElement(By.xpath("(//div[@class='mat-radio-outer-circle'])[19]")).click();
        Thread.sleep(1000);
    }

    @And("^I click on add question buttonn$")
    public void iClickOnAddQuestionButtonn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(1000);
    }

    @When("^I choose a third Single question$")
    public void iChooseAThirdSingleQuestion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//div[contains(text(), 'Single-Choice')]")).click();
        Thread.sleep(1000);
    }

    @And("^I type a third Single choice question$")
    public void iTypeAThirdSingleChoiceQuestion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is a Test Scenario?");
        Thread.sleep(1000);
    }

    @And("^I type a first option answerrr$")
    public void iTypeAFirstOptionAnswerrr() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("Identifying all the possible areas to be tested ");
        Thread.sleep(1000);
    }

    @And("^I type a second option answerrr$")
    public void iTypeASecondOptionAnswerrr() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("specifice areas only");
        Thread.sleep(1000);
    }

    @And("^I choose a first option as a trueee$")
    public void iChooseAFirstOptionAsATrueee() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
            String k = n.getAttribute("value");
            System.out.println(k);
        }
        p.get(22).click();
        Thread.sleep(3000);
    }

    @And("^I select a showstopper option$")
    public void iSelectAShowstopperOption() throws Throwable {
         getDriver().findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[9]")).click();
//        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-frame']"));
//        for (int j = 0; j < p.size(); j++) {
//            WebElement n = p.get(j);
//            String k = n.getAttribute("value");
//            System.out.println(k);
//        }
//        p.get(8).click();
//        Thread.sleep(3000);
    }

    @And("^I click on add question buttonnn$")
    public void iClickOnAddQuestionButtonnn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(2000);
    }

    @When("^I choose a first Multiple question$")
    public void iChooseAFirstMultipleQuestion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q7')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(2000);
    }


    @And("^I type a first Multiple question$")
    public void iTypeAFirstMultipleQuestion() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q7')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is a Bug?");
        Thread.sleep(1000);
    }

    @And("^I type a first option answer r$")
    public void iTypeAFirstOptionAnswerR() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q7')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("Mismatch between actual and intended behaviors of the software.");
        Thread.sleep(1000);
    }

    @And("^I type a second option answer r$")
    public void iTypeASecondOptionAnswerR() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q7')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("Some small insect that flies around.");
        Thread.sleep(2000);
    }

    @And("^I choose a first option as a true e$")
    public void iChooseAFirstOptionAsATrueE() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
            String k = n.getAttribute("value");
            System.out.println(k);
        }
        p.get(0).click();
        Thread.sleep(3000);
    }
    @Then("^I click on Add question button nn$")
    public void iClickOnAddQuestionButtonNn() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(2000);
    }

    @When("^I choose a second Multiple question$")
    public void iChooseASecondMultipleQuestion() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q8')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(2000);
    }

    @And("^I type a second Multiple question$")
    public void iTypeASecondMultipleQuestion() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q8')]/../../..//textarea[@placeholder='Question *']")).sendKeys("Are Java and Javascript same languages?");
        Thread.sleep(1000);
    }

    @And("^I type a first option answer rd$")
    public void iTypeAFirstOptionAnswerRd() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q8')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("Yes");
        Thread.sleep(1000);
    }

    @And("^I type a second option answer rd$")
    public void iTypeASecondOptionAnswerRd() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q8')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("No");
        Thread.sleep(2000);
    }

    @And("^I choose a second option as a true$")
    public void iChooseASecondOptionAsATrue() throws Throwable {
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
            String k = n.getAttribute("value");
            System.out.println(k);
        }
        p.get(3).click();
        Thread.sleep(3000);
    }

    @Then("^I click on Add question button nnn$")
    public void iClickOnAddQuestionButtonNnn() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(2000);
    }
    @When("^I choose a second Multiple question n$")
    public void iChooseASecondMultipleQuestionN() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q9')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(2000);
    }

    @And("^I type a second Multiple question nn$")
    public void iTypeASecondMultipleQuestionNn() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q9')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is a prime objective of a bug tracking database?");
        Thread.sleep(1000);
    }

    @And("^I type a first option answer rdd$")
    public void iTypeAFirstOptionAnswerRdd() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q9')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("Tracking the bugs");
        Thread.sleep(1000);
    }

    @And("^I type a second option answer rdd$")
    public void iTypeASecondOptionAnswerRdd() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q9')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("To get a bug fixed");
        Thread.sleep(2000);
    }

    @And("^I choose a second option as a true e$")
    public void iChooseASecondOptionAsATrueE() throws Throwable {
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
            String k = n.getAttribute("value");
            System.out.println(k);
        }
        p.get(5).click();
        Thread.sleep(3000);
    }

    @Then("^I click on save button$")
    public void iClickOnSaveButton() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Save')]")).click();
        Thread.sleep(2000);
    }
}