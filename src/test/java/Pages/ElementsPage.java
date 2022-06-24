package Pages;

import Base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementsPage {

    WebDriver driver;
    WebDriverWait wdwait;
    ExcelReader excelReader;
    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement button;
    WebElement links;
    WebElement brokenLinksImages;
    WebElement uploadAndDownload;
    WebElement dynamicProperties;
    List <WebElement> listElements;

    public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getListElements() {
        return driver.findElements(By.cssSelector(".btn.btn-light "));
    }

    public WebElement getTextBox() {
        WebElement element = null;
        for(int i=0;i< getListElements().size();i++) {
            if(getListElements().get(i).getText().equals("Text Box")) {
                element=getListElements().get(i);
                break;
            }
        }
        return element;
    }

    public WebElement getCheckBox() {
        WebElement element = null;
        for(int i=0;i< getListElements().size();i++) {
            if(getListElements().get(i).getText().equals("Check Box")) {
                element=getListElements().get(i);
                break;
            }
        }
        return element;
    }


    public WebElement getRadioButton() {
        WebElement element = null;
        for(int i=0;i< getListElements().size();i++) {
        if(getListElements().get(i).getText().equals("Radio Button")) {
        element=getListElements().get(i);
        break;
            }
        }
        return element;
    }


    public WebElement getWebTables() {
        WebElement element = null;
        for(int i=0;i< getListElements().size();i++) {
            if(getListElements().get(i).getText().equals("Web Tables")) {
                element=getListElements().get(i);
                break;
            }
        }
        return element;
    }

    public WebElement getButtons() {
        WebElement element = null;
        for(int i=0;i< getListElements().size();i++) {
            if(getListElements().get(i).getText().equals("Buttons")) {
                element=getListElements().get(i);
                break;
            }
        }
        return element;
    }

    public WebElement getLinks() {
        WebElement element = null;
        for(int i=0;i< getListElements().size();i++) {
            if(getListElements().get(i).getText().equals("Links")) {
                element=getListElements().get(i);
                break;
            }
        }
        return element;
    }

    public WebElement getBrokenLinksImages() {
        WebElement element = null;
        for(int i=0;i< getListElements().size();i++) {
            if(getListElements().get(i).getText().equals("Broken Links-Images")) {
                element=getListElements().get(i);
                break;
            }
        }
        return element;
    }


    public WebElement getUploadAndDownload() {
        WebElement element = null;
        for(int i=0;i< getListElements().size();i++) {
            if(getListElements().get(i).getText().equals("Upload and Download")) {
                element=getListElements().get(i);
                break;
            }
        }
        return element;
    }

    public WebElement getDynamicProperties() {
        WebElement element = null;
        for(int i=0;i< getListElements().size();i++) {
            if(getListElements().get(i).getText().equals("Dynamic Properties")) {
                element=getListElements().get(i);
                break;
            }
        }
        return element;
    }

//-------------------------------------------------------------

public void clickOnTextBox(){
    this.getTextBox().click(); }

public void clickOnCheckBox() {
    this.getCheckBox().click();}

public void clickOnRadioButton() {
    this.getRadioButton().click();}

public void clickOnWebTabels() {
    this.getWebTables().click();}

public void clickOnButtons() {
    this.getButtons().click();}

public void clickOnLinks(){
    this.getLinks().click();}

public void clickOnBrokenLinksImages(){
        this.getBrokenLinksImages().click();
}

public void clickOnUploadDownload() {
    this.getUploadAndDownload().click();}

public void clickOnDynamicProperties() {
    this.getDynamicProperties().click();}

}