package study.qa.automation.stepDefinitions.AreasOfIndepTesting;

import static study.qa.automation.utils.TestContext.getDriver;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;



public class LoginStepdefs {
    @When("^I type email \"([^\"]*)\"$")
    public void iTypeEmail(String arg0) throws Throwable {
       getDriver().findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(arg0);
       Thread.sleep(1000);
    }


        @Then("^user's name \"([^\"]*)\" appears in left corner of the page$")
        public void userSNameAppearsInLeftCornerOfThePage(String arg0) throws Throwable {
            getDriver().findElement(By.xpath("//*[contains(text(),'Andrii')]/..")).isDisplayed();
            Thread.sleep(1000);

        }


        @And("^I type Password \"([^\"]*)\" in login page$")
        public void iTypePasswordInLoginPage(String arg0) throws Throwable {
            getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(arg0);
            Thread.sleep(1000);
        }

        @And("^I push \"([^\"]*)\" button in login page$")
        public void iPushButtonInLoginPage(String arg0) throws Throwable {
            getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
            Thread.sleep(1000);
        }

        @Then("^error message \"([^\"]*)\" appears in login page$")
        public void errorMessageAppearsInLoginPage(String arg0) throws Throwable {
            getDriver().findElement(By.xpath("//div[@class='cdk-overlay-container']")).isDisplayed();
            Thread.sleep(1000);
        }

        @Then("^Bullets appears in Password field$")
        public void bulletsAppearsInPasswordField() {
            getDriver().findElement(By.xpath("//*[@type='password'][@id='mat-input-1']")).isDisplayed();
        }

        @And("^select entered characters \"([^\"]*)\" in password field$")
        public void selectEnteredCharactersInPasswordField(String arg0) throws Throwable {

        getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).isSelected();
            Thread.sleep(1000);
        }


    @Then("^I inspect element \"([^\"]*)\" on the page$")
    public void iInspectElementOnThePage(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//*[@type='password'][@id='mat-input-1']")).isEnabled();
        Thread.sleep(1000);
    }

    @Then("^error message \"([^\"]*)\" appears under Email field$")
    public void errorMessageAppearsUnderEmailField(String arg0) throws Throwable {
//        getDriver().findElement(By.xpath())
    }

    @And("^element Password with XPath \"([^\"]*)\" should have attribute \"([^\"]*)\" as \"([^\"]*)\"$")
    public void elementPasswordWithXPathShouldHaveAttributeAs(String xpath, String attribute, String attributeValue) throws Throwable {
//        assertThat(getDriver().findElement(By.xpath(xpath)).getAttribute(attribute)).isEqualTo(attributeValue);
    }
}
