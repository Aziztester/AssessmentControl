package study.qa.automation.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import study.qa.automation.pages.LoginPage;
import study.qa.automation.pages.Settings;

import static org.assertj.core.api.Assertions.assertThat;

public class FullNameDefPOP {
    @Given("^I go to Login page and login as a teacher POP$")
    public void iGoToLoginPageAndLoginAsATeacherPOP() throws Throwable {
        //getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginPage page = new LoginPage();
        page.open();
        page.fillEmail("lfelipe@gag16dotw7t.tk");
        page.fillPassword("12345");
        page.clickSignIn();
        Thread.sleep(5000);
    }

    @When("^I change name to \"([^\"]*)\" POP$")
    public void iChangeNameToPOP(String arg0) throws Throwable {
        Settings settpage = new Settings();
        settpage.clickSettings();
        settpage.clickChangeYourName();
        settpage.clearName();
        settpage.fillnewName(arg0);
        settpage.clickChange();
        Thread.sleep(2000);
    }

    @Then("^I verify that the name was changed POP$")
    public void iVerifyThatTheNameWasChangedPOP() throws Throwable {
        String name = new Settings().newName();
        assertThat(name).contains("Ivan*? Iv@n0v");
    }


    @When("^I change name to I I POP$")
    public void iChangeNameToIIPOP() throws Throwable {
        Settings settpage = new Settings();
        settpage.clickSettings();
        settpage.clickChangeYourName();
        settpage.clearName();
        settpage.fillnewName("I I");
        settpage.clickChange();
        Thread.sleep(2000);
    }

    @Then("^I verify that the name was changed to \"([^\"]*)\" POP$")
    public void iVerifyThatTheNameWasChangedToPOP(String arg0) throws Throwable {
        String name = new Settings().newName();
        assertThat(name).contains(arg0);
        Thread.sleep(5000);
    }

    @And("^I change name back to \"([^\"]*)\" POP$")
    public void iChangeNameBackToPOP(String arg0) throws Throwable {
        Settings settpage = new Settings();
        settpage.clickChangeYourName();
        settpage.clearName();
        settpage.fillnewName(arg0);
        settpage.clickChange();
        Thread.sleep(3000);
        String name = settpage.newName();
        assertThat(name).contains(arg0);
    }



}
