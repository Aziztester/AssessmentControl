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


public class SingleChoiceQuestionText {
    //ASK-197...happy path
    @Given("^Navigate to login page  \"([^\"]*)\"$")
    public void navigateToLoginPage(String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        TestContext.getDriver().get("http://local.school.portnov.com:4520/#/login");
        getDriver().findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("lfelipe@gag16dotw7t.tk");
        getDriver().findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("12345");
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
    }

    @Then("^I create quiz with Alphanumerical and special character \"([^\"]*)\" path$")
    public void iCreateQuizWithAlphanumericalAndSpecialCharacterPath(String happy) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("altos");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println(x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
            String m = z.getAttribute("value");
            System.out.println(m);
        }
        Thread.sleep(1000);
        y.get(1).click();
        // System.out.println("wow");

        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Aa1$#!");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
            String k = n.getAttribute("value");
            System.out.println(k);
        }
        p.get(3).click();
        Thread.sleep(3000);

        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
    }




    @Then("^I verify the quiz present in \"([^\"]*)\"$")
    public void iVerifyTheQuizPresentIn (String arg0) throws Throwable {

        Thread.sleep(1000);
                int q = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).size();
                System.out.println(" Currently the number of Quizzes are " + q);
                for (int i = 0; i < q; i++) {
                    // String txt = getDriver().findElements(By.xpath("//span[@class='mat-content']")).get(i).getText();
                    String txt = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).getText();
                    if (txt.contains("altos")) {

                        getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).click();
                        //Thread.sleep(1000);
                        System.out.println(txt);
                        // Thread.sleep(1000);
                        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[1]/span[1 ]")).click();
                        Thread.sleep(2000);
                        getDriver().findElement(By.xpath("//ac-quiz-preview[@class='ng-star-inserted']/div[2]/button")).click();
                        Thread.sleep(1000);
            }
        }
    }

    @And("^I delete the \"([^\"]*)\"$")
    public void iDeleteThe (String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[2]/span")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']/button[2]")).click();
        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
    }
        //ASK-189...single char

    @Then("^I click on Create New quiz and create question as \"([^\"]*)\"$")
    public void iClickOnCreateNewQuizAndCreateQuestionAs (String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("altos");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println(x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
            String m = z.getAttribute("value");
            System.out.println(m);
        }
        Thread.sleep(5000);
        y.get(1).click();
        System.out.println("wow");
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("h");
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
            String k = n.getAttribute("value");
            System.out.println(k);
        }
        p.get(3).click();
        Thread.sleep(3000);

        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();

    }


    @And("^I verify  that the quiz present in \"([^\"]*)\"$")
    public void iVerifyThatTheQuizPresentIn (String arg0) throws Throwable {
        Thread.sleep(1000);
        int q = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).size();
        System.out.println(" Currently the number of Quizzes are " + q);
        for (int i = 0; i < q; i++) {
            // String txt = getDriver().findElements(By.xpath("//span[@class='mat-content']")).get(i).getText();
            String txt = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).getText();
            if (txt.contains("altos")) {

                getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).click();
                //Thread.sleep(1000);
                System.out.println(txt);
                // Thread.sleep(1000);
                getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[1]/span[1 ]")).click();
                Thread.sleep(2000);
                getDriver().findElement(By.xpath("//ac-quiz-preview[@class='ng-star-inserted']/div[2]/button")).click();
                Thread.sleep(1000);

                           }
        }
    }

