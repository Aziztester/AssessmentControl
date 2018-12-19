package study.qa.automation.pages;

import org.openqa.selenium.support.PageFactory;

import static study.qa.automation.utils.TestContext.getDriver;

public class Page {
    String url;
    public Page() {
        //setUrl("http://local.school.portnov.com:4520/#/login");
        PageFactory.initElements(getDriver(),this);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public void open() {
        getDriver().get(url);
    }



}
