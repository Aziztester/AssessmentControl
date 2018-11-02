package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import pages.RegistrationPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UserEmailDefPOP {
    @Given("^I open registration page$")
    public void iOpenRegistrationPage() throws Throwable {
        new RegistrationPage().open();
    }


    @When("^I fill registration form with ANCII letters in email$")
    public void iFillRegistrationFormWithANCIILettersInEmail() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillFirstname("Firstname");
        page.fillLastname("Lastname");
        page.fillEmail("Firstname.Lastname@domain.name");
        page.fillGroupcode("A01");
        page.fillPassword("12345");
        page.fillConfPassword("12345");
        page.clickRegisterMe();
    }

    @Then("^I verify user was registered$")
    public void iVerifyUserWasRegistered() throws Throwable {
        String title = new RegistrationPage().registrTitle();
        assertThat(title).contains("You have been Registered");
    }

    @When("^I fill registration form with all upper case letters in email$")
    public void iFillRegistrationFormWithAllUpperCaseLettersInEmail() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillFirstname("Firstname");
        page.fillLastname("Lastname");
        page.fillEmail("FIRSTNAME.LASTNAME@DOMAIN.NAME");
        page.fillGroupcode("A01");
        page.fillPassword("12345");
        page.fillConfPassword("12345");
        page.clickRegisterMe();
    }

    @When("^I fill registration form with ASCII printable characters$")
    public void iFillRegistrationFormWithASCIIPrintableCharacters() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillFirstname("Firstname");
        page.fillLastname("Lastname");
        page.fillEmail("$!#%^&*_-+={}|'?/@domain.name");
        page.fillGroupcode("A01");
        page.fillPassword("12345");
        page.fillConfPassword("12345");
        page.clickRegisterMe();
        //Thread.sleep(5000);
    }

    @When("^I fill registration form with numbers in local-part of email$")
    public void iFillRegistrationFormWithNumbersInLocalPartOfEmail() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillFirstname("Firstname");
        page.fillLastname("Lastname");
        page.fillEmail("1234567890@domain.name");
        page.fillGroupcode("A01");
        page.fillPassword("12345");
        page.fillConfPassword("12345");
        page.clickRegisterMe();
    }

    @When("^I fill registration form with (\\d+) or more characters in last part of domain name$")
    public void iFillRegistrationFormWithOrMoreCharactersInLastPartOfDomainName(int arg0) throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("Firstname.Lastname@domain.nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        page.fillGroupcode("A01");

    }

    @Then("^I verify error msg in email field$")
    public void iVerifyErrorMsgInEmailField() throws Throwable {
        String error = new RegistrationPage().emailErrormessage();
        assertThat(error).contains("Should be a valid email address");
        //Thread.sleep(5000);
    }

    @When("^I fill registration form with numbers in domain name$")
    public void iFillRegistrationFormWithNumbersInDomainName() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillFirstname("Firstname");
        page.fillLastname("Lastname");
        page.fillEmail("Firsname.Lastname@domain1234567890.name");
        page.fillGroupcode("A01");
        page.fillPassword("12345");
        page.fillConfPassword("12345");
        page.clickRegisterMe();
    }

    @When("^I fill registration form according to scenario$")
    public void iFillRegistrationFormAccordingToScenario() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillFirstname("Firstname");
        page.fillLastname("Lastname");
        page.fillEmail("1234567890123456789012345678901234567890123456789012345678901234@domain123456789012345678901234567890123456789012345678901234567.nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        page.fillGroupcode("A01");
        page.fillPassword("12345");
        page.fillConfPassword("12345");
        page.clickRegisterMe();
    }

    @When("^I fill registration form with (\\d+) or more characters in local-part of  email$")
    public void iFillRegistrationFormWithOrMoreCharactersInLocalPartOfEmail(int arg0) throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("12345678901234567890123456789012345678901234567890123456789012345@domain.name");
        page.fillGroupcode("A01");
        page.clickRegisterMe();
    }

    @When("^fill registration form with (\\d+) or more characters in first part of domain name of  email$")
    public void fillRegistrationFormWithOrMoreCharactersInFirstPartOfDomainNameOfEmail(int arg0) throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("Firstname.Lastname@domain1234567890123456789012345678901234567890123456789012345678.name");
        page.fillGroupcode("A01");
        page.clickRegisterMe();
    }

    @When("^fill registration form with Cyrillic letters$")
    public void fillRegistrationFormWithCyrillicLetters() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("Firstname.Lastnamе@domain.name");
        page.fillGroupcode("A01");
        page.clickRegisterMe();
    }

    @When("^fill registration form with printable characters$")
    public void fillRegistrationFormWithPrintableCharacters() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("<@,\">[()]@domain.name");
        page.fillGroupcode("A01");
        page.clickRegisterMe();
    }

    @When("^fill registration form with ASCII printable characters$")
    public void fillRegistrationFormWithASCIIPrintableCharacters() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("Firstname.Lastname@do$!#%^&*_-+={}|'?/ main.name");
        page.fillGroupcode("A01");
        page.clickRegisterMe();
    }

    @When("^fill registration form with space character in local-part of email$")
    public void fillRegistrationFormWithSpaceCharacterInLocalPartOfEmail() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("Firstname Lastname@domain.name");
        page.fillGroupcode("A01");
        page.clickRegisterMe();
    }

    @When("^fill registration form with space character in domain name of email$")
    public void fillRegistrationFormWithSpaceCharacterInDomainNameOfEmail() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("Firstname.Lastname@do main.name");
        page.fillGroupcode("A01");
        page.clickRegisterMe();
    }

    @When("^fill registration form with two @@ characters in row in email$")
    public void fillRegistrationFormWithTwoCharactersInRowInEmail() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("FirstnameLastname@@domain.name");
        page.fillGroupcode("A01");
        page.clickRegisterMe();
    }

    @When("^fill registration form without @ character in email$")
    public void fillRegistrationFormWithoutCharacterInEmail() throws Throwable {
        RegistrationPage page = new RegistrationPage();
        page.fillEmail("Firstname.Lastname.domain.name");
        page.fillGroupcode("A01");
        page.clickRegisterMe();
    }
}
