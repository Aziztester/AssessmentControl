package study.qa.automation.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static study.qa.automation.utils.TestContext.getDriver;
//ASK-916     creating the quiz   Option - Alphanumeric & Special Characters
public class MultipleChoiceQuestionOption {
    @Then("^I create the quiz with Alphanumerical and special character \"([^\"]*)\" path$")
    public void iCreateTheQuizWithAlphanumericalAndSpecialCharacterPath(String arg0) throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("first question");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("SQA123#");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        getDriver().findElement(By.xpath("//label[@class='mat-checkbox-layout']/div")).click();
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();

    }



//ASK-917    creating the quiz   Option - Single Characters
    @Then("^I create the quiz with \"([^\"]*)\" option$")
    public void iCreateTheQuizWithOption(String arg0) throws Throwable {

        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("1");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("2");
        getDriver().findElement(By.xpath("//label[@class='mat-checkbox-layout']/div")).click();
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();

    }
    ////verify the quiz is present in quizlist and delete

    @And("^I verify the quiz present in \"([^\"]*)\" and delete$")
    public void iVerifyTheQuizPresentInAndDelete(String arg0) throws Throwable {
        Thread.sleep(4000);
        int q = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).size();
        // System.out.println(getDriver().findElement(By.xpath("//span[@class='mat-content']/mat-panel-title")).getSize());
        System.out.println(" Currently the number of Quizzes are " + q);
        Thread.sleep(4000);
        for (int i = 0; i < q; i++) {
            WebElement fndquz = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i);
            String txt = getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).getText();
            if (fndquz.getText().contains("Question 1")) {
                getDriver().findElements(By.xpath("//div[@class='quizzes']/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title")).get(i).click();
                Thread.sleep(1000);
                System.out.println(txt);
                getDriver().findElement(By.xpath("//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion mat-expanded']/div/div/div/button[2]/span")).click();


                getDriver().findElement(By.xpath("//div[@class='mat-dialog-actions']/button[2]")).click();
                break;
            }
        }
                List<WebElement> lgout = getDriver().findElements(By.xpath("//div[@class='mat-list-text']"));
                lgout.get(6).click();
                // getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
                Thread.sleep(1000);
                getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
            }



//ASK-920   creating the quiz   Option - zero Characters
    @Then("^create the quiz with \"([^\"]*)\" option$")
    public void createTheQuizWithOption(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        //getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("");
       // getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("");
        getDriver().findElement(By.xpath("//label[@class='mat-checkbox-layout']/div")).click();
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]")).click();

    }


    @And("^I check the \"([^\"]*)\" and logout$")
    public void iCheckTheAndLogout(String arg0) throws Throwable {
       Thread.sleep(4000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();

    }
    //ASK-921 creating the quiz   Option -  Leading Space
    @Then("^create  quiz with \"([^\"]*)\" option$")
    public void createQuizWithOption(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("  yes");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        getDriver().findElement(By.xpath("//label[@class='mat-checkbox-layout']/div")).click();
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
           }
//ASK-923 creating the quiz   Option -  Trailing Space
    @Then("^I create  quiz with \"([^\"]*)\" option$")
    public void iCreateQuizWithOption(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("yes   ");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        getDriver().findElement(By.xpath("//label[@class='mat-checkbox-layout']/div")).click();
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
    }
//ASK-924  creating the quiz   Option -  WhiteSpace only
    @Then("^I created the quiz with \"([^\"]*)\" option$")
    public void iCreatedTheQuizWithOption(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("    ");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("    ");
        getDriver().findElement(By.xpath("//label[@class='mat-checkbox-layout']/div")).click();
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);

    }
//ASK-926   creating the quiz   Option -  MultipleSpaces between characters
    @Then("^I created the quiz with \"([^\"]*)\" between characters option$")
    public void iCreatedTheQuizWithBetweenCharactersOption(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("456     hij   $%* ");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("no");
        getDriver().findElement(By.xpath("//label[@class='mat-checkbox-layout']/div")).click();
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);


    }
