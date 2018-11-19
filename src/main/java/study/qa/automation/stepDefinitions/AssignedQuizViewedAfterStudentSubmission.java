package study.qa.automation.stepDefinitions;
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

import java.util.List;
import java.util.concurrent.TimeUnit;

import static study.qa.automation.utils.TestContext.getDriver;


public class AssignedQuizViewedAfterStudentSubmission {

    @Given("^Navigate to login page \"([^\"]*)\"$")
    public void navigateToLoginPage(String arg0) throws Throwable {

        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        getDriver().findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("lfelipe@gag16dotw7t.tk");
        getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();


    }

//Create First quiz

    @Then("^teacher create  \"([^\"]*)\"$")
    public void teacherCreate(String arg0) throws Throwable {

        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("losaltos1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);

        }
        Thread.sleep(1000);
        y.get(0).click();
        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/ac-question-body-form/div/div[2]/mat-form-field/div/div/div/textarea")).sendKeys("What is Software Quality Assurance?");
        getDriver().findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();

        Thread.sleep(1000);
        List<WebElement> bttn = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));

        for (int i = 0; i < bttn.size(); i++) {
            WebElement c = bttn.get(i);
        }
        bttn.get(4).click();
        Thread.sleep(1000);

        System.out.println("wow");

        List<WebElement> ques = getDriver().findElements(By.xpath("//*[@placeholder='Question *']"));
        for (int i = 0; i < ques.size(); i++) {
            WebElement ques1 = ques.get(i);
        }
        ques.get(1).sendKeys("What are different test levels?");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("Unit, Integration, system and acceptance testing");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("unit, regression, system and end to end testing");
        List<WebElement> rdbttn = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        rdbttn.get(6).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();


    }
//creates second quiz
    @Then("^teacher also create \"([^\"]*)\"$")
    public void teacherAlsoCreate(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("losaltos2");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x1=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are "+x1);
        List<WebElement> y1=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for(int i=0;i<y1.size();i++) {
            WebElement z=y1.get(i);

        }
        Thread.sleep(1000);
        y1.get(0).click();
        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/ac-question-body-form/div/div[2]/mat-form-field/div/div/div/textarea")).sendKeys("What is Regression Testing?");
        getDriver().findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();

        Thread.sleep(1000);
        List<WebElement> bttn1=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));

        for(int i=0;i<bttn1.size();i++) {
            WebElement c=bttn1.get(i);
        }
        bttn1.get(4).click();
        Thread.sleep(1000);

        System.out.println("wow");

        List<WebElement> ques2=getDriver().findElements(By.xpath("//*[@placeholder='Question *']"));
        for(int i=0;i<ques2.size();i++) {
            WebElement ques3=ques2.get(i);
        }
        ques2.get(1).sendKeys("What is Integration Level Testing?");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("Modules (or) Unit of code.");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("test planning");
        List<WebElement> rdbttn1=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        rdbttn1.get(6).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
    }

    @And("^then last \"([^\"]*)\"$")
    public void thenLast(String arg0) throws Throwable {

        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("losaltos3");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x3=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are "+x3);
        List<WebElement> y3=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for(int i=0;i<y3.size();i++) {
            WebElement z=y3.get(i);

        }
        Thread.sleep(1000);
        y3.get(0).click();
        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/ac-question-body-form/div/div[2]/mat-form-field/div/div/div/textarea")).sendKeys("What is a Defect?");
        getDriver().findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();

        Thread.sleep(1000);
        List<WebElement> bttn4=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));

        for(int i=0;i<bttn4.size();i++) {
            WebElement c=bttn4.get(i);
        }
        bttn4.get(4).click();
        Thread.sleep(1000);

        System.out.println("wow");

        List<WebElement> ques4=getDriver().findElements(By.xpath("//*[@placeholder='Question *']"));
        for(int i=0;i<ques4.size();i++) {
            WebElement ques5=ques4.get(i);
        }
        ques4.get(1).sendKeys("What are different test levels?");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("Unit, Integration, system and acceptance testing");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("unit, regression, system and end to end testing");
        List<WebElement> rdbttn4=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        rdbttn4.get(6).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();

    }
