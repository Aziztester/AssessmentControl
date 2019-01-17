package study.qa.automation.stepDefinitions;

import cucumber.api.java.en.Then;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import static study.qa.automation.utils.TestContext.getDriver;

public class UserGroupCode {
    @Then("^Verify message \"([^\"]*)\" with xpath \"([^\"]*)\" is displayed$")
    public void verifyMessageWithXpathIsDisplayed(String arg0, String arg1) throws Throwable {
        Assertions.assertThat(getDriver().findElement(By.xpath(arg1)).getText().contains(arg0));
    }
}