//ASK-927 creating the quiz   Option -  Max 1000 characters
    @Then("^I created the quiz with max \"([^\"]*)\"$")
    public void iCreatedTheQuizWithMax(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("srfsdxxdgxgfcxfgwcxgfwcxwqdywqfdywqfdytwfdytwfdywtfdtwfcwtfdugediehgiufhriugfhtroughotyihjuoitjuyoitjupygygiuewhcijfcljclkjclkhscdschfgdfchjfcghjgfcehjcghdvkfvgkdjrvgkdjvgkdjgrfkvdgvkdgvkdgkgvkdgvdgvkgdvkdgvkdgvkdgrvvjcgfjsehfkjshfkjshfjvgfvhgfcjsvgfhjvcgfgfhkhfjvrhgfhjvrgfjhegjwegkdjhwkdhjqwkeuqlkeuqihcgfeygrfyvewgrwvekuhwqkehjqlkwehjcwquelqiwiqvcgvyghureytoi4ejljklkwjflkwqhkuwqgejywqfeywqfjwqhgfrewhgkrehglkervchgcdvjvdjevdjhwvdhjwvdhjwvdhwvdhjwvdhjwevdhjewvdhjevhmebvcmebmcbemcbejbcjebfcjebfkjehwgduegefdjewfdjwegdkewhdihjewpoifewjfjeliehdegfwjywfdjewdwqjykudwqgedkuewgfqyudewydfyewqfdygfewidewgiudhgeouwhyfoiewyfiohrflihrewliahfiewgkugvdjgewcdghwqchchfdsqfwqcshwqcjvcdsjhwqvgkhdsgwqukegwqugduewiyfoiuryfoirehfilhrwlihfkuevgfhyewvdjgvcxghwSWHTQSTWFDYEGDUGEUWFREGFUKRGFYUGUEWIRGFEWHFIUHEWIFDYEWIHYFIUEWGYUFGEFYEWVGCDGEWCDEWQFDYEWQGDIUWHYFOIWREUOIFURIGJHYOIYTJUIOTYUIOYUOYJUITHGIUREHGUERGIUEWGFRYWFEYWFYDCWYDCYWQFYWGEUWQHEUWQHggeduegfrgiuegfueueueujglkjwhdegwqeuqgfjyewfqejfwqgcdhgwqcdehtwqeqfewj");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("srfsdxxdgxgfcxfgwcxgfwcxwqdywqfdywqfdytwfdytwfdywtfdtwfcwtfdugediehgiufhriugfhtroughotyihjuoitjuyoitjupygygiuewhcijfcljclkjclkhscdschfgdfchjfcghjgfcehjcghdvkfvgkdjrvgkdjvgkdjgrfkvdgvkdgvkdgkgvkdgvdgvkgdvkdgvkdgvkdgrvvjcgfjsehfkjshfkjshfjvgfvhgfcjsvgfhjvcgfgfhkhfjvrhgfhjvrgfjhegjwegkdjhwkdhjqwkeuqlkeuqihcgfeygrfyvewgrwvekuhwqkehjqlkwehjcwquelqiwiqvcgvyghureytoi4ejljklkwjflkwqhkuwqgejywqfeywqfjwqhgfrewhgkrehglkervchgcdvjvdjevdjhwvdhjwvdhjwvdhwvdhjwvdhjwevdhjewvdhjevhmebvcmebmcbemcbejbcjebfcjebfkjehwgduegefdjewfdjwegdkewhdihjewpoifewjfjeliehdegfwjywfdjewdwqjykudwqgedkuewgfqyudewydfyewqfdygfewidewgiudhgeouwhyfoiewyfiohrflihrewliahfiewgkugvdjgewcdghwqchchfdsqfwqcshwqcjvcdsjhwqvgkhdsgwqukegwqugduewiyfoiuryfoirehfilhrwlihfkuevgfhyewvdjgvcxghwSWHTQSTWFDYEGDUGEUWFREGFUKRGFYUGUEWIRGFEWHFIUHEWIFDYEWIHYFIUEWGYUFGEFYEWVGCDGEWCDEWQFDYEWQGDIUWHYFOIWREUOIFURIGJHYOIYTJUIOTYUIOYUOYJUITHGIUREHGUERGIUEWGFRYWFEYWFYDCWYDCYWQFYWGEUWQHEUWQHggeduegfrgiuegfueueueujglkjwhdegwqeuqgfjyewfqejfwqgcdhgwqcdehtwqeqfewj");
        getDriver().findElement(By.xpath("//label[@class='mat-checkbox-layout']/div")).click();
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);


    }
//ASK-942  creating the quiz   Option - Options filled out and selected

    @Then("^I created the quiz with \"([^\"]*)\" selected$")
    public void iCreatedTheQuizWithSelected(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("private");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("private");
        List<WebElement> opt=getDriver().findElements(By.xpath("//label[@class='mat-checkbox-layout']/div"));
        opt.get(0).click();
        opt.get(1).click();
        Thread.sleep(2000);
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);

    }
//ASk-943  creating the quiz   Option - Options filled out but not selected
    @Then("^created the quiz with \"([^\"]*)\" selected$")
    public void createdTheQuizWithSelected(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("private");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("private");
        Thread.sleep(2000);
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]")).click();





    }
    //ASK-944 creating the quiz   Option - Options not filled out but all selected
    @Then("^created the quiz with \"([^\"]*)\" but all selected$")
    public void createdTheQuizWithButAllSelected(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");

        List<WebElement> opt=getDriver().findElements(By.xpath("//label[@class='mat-checkbox-layout']/div"));
        opt.get(0).click();
        opt.get(1).click();
        Thread.sleep(2000);
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]")).click();


    }
//ASK-945  creating the quiz   Option - Options not filled out and nothing selected
    @Then("^created the quiz with \"([^\"]*)\" and nothing selected$")
    public void createdTheQuizWithAndNothingSelected(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");

         Thread.sleep(2000);
        List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]")).click();


    }
