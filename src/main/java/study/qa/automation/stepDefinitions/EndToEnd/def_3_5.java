package study.qa.automation.stepDefinitions.EndToEnd;

//import cucumber.api.PendingException;
//import cucumber.api.PendingException;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static study.qa.automation.utils.TestContext.getDriver;

public class def_3_5 {
    @And("^Select Multiple-Choice Type of question$")
    public void selectMultipleChoiceTypeOfQuestion()  throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(1000);
    }

    @And("^Push Add option button (\\d+) time$")
    public void pushAddOptionButtonTime(int arg0)throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Add Option')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Add Option')]")).click();
        Thread.sleep(1000);
    }


    @And("^Type text in Options \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void typeTextInOptionsAndAndAnd(String option1, String option2, String option3, String option4) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys(option1);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys(option2);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//textarea[@placeholder='Option 3*']")).sendKeys(option3);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//textarea[@placeholder='Option 4*']")).sendKeys(option4);
        Thread.sleep(1000);
    }

    @And("^Select second and third option as correct answer$")
    public void selectSecondAndThirdOptionAsCorrectAnswer()throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox")).click();
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//textarea[@placeholder='Option 3*']/../../../../..//mat-checkbox")).click();
        Thread.sleep(1000);

    }

    @And("^Push add question$")
    public void pushAddQuestion()throws InterruptedException {
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']//span[1]")).click();
        Thread.sleep(1000);
    }
    @And("^Select Multiple-Choice Type of question (\\d+)$")
    public void selectMultipleChoiceTypeOfQuestion(int arg0)throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(1000);
    }
    @And("^Type text of Question (\\d+) \"([^\"]*)\"$")
    public void typeTextOfQuestion(int arg0, String text) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//*[@placeholder='Question *']")).sendKeys(text);
        Thread.sleep(1000);

    }
    @And("^Push Add option button for question(\\d+) (\\d+) time$")
    public void pushAddOptionButtonForQuestionTime(int arg0, int arg1)throws InterruptedException {
        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']//span[@class='mat-button-wrapper'][contains(text(),'Add Option')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']//span[@class='mat-button-wrapper'][contains(text(),'Add Option')]")).click();
        Thread.sleep(1000);

    }

    @And("^Type text(\\d+) in Options \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void typeTextInOptionsAndAndAnd(int arg0, String option1, String option2, String option3, String option4) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys(option1);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys(option2);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//textarea[@placeholder='Option 3*']")).sendKeys(option3);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//textarea[@placeholder='Option 4*']")).sendKeys(option4);
        Thread.sleep(1000);

    }
    @And("^Select First and third option as correct answer$")
    public void selectFirstAndThirdOptionAsCorrectAnswer ()throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//textarea[@placeholder='Option 1*']/../../../../..//mat-checkbox")).click();
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//textarea[@placeholder='Option 3*']/../../../../..//mat-checkbox")).click();
        Thread.sleep(1000);
    }
    @And("^Select Multiple Choice Type of Q(\\d+)$")
    public void selectMultipleChoiceTypeOfQ(int arg0)throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3:')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(1000);

    }
    @And("^Type text in Question (\\d+) \"([^\"]*)\"$")
    public void typeTextInQuestion(int arg0, String text) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3:')]/../../..//*[@placeholder='Question *']")).sendKeys(text);
        Thread.sleep(1000);
    }
