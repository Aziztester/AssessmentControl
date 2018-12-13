package study.qa.automation.stepDefinitions;

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

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class teacherCreateQuiz {

    @Given("^I Navigate to login page \"([^\"]*)\"$")
    public void iNavigateToLoginPage(String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(1000); //alt enter to call the bulb
    }

    @When("I register as a teacher")
    public void iRegisterAsATeacher() throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("VasyaPetrovTeacher@gmail.com");

        getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("123456");
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();

        String verif1 = getDriver().findElement(By.xpath("//h3[text()='Vasya Petrov']")).getText();
        if (verif1.equals("Vasya Petrov")) {
            System.out.println("good. you are a teacher!");
        } else {
            System.out.println("Something went wrong");
        }}
    @And("You create new quiz")
    public void youCreateNewQuiz() throws InterruptedException {

        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();

        Thread.sleep(1000);                 //1000 milliseconds is one second.

        if (getDriver().findElement(By.xpath("//h4[contains(text(),'List of Quizzes')]")).isDisplayed()) {
            System.out.println("List of Quizes is going Ok");
        } else {
            System.out.println("You need change code in list of quizzes");
        }
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("New quiz with 3 text,3 multiple, 3 single");

        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[text()='add_circle']")).click();
    }



    @And("create three textual questions")
    public void createThreeTextualQuestions() throws InterruptedException {
        //first text

        Thread.sleep(1000);

        List<WebElement> singlechoice = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        singlechoice.get(0).click();
        getDriver().findElement(By.xpath("//textarea[@placeholder='Question *']")).sendKeys("Some text for first text q?");
        getDriver().findElement(By.xpath("//*[text()='add_circle']")).click();
        //getDriver().findElement(By.xpath("//*[text()='add_circle']")).click();

        Thread.sleep(1000);

        //Second text
        List<WebElement> secsinglchoice = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        secsinglchoice.get(3).click();

        Thread.sleep(1000);

        List<WebElement> secques = getDriver().findElements(By.xpath("//textarea[@placeholder='Question *']"));
        secques.get(1).sendKeys("Some text for Second q?");
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();


        Thread.sleep(1000);


        //third text

        List<WebElement> thirdradio = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        thirdradio.get(6).click();

        Thread.sleep(1000);


        List<WebElement> thirdq = getDriver().findElements(By.xpath("//textarea[@placeholder='Question *']"));
        thirdq.get(2).sendKeys("Some text for Third q?");
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();


        Thread.sleep(1000);
    }
    @And("create three single-choice questions")
    public void createThreeSingleChoiceQuestions() throws InterruptedException {

        //first single

        List<WebElement> fouthradio = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        fouthradio.get(10).click();

        Thread.sleep(1000);

        List<WebElement> fourthq = getDriver().findElements(By.xpath("//textarea[@placeholder='Question *']"));
        fourthq.get(3).sendKeys("Some text for Fourth q?");
        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 1*']")).sendKeys("first version of answer");
        getDriver().findElement(By.xpath("//textarea[@placeholder='Option 2*']")).sendKeys("second version of answer");
        List<WebElement> fouthradio1 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        fouthradio1.get(12).click();
        Thread.sleep(1000);
        //getDriver().findElement(By.xpath("(//div[@class='mat-radio-outer-circle'])[12]")).click();
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();
        Thread.sleep(1000);

        //second single

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//div[contains(text(), 'Single-Choice')]")).click();
        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//*[@placeholder='Question *']")).sendKeys("Some text for Fifth q?");

        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("first version of answer");
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("second version of answer");
        //List<WebElement> fifthradio1 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        //fifthradio1.get(17).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q5:')]/../../..//*[@placeholder='Option 1*']/../../../../..//mat-radio-button")).click();
        Thread.sleep(1000);
        //getDriver().findElement(By.xpath("(//div[@class='mat-radio-outer-circle'])[12]")).click();
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();
        Thread.sleep(1000);

        //third single

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6:')]/../../..//div[contains(text(), 'Single-Choice')]")).click();
        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6:')]/../../..//*[@placeholder='Question *']")).sendKeys("Some text for sixth q?");

        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("first version of answer");
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("second version of answer");

        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q6:')]/../../..//*[@placeholder='Option 1*']/../../../../..//mat-radio-button")).click();
        Thread.sleep(1000);
        //getDriver().findElement(By.xpath("(//div[@class='mat-radio-outer-circle'])[12]")).click();
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();
        Thread.sleep(1000);
    }
    @And("create three multiple-choice questions")
    public void createThreeMultipleChoiceQuestions() throws InterruptedException {


        // first multi

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q7:')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q7:')]/../../..//*[@placeholder='Question *']")).sendKeys("Some text for seventh q?");

        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q7:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("first version of answer");
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q7:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("second version of answer");
        //List<WebElement> fifthradio1 = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        //fifthradio1.get(17).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Q7:')]/../../..//textarea[@placeholder='Option 1*']/../../../../..//mat-checkbox")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Q7:')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox")).click();
        //*[contains(text(),'Q7:')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox
        Thread.sleep(1000);
        //getDriver().findElement(By.xpath("(//div[@class='mat-radio-outer-circle'])[12]")).click();
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();
        Thread.sleep(1000);

        // second multi

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q8:')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q8:')]/../../..//*[@placeholder='Question *']")).sendKeys("Some text for eighth q?");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q8:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("first version of answer");
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q8:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("second version of answer");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Q8:')]/../../..//textarea[@placeholder='Option 1*']/../../../../..//mat-checkbox")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Q8:')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//div[@class='controls ng-star-inserted shift']/button/span/mat-icon")).click();
        Thread.sleep(1000);


        // third multi

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q9:')]/../../..//div[contains(text(), 'Multiple-Choice')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q9:')]/../../..//*[@placeholder='Question *']")).sendKeys("Some text for ninth q?");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q9:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("first version of answer");
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q9:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("second version of answer");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Q9:')]/../../..//textarea[@placeholder='Option 1*']/../../../../..//mat-checkbox")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Q9:')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox")).click();
        Thread.sleep(1000);
    }

    @Then("^verified that passing rate is (\\d+)%$")
    public void verifiedThatPassingRateIs(int arg0) throws Throwable {
        String currentPassRate=getDriver().findElement(By.xpath("//*[contains(text(), 'Passing Rate')]/../h1")).getText();

        assertThat(currentPassRate).isEqualTo("75%");

    }

    @When("we save quiz")
    public void weSaveQuiz() {

        getDriver().findElement(By.xpath("//span[contains(text(), 'Save')]")).click();
    }

    @Then("^verify that quiz with name \"([^\"]*)\" exist$")
    public void verifyThatQuizWithNameExist(String arg0) throws Throwable {
        int a=getDriver().findElements(By.xpath("//*[contains(text(), 'New quiz with 3 text,3 multiple, 3 single')]")).size();
        if (a==0){System.out.println("not exist");} else {System.out.println("Quiz exist");}
        //assertThat(getDriver().findElement(By.xpath("//*[contains(text(), 'New quiz with 3 text,3 multiple, 3 single')]"))).
    }







        /*Thread.sleep(1000);  New quiz with 3 text,3 multiple, 3 single
        //WebElement passingRate = getDriver().findElement(By.xpath("//*[contains(text(), 'Passing Rate')]/../h1"));//windows with rate
        String currentPassRate=getDriver().findElement(By.xpath("//*[contains(text(), 'Passing Rate')]/../h1")).getText();
        System.out.println(currentPassRate);
        WebElement buttonPlus = getDriver().findElement(By.xpath("//span[contains(text(), '+')]"));
        WebElement buttonMinus=getDriver().findElement(By.xpath("//span[text()='-']"));
        do {buttonMinus.click();} while (currentPassRate.equals(""))
        if (!currentPassRate.equals("75%")){
        buttonPlus.click();
        }*/














}

