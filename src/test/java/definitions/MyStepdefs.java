package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MyStepdefs {
    @Given("^I write Java code$")
    public void iWriteJavaCode() throws Throwable  {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I create my step$")
    public void iCreateMyStep() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("I open the url {string}")
    public void iOpenTheUrl(String arg0) {

    }

    @And("I type {string} and {string} and {string}")
    public void iTypeAndAnd(String arg0, String arg1, String arg2) {

    }
}
