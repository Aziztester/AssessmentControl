package study.qa.automation.stepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import study.qa.automation.utils.TestContext;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static study.qa.automation.utils.TestContext.getDriver;

public class AssignedQuizViewedAfterStudentSubmission {
    @Given("^Navigate to the login page  \"([^\"]*)\"$")
    public void navigateToTheLoginPage(String arg0) throws Throwable {

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
        List<WebElement> singlechoice = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        singlechoice.get(1).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//textarea[@placeholder='Question *']")).sendKeys("What is a Test Scenario?");
        List<WebElement> frstopans = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        frstopans.get(3).click();
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 1*']")).sendKeys("Identifying all the possible areas to be tested ");
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 2*']")).sendKeys("specifice areas only");
        //mark as showstopper
        List<WebElement> shwstpper = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container']"));
        shwstpper.get(1).click();
        //push add question
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();
        List<WebElement> multichoice = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        multichoice.get(7).click();

        List<WebElement> multques = getDriver().findElements(By.xpath("//textarea[@placeholder='Question *']"));
        multques.get(1).sendKeys("What is most frequent testing?");

        //select first option in multiple choice
        List<WebElement> frstop = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
        frstop.get(0).click();
        List<WebElement> frstmultop = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 1*']"));
        frstmultop.get(1).sendKeys("Release/Build, Acceptance");
        List<WebElement> secndmultop = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 2*']"));
        secndmultop.get(1).sendKeys("Stress testing");
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();

    }

    //creates second quiz
    @Then("^teacher also create \"([^\"]*)\"$")
    public void teacherAlsoCreate(String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("losaltos2");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x2 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x2);
        List<WebElement> singlechoice1 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        singlechoice1.get(1).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//textarea[@placeholder='Question *']")).sendKeys("What is Priority?");
        List<WebElement> frstopans1 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        frstopans1.get(3).click();
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 1*']")).sendKeys("It indicates the importance or urgency of fixing a defect");
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 2*']")).sendKeys("anytime can fix this bug. No time limit");
        //mark as showstopper
        List<WebElement> shwstpper1 = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container']"));
        shwstpper1.get(1).click();
        //push add question
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();
        List<WebElement> multichoice1 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        multichoice1.get(7).click();

        List<WebElement> multques1 = getDriver().findElements(By.xpath("//textarea[@placeholder='Question *']"));
        multques1.get(1).sendKeys("What is a Bug?");

