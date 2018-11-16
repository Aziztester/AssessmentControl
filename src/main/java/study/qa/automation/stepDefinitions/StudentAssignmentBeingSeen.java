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



public class StudentAssignmentBeingSeen {
    @Given("^navigate to teacher \"([^\"]*)\" page$")
    public void navigateToTeacherPage(String arg0) throws Throwable {

        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        getDriver().findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("umoha@jerapah993r.gq");
        getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
    }

    @And("^create quiz with \"([^\"]*)\" question$")
    public void createQuizWithQuestion(String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        //teacher Create quiz
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("PracticalQABasics");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x);
        List<WebElement> singlechoice = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        singlechoice.get(1).click();
        Thread.sleep(1000);

        //Adding first question
        getDriver().findElement(By.xpath("//textarea[@placeholder='Question *']")).sendKeys("What is a Defect?");
        List<WebElement> frstopans = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        Thread.sleep(1000);
        frstopans.get(3).click();
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 1*']")).sendKeys("Any flaw or imperfection in a software work product");
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 2*']")).sendKeys("without any issues");
        //mark as showstopper
        List<WebElement> shwstpper = getDriver().findElements(By.xpath("//div[@class='mat-checkbox-inner-container']"));
        shwstpper.get(1).click();
        //push add question
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();
        Thread.sleep(2000);
        //Adding second question
        List<WebElement> secsinglchoice = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        secsinglchoice.get(6).click();
        Thread.sleep(2000);
        List<WebElement> secques = getDriver().findElements(By.xpath("//textarea[@placeholder='Question *']"));
        secques.get(1).sendKeys("What is a Test Scenario?");
        List<WebElement> frstans = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 1*']"));
        frstans.get(1).sendKeys("Identifying all the possible areas to be tested");

        List<WebElement> secndans = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 2*']"));
        secndans.get(1).sendKeys("specifice areas only");

        List<WebElement> frstopselect = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        frstopselect.get(8).click();


        //Adding third question
        getDriver().findElement(By.xpath("//*[contains(text(),'add_circle')]")).click();
        Thread.sleep(1000);
        List<WebElement> thrdsinglchoice = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        thrdsinglchoice.get(11).click();
        Thread.sleep(2000);
        List<WebElement> thrdques = getDriver().findElements(By.xpath("//textarea[@placeholder='Question *']"));
        thrdques.get(2).sendKeys("What are different test levels?");
        List<WebElement> frstans3 = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 1*']"));
        frstans3.get(2).sendKeys("unit, regression, system and end to end testing");

        List<WebElement> secndans3 = getDriver().findElements(By.xpath("//textarea[@placeholder='Option 2*']"));
        secndans3.get(2).sendKeys("Unit, Integration, system and acceptance testing");


