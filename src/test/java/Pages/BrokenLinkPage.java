package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinkPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement brokenLink;
    WebElement validLink;
    String brokenlinkURL = "http://the-internet.herokuapp.com/status_codes/500";

    public BrokenLinkPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getBrokenLink() {
        return driver.findElement(By.linkText("Click Here for Broken Link"));
    }

    public WebElement getValidLink() {
        return driver.findElement(By.linkText("Click Here for Valid Link"));
    }
    public String getBrokenlinkURL() {
        return brokenlinkURL;
    }



    //----------------------------------------------------------------------------------

    public void clickOnBrokenLink() {
        this.getBrokenLink().click();
    }
    public void clicnOnValidLink() {this.getValidLink().click();}



}
