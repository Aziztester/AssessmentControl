package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static study.qa.automation.utils.TestContext.getDriver;

public class def_3_19 {
    @And("^Select Is Show Stopper question$")
    public void selectIsShowStopperQuestion() throws InterruptedException {

        WebElement element = getDriver().findElement(By.xpath("//*[contains(text(), 'Is')]/../div"));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    @And("^Type \"([^\"]*)\" to Enter Your Answer$")
    public void typeToEnterYourAnswer(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[@placeholder='Enter your answer']")).sendKeys(arg0);
        Thread.sleep(2000);
    }

    @And("^Push Grade button$")
    public void pushGradeButton() throws Throwable {
        getDriver().findElement(By.xpath("//button/span")).click();
        Thread.sleep(2000);
    }

    @And("^Push \"([^\"]*)\" button to grade$")
    public void pushButtonToGrade(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Question')]/../..//button[2]")).click();
        Thread.sleep(1000);
    }



    @And("^Push on \"([^\"]*)\" Hello World$")
    public void pushOnHelloWorld(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Hello world')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Hello world')]/../../..//span[contains(text(),'Delete')]")).click();
        Thread.sleep(1000);

    }

    @And("^Push on popup \"([^\"]*)\"$")
    public void pushOnPopup(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//div[@class='cdk-overlay-container']//button[2]")).click();
        Thread.sleep(1000);
    }

    @And("^Push button \"([^\"]*)\"$")
    public void pushButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Hello world')]/../../..//*[contains(text(),'more_vert')]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Delete')]")).click();
        Thread.sleep(2000);
    }

    @And("^Push popup \"([^\"]*)\"$")
    public void pushPopup(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h1[contains(text(), 'Confirm')]/../..//*[contains(text(),'Delete')]")).click();
        Thread.sleep(4000);
    }

    @And("^Click to \"([^\"]*)\"$")
    public void clickTo(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).click();
        Thread.sleep(2000);
    }


    @And("^Click to an \"([^\"]*)\" place$")
    public void clickToAnPlace(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//ac-quiz-builder-page[@class='ng-star-inserted']")).click();
        Thread.sleep(2000);
    }
}

