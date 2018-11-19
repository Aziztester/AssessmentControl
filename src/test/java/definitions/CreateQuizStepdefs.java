package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.xpath.operations.Equals;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class CreateQuizStepdefs {
    @Then("^I click on Quizzes$")
    public void iClickOnQuizzes() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
    }

    @Then("^I click on Create Quizzes$")
    public void iClickOnCreateQuizzes() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
    }

    @Then("^I clicked on Submit button$")
    public void iClickedOnSubmitButton() throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-2']")).click();
    }

    @Then("^I verify url \"([^\"]*)\"$")
    public void iVerifyUrl(String urlquiz) throws Throwable {
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, urlquiz );
        System.out.println("Current URL : " + URL);
        System.out.println("Required URL : " + urlquiz);

    }

    @Then("^I write the Quiz title as \"([^\"]*)\"$")
    public void iWriteTheQuizTitleAs(String title1) throws Throwable {
        getDriver().findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(title1);

    }

    @Then("^I click on Add Question$")
    public void iClickOnAddQuestion() throws Throwable {
        getDriver().findElement(By.xpath("//form/div/button[@type='button']/span[@class='mat-button-wrapper']")).click();

    }

    @Then("^I choose type of question as \"([^\"]*)\"$")
    public void iChooseTypeOfQuestionAs(String QuestionType) throws Throwable {

        if (QuestionType.equalsIgnoreCase("Textual")) {
            assertThat(getDriver().findElement(By.xpath("//mat-expansion-panel-header[@aria-expanded='true']//../div//label//div[contains(text(),'Textual')]")).isDisplayed()).isTrue();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//mat-expansion-panel-header[@aria-expanded='true']//../div//label//div[contains(text(),'Textual')]")).click();
            System.out.println(QuestionType);
            System.out.println();
        } else if (QuestionType.equalsIgnoreCase("Single-Choice")) {
            assertThat(getDriver().findElement(By.xpath("//mat-expansion-panel-header[@aria-expanded='true']//../div//label//div[contains(text(),'Single-Choice')]")).isDisplayed()).isTrue();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//mat-expansion-panel-header[@aria-expanded='true']//../div//label//div[contains(text(),'Single-Choice')]")).click();
            System.out.println(QuestionType);
            System.out.println();
        } else {
            assertThat(getDriver().findElement(By.xpath("//mat-expansion-panel-header[@aria-expanded='true']//../div//label//div[contains(text(),'Multiple-Choice')]")).isDisplayed()).isTrue();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//mat-expansion-panel-header[@aria-expanded='true']//../div//label//div[contains(text(),'Multiple-Choice')]")).click();
            System.out.println(QuestionType);
            System.out.println();
        }
//        Thread.sleep(3000);

    }

    @Then("^I typed Question \"([^\"]*)\"$")
    public void iTypedQuestion(String quest) throws Throwable {

        assertThat(getDriver().findElement(By.xpath("//mat-form-field[contains(@class,'ng-invalid')]//textarea[@placeholder='Question *']")).isDisplayed()).isTrue();
        getDriver().findElement(By.xpath("//mat-form-field[contains(@class,'ng-invalid')]//textarea[@placeholder='Question *']")).sendKeys(quest);

    }

    @And("^I put the option as \"([^\"]*)\"$")
    public void iPutTheOptionAs(String opt) throws Throwable {

        assertThat(getDriver().findElement(By.xpath("//textarea[@formcontrolname='option']//..//span//label[contains(text(),'Option 1')]")).isDisplayed()).isTrue();
        System.out.println();
        System.out.println("Option 1 displayed");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//textarea[@formcontrolname='option']//..//span//label[contains(text(),'Option 1')]")).click();
        System.out.println("Option 1 text area clicked");
        getDriver().findElement(By.xpath("//textarea[@formcontrolname='option']//..//span//label[contains(text(),'Option 1')]")).sendKeys(opt);
        Thread.sleep(3000);

    }

    @Then("^I waited for \"([^\"]*)\" seconds$")
    public void iWaitedForSeconds(String sec) throws Throwable {
        Thread.sleep(1000);
    }




//    @And("^I clicked on Show Stopper check box$")
//    public void iClickedOnShowStopperCheckBox() throws Throwable {
//
////        assertThat(getDriver().findElement(By.xpath("//mat-form-field[contains(@class,'ng-invalid')]//..//div[@class='mat-checkbox-inner-container']")).isDisplayed()).isTrue();
//        getDriver().findElement(By.xpath("//mat-form-field[contains(@class,'ng-invalid')]//..//div/mat-checkbox/label")).click();
//        System.out.println();
//        System.out.println("Show Stopper");
//        System.out.println();
//
//
//
//    }
}

//        new WebDriverWait(getDriver(),10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[contains(@class,'ng-invalid')]")));
//        getDriver().findElement(By.xpath("//*[contains(text(), " + questno + ")]/../../..//textarea[@placeholder='Question *']")).click();
//        System.out.println();
//        System.out.println("Clicked");
//        System.out.println();
//        getDriver().findElement(By.xpath("//*[contains(text(), " + questno + ")]/../../..//textarea[@placeholder='Question *']")).sendKeys(quest);
