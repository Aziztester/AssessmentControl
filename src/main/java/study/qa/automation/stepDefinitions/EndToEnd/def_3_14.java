package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static study.qa.automation.utils.TestContext.getDriver;

public class def_3_14 {
    @And("^Select Textual Type of question$")
    public void selectTextualTypeOfQuestion() throws InterruptedException {
            getDriver().findElement(By.xpath("//*[contains(text(),'Q2:')]/../../..//div[contains(text(),'Textual')]")).click();
            Thread.sleep(1000);
        }


    @And("^Type text for Question \"([^\"]*)\"$")
    public void typeTextForQuestion(String text) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//*[@placeholder='Question *']")).sendKeys(text);
        Thread.sleep(1000);
    }

    @And("^Select Group \"([^\"]*)\"$")
    public void selectGroup(String code) throws Throwable {
        getDriver().findElement(By.xpath("//mat-select[@id='mat-select-0']//div[@class='mat-select-arrow-wrapper']")).click();
        Thread.sleep(3000);
        WebDriverWait wait=new WebDriverWait(getDriver(),2);
        //use webelement class for the element and wait 2 sec until element is present
        WebElement present=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='mat-option-text'][text()=\'" + code + "\')]")));
        present.click();

        //getDriver().findElement(By.xpath("//span[@class='mat-option-text'][text()=\'" + code + "\')]")).click();
        //Thread.sleep(1000);

    }
}

