package Pages;

import Base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    ExcelReader excelReader;
    WebDriverWait wdwait;
    WebElement username;
    WebElement password;
    WebElement loginButton;
    WebElement errorMessage;
    public LoginPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.cssSelector(".btn.btn-primary"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.className("mb-1"));

    }

    //-----------------------------------------------------------------------

    public void insertUsername (String username) {
        this.getUsername().clear();
        this.getUsername().sendKeys(username);
    }
    public void insertPassword (String password) {
        this.getUsername().clear();
        this.getUsername().sendKeys(password);
    }

   public void clickOnLoginButton () {
        this.getLoginButton().click();
   }

}