//teacher assigns three quizzes to a single student
    @And("^teacher \"([^\"]*)\" three quizes to a single student$")
    public void teacherThreeQuizesToASingleStudent(String arg0) throws Throwable {
        Thread.sleep(3000);
       // getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        List<WebElement> assign=getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        assign.get(2).click();
        Thread.sleep(1000);



        //1st assignment
        getDriver().findElement(By.xpath("//a[@href='/#/assign-quiz']")).click();
        List<WebElement> studntlst=getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        for(int i=0;i<studntlst.size();i++) {
            WebElement studnt=getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i);
            String studntnm=getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i).getText();
            if(studntnm.contains("Ella Miller")) {studnt.click();}
        }

        List<WebElement>	 arrow= getDriver().findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
        arrow.get(1).click();

        List<WebElement> qzlst=getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span"));
        for(int i=0;i<qzlst.size();i++) {
            WebElement qzlst1=getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i);
            String quizz=getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i).getText();
            if(quizz.contains("losaltos1")) {
                qzlst1.click();
                break;
            }
        }

        getDriver().findElement(By.xpath("//span[contains( text(),'Give Assignment')]")).click();
        Thread.sleep(1000);




        //2nd assignment

        getDriver().findElement(By.xpath("//a[@href='/#/assign-quiz']")).click();
        List<WebElement> studntlst1=getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        for(int i=0;i<studntlst1.size();i++) {
            WebElement studnt=getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i);
            String studntnm=getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i).getText();
            if(studntnm.contains("Ella Miller")) {studnt.click();}
        }

        List<WebElement>	 arrow1= getDriver().findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
        arrow1.get(1).click();

        List<WebElement> qzlstt=getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span"));
        for(int i=0;i<qzlstt.size();i++) {
            WebElement qzlst1=getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i);
            String quizz=getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i).getText();
            if(quizz.contains("losaltos2")) {
                qzlst1.click();
                break;
            }
        }

        getDriver().findElement(By.xpath("//span[contains( text(),'Give Assignment')]")).click();
        Thread.sleep(1000);






        //3rd Assignment

        getDriver().findElement(By.xpath("//a[@href='/#/assign-quiz']")).click();
        Thread.sleep(1000);
        List<WebElement> studntlst2=getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        for(int i=0;i<studntlst2.size();i++) {
            WebElement studnt=getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i);
            String studntnm=getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i).getText();
            if(studntnm.contains("Ella Miller")) {studnt.click();}
        }

        List<WebElement>	 arrow2= getDriver().findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
        arrow2.get(1).click();

        List<WebElement> qzlst3=getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span"));
        for(int i=0;i<qzlst3.size();i++) {
            WebElement qzlst1=getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i);
            String quizz=getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i).getText();
            if(quizz.contains("losaltos3")) {
                qzlst1.click();
                break;
            }
        }

        getDriver().findElement(By.xpath("//span[contains( text(),'Give Assignment')]")).click();
        Thread.sleep(3000);



    }
//teacher logout
    @And("^teacher \"([^\"]*)\"$")
    public void teacher(String arg0) throws Throwable {
Thread.sleep(2000);
       // getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        List<WebElement> lgout=getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        lgout.get(6).click();
        Thread.sleep(1000);
        //getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
        getDriver().findElement(By.xpath("//button[@class='mat-button mat-warn']/span")).click();
    }

    @And("^student \"([^\"]*)\"$")
    public void student(String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
Thread.sleep(2000);
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("2youssef.l@18-9-2.tk");
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("abcde");
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(4000);
    }

    @Then("^student answer \"([^\"]*)\"$")
    public void studentAnswer(String arg0) throws Throwable {
        //Student Check the first Assignment
        Thread.sleep(3000);
         getDriver().findElement(By.xpath("//h5[contains(text(),'My Assignments')]")).click();
        //1st Assessment completing for student
        List<WebElement> assess=getDriver().findElements(By.xpath("//span[contains(text(),'Go To Assessment')]"));
        assess.get(2).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']/textarea")).sendKeys("xxxer");
        List<WebElement> ans=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle'] "));
        ans.get(0).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//button[@type='button']")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Ok')]")).click();

Thread.sleep(3000);



    }
//student completing second assignment
    @Then("^also answered \"([^\"]*)\"$")
    public void alsoAnswered(String arg0) throws Throwable {
        //2nd assessment completing by student
        Thread.sleep(3000);
        List<WebElement> assess1=getDriver().findElements(By.xpath("//span[contains(text(),'Go To Assessment')]"));
        assess1.get(1).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']/textarea")).sendKeys("xxxer");
        List<WebElement> ans1=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle'] "));
        ans1.get(0).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//button[@type='button']")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
Thread.sleep(3000);
    }
