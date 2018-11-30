package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import jdk.nashorn.internal.ir.LiteralNode;
import org.openqa.selenium.By;
import study.qa.automation.utils.TestContext;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class UserForgotPassword {
    @Given("^open page$")
    public void openPage() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(2000);
    }

    @And("^click on forgot password link k$")
    public void clickOnForgotPasswordLinkK() throws Throwable {
        getDriver().findElement(By.xpath("//a[contains(text(),'I forgot my password')]")).click();
    }

    @And("^type email to the field$")
    public void typeEmailToTheField() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("100tak@wp.pl");
    }

    @And("^click on reset password button$")
    public void clickOnResetPasswordButton() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Request Password Reset')]")).click();
        Thread.sleep(3000);
    }

    @And("^error message appears$")
    public void errorMessageAppears() throws Throwable {
        assertThat(getDriver().findElement(By.xpath("//*[contains(@class, 'ng-trigger-contentFade')]")).isDisplayed()).isTrue();
        Thread.sleep(2000);
    }


//    Scenario: User Email required

    @Given("^open page secon time$")
    public void openPageSeconTime() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(2000);
    }

    @And("^just click on reset password button$")
    public void justClickOnResetPasswordButton() throws Throwable {
        getDriver().findElement(By.xpath("//a[contains(text(),'I forgot my password')]")).click();
        Thread.sleep(1000);
    }

    @And("^I click on request a password$")
    public void iClickOnRequestAPassword() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Request Password Reset')]")).click();
        Thread.sleep(3000);
    }

    @And("^it shows error that email required$")
    public void itShowsErrorThatEmailRequired() throws Throwable {
        assertThat(getDriver().findElement(By.xpath("//mat-error[@class='mat-error ng-star-inserted'][contains(text(),'This field is required')]")).isDisplayed()).isTrue();
        Thread.sleep(1000);
    }


    @Given("^I open a test url$")
    public void iOpenATestUrl() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(2000);
    }


    @And("^click on forgot password linkk$")
    public void clickOnForgotPasswordLinkk() throws Throwable {
        getDriver().findElement(By.xpath("//a[contains(text(),'I forgot my password')]")).click();
    }

    @And("^I type my email address into email field$")
    public void iTypeMyEmailAddressIntoEmailField() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("justemail1@wp.pl");
    }

    @And("^I push Request Password Reset button$")
    public void iPushRequestPasswordResetButton() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Request Password Reset')]")).click();
        Thread.sleep(3000);
    }

    @And("^I open my email web page$")
    public void iOpenMyEmailWebPage() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestContext.getDriver().get("https://profil.wp.pl/login.html?zaloguj=poczta");
        Thread.sleep(2000);
    }

    @And("^I login in$")
    public void iLoginIn() throws Throwable {
        getDriver().findElement(By.xpath("//input[@id='login']")).sendKeys("justemail1@wp.pl");
        getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("justpassword1");
        getDriver().findElement(By.xpath("//button[@id='btnSubmit']")).click();
        Thread.sleep(3000);
    }

    @And("^I open a message from assessmentdotportnovatgmaildotcom$")
    public void iOpenAMessageFromAssessmentdotportnovatgmaildotcom() throws Throwable {
        getDriver().findElement(By.xpath("//div[@title='Odebrane']")).click();
        getDriver().findElement(By.xpath("(//div[@class='StreamGroup StreamGroup-0']//span[contains(text(),'Reset Your Password')])[1]")).click();
        Thread.sleep(2000);
    }


    @And("^I click on the reseting password link$")
    public void iClickOnTheResetingPasswordLink() throws Throwable {
        getDriver().findElement(By.xpath("//a[contains(text(), 'Reset Passw')]")).click();
        Thread.sleep(1000);
    }

    @And("^I enter a new password twice and push Reset button$")
    public void iEnterANewPasswordTwiceAndPushResetButton() throws Throwable {
        for (String windowHandle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(windowHandle);
            Thread.sleep(2000);
        }

        getDriver().findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("123456");
        getDriver().findElement(By.xpath("//input[@placeholder='Confirm New Password']")).sendKeys("123456");
        getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
        Thread.sleep(1000);
    }

    @Then("^I push a login back button$")
    public void iPushALoginBackButton() throws Throwable {
        getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
    }

    @And("^Type my email addres with a new password$")
    public void typeMyEmailAddresWithANewPassword() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("justemail1@wp.pl");
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("123456");
        Thread.sleep(2000);

    }

    @And("^push sign in button$")
    public void pushSignInButton() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(3000);
        assertThat(getDriver().findElement(By.xpath("//h3[contains(text(),'Justfname Justlname')]")).isDisplayed()).isTrue();
        Thread.sleep(2000);
    }

    @Given("^I open a test url l$")
    public void iOpenATestUrlL() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(2000);
    }

    @And("^I push forgot my password$")
    public void iPushForgotMyPassword() throws Throwable {
        getDriver().findElement(By.xpath("//a[contains(text(),'I forgot my password')]")).click();
    }

    @And("^I type invalid email address$")
    public void iTypeInvalidEmailAddress() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abcd.com");
    }

    @And("^I push Request password Reset$")
    public void iPushRequestPasswordReset() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Request Passw')]")).click();
        assertThat(getDriver().findElement(By.xpath("//mat-error[contains(text(),'Should be')]")).isDisplayed()).isTrue();
        Thread.sleep(2000);
    }
