package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Page {
    public RegistrationPage(){
        setUrl("http://local.school.portnov.com:4520/#/registration");
    }
    @FindBy (xpath = "//input[@id='mat-input-0']")
    private WebElement firstname;
    @FindBy (xpath = "//input[@id='mat-input-1']")
    private WebElement lasttname;
    @FindBy (xpath = "//input[@id='mat-input-2']")
    private WebElement email;
    @FindBy (xpath = "//input[@id='mat-input-3']")
    private WebElement groupcode;
    @FindBy (xpath = "//input[@id='mat-input-4']")
    private WebElement password;
    @FindBy (xpath = "//input[@id='mat-input-5']")
    private WebElement confpassw;
    @FindBy (xpath = "//span[contains(text(),'Register Me')]")
    private WebElement registerme;
    @FindBy (xpath = "//h4[contains(text(),'You have been Registered.')]")
    private WebElement regtitle;
    @FindBy (xpath = "//mat-error[contains(text(),'Should be a valid email address')]")
    private WebElement emailerrormsg;




    public void fillFirstname(String text){ firstname.sendKeys(text); }
    public void fillLastname(String text){ lasttname.sendKeys(text); }
    public void fillEmail(String text){ email.sendKeys(text); }
    public void fillGroupcode(String text){ groupcode.sendKeys(text); }
    public void fillPassword(String text){ password.sendKeys(text); }
    public void fillConfPassword(String text){ confpassw.sendKeys(text); }
    public String registrTitle(){ return regtitle.getText(); }
    public String emailErrormessage(){ return emailerrormsg.getText(); }

    public void clickRegisterMe(){ registerme.click(); }




}
