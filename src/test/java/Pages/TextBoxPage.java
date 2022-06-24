package Pages;

import Base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    ExcelReader excelReader;
    WebElement fullName;
    WebElement email;
    WebElement currentAdress;
    WebElement permanentAdress;
    WebElement submittButton;
    WebElement infoBox;
    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAdress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAdress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmittButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getInfoBox() {
        return driver.findElement((By.cssSelector(".mt-4.row")));
    }

    //----------------------------------------------------------------

   public void clickOnSubmittButton() {
        this.getSubmittButton().click();
   }





}
