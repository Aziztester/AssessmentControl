package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Settings extends Page {
    public Settings() {
    }


    @FindBy(xpath = "//h5[contains(text(),'Settings')]")
    private WebElement SettingsButton;
    @FindBy(xpath = "//*[contains(text(),'Change Your Name')]")
    private WebElement changeYourName;
    @FindBy(xpath = "//button[@type='button']//*[@class='mat-button-wrapper'][contains(text(),'Change')]")
    private WebElement changeButton;
    @FindBy(xpath = "//div[@class='mat-input-infix mat-form-field-infix']//input")
    private WebElement inputName;
    @FindBy(xpath = "//div[@class='info']")
    private WebElement titleName;

    public void clickSettings(){
        SettingsButton.click();
    }
    public void clickChangeYourName(){
        changeYourName.click();
    }
    public void fillnewName(String name){
        inputName.sendKeys(name);
    }
    public void clickChange(){
        changeButton.click();
    }
    public void clearName() {
        inputName.clear();
    }
    public String newName(){return
        titleName.getText();
    }


}





