package definitions;

//<<<<<<< HEAD:src/test/java/definitions/FullNameDef.java
import com.gargoylesoftware.htmlunit.Page;
import cucumber.api.PendingException;
//=======
//>>>>>>> master:src/main/java/study/qa/automation/stepDefinitions/FullNameDef.java
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import study.qa.automation.utils.TestContext;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class FullNameDef {
    @When("^I change name to \"([^\"]*)\"$")
    public void iChangeNameTo(String arg1) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TestContext.getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(arg1);
        //boolean button = (getDriver().findElement(By.xpath("//button[@type='button']//*[@class='mat-button-wrapper'][contains(text(),'Change')]")).isEnabled());
        //assertThat(button).isFalse()
        getDriver().findElement(By.xpath("//button[@type='button']//*[@class='mat-button-wrapper'][contains(text(),'Change')]")).click();
        Thread.sleep(5000);

    }

    @Then("^I verify that the name was changed$")
    public void iVerifyThatTheNameWasChanged() throws Throwable {
        String name = getDriver().findElement(By.xpath("//div[@class='info']")).getText();
        assertThat(name).contains("Ivan*? Iv@n0v");
    }

    @And("^I change name back to \"([^\"]*)\"$")
    public void iChangeNameBackTo(String arg2) throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(arg2);
        getDriver().findElement(By.xpath("//button[@type='button']//*[@class='mat-button-wrapper'][contains(text(),'Change')]")).click();
        Thread.sleep(3000);
        String name = getDriver().findElement(By.xpath("//div[@class='info']")).getText();
        assertThat(name).contains(arg2);
    }

    @Then("^I verify that the name was changed \"([^\"]*)\"$")
    public void iVerifyThatTheNameWasChanged(String arg0) throws Throwable {
        String name = getDriver().findElement(By.xpath("//div[@class='info']")).getText();
        assertThat(name).contains(arg0);
    }


    @When("^I change name to the name with max characters$")
    public void iChangeNameToTheNameWithMaxCharacters() throws Throwable {
        String Ivanname = ("IvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvann I");
        TestContext.getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Ivanname);
        getDriver().findElement(By.xpath("//button[@type='button']//*[@class='mat-button-wrapper'][contains(text(),'Change')]")).click();
        Thread.sleep(5000);

    }

    @Then("^I verify that the name was changed to the name with max characters$")
    public void iVerifyThatTheNameWasChangedToTheNameWithMaxCharacters() throws Throwable {
        String Ivanname = ("IvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvann I");
        String name = getDriver().findElement(By.xpath("//div[@class='info']")).getText();
        assertThat(name).contains(Ivanname);

    }

    @When("^I change name to the name with max char in Last Name$")
    public void iChangeNameToTheNameWithMaxCharInLastName() throws Throwable {
        String nameIvan = ("I IvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvann");
        TestContext.getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(nameIvan);
        getDriver().findElement(By.xpath("//button[@type='button']//*[@class='mat-button-wrapper'][contains(text(),'Change')]")).click();
        Thread.sleep(3000);

    }

    @Then("^I verify that the name was changed to the name with Max Characters Last Name$")
    public void iVerifyThatTheNameWasChangedToTheNameWithMaxCharactersLastName() throws Throwable {
        String nameIvan = ("I IvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvann");
        String name = getDriver().findElement(By.xpath("//div[@class='info']")).getText();
        assertThat(name).contains(nameIvan);

    }

    @When("^I change name to \"([^\"]*)\" and press Tab$")
    public void iChangeNameToAndPressTab(String arg3) throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(arg3);
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Keys.TAB);

    }

    @And("^I verify that there is an error message$")
    public void iVerifyThatThereIsAnErrorMessage() throws Throwable {
        String error = getDriver().findElement(By.xpath("//div[@class='mat-input-subscript-wrapper mat-form-field-subscript-wrapper']")).getText();
        assertThat(error).contains("Should contain only first and last name latin characters");
    }

    @When("^I change name to Zero character input and press Tab$")
    public void iChangeNameToZeroCharacterInputAndPressTab() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        //By matSelect = By.xpath("//*[contains(text(),'Change Your Name')]");
        Thread.sleep(3000);
        //getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        By matSelector = By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input");
        WebElement matElement = getDriver().findElement(matSelector);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.BACK_SPACE);
        matElement.sendKeys(Keys.TAB);

    }

    @And("^I verify that there is an error msg$")
    public void iVerifyThatThereIsAnErrorMsg() throws Throwable {
        String error = getDriver().findElement(By.xpath("//div[@class='mat-input-subscript-wrapper mat-form-field-subscript-wrapper']")).getText();
        assertThat(error).contains("This field is required");
    }


    @When("^I change name to First Name Max character plus one  and Last Name one char and press Tab$")
    public void iChangeNameToFirstNameMaxCharacterPlusOneAndLastNameOneCharAndPressTab() throws Throwable {
        String Ivname = ("IvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvannn I");
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Ivname);
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Keys.TAB);

    }

    @And("^I verify that there is an error msg Too long$")
    public void iVerifyThatThereIsAnErrorMsgTooLong() throws Throwable {
        String error = getDriver().findElement(By.xpath("//div[@class='mat-input-subscript-wrapper mat-form-field-subscript-wrapper']")).getText();
        assertThat(error).contains("Too long. Should be no more than 100 characters");
    }

    @When("^I change name to First name one character and Last Name Max char plus one and press Tab$")
    public void iChangeNameToFirstNameOneCharacterAndLastNameMaxCharPlusOneAndPressTab() throws Throwable {
        String nameIv = ("I IvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvanIvannn");
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(nameIv);
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Keys.TAB);
    }


    @When("^I change name to the name with leading space$")
    public void iChangeNameToTheNameWithLeadingSpace() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(" Ivan");
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Keys.TAB);
    }

    @When("^I change name to the name with trailing space$")
    public void iChangeNameToTheNameWithTrailingSpace() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys("Ivan Ivanov ");
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Keys.TAB);
    }

    @When("^I change name to the name with Three parts$")
    public void iChangeNameToTheNameWithThreeParts() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys("Ivan Iva nov");
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Keys.TAB);
    }

    @When("^I change name to the name with Two spaces between$")
    public void iChangeNameToTheNameWithTwoSpacesBetween() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys("Ivan  Ivanov");
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Keys.TAB);
    }

    @When("^I change name to the name with space$")
    public void iChangeNameToTheNameWithSpace() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]")).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Change Your Name')]")).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).clear();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(" ");
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']//input")).sendKeys(Keys.TAB);
    }

//<<<<<<< HEAD:src/test/java/definitions/FullNameDef.java
//
//    @Given("^I open url and login$")
//    public void iOpenUrlAndLogin() throws Throwable {
//
//    }
//
//
//=======
//>>>>>>> master:src/main/java/study/qa/automation/stepDefinitions/FullNameDef.java
}
