package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static study.qa.automation.utils.TestContext.getDriver;

public class sergBellsStepDefs {
    @Then("^Verify that SergBells TestQuiz \"([^\"]*)\" was assigned$")
    public void verifyThatSergBellsTestQuizWasAssigned(String sergBellsquiz) throws Throwable {
        String xpathVar = "//h4[contains(text(), 'My Assignment')]/..//*[contains(text(), '" + sergBellsquiz + "')]";
        WebElement quiz = getDriver().findElement(By.xpath(xpathVar));
        String textFromQuiz = quiz.getText();
        Assert.assertTrue(textFromQuiz.contains(sergBellsquiz));
        String name = getDriver().findElement(By.xpath("//div[@class='info']//h3")).getText();
        if (textFromQuiz.contains(sergBellsquiz)) {
            System.out.println(name + " get assignment. ");
        }
    }

    @Given("^Wait \"([^\"]*)\" seconds$")
    public void waitSeconds(int seconds) throws Throwable {
        Thread.sleep(seconds*1000);
    }

    @And("^Delete SergBells TestQuiz with name \"([^\"]*)\"$")
    public void deleteSergBellsTestQuizWithName(String sergBellsquiz) throws Throwable {
        String xpathVar = "//*[contains(text(), '" + sergBellsquiz + "')]";
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(1000);

        int quizzes = getDriver().findElements(By.xpath(xpathVar)).size();
        for (int i = 0; i < quizzes; i++) {
            getDriver().findElement(By.xpath(xpathVar)).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath(xpathVar + "/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(1000);

        }
    }

    @And("^Delete SergBells TestAssignments with name \"([^\"]*)\"$")
    public void deleteSergBellsTestAssignmentsWithName(String sergBellsAssignment) throws Throwable {
        String xpathVar = "//*[contains(text(), '" + sergBellsAssignment + "')]";
        getDriver().findElement(By.xpath("//h5[text()='Assignments']")).click();
        Thread.sleep(1000);
        int countAssignments = getDriver().findElements(By.xpath(xpathVar + "/..//*[contains(text(), 'more_vert')]")).size();
        Thread.sleep(1000);
        if (countAssignments != 0) {
            getDriver().findElement(By.xpath(xpathVar + "//..//*[contains(text(), 'more_vert')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(1000);
        }
    }



}
