package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static study.qa.automation.utils.TestContext.getDriver;

public class DefTest3_18 {
    @And("^Select the first option as correct answer$")
    public void selectTheFirstOptionAsCorrectAnswer() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'Yes')]")).click();
        Thread.sleep(3000);
    }

    @And("^Click Logout on the left navigation panel$")
    public void clickLogoutOnTheLeftNavigationPanel() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'Log Out')]")).click();
        Thread.sleep(2000);
    }

    @Then("^Verify the Quiz \"([^\"]*)\" was submitted by student$")
    public void verifyTheQuizWasSubmittedByStudent(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//")).click();
        throw new PendingException();
    }

    @And("^Click quiz \"([^\"]*)\" on List of Assignments window tab$")
    public void clickQuizOnListOfAssignmentsWindowTab(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'PALOALTO')]/..//*[contains(text(), 'more_vert')]")).click();
        Thread.sleep(4000);
        throw new PendingException();
    }

    @And("^Delete assignment with quiz name \"([^\"]*)\" from list$")
    public void deleteAssignmentWithQuizNameFromList(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h5[text()='Assignments']")).click();
        Thread.sleep(1000);

        int countAssignments = getDriver().findElements(By.xpath("//*[contains(text(),'HelloWorld')]/..//*[contains(text(), 'more_vert')]")).size();
        Thread.sleep(1000);

        if (countAssignments != 0) {
            getDriver().findElement(By.xpath("//*[contains(text(),'HelloWorld')]/..//*[contains(text(), 'more_vert')]")).click();
            Thread.sleep(1000);

            getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(1000);
            throw new PendingException();
        }
    }

    @When("^Delete quiz with name \"([^\"]*)\" from list$")
    public void deleteQuizWithNameFromList(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Delete quiz with name \"([^\"]*)\" from list tab$")
    public void deleteQuizWithNameFromListTab(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(1000);

        int quizzes = getDriver().findElements(By.xpath("//*[contains(text(), 'HelloWorld')]")).size();
        for (int i = 0; i < quizzes; i++) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'HelloWorld')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'HelloWorld')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(1000);

            getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(1000);

            throw new PendingException();
        }
    }

    @And("^Click Logout$")
    public void clickLogout() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
    }

    @And("^Delete the quiz$")
    public void deleteTheQuiz() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]//button[@class='mat-menu-item']")).click();
    }

    @And("^Click on Quiz \"([^\"]*)\"$")
    public void clickOnQuiz(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'PALOALTO')]")).click();
        Thread.sleep(4000);
        getDriver().findElement(By.xpath("//*[contains(text(),'PALOALTO')]/../../..//span[contains(text(),'Delete')]")).click();
        Thread.sleep(2000);
    }

    @And("^Delete the quiz at the end$")
    public void deleteTheQuizAtTheEnd() throws InterruptedException {
        getDriver().findElement(By.xpath("//h1[contains(text(), 'Confirmation')]/../..//button/span[contains(text(), 'Delete')]")).click();
        Thread.sleep(4000);

    }

    @And("^Click on Assignments on left navigational panel$")
    public void clickOnAssignmentsOnLeftNavigationalPanel() throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        Thread.sleep(1000);
    }

    @And("^Click on Assignment \"([^\"]*)\"$")
    public void clickOnAssignment(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'PALOALTO')]/../../..//*[contains(text(),'more_vert')]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();
        Thread.sleep(2000);
    }

    @And("^Confirm the pop out$")
    public void confirmThePopOut() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'Confirm')]/../..//*[contains(text(),'Delete')]")).click();
        Thread.sleep(3000);
    }
}