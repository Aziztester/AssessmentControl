package study.qa.automation.stepDefinitions.EndToEnd;

import cucumber.api.java8.En;

public class def_3_14 implements En {
    public def_3_14() {
        And("^Select Group Filter \"([^\"]*)\"$", (String arg0) -> {
        });
        And("^Push Select All button$", () -> {
            getDriver().findElement()
        });
    }
}


    getDriver().findElement(By.xpath("//span[contains(text(), 'Save')]")).click();
        Thread.sleep(1000);

        getD