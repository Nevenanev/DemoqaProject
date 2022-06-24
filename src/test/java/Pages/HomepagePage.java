package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomepagePage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement ElementsButton;
    WebElement FormsButton;
    WebElement AlertsButton;
    WebElement WidgetsButton;
    WebElement InteractionsButton;
    WebElement BookstoreAplication;
    List <WebElement> listaElemenata;
    public HomepagePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getListaElemenata(){
        return driver.findElements(By.className("card-body")); }

   public WebElement getElements() {
       WebElement element = null;
        for(int i=0;i< getListaElemenata().size();i++) {
            if(getListaElemenata().get(i).getText().equals("Elements")) {
                element=getListaElemenata().get(i);
                break;
            }
        }
 return element;
   }
    public WebElement getForms() {
        WebElement element = null;
        for (int i = 0; i < getListaElemenata().size();i++) {
            if (getListaElemenata().get(i).getText().equals("Forms")) {
                element= getListaElemenata().get(i);
                break;
            }
        }
    return element;
    }
    public WebElement getAlerts() {
        WebElement element = null;
        for(int i=0;i<getListaElemenata().size();i++) {
            if(getListaElemenata().get(i).getText().equals("Alerts, Frame & Windows")) {
                element=getListaElemenata().get(i);
                break;
            } }
    return element;
    }

    public WebElement getWidgets() {
    WebElement element = null;
    for(int i=0; i<getListaElemenata().size();i++) {
        if(getListaElemenata().get(i).getText().equals("Widgets")) {
            element=getListaElemenata().get(i);
            break;
        } }
    return element;
    }

    public WebElement getInteractions() {
        WebElement element = null;
        for (int i = 0; i < getListaElemenata().size(); i++) {
        if (getListaElemenata().get(i).getText().equals("Interactions")) {
            element = getListaElemenata().get(i);
            break;
        } }
    return element;
    }

    public WebElement getBookstoreAplication(){
        WebElement element = null;
        for (int i = 0; i < getListaElemenata().size(); i++) {
            if (getListaElemenata().get(i).getText().equals("Book Store Application")) {
                element=getListaElemenata().get(i);
                break;
            } }
        return element;
    }

    //------------------------------------------------

    public void clickOnElements () {
        getElements().click();
    }


    public void clickOnForms () {
        getForms().click();
    }

    public void clickOnAlerts() {
        getAlerts().click();
    }


    public void clickOnWidgets() {
       getWidgets().click();

    }

    public void clickOnInteractions() {
        getInteractions().click();
    }

    public void clickOnBookstoreApplication() {
        getBookstoreAplication().click();
    }



}

