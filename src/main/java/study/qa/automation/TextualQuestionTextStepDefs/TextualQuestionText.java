package study.qa.automation.TextualQuestionTextStepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static study.qa.automation.utils.TestContext.getDriver;

public class TextualQuestionText {
    @Then("^Select textual radio button$")
    public void selectTextualRadioButton() throws InterruptedException { //throws Throwable ?!
        getDriver().findElement(By.xpath("//*[@id='mat-radio-2']//*[@class='mat-radio-outer-circle']")).click();
        Thread.sleep(1000);
    }

    @And("^Type text in Question \"([^\"]*)\"$")
    public void typeTextInQuestion(String questionTitle) throws Throwable {
//        getDriver().findElement(By.xpath("//*[@id='mat-input-3']")).sendKeys(questionTitle);
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(questionTitle);
        Thread.sleep(1000);
    }

    @Then("^Verify if Quiz \"([^\"]*)\" appears in the List of Quizzes$")
    public void verifyIfQuizAppearsInTheListOfQuizzes(String arg0) throws Throwable {
//        java.util.List<WebElement> elements = getDriver().findElements(By.xpath("//*[contains(text(),'" + arg0 + "')]"));
        List<WebElement> elements = getDriver().findElements(By.xpath("//*[contains(text(),'" + arg0 + "')]"));
        if (elements.size() > 0 && elements.get(0).isDisplayed()) {
            elements.get(0).click();
            Thread.sleep(1000);
            System.out.println(arg0);
            Thread.sleep(1000);
        }
    }

    @And("^Delete this quiz \"([^\"]*)\"$")
    public void deleteThisQuiz(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'" + arg0 + "')]")).isDisplayed();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']//span[@class='mat-button-wrapper'][contains(text(),'Delete')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//span[@class='mat-button-wrapper'][contains(text(),'Delete')]")).click();
        Thread.sleep(1000);
    }

    @Then("^Error messages \"([^\"]*)\" and \"([^\"]*)\"red\"([^\"]*)\" appear$")
    public void errorMessagesAndRedAppear(String arg0, String arg1, String arg2) throws Throwable {
        if (getDriver().findElement(By.xpath("//..//*[contains(text(), 'This field is required')]")).isDisplayed()) {
            System.out.println("This field is required");
        } else {
            System.out.println("Where is an error message?");
        }
        Thread.sleep(1000);

        if (getDriver().findElement(By.xpath("//div[contains(text(),'Quiz is not completed. Check highlighted with \"red\" areas')]")).isDisplayed()) {
            System.out.println("Quiz is not completed. Check highlighted with \"red\" areas");
        } else {
            System.out.println("Where is an error message?");
        }
        Thread.sleep(1000);
    }

    @And("^Push space bar five times \"([^\"]*)\" in Question$")
    public void pushSpaceBarFiveTimesInQuestion(String arg0) throws InterruptedException {
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Keys.SPACE);
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Keys.SPACE);
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Keys.SPACE);
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Keys.SPACE);
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Keys.SPACE);
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Keys.SPACE);
    }

    @And("^Type text in Question using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void typeTextInQuestionUsing(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).isDisplayed();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Keys.chord(Keys.ENTER, "o"));
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Keys.chord(Keys.ENTER, "n"));
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(Keys.chord(Keys.ENTER, "e"));
        Thread.sleep(1000);
    }

    @And("^Verify that switching to the next line input will be remove automatically$")
    public void verifyThatSwitchingToTheNextLineInputWillBeRemoveAutomatically() {
//  //div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']//span[@class='mat-button-wrapper'][contains(text(),'Preview')]
        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']//span[@class='mat-button-wrapper'][contains(text(),'Preview')]")).isDisplayed();
        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']//span[@class='mat-button-wrapper'][contains(text(),'Preview')]")).click();
        //Thread.sleep(1000);
    }

//    @And("^Push Save button give an errors messages \"([^\"]*)\" and \"([^\"]*)\"red\"([^\"]*)\"$")
//    public void pushSaveButtonGiveAnErrorsMessagesAndRed(String arg0, String arg1, String arg2) throws Throwable {
//        getDriver().findElement(By.xpath("//span[contains(text(), 'Save')]")).click();
//        Thread.sleep(1000);
//        getDriver().findElement(By.xpath("//*[@placeholder ='Question *']")).StringUtils.isBlank(arg0); //[@id = 'aria-required=false']
//        //StringUtils.isBlank(arg0);
//        if (getDriver().findElement(By.xpath("//..//*[contains(text(), 'This field is required')]")).isDisplayed()) {
//            System.out.println("This field is required");
//        } else {
//            System.out.println("Where is an error message?");
//        }
//        Thread.sleep(1000);
//
//        if (getDriver().findElement(By.xpath("//div[contains(text(),'Quiz is not completed. Check highlighted with \"red\" areas')]")).isDisplayed()) {
//            System.out.println("Quiz is not completed. Check highlighted with \"red\" areas");
//        } else {
//            System.out.println("Where is an error message?");
//        }
//        Thread.sleep(1000);
//    }

}
