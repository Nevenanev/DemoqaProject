package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ButtonsPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement doubleClickButton;
    WebElement rightClickButton;
    WebElement clickMeButton;
    WebElement doubleclickMessage;
    WebElement rightclickMessage;
    WebElement clickmeMessage;
    List<WebElement> buttonList;
    Actions actions;
    public ButtonsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
   public List<WebElement> getButtonList() {
        return driver.findElements(By.cssSelector(".btn.btn-primary"));
    }

    public WebElement getDoubleClickButton() {
        WebElement element = null;
        for(int i=0;i< getButtonList().size();i++) {
            if(getButtonList().get(i).getText().equals("Double Click Me")) {
                element=getButtonList().get(i);
                break;
            }
        }
        return element;
    }

    public WebElement getRightClickButton() {
        WebElement element = null;
        for (int i = 0; i < getButtonList().size(); i++) {
            if (getButtonList().get(i).getText().equals("Right Click Me")) {
                element = getButtonList().get(i);
                break;
            }
        }
        return element;
    }

    public WebElement getClickMeButton() {
        WebElement element = null;
        for(int i=0;i< getButtonList().size();i++) {
            if(getButtonList().get(i).getText().equals("Click Me")) {
                element=getButtonList().get(i);
                break;
            }
        }
        return element;
    }

    public WebElement getDoubleclickMessage() {
        return driver.findElement(By.id("doubleClickMessage")); }

    public WebElement getRightclickMessage() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getClickmeMessage() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }


    //---------------------------------------------------------------

    public void clickOnDoubleClickButton() {
        actions = new Actions(driver);
        actions.doubleClick(this.getDoubleClickButton()).perform();
    }
    public void clickOnRightClickButton() {
        actions = new Actions(driver);
        actions.contextClick(this.getRightClickButton()).perform();
    }
    public void clickOnClickMeButton() {
        this.getClickMeButton().click();
    }


}