        //Select the second option as right ans
        List<WebElement> frstopselect3 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        frstopselect3.get(14).click();
        //now saving the quiz
        Thread.sleep(1000);
        //getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        List<WebElement> sve=getDriver().findElements(By.xpath("//button[@class='mat-raised-button mat-primary ng-star-inserted']/span"));
        sve.get(1).click();
    }

    @And("^\"([^\"]*)\" it to a single student$")
    public void itToASingleStudent(String arg0) throws Throwable {

        //Assign the quiz to a single student
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//a[@href='/#/assign-quiz']")).click();
        Thread.sleep(2000);
        List<WebElement> studntlst = getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        for (int i = 0; i < studntlst.size(); i++) {
            WebElement studnt = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i);
            String studntnm = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i).getText();
            if (studntnm.contains("Ivan Ivanov")) {
                studnt.click();
            }
        }

        List<WebElement> arrow = getDriver().findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
        arrow.get(1).click();

        List<WebElement> qzlst = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span"));
        for (int i = 0; i < qzlst.size(); i++) {
            WebElement qzlst1 = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i);
            String quizz = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i).getText();
            if (quizz.contains("PracticalQABasics")) {
                qzlst1.click();
                break;
            }
        }
        getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]")).click();
        Thread.sleep(2000);

    }


    @And("^then \"([^\"]*)\"$")
    public void then(String arg0) throws Throwable {
        //teacher logout
        Thread.sleep(2000);
        // getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        List<WebElement> lgout = getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
        lgout.get(6).click();
        Thread.sleep(1000);
        //getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
        getDriver().findElement(By.xpath("//button[@class='mat-button mat-warn']/span")).click();
    }

    @Then("^assign it to \"([^\"]*)\" students$")
    public void assignItToStudents(String arg0) throws Throwable {

        //Assign the quiz to five students
        Thread.sleep(4000);
        List<WebElement> assnav= getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
                assnav.get(2).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//a[@href='/#/assign-quiz']")).click();
        Thread.sleep(2000);
        String[] stunme = {"Peter Petrov", "Ivan Ivanov", "Elena Talley", "Emma Smith", "Sophia Jones"};
        for (int j = 0; j < stunme.length; j++) {
            List<WebElement> studntlst = getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
            for (int i = 0; i < studntlst.size(); i++) {
                WebElement studnt = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i);
                String studntnm = getDriver().findElements(By.xpath("//div[@class='mat-list-text']")).get(i).getText();
                if (studntnm.contains(stunme[j])) {
                    studnt.click();
                    break;
                }
            }
        }
        List<WebElement> arrow = getDriver().findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
        arrow.get(1).click();

        List<WebElement> qzlst = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span"));
        for (int i = 0; i < qzlst.size(); i++) {
            WebElement qzlst1 = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i);
            String quizz = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i).getText();
            if (quizz.contains("PracticalQABasics")) {
                qzlst1.click();
                break;
            }
        }
        getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]")).click();
    }


    @Then("^assign it to \"([^\"]*)\"$")
    public void assignItTo(String arg0) throws Throwable {

        //Assign it to all students
        Thread.sleep(4000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//a[@href='/#/assign-quiz']")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Select All')]")).click();
        List<WebElement> arrow = getDriver().findElements(By.xpath("//div[@class='mat-select-arrow-wrapper']"));
        arrow.get(1).click();

        List<WebElement> qzlst = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span"));
        for (int i = 0; i < qzlst.size(); i++) {
            WebElement qzlst1 = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i);
            String quizz = getDriver().findElements(By.xpath("//mat-option[@class='mat-option ng-star-inserted']/span")).get(i).getText();
            if (quizz.contains("PracticalQABasics")) {
                qzlst1.click();
                break;
            }
        }
        getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]")).click();
    }


    @And("^teacher delete the \"([^\"]*)\"$")
    public void teacherDeleteThe(String arg0) throws Throwable {
        // teacher delete the quiz
        Thread.sleep(5000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        List<WebElement> quizz = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title"));
        for (int i = 0; i < quizz.size(); i++) {
            WebElement quiz = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i);

            String quiznme = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).getText();
            if (quiznme.contains("PracticalQABasics")) {
                getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).click();
                getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[2]/span")).click();
                getDriver().findElement(By.xpath("//button[@class='mat-button mat-warn']/span")).click();
                break;

            }
        }
    }

    @And("^teacher also delete the \"([^\"]*)\"$")
    public void teacherAlsoDeleteThe(String arg0) throws Throwable {
        // teacher also delete the assignment
        Thread.sleep(5000);
        List<WebElement> assnav = getDriver().findElements(By.xpath("//div[@class='mat-list-text'] "));
        assnav.get(2).click();

        List<WebElement> fndassign = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]"));
        for (int i = 0; i < fndassign.size(); i++) {
            WebElement findassi = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(i);

            String findassign1 = getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(i).getText();

            if (findassign1.contains("PracticalQABasics")) {
                getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title[3]")).get(i).click();
                // getDriver().findElements(By.xpath("//*[@class='mat-accordion']/mat-expansion-panel/mat-expansion-panel-header/span")).get(i).click();
                getDriver().findElement(By.xpath("//*[contains(text(),'more_vert')]")).click();
                getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();
                List<WebElement> del = getDriver().findElements(By.xpath("//button[@aria-label='Close dialog']/span "));
                del.get(1).click();
                break;
            }
        }
    }
}