package Pages;

import Base.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTablesPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement addButton;
    WebElement newWindow;
    WebElement FirstNameTextbox;
    WebElement LastNameTextbox;
    WebElement emailTextbox;
    WebElement ageTextbox;
    WebElement salaryTextbox;
    WebElement departmentTextbox;
    WebElement submitButton;
    WebElement cancelButton;
    WebElement deleteButton;
    WebElement editButton;
    WebElement searchTextbox;
    WebElement table;
   // List<WebElement> rowInTable;

    public WebTablesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstNameTextbox() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastNameTextbox() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmailTextbox() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAgeTextbox() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalaryTextbox() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartmentTextbox() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getCancelButton() {
        return driver.findElement(By.className("sr-only"));
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.id("delete-record-1"));
    }

    public WebElement getEditButton() {
        return driver.findElement(By.className("mr-2"));
    }

    public WebElement getSearchTextbox() {
        return driver.findElement(By.id("searchBox"));
    }

    public WebElement getTable() {
        return driver.findElement(By.className("-loading"));
    }

    public WebElement getRowInTable() {
        return driver.findElement(By.cssSelector("rt-tr-group"));      //.rt-tr.-padRow.-odd
    }

    public WebElement getNewWindow() {
        return driver.findElement(By.className("modal-content"));
    }
    //---------------------------------------------------------------------------------

    public void clickOnAddButton() {
        this.getAddButton().click();
    }
    public void clickOnCancelButton() {
        this.getCancelButton().click();
    }
    public void enterFirstName(String firstname) {
        this.getFirstNameTextbox().clear();
        this.getFirstNameTextbox().sendKeys(firstname);
    }
    public void enterLastName(String lastname) {
        this.getLastNameTextbox().clear();
        this.getLastNameTextbox().sendKeys(lastname);
    }
    public void enterEmail(String email) {
        this.getEmailTextbox().clear();
        this.getEmailTextbox().sendKeys(email);
    }
    public void enterAge(String age) {
        this.getAgeTextbox().clear();
        this.getAgeTextbox().sendKeys(age);
    }
    public void enterSalary(String salary) {
        this.getSalaryTextbox().clear();
        this.getSalaryTextbox().sendKeys(salary);
    }
    public void enterDepartment(String department) {
        this.getDepartmentTextbox().clear();
        this.getDepartmentTextbox().sendKeys(department);
    }
    public void clickOnSubmittButton() {
        this.getSubmitButton().click();
    }
    public void clickOnDeleteButton() {
        this.getDeleteButton().click();
    }
    public void clickOnEditButton() {
        this.getEditButton().click();
    }

    public void enterSearchContent(String search) {
          this.getSearchTextbox().sendKeys(search );
    }



}