        //select first option in multiple choice
        List<WebElement> frstop1 = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
        frstop1.get(0).click();
        List<WebElement> frstmultop1 = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 1*']"));
        frstmultop1.get(1).sendKeys("Mismatch between actual and intended behaviors of the software.");
        List<WebElement> secndmultop1 = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 2*']"));
        secndmultop1.get(1).sendKeys("Some small insect that flies around.");
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();


    }

    @And("^then last \"([^\"]*)\"$")
    public void thenLast(String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("losaltos3");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x3 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x3);
        List<WebElement> singlechoice2 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        singlechoice2.get(1).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//textarea[@placeholder='Question *']")).sendKeys("What is API?");
        List<WebElement> frstopans2 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        frstopans2.get(3).click();
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 1*']")).sendKeys("Application Program Interface ");
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 2*']")).sendKeys("Application Process Information");
        //mark as showstopper
        List<WebElement> shwstpper2 = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container']"));
        shwstpper2.get(1).click();
        //push add question
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();
        List<WebElement> multichoice2 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        multichoice2.get(7).click();

        List<WebElement> multques2 = getDriver().findElements(By.xpath("//textarea[@placeholder='Question *']"));
        multques2.get(1).sendKeys("Who can assign/change a severity in a bug report?");

        //select first option in multiple choice
        List<WebElement> frstop2 = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
        frstop2.get(0).click();
        List<WebElement> frstmultop2 = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 1*']"));
        frstmultop2.get(1).sendKeys("Tester");
        List<WebElement> secndmultop2 = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 2*']"));
        secndmultop2.get(1).sendKeys("Development Manager");
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();


    }

    //teacher assigns three quizzes to a single student

    @And("^teacher \"([^\"]*)\" three quizes to a single student$")
    public void teacherThreeQuizesToASingleStudent(String arg0) throws Throwable {
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        Thread.sleep(1000);


        //1st assignment
        getDriver().findElement(By.xpath("//a[@href='/#/assign-quiz']")).click();
        List<WebElement> studntlst = getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        for (int i = 0; i < studntlst.size(); i++) {
            WebElement studnt = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i);
            String studntnm = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i).getText();
            if (studntnm.contains("Ella Miller")) {
                studnt.click();
            }
        }

        List<WebElement> arrow = getDriver().findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
        arrow.get(1).click();

        List<WebElement> qzlst = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span"));
        for (int i = 0; i < qzlst.size(); i++) {
            WebElement qzlst1 = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i);
            String quizz = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i).getText();
            if (quizz.contains("losaltos1")) {
                qzlst1.click();
                break;
            }
        }

        getDriver().findElement(By.xpath("//span[contains( text(),'Give Assignment')]")).click();
        Thread.sleep(1000);


        //2nd assignment

        getDriver().findElement(By.xpath("//a[@href='/#/assign-quiz']")).click();
        List<WebElement> studntlst1 = getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        for (int i = 0; i < studntlst1.size(); i++) {
            WebElement studnt = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i);
            String studntnm = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i).getText();
            if (studntnm.contains("Ella Miller")) {
                studnt.click();
            }
        }

        List<WebElement> arrow1 = getDriver().findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
        arrow1.get(1).click();

        List<WebElement> qzlstt = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span"));
        for (int i = 0; i < qzlstt.size(); i++) {
            WebElement qzlst1 = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i);
            String quizz = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i).getText();
            if (quizz.contains("losaltos2")) {
                qzlst1.click();
                break;
            }
        }

        getDriver().findElement(By.xpath("//span[contains( text(),'Give Assignment')]")).click();
        Thread.sleep(1000);


        //3rd Assignment

        getDriver().findElement(By.xpath("//a[@href='/#/assign-quiz']")).click();
        Thread.sleep(1000);
        List<WebElement> studntlst2 = getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        for (int i = 0; i < studntlst2.size(); i++) {
            WebElement studnt = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i);
            String studntnm = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i).getText();
            if (studntnm.contains("Ella Miller")) {
                studnt.click();
            }
        }

        List<WebElement> arrow2 = getDriver().findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
        arrow2.get(1).click();

        List<WebElement> qzlst3 = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span"));
        for (int i = 0; i < qzlst3.size(); i++) {
            WebElement qzlst1 = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i);
            String quizz = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i).getText();
            if (quizz.contains("losaltos3")) {
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

        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
    }

    @And("^student \"([^\"]*)\"$")
    public void student(String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys("2youssef.l@18-9-2.tk");
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys("abcde");
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
    }

    @Then("^student answer \"([^\"]*)\"$")
    public void studentAnswer(String arg0) throws Throwable {
        ////1st Assessment completing by student
        //Student Check the first Assignment
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'My Assignments')]")).click();
        //1st Assessment done for student
        Thread.sleep(1000);
        List<WebElement> assess = getDriver().findElements(By.xpath("//tr[@class='ng-star-inserted']/td/a/button/span"));
        assess.get(2).click();

        List<WebElement> ans1 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle'] "));
        ans1.get(0).click();

        List<WebElement> ans2 = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container']"));
        ans2.get(0).click();
       // Thread.sleep(1000);
        getDriver().findElement(By.xpath("//button[@type='button']")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
    }


    //student completing second assignment
    @Then("^also answered \"([^\"]*)\"$")
    public void alsoAnswered(String arg0) throws Throwable {
        //2nd assessment completing by student
        Thread.sleep(2000);
        List<WebElement> assess1 = getDriver().findElements(By.xpath("//tr[@class='ng-star-inserted']/td/a/button/span"));
        assess1.get(1).click();

        List<WebElement> altos2ans1 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle'] "));
        altos2ans1.get(0).click();

        List<WebElement> altos2ans2 = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container']"));
        altos2ans2.get(0).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//button[@type='button']")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Ok')]")).click();


    }

    //student completing third assignment
    @And("^student answered \"([^\"]*)\"$")
    public void studentAnswered(String arg0) throws Throwable {
        //3rd assessment completing by student
        Thread.sleep(1000);
        List<WebElement> assess2 = getDriver().findElements(By.xpath("//tr[@class='ng-star-inserted']/td/a/button/span"));
        assess2.get(0).click();
        Thread.sleep(1000);

        List<WebElement> altos3ans1 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle'] "));
        altos3ans1.get(0).click();

        List<WebElement> altos3ans2 = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container']"));
        altos3ans2.get(0).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//button[@type='button']")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Ok')]")).click();


    }

    //Logout from Student account

    @And("^student able \"([^\"]*)\"$")
    public void studentAble(String arg0) throws Throwable {

        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
    }


    @And("^teacher login and view the student's \"([^\"]*)\"$")
    public void teacherLoginAndViewTheStudentS(String arg0) throws Throwable {

        //and view the student's assignments as passed
        //search in Assignment
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        Thread.sleep(2000);


        ////teacher check student's first assignment
        List<WebElement> quiznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]"));
        for (int j = 0; j < quiznme.size(); j++) {
            WebElement qznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j);

            String quizznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j).getText();
            Thread.sleep(2000);
            if (quizznme.contains("losaltos1")) {
                qznme.click();
                break;
            }
        }

        Thread.sleep(2000);

        //teacher check student's second assignment
        List<WebElement> quiznme1 = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]"));
        for (int j = 0; j < quiznme1.size(); j++) {
            WebElement qznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j);

            String quizznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j).getText();
            Thread.sleep(2000);
            if (quizznme.contains("losaltos2")) {
                qznme.click();
                break;
            }
        }
        Thread.sleep(2000);

        //teacher check student's third assignment
        List<WebElement> quiznme2 = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]"));
        for (int j = 0; j < quiznme2.size(); j++) {
            WebElement qznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j);

            String quizznme = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(j).getText();
            Thread.sleep(2000);
            if (quizznme.contains("losaltos3")) {
                qznme.click();
                break;
            }
        }
        Thread.sleep(3000);


        //Another way to check by Clicking on User's Management
        List<WebElement> studnt = getDriver().findElements(By.xpath("//div[@class='mat-list-text']/h5"));
        studnt.get(4).click();
        Thread.sleep(1000);

        List<WebElement> studntnme = getDriver().findElements(By.xpath("//div[@class='mat-list-item-content']/div/h4"));
        for (int i = 0; i < studntnme.size(); i++) {
            WebElement studntt = getDriver().findElements(By.xpath("//div[@class='mat-list-item-content']/div/h4")).get(i);
            String stu = getDriver().findElements(By.xpath("//div[@class='mat-list-item-content']/div/h4")).get(i).getText();
            if (stu.contains("Ella Miller")) {
                getDriver().findElements(By.xpath("//div[@class='mat-list-item-content']/div/h4")).get(i).click();
                Thread.sleep(2000
                );
                break;
            }

        }
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