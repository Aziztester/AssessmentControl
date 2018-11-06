package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import study.qa.automation.utils.TestContext;

import static study.qa.automation.utils.TestContext.getDriver;


public class QuizesPage extends Page {

    @FindBy(xpath = "//h5[contains(text(),'Quizzes')]")
    private WebElement buttQuizzes;
    @FindBy(xpath = "//*[contains(text(),'Create New Quiz')]")
    private WebElement buttCreateNewQuiz;
    @FindBy(xpath = "//*[@placeholder = 'Title Of The Quiz *']")
    private WebElement titleofquiz;
    @FindBy(xpath = "//*[contains(text(), 'add_circle')]")
    private WebElement buttonaddquestion;
    @FindBy(xpath = "//*[contains(text(),'Save')]")
    private WebElement buttonSave;
    @FindBy(xpath = "//mat-panel-title[contains(text(),'QQA BASICS')]/../../..//*[contains(text(),'Delete')]")
    private WebElement buttonDelete;
//    @FindBy(xpath = "//*[contains(text(), 'Q4')]/../../..//*[@placeholder='Option 1*']")
//    private WebElement option1Q4;
//    @FindBy(xpath = "//*[contains(text(), 'Q4')]/../../..//*[@placeholder='Option 2*']")
//    private WebElement option2Q4;
    @FindBy(xpath = "(//*[contains(text(), 'Q4')]/../../..//mat-radio-button[@class='mat-radio-button mat-accent']//div[@class='mat-radio-outer-circle'])[1]")
    private WebElement opt1Q4;
    @FindBy(xpath = "(//*[contains(text(), 'Q5')]/../../..//mat-radio-button[@class='mat-radio-button mat-accent']//div[@class='mat-radio-outer-circle'])[1]")
    private WebElement opt1Q5;
    @FindBy(xpath = "(//*[contains(text(), 'Q6')]/../../..//mat-radio-button[@class='mat-radio-button mat-accent']//div[@class='mat-radio-outer-circle'])[1]")
    private WebElement opt1Q6;


    public  void clickQuizzes (){buttQuizzes.click();}
    public  void clickDelete (){
        buttonDelete.click();
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]")).click();
    }
    public  void buttonCreateNewQuiz(){buttCreateNewQuiz.click();}
    public  void fillTitleofQuiz(String text){titleofquiz.sendKeys(text);}
    public void clickAddQuestion(){buttonaddquestion.click();}
    public void clickSave(){buttonSave.click();}
    public void fillQuestion(String value,String tex){
        getDriver().findElement(By.xpath("//*[contains(text(), '"+value+"')]/../../..//textarea[@placeholder='Question *']")).sendKeys(tex);
    }
    public  void fillOption1(String value,String text){
        getDriver().findElement(By.xpath("//*[contains(text(), '"+value+"')]/../../..//*[@placeholder='Option 1*']")).sendKeys(text);
    }
    public void fillOption2 (String value,String text){
        getDriver().findElement(By.xpath("//*[contains(text(), '"+value+"')]/../../..//*[@placeholder='Option 2*']")).sendKeys(text);
    }

    public void clickTextual(String value){getDriver().findElement(By.xpath("//*[contains(text(), '"+value+"')]/../../..//div[contains(text(), 'Textual')]")).click();}
    public void clickSingleChoise(String value){getDriver().findElement(By.xpath("//*[contains(text(), '"+value+"')]/../../..//div[contains(text(), 'Single-Choice')]")).click();}

    public void clickopt1Q4(){opt1Q4.click();}
    public void clickopt1Q5(){opt1Q5.click();}
    public void clickopt1Q6(){opt1Q6.click();}

    public  void clickMultipleChoise(String value){
        getDriver().findElement(By.xpath("//*[contains(text(), '"+value+"')]/../../..//div[@class='mat-radio-label-content'][contains(text(), 'Multiple-Choice')]")).click();
    }



}
