package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import study.qa.automation.utils.TestContext;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class AssignmentForFiveStudents {
    @When("^I navigate to login page$")
    public void iNavigateToLoginPageILoginAsATeacher() throws InterruptedException {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        Thread.sleep(1000);

    }

    @And("^I login as a teacher with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginAsATeacherWithEmailAndPassword(String login, String teacherpass) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys(login);
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys(teacherpass);
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);


    }

    @And("^create new quiz$")
    public void createNewQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(1000);                 //1000 milliseconds is one second.
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("quiz for assignment for 5 students");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[text()='add_circle']")).click();

        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//div[contains(text(), 'Single-Choice')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//*[@placeholder='Question *']")).sendKeys("Some text for Fifth q?");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//textarea[@placeholder='Option 1*']")).sendKeys("first version of answer");
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//textarea[@placeholder='Option 2*']")).sendKeys("second version of answer");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Q1:')]/../../..//*[@placeholder='Option 1*']/../../../../..//mat-radio-button")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(), 'Save')]")).click();
        Thread.sleep(1000);

    }


    @And("^choose the quiz$")
    public void chooseTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[text()='Assignments']")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(), 'Create New Assignment')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(), 'Select Quiz To Assign')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//div/..//*[contains (text(), 'quiz for assignment for 5 students')]")).click();
        Thread.sleep(1000);
    }

    @And("^assign quiz to \"([^\"]*)\"$")
    public void assignQuizTo(String nameStudent) throws Throwable {


        List<WebElement> names = getDriver().findElements(By.xpath("//div[@class= 'mat-list-text']"));
        int count = names.size();
        for (int i = 0; i < count; i++) {
            String text = names.get(i).getText();
            if (text.contains(nameStudent)) {
                names.get(i).click();
                Thread.sleep(1000);
                //getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]")).click();

                break;
            }
        }
    }

    @And("^push assign button$")
    public void pushAssignButton() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]")).click();
        Thread.sleep(2000);
    }


    @And("^push logout$")
    public void logoutAsATeacherAndLoginAsAStudent() throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
        Thread.sleep(1000);

    }

    @And("^login as a student with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void loginAsAStudentWithEmailAndPassword(String email, String password) throws Throwable {
        getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys(email);
        getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys(password);
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

    }

    @Then("^verify that assignment was given$")
    public void verifyThatAssignmentWasDone() {
        getDriver().findElement(By.xpath("//h5[contains(text(),'My Assignments')]")).click();
        WebElement quiz = getDriver().findElement(By.xpath("//h4[contains(text(), 'My Assignment')]/..//*[contains(text(), 'quiz for assignment for 5 students')]"));
        String textFromQuiz = quiz.getText();
        assertThat(textFromQuiz.contains("quiz for assignment for 5 students")).isTrue();
        String name =getDriver().findElement(By.xpath("//div[@class='info']//h3")).getText();
        if (textFromQuiz.contains("quiz for assignment for 5 students")){
            System.out.println(name+ " get assignment. ");
        }

    }

    @And("^Delete quiz with name \"([^\"]*)\"$")
    public void deleteQuizWithName(String nameOfQuiz) throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
        Thread.sleep(2000);

        int quizzes = getDriver().findElements(By.xpath("//*[contains(text(), 'quiz for assignment for 5 students')]")).size();

        /*if (quizzes!=0){
            getDriver().findElement(By.xpath("//*[contains(text(), 'quiz for assignment for 5 students')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'quiz for assignment for 5 students')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(1000);

            getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
        }*/
        /*while(quizzes!=0){
            getDriver().findElement(By.xpath("//*[contains(text(), 'quiz for assignment for 5 students')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'quiz for assignment for 5 students')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(1000);

            getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
        }*/
        for (int i = 0; i < quizzes; i++) {
            getDriver().findElement(By.xpath("//*[contains(text(), 'quiz for assignment for 5 students')]")).click();
            Thread.sleep(1000);
            getDriver().findElement(By.xpath("//*[contains(text(), 'quiz for assignment for 5 students')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(1000);

            getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(5000);

        }

    }

    @And("^Delete assignments with name \"([^\"]*)\"$")
    public void deleteAssignmentsWithName(String assignName) throws Throwable {
        getDriver().findElement(By.xpath("//h5[text()='Assignments']")).click();
        Thread.sleep(1000);

        int countAssignments=getDriver().findElements(By.xpath("//*[contains(text(), 'quiz for assignment for 5 students')]/..//*[contains(text(), 'more_vert')]")).size();
        Thread.sleep(1000);

        if (countAssignments!=0){
        getDriver().findElement(By.xpath("//*[contains(text(), 'quiz for assignment for 5 students')]/..//*[contains(text(), 'more_vert')]")).click();
            Thread.sleep(1000);

            getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
            Thread.sleep(3000);


        }

        //*[contains(text(),'Quiz: quiz for assignment for 5 students')]

        //*[contains(text(),'more_vert')]/../../../..//*[contains(text(), 'quiz for assignment for 5 students')]


    }
}