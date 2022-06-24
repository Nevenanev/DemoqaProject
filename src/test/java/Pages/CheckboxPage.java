package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement checkbox;
    WebElement resultMessage;
    WebElement plusButton;
    WebElement minusButton;
    WebElement dropMenu;
    public CheckboxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCheckbox() {
        return driver.findElement(By.className("rct-checkbox"));
    }

    public WebElement getResultMessage(){
        return driver.findElement(By.id("result"));
    }

    public WebElement getPlusButton() {
        return driver.findElement(By.cssSelector(".rct-option.rct-option-expand-all"));
    }

    public WebElement getMinusButton() {
        return driver.findElement(By.cssSelector(".rct-option.rct-option-collapse-all"));
    }

    public WebElement getDropMenu() {
        return driver.findElement(By.cssSelector(".rct-node.rct-node-parent.rct-node-expanded"));

}

    //------------------------------------------------------

public void selectCheckBox() {
    this.getCheckbox().click();
    }
public void clickOnPlusButton() {
        this.getPlusButton().click();
    }
    public void clickOnMinusButton() {
        this.getMinusButton().click();
    }

}