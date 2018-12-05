package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.qa.automation.utils.TestContext;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static study.qa.automation.utils.TestContext.getDriver;

public class UserForgotPassword {
    @Given("^Navigate to login page \"([^\"]*)\" and  push forgot password button$")
    public void navigateToLoginPageAndPushForgotPasswordButton(String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        getDriver().findElement(By.xpath("//a[contains(text(),'I forgot my password')]")).click();

        Thread.sleep(2000);
    }

    @Then("^Enter valid email in Email field and Push the \"([^\"]*)\" button$")
    public void enterValidEmailInEmailFieldAndPushTheButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("cdeb6685@gmail.com");
        //password for this account 123465_abc
        getDriver().findElement(By.xpath("//span[contains(text(),'Request Password Reset')]")).click();
        Thread.sleep(3000);
    }

    @Then("^Follow the ResetPassword link and enter \"([^\"]*)\"$")
    public void followTheResetPasswordLinkAndEnter(String arg0) throws Throwable {
       TestContext.getDriver().get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
       Thread.sleep(2000);
       getDriver().findElement(By.xpath("//input[@type='email']")).sendKeys("cdeb6685@gmail.com");
       getDriver().findElement(By.xpath("//span[contains(text(),'Next')]")).click();
       Thread.sleep(3000);
       getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("12345_abc");
       getDriver().findElement(By.xpath("//content[@class='CwaK9']/span")).click();
       Thread.sleep(3000);
       getDriver().findElement(By.xpath("//a[@class='WaidBe']")).click();
        Thread.sleep(5000);
        WebElement x=getDriver().findElement(By.xpath("//div[@id=':2v']"));
        x.click();
        WebElement y=getDriver().findElement(By.xpath("//tr[@id=':3b']"));
        y.click();
        Thread.sleep(5000);
        getDriver().findElement(By.linkText("Reset Password")).click();
       // Thread.sleep(5000);
        System.out.println(getDriver().getTitle());
        Thread.sleep(5000);
        Set<String> ids=getDriver().getWindowHandles();
        Iterator<String> it=ids.iterator();
        String pa=it.next();
        String ch=it.next();
        getDriver().switchTo().window(ch);
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(7000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Login Page')]")).click();
        Thread.sleep(3000);





    }

    @And("^login with \"([^\"]*)\"$")
    public void loginWith(String arg0) throws Throwable {

        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("cdeb6685@gmail.com");
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(4000);






    }
//ASK-955
    @Then("^enter valid email but \"([^\"]*)\"$")
    public void enterValidEmailBut(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("cdeb6585@gmail.com");
        //password for this account 123465_abc
        getDriver().findElement(By.xpath("//span[contains(text(),'Request Password Reset')]")).click();
        Thread.sleep(3000);
    }

    @And("^Verify the \"([^\"]*)\" message$")
    public void verifyTheMessage(String arg0) throws Throwable {
       System.out.println(getDriver().findElement(By.xpath("//div[contains(text(),'Authentication failed. User not found or password does not match')]")));
    }

    //ASK-954
    @Then("^leave \"([^\"]*)\" in email field and push Request Password Reset button$")
    public void leaveInEmailFieldAndPushRequestPasswordResetButton(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Request Password Reset')]")).click();
        Thread.sleep(3000);
    }

    @And("^then verify \"([^\"]*)\" message$")
    public void thenVerifyMessage(String arg0) throws Throwable {
        System.out.println(getDriver().findElement(By.xpath("//*[contains(text(),'This field is required')]")));
           }



           //ASK-959

    @Then("^enter \"([^\"]*)\" in email field$")
    public void enterInEmailField(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("cdeb6585gmail");
        getDriver().findElement(By.xpath("//span[contains(text(),'Request Password Reset')]")).click();
        Thread.sleep(3000);

    }

    @And("^also verify the \"([^\"]*)\" message$")
    public void alsoVerifyTheMessage(String arg0) throws Throwable {


        System.out.println(getDriver().findElement(By.xpath("//*[contains(text(),'Should be a valid email address')]")));
    }
}