//ASK-302.....zero char


    @Then("^create quiz entering \"([^\"]*)\" in question$")
    public void createQuizEnteringInQuestion (String arg0) throws Throwable {

        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("altos");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println(x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
            String m = z.getAttribute("value");
            System.out.println(m);
        }
        Thread.sleep(1000);
        y.get(1).click();
        System.out.println("wow");
        //getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Aa1$#!");
        // Thread.sleep(3000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
            String k = n.getAttribute("value");
            System.out.println(k);
        }
        p.get(3).click();
        Thread.sleep(1000);

        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
    }

    @And("^verify the \"([^\"]*)\"$")
    public void verifyThe (String arg0) throws Throwable {
        System.out.println(getDriver().findElement(By.xpath("//div[@class='mat-input-wrapper mat-form-field-wrapper']/div[3]/div/mat-error")).getText());
    }


    // ASK-303....leading space


    @Then("^enter a question with \"([^\"]*)\" in quiz$")
    public void enterAQuestionWithInQuiz (String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("altos");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(1).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(" abcd");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
        }
        p.get(3).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
    }

    @Then("^I check whether the quiz present in \"([^\"]*)\"$")
    public void iCheckWhetherTheQuizPresentIn (String arg0) throws Throwable {

        Thread.sleep(1000);
        int q = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).size();
        System.out.println(" Currently the number of Quizzes are " + q);
        for (int i = 0; i < q; i++) {
            // String txt = getDriver().findElements(By.xpath("//span[@class='mat-content']")).get(i).getText();
            String txt = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).getText();
            if (txt.contains("altos")) {

                getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).click();
                //Thread.sleep(1000);
                System.out.println(txt);
                // Thread.sleep(1000);
                getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[1]/span[1 ]")).click();
                Thread.sleep(2000);
                getDriver().findElement(By.xpath("//ac-quiz-preview[@class='ng-star-inserted']/div[2]/button")).click();
                Thread.sleep(1000);
            }
        }
    }








//ASK-309...........trailing space

    @And("^create quiz with \"([^\"]*)\" space in the question$")
    public void createQuizWithSpaceInTheQuestion (String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("altos");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(1).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("abcd  ");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
        }
        p.get(3).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();

    }


    @Then("^checked that it's in \"([^\"]*)\"$")
    public void checkedThatItSIn (String arg0) throws Throwable {
        Thread.sleep(1000);
        int q = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).size();
        System.out.println(" Currently the number of Quizzes are " + q);
        for (int i = 0; i < q; i++) {
            String txt = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).getText();
            if (txt.contains("altos")) {
                getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).click();
                System.out.println(txt);
                Thread.sleep(1000);
                getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[2]/span")).click();
                Thread.sleep(1000);
                getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']/button[2]")).click();
                getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
                Thread.sleep(1000);
                getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
            }
        }
    }


    //ASK-312.....space inside

    @And("^create question with \"([^\"]*)\" inside$")
    public void createQuestionWithInside (String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("altos");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(1).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("ab   c      deg");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
        }
        p.get(3).click();
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();


    }

    @And("^then check whether it's in the \"([^\"]*)\"$")
    public void thenCheckWhetherItSInThe (String arg0) throws Throwable {
        Thread.sleep(1000);
        int q = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).size();
        System.out.println(" Currently the number of Quizzes are " + q);
        for (int i = 0; i < q; i++) {
            String txt = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).getText();
            if (txt.contains("altos")) {
                getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).click();
                System.out.println(txt);
                Thread.sleep(1000);
                getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[2]/span")).click();
                Thread.sleep(1000);
                getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']/button[2]")).click();
                getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
                Thread.sleep(1000);
                getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
            }
        }

    }

    //ASK-192....Whitespace inside

    @Then("^create question that has \"([^\"]*)\" inside$")
    public void createQuestionThatHasInside (String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("altos");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(2000);
        y.get(1).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("   ");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
        }
        p.get(3).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();


    }

    @Then("^I create single choice question with \"([^\"]*)\" characters$")
    public void iCreateSingleChoiceQuestionWithCharacters (String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("altos");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(2000);
        y.get(1).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("rgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxc");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
        }
        p.get(3).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();

    }

    @Then("^I create  question with \"([^\"]*)\"  characters$")
    public void iCreateQuestionWithCharacters (String arg0) throws Throwable {
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("altos");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        System.out.println("The choice options are " + x);
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(2000);
        y.get(1).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("rgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcnxcgxcfxxdydytdyffxuwgfecygewfigwgfchhjvjvbhkbkbkjkhtdhtdhhxshfgewgkwkwhflwjlwjihuewgyvwcrgsxgxngxcx");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int j = 0; j < p.size(); j++) {
            WebElement n = p.get(j);
        }
        p.get(3).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
    }
}

   // git commit --amend --reset-author




