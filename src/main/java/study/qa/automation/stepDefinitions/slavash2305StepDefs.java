package study.qa.automation.stepDefinitions;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static study.qa.automation.utils.TestContext.getDriver;

public class slavash2305StepDefs {

    @Then ("I find \"([^\"]*)\" in one of the elements with xpath \"([^\"]*)\", scroll to it with offset (\\d+) and click it$")
    public void iFindInOneOfTheElementsWithXpathAndClickIt(String text, String xpath, Integer offset)
    {
        String elementText;
        List<WebElement> elements = getDriver().findElements(By.xpath(xpath));
        for (WebElement elem: elements) {
            elementText = elem.getText();
            if (elementText.contains(text))
            {
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].scrollIntoView(true);", elem);
                executor.executeScript("window.scrollBy(0, " + offset + ");", elem);
                elem.click();
                return;
            }
        }
    }

}
