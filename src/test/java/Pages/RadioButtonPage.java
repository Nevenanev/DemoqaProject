package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collection;
import java.util.List;

public class RadioButtonPage extends BaseTest {

    WebDriver driver;
    WebDriverWait wdwait;

    List<WebElement> radiobuttonsList;

    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getYesRadiobutton() {
        return driver.findElement(By.id("yesRadio"));
    }

    public WebElement getImpressiveRadiobutton() {
        return driver.findElement(By.id("impressiveRadio"));
    }

    public WebElement getNoRadiobutton() {
        return driver.findElement(By.id("noRadio"));
        //  return driver.findElement(By.cssSelector(".custom-control.disabled.custom-radio.custom-control-inline"));

    }

    public List<WebElement> getRadiobuttonsList() {
        return driver.findElements(By.className("custom-control-label"));
    }


    public WebElement getNotificationMessage() {
        return driver.findElement(By.className("mt-3"));
    }

    //------------------------------------------------------
    public void clickOnYesRadioButton() {
        boolean selectState = this.getYesRadiobutton().isSelected();
//performing click operation only if element is not selected
        if (!selectState) {
            this.getYesRadiobutton().click();
        }

    }

    /*public void clickOnYesRadioButton() {
        for (int i = 0; i < radiobuttonsList().size(); i++) {
            scrollIntoView(radiobuttonsList.get(i));
            if (radiobuttonsList.get(i).getAttribute("for").equals("yesRadio")) {
                getRadiobuttonsList().get(i).click();
                break;
            }
        }
        return
    }*/


    public void clickOnImpressiveRadioButton() {
        boolean selectState = this.getImpressiveRadiobutton().isSelected();
//performing click operation only if element is not selected
        if (!selectState) {
            this.getImpressiveRadiobutton().click();
        }
    }


    public void clickOnNoRadioButton() {
        boolean selectState = this.getNoRadiobutton().isEnabled();
//performing click operation only if element is not selected
        if (selectState) {
            this.getNoRadiobutton().click();
        }

    }


}