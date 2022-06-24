package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadDownloadPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement DownloadButton;
    WebElement ChooseFileButton;
    WebElement uploadMessage;

    public UploadDownloadPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getDownloadButton() {
        return driver.findElement(By.id("downloadButton"));
    }

    public WebElement getChooseFileButton() {
        return driver.findElement(By.id("uploadFile"));
    }

    public WebElement getUploadMessage(){
        return driver.findElement(By.id("uploadedFilePath"));
    }
    //-------------------------------------------------------------

    public void clickOnChooseFileButton(){
        this.getChooseFileButton().click();
    }
    public void clickDownloadButton() {
        this.getDownloadButton().click();
    }
    public void choosePictureToUpload() {
        this.getChooseFileButton().sendKeys("C:\\Users\\Korisnik\\Desktop\\slika1.jpg");
    }

}
