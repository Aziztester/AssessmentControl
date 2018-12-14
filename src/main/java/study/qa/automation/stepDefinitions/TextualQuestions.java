package study.qa.automation.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import study.qa.automation.utils.TestContext;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class TextualQuestions {
    private String offset;
    private String xpath;

    @Given("Opened url {string}")
    public void openedUrl(String arg0) {
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
    }

    @And("Type email address {string} and password {string}")
    public void typeEmailAddressAndPassword(String arg0, String arg1) {
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("umoha@jerapah993r.gq");
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("12345");
    }

    @Then("Click on the {string} button")
    public void clickOnTheButton(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(1000);
    }

    @When("Click the element {string}")
    public void clickTheElement(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(1000);
    }

    @Then("Click quiz {string}")
    public void clickQuiz(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        Thread.sleep(1000);
    }

    @And("Type the title of Quiz  {string}")
    public void typeTheTitleOfQuiz(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Textual Questions");
        Thread.sleep(1000);
    }

    @And("Click {string}")
    public void click(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//*[@class='mat-icon material-icons']")).click();
        Thread.sleep(1000);
    }

    @And("Click Element {string}")
    public void clickElement(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']")).click();
        Thread.sleep(1000);
    }

    @Then("Typed Question {string}")
    public void typedQuestion(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-form-field[contains(@class,'ng-invalid')]//textarea[@placeholder='Question *']")).sendKeys("What is 2 X 2 ?");
        Thread.sleep(1000);
    }

    @Then("Click on Add Question")
    public void clickOnAddQuestion() throws InterruptedException {
        getDriver().findElement(By.xpath("//form/div/button[@type='button']/span[@class='mat-button-wrapper']")).click();
        Thread.sleep(1000);
    }

    @Then("Choose type of question as {string}")
    public void chooseTypeOfQuestionAs(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-radio-button[@id='mat-radio-6']//div[@class='mat-radio-outer-circle']")).click();
        Thread.sleep(1000);
    }

    @And("Type Question {string}")
    public void typeQuestion(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-form-field[contains(@class,'ng-invalid')]//textarea[@placeholder='Question *']")).sendKeys("What is 3 X 3 ?");
        Thread.sleep(1000);
    }

    @Then("Click on Add Question {int}")
    public void clickOnAddQuestion(int arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        Thread.sleep(1000);
    }


    @And("Select type of question as {string}")
    public void selectTypeOfQuestionAs(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-radio-button[@id='mat-radio-10']//div[@class='mat-radio-outer-circle']")).click();
        Thread.sleep(1000);
    }


    @And("Type {int} Question {string}")
    public void typeQuestion(int arg0, String arg1) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-form-field[contains(@class,'ng-invalid')]//textarea[@placeholder='Question *']")).sendKeys("What is 4 X 4 ?");
        Thread.sleep(1000);
    }

    @Then("Click  Add Question {int}")
    public void clickAddQuestion(int arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        Thread.sleep(1000);
    }

    @And("Select {string}type of question")
    public void selectTypeOfQuestion(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-radio-button[@id='mat-radio-14']//div[@class='mat-radio-outer-circle']")).click();
        Thread.sleep(1000);
    }

    @And("Type {int}th Question {string}")
    public void typeThQuestion(int arg0, String arg1) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-form-field[contains(@class,'ng-invalid')]//textarea[@placeholder='Question *']")).sendKeys("What is 5 X 5 ?");
        Thread.sleep(1000);
    }

    @Then("Click add Question {int}")
    public void clickAdd5Question(int arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        Thread.sleep(1000);
    }

    @And("Select {string} type of question")
    public void selectTypeOf5Question(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-radio-button[@id='mat-radio-18']//div[@class='mat-radio-outer-circle']")).click();
        Thread.sleep(1000);
    }

    @Then("Type  Question {string}")
    public void type5Question(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//mat-form-field[contains(@class,'ng-invalid')]//textarea[@placeholder='Question *']")).sendKeys("What is 6 X 6 ?");
        Thread.sleep(1000);
    }

    @Then("Click the {string} button")
    public void clickTheButton(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//div[@class='form-controls-container ng-star-inserted']//div[@class='controls']//button[2]")).click();
        Thread.sleep(1000);
    }

    @Then("Select the Quiz")
    public void selectTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'List of Quizzes')]/..//*[contains(text(),'Textual Questions')]")).click();
        Thread.sleep(1000);
    }


    @And("Click Delete")
    public void clickDelete() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'Textual Questions')]/../../..//*[contains(text(),'Delete')]")).click();
        Thread.sleep(5000);
    }

    @Then("Click the string {string}")
    public void clickTheString(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//button[2]")).click();
        Thread.sleep(5000);
    }
}
