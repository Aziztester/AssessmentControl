package study.qa.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
    public LoginPage() {
        setUrl("http://local.school.portnov.com:4520/#/login");
    }

    @FindBy (xpath = "//*[@id='mat-input-0']")
    private WebElement email;
    @FindBy (xpath = "//*[@id='mat-input-1']")
    private WebElement password;
    @FindBy (xpath = "//*[contains(text(),'Sign In')]")
    private WebElement signInButton;

    public void fillEmail(String text){
        email.sendKeys(text);
    }
    public void fillPassword(String passw){
        password.sendKeys(passw);
    }
    public void clickSignIn(){
        signInButton.click();
    }



}
