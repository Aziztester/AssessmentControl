package study.qa.automation.stepDefinitions.EndToEnd;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static study.qa.automation.utils.TestContext.getDriver;

 public class def_3_14 {
     @And("^Select Textual Type of question$")
     public void selectTextualTypeOfQuestion() throws InterruptedException {
         getDriver().findElement(By.xpath("//*[contains(text(),'Q2:')]/../../..//div[contains(text(),'Textual')]")).click();
         Thread.sleep(1000);
     }


     @And("^Type text for Question \"([^\"]*)\"$")
     public void typeTextForQuestion(String text) throws Throwable {
         getDriver().findElement(By.xpath("//*[contains(text(), 'Q2:')]/../../..//*[@placeholder='Question *']")).sendKeys(text);
         Thread.sleep(1000);
     }

     @And("^Select Group \"([^\"]*)\"$")
     public void selectGroup(String code) throws Throwable {
         getDriver().findElement(By.xpath("//mat-select[@placeholder='Group Filter']//div[@class='mat-select-trigger']")).click();//  //*[contains(text(), 'Group Filter')]/..
         Thread.sleep(3000);
         getDriver().findElement(By.xpath("//mat-option[@role='option']/span[@class='mat-option-text'][text()=\'" + code + "\']")).click();
         Thread.sleep(3000);

         //WebDriverWait wait=new WebDriverWait(getDriver(),2);
         //use webelement class for the element and wait 2 sec until element is present
         //WebElement present=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='mat-option-text'][text()=\'" + code + "\')]")));
         // present.click();

         //getDriver().findElement(By.xpath("//span[@class='mat-option-text'][text()=\'" + code + "\')]")).click();
         //Thread.sleep(1000);

     }

     @And("^Select \"([^\"]*)\" in Select Quiz to Assign dropdown list$")
     public void selectInSelectQuizToAssignDropdownList(String title) throws Throwable {
         getDriver().findElement(By.xpath("//span[contains(text(), 'Select Quiz To Assign')]")).click();
         Thread.sleep(1000);
         getDriver().findElement(By.xpath("//div/..//*[contains (text(), \'" + title + "\')]")).click();
         Thread.sleep(1000);
         //throw new PendingException();
     }

     @And("^Click Select All button at the right bottom$")
     public void clickSelectAllButtonAtTheRightBottom() throws InterruptedException {
         Thread.sleep(1000);

         getDriver().findElement(By.xpath("//span[contains(text(),'Select All')]")).click();
         Thread.sleep(10000);
     }


     @Then("^Verify that quiz for \"([^\"]*)\" was assigned$")
     public void verifyThatQuizForWasAssigned(String myQuiz) throws Throwable {
         WebElement quiz = getDriver().findElement(By.xpath("//h4[contains(text(), 'My Assignment')]/..//*[contains(text(), 'Testing Assignment current date time 0310/10:28')]"));
         String textFromQuiz = quiz.getText();
         Assert.assertTrue(textFromQuiz.contains(myQuiz));
         String name = getDriver().findElement(By.xpath("//div[@class='info']//h3")).getText();
         if (textFromQuiz.contains(myQuiz)) {
             System.out.println(name + " get assignment. ");
         }
     }


     @And("^Delete the quiz with name \"([^\"]*)\"$")
     public void deleteTheQuizWithName(String arg0) throws Throwable {
         getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]")).click();
         Thread.sleep(1000);

         int quizzes = getDriver().findElements(By.xpath("//*[contains(text(), \'" + arg0 + "\')]")).size();
         for (int i = 0; i < quizzes; i++) {
             getDriver().findElement(By.xpath("//*[contains(text(), \'" + arg0 + "\')]")).click();
             Thread.sleep(1000);
             getDriver().findElement(By.xpath("//*[contains(text(), \'" + arg0 + "\')]/../../..//*[contains(text(), 'Delete')]")).click();
             Thread.sleep(1000);

             getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
             Thread.sleep(1000);

             // Write code here that turns the phrase above into concrete actions

         }
     }

     @And("^Delete assignment with quiz name \"([^\"]*)\"$")
     public void deleteAssignmentWithQuizName(String arg0) throws Throwable {
         getDriver().findElement(By.xpath("//h5[text()='Assignments']")).click();
         Thread.sleep(1000);

         int countAssignments = getDriver().findElements(By.xpath("//*[contains(text(), \'" + arg0 + "\')]/..//*[contains(text(), 'more_vert')]")).size();
         Thread.sleep(1000);

         if (countAssignments != 0) {
             getDriver().findElement(By.xpath("//*[contains(text(), \'" + arg0 + "\')]/..//*[contains(text(), 'more_vert')]")).click();
             Thread.sleep(1000);

             getDriver().findElement(By.xpath("//span[contains(text(),'Delete Assignment')]")).click();
             Thread.sleep(1000);
             getDriver().findElement(By.xpath("//*[contains(text(), 'Confirmation')]/../../..//*[contains(text(), 'Delete')]")).click();
             Thread.sleep(1000);


         }
     }
 }