//Enter old passwod
    @Given("^I open a test url ll$")
    public void iOpenATestUrlLl() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(2000);
    }


    @And("^click on forgot password linkkk$")
    public void clickOnForgotPasswordLinkkk() throws Throwable {
        getDriver().findElement(By.xpath("//a[contains(text(),'I forgot my password')]")).click();
    }

    @And("^I type my email address into email field d$")
    public void iTypeMyEmailAddressIntoEmailFieldD() throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("justemail1@wp.pl");
    }

    @And("^I push Request Password Reset button n$")
    public void iPushRequestPasswordResetButtonN() throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Request Password Reset')]")).click();
        Thread.sleep(3000);
    }

    @And("^I open my email web page e$")
    public void iOpenMyEmailWebPageE() throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        TestContext.getDriver().get("https://profil.wp.pl/login.html?zaloguj=poczta");
        Thread.sleep(2000);
//login in
        getDriver().findElement(By.xpath("//input[@id='login']")).sendKeys("justemail1@wp.pl");
        getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("justpassword1");
        getDriver().findElement(By.xpath("//button[@id='btnSubmit']")).click();
        Thread.sleep(3000);
//choose the letter with recovery password
        getDriver().findElement(By.xpath("//div[@title='Odebrane']")).click();
        getDriver().findElement(By.xpath("(//div[@class='StreamGroup StreamGroup-0']//span[contains(text(),'Reset Your Password')])[1]")).click();
        Thread.sleep(2000);
//click on the reset password link
        getDriver().findElement(By.xpath("//a[contains(text(), 'Reset Passw')]")).click();
        Thread.sleep(1000);
    }
//enter old password

    @And("^I enter old password twice and push Reset button n$")
    public void iEnterOldPasswordTwiceAndPushResetButtonN() throws Throwable {
        for (String windowHandle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(windowHandle);
            Thread.sleep(2000);
        }

        getDriver().findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("123456");
        getDriver().findElement(By.xpath("//input[@placeholder='Confirm New Password']")).sendKeys("123456");
        getDriver().findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
        Thread.sleep(1000);
    }

    @And("^Error message appears there$")
    public void errorMessageAppearsThere() throws Throwable {
        assertThat(getDriver().findElement(By.xpath("//h4[contains(text(),'This is your old password')]")).isDisplayed()).isTrue();
        Thread.sleep(2000);
    }
}
