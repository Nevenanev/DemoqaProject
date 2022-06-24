package Pages;

import Base.BaseTest;
import Base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookstoreApplicationPage {
    WebDriver driver;
    WebDriverWait wdwait;
    ExcelReader excelReader;
    WebElement searchTextBox;
    WebElement loginButton;
    WebElement logoutButton;
    WebElement UserNameField;
    WebElement UsernameValue;
    public BookstoreApplicationPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSearchTextBox() {
        return driver.findElement(By.className("mb-3 input-group"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login"));
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getUserNameField() {
        return driver.findElement(By.id("userName-label"));
    }

    public WebElement getUsernameValue() {
        return driver.findElement(By.id("userName-value"));
    }
    //----------------------------------------------------------

    public void clickOnLoginButton () {
       this.getLoginButton().click();
    }

    public void insertTextinSearchTextBox() {
        this.getSearchTextBox().sendKeys(excelReader.getStringData("BookstoreSearch", 1,0));
    }

    public void clickOnLogOutButton () {
        this.getLogoutButton().click();
    }

}