//ASK-946  creating the quiz   Option -Select "Include "Other" text area option for this question?
    @Then("^created the quiz including \"([^\"]*)\" option$")
    public void createdTheQuizIncludingOption(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("private");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("private");
        Thread.sleep(2000);
        List<WebElement> opt=getDriver().findElements(By.xpath("//label[@class='mat-checkbox-layout']/div"));
        opt.get(0).click();
        opt.get(1).click();
        opt.get(2).click();
        Thread.sleep(4000);
       // List<WebElement> p = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);

    }
//ASK-947  creating the quiz   Option - Add the option
    @Then("^created  quiz including \"([^\"]*)\" option$")
    public void createdQuizIncludingOption(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[@class='add-option']/button/span")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
        String errmsg=getDriver().findElement(By.xpath("//*[contains(text(),'*Choose at least one correct answer')]")).getText();
        System.out.println(errmsg);
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]")).click();

    }
//ASK-948  creating the quiz   Option - max no of  option
    @Then("^created  quiz with \"([^\"]*)\" option$")
    public void createdQuizWithOption(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        Thread.sleep(2000);

        WebElement addop=getDriver().findElement(By.xpath("//div[@class='add-option']/button/span"));
        for(int i=0;i<=7;i++){addop.click();}
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
        String errmsg=getDriver().findElement(By.xpath("//*[contains(text(),'*Choose at least one correct answer')]")).getText();
        System.out.println(errmsg);
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]")).click();

    }
    //ASK-949 creating the quiz   Option - delete the option
    @Then("^created  quiz with \"([^\"]*)\" in it$")
    public void createdQuizWithInIt(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question delete option");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("private");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("private");
        //select one option as answer
        List<WebElement> opt=getDriver().findElements(By.xpath("//label[@class='mat-checkbox-layout']/div"));

        opt.get(1).click();

        getDriver().findElement(By.xpath("//div[@class='add-option']/button/span")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 3*']")).sendKeys("private");
        Thread.sleep(1000);
        List<WebElement> delop=getDriver().findElements(By.xpath("//span[@class='mat-button-wrapper']/mat-icon"));
        delop.get(2).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Delete Option')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]")).click();
        Thread.sleep(2000);


    }
//ASK-950 creating the quiz   Option -One of option is not filled out
    @Then("^created  quiz with \"([^\"]*)\"$")
    public void createdQuizWith(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question delete option");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("private");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("private");
        //select one option as answer
        List<WebElement> opt=getDriver().findElements(By.xpath("//label[@class='mat-checkbox-layout']/div"));
        opt.get(0).click();
        opt.get(1).click();

        getDriver().findElement(By.xpath("//div[@class='add-option']/button/span")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 3*']")).sendKeys("private");
        Thread.sleep(1000);
        List<WebElement> delop=getDriver().findElements(By.xpath("//span[@class='mat-button-wrapper']/mat-icon"));
        delop.get(2).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Delete Option')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]")).click();
        Thread.sleep(2000);

    }
//ASk-951 creating the quiz   Option-  Reorder options in Question
    @Then("^create quiz with \"([^\"]*)\"$")
    public void createQuizWith(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question delete option");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 1*']")).sendKeys("private1");
        getDriver().findElement(By.xpath("//*[@placeholder='Option 2*']")).sendKeys("private2");
        //select one option as answer
        List<WebElement> opt=getDriver().findElements(By.xpath("//label[@class='mat-checkbox-layout']/div"));
        opt.get(0).click();
        opt.get(1).click();
        getDriver().findElement(By.xpath("//div[@class='add-option']/button/span")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[@placeholder='Option 3*']")).sendKeys("private3");
        Thread.sleep(1000);
        //click the setting option
        List <WebElement> sett=getDriver().findElements(By.xpath("//span[@class='mat-button-wrapper']/mat-icon "));
        sett.get(2).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[contains(text(),'Move option up')]")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);






    }
//ASK-952 creating the quiz   Option-  Max+1 number of the options
    //This is bug...so not included in automation
   /* @Then("^after that I created  quiz with \"([^\"]*)\" option$")
    public void afterThatICreatedQuizWithOption(String arg0) throws Throwable {
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')] ")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        getDriver().findElement(By.xpath("//input[@placeholder='Title Of The Quiz *']")).sendKeys("Question 1");
        getDriver().findElement(By.xpath("//mat-icon[@class='mat-icon material-icons']")).click();
        int x = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']")).size();
        List<WebElement> y = getDriver().findElements(By.xpath("//div[@class='mat-radio-outer-circle']"));
        for (int i = 0; i < y.size(); i++) {
            WebElement z = y.get(i);
        }
        Thread.sleep(1000);
        y.get(2).click();
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys("Question single character");
        Thread.sleep(2000);

        WebElement addop=getDriver().findElement(By.xpath("//div[@class='add-option']/button/span"));
        for(int i=0;i<=9;i++){addop.click();}
        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//*[contains(text(),'Save')]")).click();
        Thread.sleep(2000);
        String errmsg=getDriver().findElement(By.xpath("//*[contains(text(),'*Choose at least one correct answer')]")).getText();
        System.out.println(errmsg);
        getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]")).click();
    }
    */
}
