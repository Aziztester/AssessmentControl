package study.qa.automation.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;
import cucumber.api.java8.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.qa.automation.utils.TestContext;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static study.qa.automation.utils.TestContext.getDriver;
import static org.assertj.core.api.Assertions.assertThat;
public class TeacherCreateQuizAndAssignToSingleStudent {


    @Given("^Navigate to Web Page \"([^\"]*)\"$")
    public void navigateToWebPage(String arg0) throws Throwable {
        getDriver().get("http://local.school.portnov.com:4520/#/login");

    }

    @When("^I type E-mail in the \"([^\"]*)\" field$")
    public void iTypeEMailInTheField(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("umoha@jerapah993r.gq");

    }

    @And("^I type Password in the \"([^\"]*)\" field$")
    public void iTypePasswordInTheField(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("12345");

    }

    @And("^I push \"([^\"]*)\" button$")
    public void iPushButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

    }


    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(2000);
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
    }

    @And("^I type the Title into a \"([^\"]*)\" field$")
    public void iTypeTheTitleIntoAField(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder=\"Title Of The Quiz *\"]")).sendKeys("QA Basics");
    }

    @Then("^I push add \"([^\"]*)\"$")
    public void iPushAdd(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        Thread.sleep(2000);
    }


    @Then("^I push \"([^\"]*)\" to select type of Question as Textual$")
    public void iPushToSelectTypeOfQuestionAsTextual(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//div[@class='mat-radio-outer-circle']")).click();
        Thread.sleep(2000);
    }

    @Then("^I type the \"([^\"]*)\" as \"([^\"]*)\"$")
    public void iTypeTheAs(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//textarea[@id='mat-input-3']")).sendKeys("What is Software Quality Assurance?");
        Thread.sleep(2000);
    }

    @Then("^I check the \"([^\"]*)\" box$")
    public void iCheckTheBox(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
        Thread.sleep(2000);
    }


    @Then("^I click on add \"([^\"]*)\" button$")
    public void iClickOnAddButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']//button[@type='button']")).click();
        Thread.sleep(2000);
    }

    @Then("^I push \"([^\"]*)\" to select type of Question as \"([^\"]*)\"$")
    public void iPushToSelectTypeOfQuestionAs(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q2')]/../../..//div[contains(text(), 'Single-Choice')]")).click();
        Thread.sleep(200);
    }

    @Then("^I type the \"([^\"]*)\"$")
    public void iTypeThe(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q2')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What are different test levels?");
    }

    @Then("^I type the \"([^\"]*)\" field$")
    public void iTypeTheField(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q2')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("Unit, Integration, system and acceptance testing");
    }

    @Then("^I type \"([^\"]*)\" Field$")
    public void iTypeField(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q2')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("unit, regression, system and end to end testing");
        Thread.sleep(2000);
    }

    @Then("^I select \"([^\"]*)\" of option one$")
    public void iSelectOfOptionOne(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q2')]/../../..//*[contains(text(),'Option 1*')]/../../../../../..//mat-radio-button")).click();


    }

    @Then("^I push add \"([^\"]*)\" button$")
    public void iPushAddButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']//button[@type='button']")).click();
        Thread.sleep(2000);
    }

    @Then("^I push \"([^\"]*)\" to select type of Question as \"([^\"]*)\" field$")
    public void iPushToSelectTypeOfQuestionAsField(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q3')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
    }

    @Then("^I type the \"([^\"]*)\" Field(\\d+)$")
    public void iTypeTheField(String arg0, int arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q3')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is most frequent testing?");
    }

    @Then("^I type \"([^\"]*)\"$")
    public void iType(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q3')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("Stress testing");
    }

    @Then("^I type \"([^\"]*)\" Q(\\d+)$")
    public void iTypeQ(String arg0, int arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q3')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("Release/Build, Acceptance");
    }

    @Then("^I push \"([^\"]*)\" of option two$")
    public void iPushOfOptionTwo(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Q3')]/../../..//*[contains(text(),'Option 1*')]/../../../../../../..//mat-checkbox")).click();
        Thread.sleep(2000);
    }

    @Then("^I push \"([^\"]*)\" of \"([^\"]*)\"Other\"([^\"]*)\"$")
    public void iPushOfOther(String arg0, String arg1, String arg2) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q3')]/../../..//*[contains(text(), 'Include')]")).click();
        Thread.sleep(2000);
    }

    @Then("^I push \"([^\"]*)\"$")
    public void iPush(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
    }

    @Then("^I click on \"([^\"]*)\" Field$")
    public void iClickOnField(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
    }

    @Then("^I push Create \"([^\"]*)\"$")
    public void iPushCreate(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Assignment')]")).click();
        Thread.sleep(2000);
    }
    @Then("^I select the \"([^\"]*)\" from list-option$")
    public void iSelectTheFromListOption(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Select Quiz To Assign')]")).click();
    }

    @Then("^I select to \"([^\"]*)\"$")
    public void iSelectTo(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//div/..//*[contains(text(), 'QA Basics')]")).click();
        Thread.sleep(2000);
    }

    @And("^I assign to the student from list \"([^\"]*)\"$")
    public void iAssignToTheStudentFromList(String nameStudent) throws Throwable {
        List<WebElement> names = getDriver().findElements(By.xpath("//div[@class= 'mat-list-text']"));
        int count = names.size();
        for (int i = 0; i < count; i++) {
            String text = names.get(i).getText();
            if (text.contains(nameStudent)) {
                names.get(i).click();
                Thread.sleep(1000);
                getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]")).click();

                break;
            }

        }

    }


    @Then("^I click \"([^\"]*)\" button$")
    public void iClickButton(String arg0) throws Throwable {
       getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
       getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
        Thread.sleep(2000);
    }

    @When("^I login as \"([^\"]*)\" with Email and password$")
    public void iLoginAsWithEmailAndPassword(String arg0) throws Throwable {
        getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[@placeholder='Email *']")).sendKeys("dbobby-singh28r@ichatz.ga");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[@placeholder='Password *']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(2000);

    }

    @Then("^I Click on \"([^\"]*)\" Page$")
    public void iClickOnPage(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'My Assignments')]")).click();
        WebElement quiz = getDriver().findElement(By.xpath("//h4[contains(text(),'My Assignments')]/..//*[contains(text(), 'QA Basics')]"));
        String textFromQuiz = quiz.getText();
        assertThat(textFromQuiz.contains("QA Basics")).isTrue();
        String name =getDriver().findElement(By.xpath("//div[@class='info']//h3")).getText();
        if (textFromQuiz.contains("QA Basics")){
            System.out.println(name+ " get assignment. \n");

        }

        Thread.sleep(2000);
    }

}