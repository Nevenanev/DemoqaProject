package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomepagePage homepagePage;
    //public SidebarPage sidebarPage;
    public BookstoreApplicationPage bookStorePage;
    public LoginPage loginPage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public CheckboxPage checkboxPage;
    public RadioButtonPage radiobuttonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinkPage brokenLinkPage;
    public UploadDownloadPage uploadDownloadPage;
    public ExcelReader excelReader;

    public JavascriptExecutor js;
    public String homepageURL;


    @BeforeClass

    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homepagePage = new HomepagePage(driver, wdwait);
        //sidebarPage = new SidebarPage(driver, wdwait);
        bookStorePage = new BookstoreApplicationPage(driver, wdwait);
        loginPage = new LoginPage(driver, wdwait);
        elementsPage = new ElementsPage(driver, wdwait);
        textBoxPage = new TextBoxPage(driver, wdwait);
        checkboxPage = new CheckboxPage(driver, wdwait);
        radiobuttonPage = new RadioButtonPage(driver, wdwait);
        webTablesPage = new WebTablesPage(driver, wdwait);
        buttonsPage = new ButtonsPage(driver, wdwait);
        linksPage = new LinksPage(driver, wdwait);
        brokenLinkPage = new BrokenLinkPage(driver, wdwait);
        uploadDownloadPage = new UploadDownloadPage(driver, wdwait);
        excelReader = new ExcelReader("C:\\Users\\Korisnik\\Desktop\\PodaciProjekat.xlsx");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        homepageURL = excelReader.getStringData("Login", 1, 4);
    }

//-----------------------------------------------------------------------------

    public void visibilityWait(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickabilityWait(WebElement element) { wdwait.until(ExpectedConditions.elementToBeClickable(element));}

    public void scrollIntoView (WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element); }

    public void clickElementJS(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    }


    @AfterClass
     public void tearDown() {
        //driver.close();
        //driver.quit();
        }


}