//    @And("^Push Add option button for question(\\d+) (\\d+) time$")
//    public void pushAddOptionButtonforQuestionTime(int arg0, int arg1)throws InterruptedException {
//        getDriver().findElement(By.xpath("//div[@class='options ng-untouched ng-pristine ng-invalid ng-star-inserted']//span[@class='mat-button-wrapper'][contains(text(),'Add Option')]")).click();
//        getDriver().findElement(By.xpath("//div[@class='options ng-untouched ng-pristine ng-invalid ng-star-inserted']//span[@class='mat-button-wrapper'][contains(text(),'Add Option')]")).click();
//        Thread.sleep(1000);
//    }
    @And("^Type Value in Options \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void typeValueInOptionsAndAndAnd(String option1, String option2, String option3, String option4) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys(option1);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys(option2);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3:')]/../../..//textarea[@placeholder='Option 3*']")).sendKeys(option3);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3:')]/../../..//textarea[@placeholder='Option 4*']")).sendKeys(option4);
        Thread.sleep(1000);

    }

        @And("^Select Second and Forth option as correct answer$")
        public void selectSecondAndForthOptionAsCorrectAnswer ()throws InterruptedException {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3:')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox")).click();
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q3:')]/../../..//textarea[@placeholder='Option 4*']/../../../../..//mat-checkbox")).click();
            Thread.sleep(1000);
        }
    @And("^Select Multiple Choice Type Question(\\d+)$")
    public void selectMultipleChoiceTypeQuestion(int arg0)throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4:')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(1000);
    }
    @And("^Type text in question \"([^\"]*)\"$")
    public void typeTextInQuestion(String text) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4:')]/../../..//*[@placeholder='Question *']")).sendKeys(text);
        Thread.sleep(1000);
    }
    @And("^Push Add option button for Q(\\d+) (\\d+) time$")
    public void pushAddOptionButtonForQTime(int arg0, int arg1)throws InterruptedException {
        getDriver().findElement(By.xpath("//div[@class='options ng-untouched ng-pristine ng-invalid ng-star-inserted']//span[@class='mat-button-wrapper'][contains(text(),'Add Option')]")).click();
        getDriver().findElement(By.xpath("//div[@class='options ng-untouched ng-pristine ng-invalid ng-star-inserted']//span[@class='mat-button-wrapper'][contains(text(),'Add Option')]")).click();
        Thread.sleep(1000);

    }
    @And("^Type in Options \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void typeInOptionsAndAndAnd(String option1, String option2, String option3, String option4) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys(option1);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys(option2);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4:')]/../../..//textarea[@placeholder='Option 3*']")).sendKeys(option3);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4:')]/../../..//textarea[@placeholder='Option 4*']")).sendKeys(option4);
        Thread.sleep(1000);

    }

        @And("^Select First and Second option as correct answer$")
        public void selectFirstAndSecondOptionAsCorrectAnswer ()throws InterruptedException {
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4:')]/../../..//textarea[@placeholder='Option 1*']/../../../../..//mat-checkbox")).click();
            getDriver().findElement(By.xpath("//*[contains(text(), 'Q4:')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox")).click();
            Thread.sleep(1000);
        }
    @And("^Select Multi-Choice Type question(\\d+)$")
    public void selectMultiChoiceTypeQuestion(int arg0)throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(1000);
    }
    @And("^Type text Question \"([^\"]*)\"$")
    public void typeTextQuestion(String text) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//*[@placeholder='Question *']")).sendKeys(text);
        Thread.sleep(1000);
    }
    @And("^Push Add option button for Que(\\d+) (\\d+) time$")
    public void pushAddOptionButtonForQueTime(int arg0, int arg1)throws InterruptedException {
        getDriver().findElement(By.xpath("//div[@class='options ng-untouched ng-pristine ng-invalid ng-star-inserted']//span[@class='mat-button-wrapper'][contains(text(),'Add Option')]")).click();
        getDriver().findElement(By.xpath("//div[@class='options ng-untouched ng-pristine ng-invalid ng-star-inserted']//span[@class='mat-button-wrapper'][contains(text(),'Add Option')]")).click();
        Thread.sleep(1000);
    }
        @And("^Type text Options \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void typeTextOptionsAndAndAnd(String option1, String option2, String option3, String option4) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys(option1);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys(option2);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 3*']")).sendKeys(option3);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 4*']")).sendKeys(option4);
        Thread.sleep(1000);
            }
    @And("^Select Third and Forth option as correct answer$")
    public void selectThirdAndForthOptionAsCorrectAnswer ()throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 3*']/../../../../..//mat-checkbox")).click();
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 4*']/../../../../..//mat-checkbox")).click();
        Thread.sleep(1000);
    }

    @And("^Push on Save button$")
    public void pushOnSaveButton()throws InterruptedException {
        getDriver().findElement(By.xpath("//div[@class='form-controls-container ng-star-inserted']//button[2]")).click();
        Thread.sleep(1000);
    }


    @Then("^Verify that quiz name \"([^\"]*)\" was created$")
    public void verifyThatQuizNameWasCreated(String arg0) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//div[@class='quizzes']//*[contains(text(),'Manual Testing')]")).click();
        Thread.sleep(1000);
        System.out.println("Verify that quiz was created");
    }

    @And("^Delete quiz name of \"([^\"]*)\"$")
    public void deleteQuizNameOf(String quiz) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        getDriver().findElement(By.xpath("//*[contains(text(), 'Manual Testing')]/../../..//*[contains(text(), 'Delete')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(1000);

    }
}