//student completing third assignment
    @And("^student answered \"([^\"]*)\"$")
    public void studentAnswered(String arg0) throws Throwable {
        //3rd assessment completing by student
        Thread.sleep(3000);
        List<WebElement> assess2=getDriver().findElements(By.xpath("//span[contains(text(),'Go To Assessment')]"));
        assess2.get(1).click();
        getDriver().findElement(By.xpath("//div[@class='mat-input-infix mat-form-field-infix']/textarea")).sendKeys("xxxer");
        List<WebElement> ans2=getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle'] "));
        ans2.get(0).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//button[@type='button']")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Ok')]")).click();

Thread.sleep(3000);

    }

    //Logout from Student account

    @And("^student able \"([^\"]*)\"$")
    public void studentAble(String arg0) throws Throwable {

        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
        Thread.sleep(5000);
    }


    @And("^teacher login and view the student's \"([^\"]*)\"$")
    public void teacherLoginAndViewTheStudentS(String arg0) throws Throwable {
        //teacher login to own account
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("lfelipe@gag16dotw7t.tk");
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();


        //and view the student's assignments as passedg
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        Thread.sleep(5000);
    }



    @Then("^delete all the \"([^\"]*)\" that teacher created$")
    public void deleteAllTheThatTeacherCreated(String arg0) throws Throwable {
        //finding the quizzes
        Thread.sleep(3000);
        List<WebElement> quizz=getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        quizz.get(3).click();

        Thread.sleep(2000);
        //deleting first quiz "losaltos1"
        List<WebElement> lsaltos1=getDriver().findElements(By.xpath("//span[@class='mat-content']/mat-panel-title"));
        for(int i=0;i<lsaltos1.size();i++) {
            WebElement qzlst1=getDriver().findElements(By.xpath("//span[@class='mat-content']/mat-panel-title")).get(i);
            String quizlst1=getDriver().findElements(By.xpath("//span[@class='mat-content']/mat-panel-title")).get(i).getText();
            if(quizlst1.contains("losaltos1")) {
                qzlst1.click();
                break;
            }
        }
        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[2]/span")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//ac-modal-confirmation[@class='ng-star-inserted']/div[2]/button[2]/span")).click();

        Thread.sleep(2000);

        //deleting second quiz "losaltos2"

        List<WebElement> lsaltos2=getDriver().findElements(By.xpath("//span[@class='mat-content']/mat-panel-title"));
        for(int i=0;i<lsaltos2.size();i++) {
            WebElement qzlst1=getDriver().findElements(By.xpath("//span[@class='mat-content']/mat-panel-title")).get(i);
            String quizlst1=getDriver().findElements(By.xpath("//span[@class='mat-content']/mat-panel-title")).get(i).getText();
            if(quizlst1.contains("losaltos2")) {
                qzlst1.click();
                break;
            }
        }
        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[2]/span")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//ac-modal-confirmation[@class='ng-star-inserted']/div[2]/button[2]/span")).click();

        Thread.sleep(2000);

        //deleting third quiz "losaltos3"
        List<WebElement> lsaltos3=getDriver().findElements(By.xpath("//span[@class='mat-content']/mat-panel-title"));
        for(int i=0;i<lsaltos3.size();i++) {
            WebElement qzlst1=getDriver().findElements(By.xpath("//span[@class='mat-content']/mat-panel-title")).get(i);
            String quizlst1=getDriver().findElements(By.xpath("//span[@class='mat-content']/mat-panel-title")).get(i).getText();
            if(quizlst1.contains("losaltos3")) {
                qzlst1.click();
                break;
            }
        }
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[2]/span")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//ac-modal-confirmation[@class='ng-star-inserted']/div[2]/button[2]/span")).click();


    }

    @Then("^deleting all of the \"([^\"]*)\" teacher created$")
    public void deletingAllOfTheTeacherCreated(String arg0) throws Throwable {
        //deleting the assignments
        Thread.sleep(2000);
        List<WebElement> assign=getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        assign.get(2).click();


        //deleting the third assignment  "losaltos3"

        Thread.sleep(2000);
        List<WebElement> quiznme2 = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]"));
        for (int j = 0; j < quiznme2.size(); j++) {
            WebElement qznme =getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j);

            String quizznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j).getText();
            Thread.sleep(2000);
            if (quizznme.contains("losaltos3")) {
                qznme.click();
                getDriver().findElement(By.xpath(" //*[contains(text(),'more_vert')]")).click();
                getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();
                Thread.sleep(2000);
                getDriver().findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
                Thread.sleep(1000);
                break;
            }
        }
        Thread.sleep(3000);

        //deleting the second assignment  "losaltos2"
        List<WebElement> assign1=getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        assign1.get(2).click();



        List<WebElement> quiznme3 = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]"));
        for (int j = 0; j < quiznme3.size(); j++) {
            WebElement qznme =getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j);

            String quizznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j).getText();
            Thread.sleep(2000);
            if (quizznme.contains("losaltos2")) {
                qznme.click();
                getDriver().findElement(By.xpath(" //*[contains(text(),'more_vert')]")).click();
                getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();
                Thread.sleep(2000);
                getDriver().findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
                Thread.sleep(1000);
                break;
            }
        }

        Thread.sleep(3000);
        //deleting the first assignment  "losaltos1"

        List<WebElement> assign3=getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        assign3.get(2).click();



        List<WebElement> quiznme4 = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]"));
        for (int j = 0; j < quiznme4.size(); j++) {
            WebElement qznme =getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j);

            String quizznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j).getText();
            Thread.sleep(2000);
            if (quizznme.contains("losaltos1")) {
                qznme.click();
                getDriver().findElement(By.xpath(" //*[contains(text(),'more_vert')]")).click();
                getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();
                Thread.sleep(2000);
                getDriver().findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
                Thread.sleep(1000);
                break;
            }

        }
}
}
