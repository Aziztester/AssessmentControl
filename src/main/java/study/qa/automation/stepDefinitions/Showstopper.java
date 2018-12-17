package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.*;
import static study.qa.automation.utils.TestContext.getDriver;

public class Showstopper {
    @Given("^Navigate to web page \"([^\"]*)\"$")
    public void navigateToWebPage(String url) throws Throwable {
        getDriver().get(url);
    }

    @Then("^I type email into email field$")
    public void iTypeEmailIntoEmailField() throws InterruptedException {
        getDriver().findElement(xpath("//input[@id='mat-input-0']")).sendKeys("umoha@jerapah993r.gq");
        Thread.sleep(1000);
    }

    @Then("^I type password into password field$")
    public void iTypePasswordIntoPasswordField() {
        getDriver().findElement(xpath("//input[@id='mat-input-1']")).sendKeys("12345");
    }

    @Then("^I push \"([^\"]*)\" button$")
    public void iPushButton(String arg0) throws Throwable {
        getDriver().findElement(xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(2000);
    }

    @Then("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        getDriver().findElement(xpath("//h5[contains(text(),'Quizzes')] ")).click();
    }

    @Then("^I click \"([^\"]*)\" button$")
    public void iClickButton(String arg0) throws Throwable {

        getDriver().findElement(xpath("//span[contains(text(),'Create New Quiz')]")).click();
    }

    @Then("^I type \"([^\"]*)\" into the element with xpath \"([^\"]*)\"$")
    public void iTypeIntoTheElementWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("SQA");
        Thread.sleep(1000);
    }

    @And("^I click  the \"([^\"]*)\" button$")
    public void iClickTheButton(String arg0) throws Throwable {
        getDriver().findElement(xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        Thread.sleep(1000);
    }

    //    This works using XPATH
    @Then("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0) throws Throwable {
        getDriver().findElement(xpath("//*[contains(text(),'Q1')]/../../..//div[contains(text(), 'Textual')]")).click();
        Thread.sleep(3000);

    }


    @Then("^I type on the \"([^\"]*)\"into element with xpath \"([^\"]*)\"$")
    public void iTypeOnTheIntoElementWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(xpath("//textarea[@placeholder='Question *']")).sendKeys("What is software testing?");
        Thread.sleep(3000);
//        getDriver().findElement(By.xpath("//*[contains(text(),'Q1:')]/../../..//div[@class='mat-slider-thumb']")).sendKeys(Character.toString((char)39));

    }


    @And("^I click  on the \"([^\"]*)\" button$")
    public void iClickOnTheButton(String arg0) throws Throwable {
        getDriver().findElement(ByXPath.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        Thread.sleep(2000);
    }


    @Then("^I click on (\\d+)\"([^\"]*)\" type$")
    public void iClickOnType(int arg0, String arg1) throws Throwable {
        getDriver().findElement(xpath("//*[contains(text(),'Q2')]/../../..//div[contains(text(), 'Textual')]")).click();
    }

    @Then("^I type on \"([^\"]*)\" into element with xpath \"([^\"]*)\"$")
    public void iTypeOnIntoElementWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(xpath("//*[contains(text(),'Q2')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is SDLC methodologies");
        Thread.sleep(3000);

    }


    @And("^I click on the \"([^\"]*)\" buttons$")
    public void iClickOnTheButtons(String arg0) throws Throwable {
        getDriver().findElement(ByXPath.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        Thread.sleep(2000);

    }

    @Then("^I click on the (\\d+)\"([^\"]*)\"type$")
    public void iClickOnTheType(int arg0, String arg1) throws Throwable {
        getDriver().findElement(xpath("//*[contains(text(),'Q3')]/../../..//div[contains(text(), 'Textual')]")).click();
    }


    @Then("^I type\"([^\"]*)\" into element with xpath \"([^\"]*)\"$")
    public void iTypeIntoElementWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(xpath("//*[contains(text(),'Q3')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is Exploratory Testing?");
        Thread.sleep(3000);

    }

    @And("^click on \"([^\"]*)\" button$")
    public void clickOnButton(String arg0) throws Throwable {
        getDriver().findElement(ByXPath.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        Thread.sleep(2000);

    }


    @Then("^I choice on \"([^\"]*)\" button$")
    public void iChoiceOnButton(String arg0) throws Throwable {
        getDriver().findElement(xpath("//*[contains(text(),'Q4')]/../../..//div[contains(text(), 'Single-Choice')]")).click();

    }

    @Then("^type \"([^\"]*)\" into element with \"([^\"]*)\"$")
    public void typeIntoElementWith(String arg0, String arg1) throws Throwable {
        getDriver().findElement(xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is a Defect?");
        Thread.sleep(1000);



}


    @And("^I type the \"([^\"]*)\"$")
    public void iTypeThe(String arg0) throws Throwable {
       getDriver().findElement( xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("Any flaw or imperfection in a software work product");
        Thread.sleep(1000);
    }

    @Then("^Type the \"([^\"]*)\"$")
    public void typeThe(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("Without any issues");
        Thread.sleep(1000);
    }

    @Then("^I choose a \"([^\"]*)\" as  true$")
    public void iChooseAAsTrue(String arg0) throws Throwable {
        getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
    }

    @Then("^click on the\"([^\"]*)\" buttons$")
    public void clickOnTheButtons(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(1000);
    }

    @And("^I choice the (\\d+)\"([^\"]*)\" button$")
    public void iChoiceTheButton(int arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//div[contains(text(), 'Single-Choice')]")).click();

    }

    @Then("^type the\"([^\"]*)\" into element with xpath \"([^\"]*)\"$")
    public void typeTheIntoElementWithXpath(String arg0, String arg1) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is the difference between static testing?");
        Thread.sleep(1000);
    }

    @And("^I type on the \"([^\"]*)\"$")
    public void iTypeOnThe(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("without code executing the program is called as Static Testing.");
        Thread.sleep(1000);
    }

    @Then("^type \"([^\"]*)\"$")
    public void type(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("with code");
        Thread.sleep(1000);
    }

    @Then("^i choose a \"([^\"]*)\" as truee$")
    public void iChooseAAsTruee(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("(//div[@class='mat-radio-outer-circle'])[19]")).click();
        Thread.sleep(1000);
    }

    @Then("^click on the\"([^\"]*)\" button$")
    public void clickOnTheButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'add_circle')]")).click();
        Thread.sleep(1000);
    }

    @Then("^I choice on \"([^\"]*)\"$")
    public void iChoiceOn(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(2000);
    }

    @And("^I type Multiple \"([^\"]*)\"$")
    public void iTypeMultiple(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//textarea[@placeholder='Question *']")).sendKeys("What is a Bug?");
        Thread.sleep(1000);
    }

    @Then("^I type a Multiple \"([^\"]*)\"$")
    public void iTypeAMultiple(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("Mismatch between actual and intended behaviors of the software.");
        Thread.sleep(1000);
    }

    @Then("^I Type a Multiple \"Option$")
    public void iTypeAMultipleOption() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("No");
        Thread.sleep(2000);
    }

    @Then("^I choose a  Option(\\d+) as true$")
    public void iChooseAOptionAsTrue(int arg0) {
        getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
    }


    @Then("^Click  \"([^\"]*)\" button$")
    public void clickButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Save')]")).click();
        Thread.sleep(2000);
}
}