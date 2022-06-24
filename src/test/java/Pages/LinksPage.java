package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;

public class LinksPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement homeLink;
    WebElement homeDynamic;
    WebElement created;
    WebElement noContent;
    WebElement moved;
    WebElement badRequest;
    WebElement unauthorized;
    WebElement forbidden;
    WebElement notFound;
    WebElement responseMessage;
    List<WebElement> allURLS;
    public LinksPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getAllURLS() {
        return driver.findElements(By.tagName("a"));
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.id("simpleLink") );
    }

    public WebElement getHomeDynamic() {
        return driver.findElement(By.id("dynamicLink"));
    }

    public WebElement getCreated() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getNoContent() {
        return driver.findElement(By.id("no-content"));
    }

    public WebElement getMoved() {
        return driver.findElement(By.id("moved"));
    }

    public WebElement getBadRequest() {
        return driver.findElement(By.id("bad-request"));
    }

    public WebElement getUnauthorized() {
        return driver.findElement(By.id("unauthorized"));
    }

    public WebElement getForbidden() {
        return driver.findElement(By.id("forbidden"));
    }

    public WebElement getNotFound() {
        return driver.findElement(By.id("invalid-url"));
    }

    public WebElement getResponseMessage() {
        return driver.findElement(By.id("linkResponse"));
    }

    //--------------------------------------------------------------------------------------

    public void getAllURLs() {
        String url="";
        Iterator<WebElement> iterator = this.getAllURLS().iterator();

    }
    public void clickOnHome() {
        this.getHomeLink().click();
    }
    public void clickOnHomeDynamic() {
        this.getHomeDynamic();
    }
    public void clickOnCreated(){
        this.getCreated().click();
    }
    public void clickOnNoContent() {
        this.getNoContent().click();
    }
    public void clickOnMoved(){
        this.getMoved().click();
    }
    public void clickOnBadRequest(){
        this.getBadRequest().click();
    }
    public void clickOnUnauthorized() {
        this.getUnauthorized().click();
    }
    public void clickOnForbidden(){
        this.getForbidden().click();
    }
    public void clickOnNotFound() {
        this.getNotFound().click();
    }


}
