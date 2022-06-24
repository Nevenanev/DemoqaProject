package Test;

import Base.BaseTest;
import Base.ExcelReader;
import Pages.ElementsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class ElementsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(homepageURL);

    }

    @Test
    public void openElementsPage() {
        scrollIntoView(homepagePage.getElements());
        homepagePage.clickOnElements();
        String elementsURL = driver.getCurrentUrl();
        Assert.assertEquals(elementsURL, "https://demoqa.com/elements");
    }

    @Test
    public void openTextBoxPage() {
        openElementsPage();
        visibilityWait(elementsPage.getTextBox());
        elementsPage.clickOnTextBox();
        String textboxpageURL = driver.getCurrentUrl();
        Assert.assertEquals(textboxpageURL, "https://demoqa.com/text-box");
    }

    @Test
    public void succesfulSubmittTextBox() {
        openTextBoxPage();
        String fullName = excelReader.getStringData("TextBox", 1, 0);
        String validemail = excelReader.getStringData("TextBox", 1, 1);
        String currentAdress = excelReader.getStringData("TextBox", 1, 3);
        String permanentAdress = excelReader.getStringData("TextBox", 1, 4);
        textBoxPage.getFullName().sendKeys(fullName);
        textBoxPage.getEmail().sendKeys(validemail);
        textBoxPage.getCurrentAdress().sendKeys(currentAdress);
        textBoxPage.getPermanentAdress().sendKeys(permanentAdress);
        textBoxPage.clickOnSubmittButton();

        Assert.assertTrue(textBoxPage.getInfoBox().isDisplayed());

    }

    @Test
    public void unsuccessfulSubmittTextBoxWithInvalidEmail() {
        openTextBoxPage();
        String fullName = excelReader.getStringData("TextBox", 1, 0);
        String invalidemail = excelReader.getStringData("TextBox", 1, 2);
        String currentAdress = excelReader.getStringData("TextBox", 1, 3);
        String permanentAdress = excelReader.getStringData("TextBox", 1, 4);
        textBoxPage.getFullName().sendKeys(fullName);
        textBoxPage.getEmail().sendKeys(invalidemail);
        textBoxPage.getCurrentAdress().sendKeys(currentAdress);
        textBoxPage.getPermanentAdress().sendKeys(permanentAdress);
        textBoxPage.clickOnSubmittButton();

        boolean check = false;
        try {
            check = textBoxPage.getInfoBox().isDisplayed();
        } catch (Exception e) {
            Assert.assertFalse(check);
        }

        //******* Kako assertovati crveno uokvireno polje ??? ********
    }

    @Test
    public void openCheckboxPage() {
        openElementsPage();
        visibilityWait(elementsPage.getCheckBox());
        elementsPage.clickOnCheckBox();
        String checkboxpageURL = driver.getCurrentUrl();
        Assert.assertEquals(checkboxpageURL, "https://demoqa.com/checkbox");

    }

    @Test
    public void successfulCheckBoxselecting() {
        openCheckboxPage();
        checkboxPage.getCheckbox().click();

        Assert.assertTrue(checkboxPage.getResultMessage().isDisplayed());
        Assert.assertEquals(checkboxPage.getResultMessage().getText(), "You have selected :\n" + "home\n" + "desktop\n" + "notes\n" +
                "commands\n" + "documents\n" + "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n" +
                "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile");

    }

    @Test
    public void successfulDropMenuOpening() {
        openCheckboxPage();
        checkboxPage.getPlusButton().click();
        Assert.assertTrue(checkboxPage.getDropMenu().isDisplayed());
    }

    @Test
    public void successfulDropMenuClosing() {
        successfulDropMenuOpening();
        checkboxPage.getMinusButton().click();
        boolean check = false;
        try {
            check = checkboxPage.getDropMenu().isDisplayed();
        } catch (Exception e) {
            Assert.assertFalse(check);
        }
    }

    @Test
    public void openRadiobuttonPage() {
        openElementsPage();
        visibilityWait(elementsPage.getRadioButton());
        elementsPage.clickOnRadioButton();
        String radiobuttonpageURL = driver.getCurrentUrl();
        Assert.assertEquals(radiobuttonpageURL, "https://demoqa.com/radio-button");
    }

@Test
public void successfulRadioButtonClick() throws InterruptedException {
        openRadiobuttonPage();
        Thread.sleep(2000);
        //NECE DA KLIKNE NA DUGME???
        radiobuttonPage.clickOnYesRadioButton();
        Assert.assertTrue(radiobuttonPage.getNotificationMessage().isDisplayed());
        Assert.assertEquals(radiobuttonPage.getNotificationMessage().getText(), "You have selected Yes" );

    }

/* @Test     GRESKA???
    public void successfulClickRadioButtonYes(){
     openRadiobuttonPage();
     scrollIntoView(radiobuttonPage.getYesRadiobutton());
     //clickabilityWait(radiobuttonPage.getYesRadiobutton());
     visibilityWait(radiobuttonPage.getYesRadiobutton());
     clickElementJS(radiobuttonPage.getYesRadiobutton());
     clickElementJS(radiobuttonPage.getYesRadiobutton());
     String notifikacija = radiobuttonPage.getNotificationMessage().getText();
     Assert.assertEquals( notifikacija, "You have selected Yes \n" + "\n");

}

/* @Test   GRESKA???
    public void successfulClickRadioButtonImpressive(){
    openRadiobuttonPage();
    visibilityWait(radiobuttonPage.getImpressiveRadiobutton());
    radiobuttonPage.clickOnImpressiveRadioButton();

    Assert.assertEquals(radiobuttonPage.getNotificationMessage().getText(), "You have selected Impressive\n" + "\n");
    }
*/

    @Test
    public void openWebTablesPage() {
        openElementsPage();
        visibilityWait(elementsPage.getWebTables());
        elementsPage.clickOnWebTabels();
        String webtabelsURL = driver.getCurrentUrl();
        Assert.assertEquals(webtabelsURL, "https://demoqa.com/webtables");

    }

    @Test
    public void successfulRegistrationForm() {
        openWebTablesPage();
        String firstname = excelReader.getStringData("WebTables", 1, 0);
        String lastname = excelReader.getStringData("WebTables", 1, 1);
        String email = excelReader.getStringData("WebTables", 1, 2);
        String age = String.valueOf(excelReader.getIntegerData("WebTables", 1, 5));
        String salary = String.valueOf(excelReader.getIntegerData("WebTables", 1, 3));
        String department = excelReader.getStringData("WebTables", 1, 4);

        scrollIntoView(webTablesPage.getAddButton());
        webTablesPage.clickOnAddButton();
        //Assert.assertTrue(webTablesPage.getNewWindow().isDisplayed());
        visibilityWait(webTablesPage.getAddButton());
        webTablesPage.enterFirstName(firstname);
        webTablesPage.enterLastName(lastname);
        webTablesPage.enterEmail(email);
        webTablesPage.enterAge(age);
        webTablesPage.enterSalary(salary);
        webTablesPage.enterDepartment(department);
        webTablesPage.clickOnSubmittButton();


        //Assert.assertEquals(webTablesPage.getRowInTable().getText(), "Alden	Cantrell	alden@example.com	12000	Compliance	45");
        // Kako ASSERT sadrzaj reda u tabeli ?*****

        boolean check = false;
        try {
            check = webTablesPage.getNewWindow().isDisplayed();
        } catch (Exception e) {
            Assert.assertFalse(check);
        }


    }

    @Test
    public void successfulDeleteWithDeleteButtonClick() {
        openWebTablesPage();
        webTablesPage.clickOnDeleteButton();
        // ASSERT ???
    }

    @Test
    public void successfulEditWindowOpen() {
        openWebTablesPage();
        webTablesPage.clickOnEditButton();
        Assert.assertTrue(webTablesPage.getNewWindow().isDisplayed());
    }

    @Test
    public void successfulSearch() {
        String searchContent = excelReader.getStringData("WebTables", 1, 0);
        openWebTablesPage();
        webTablesPage.enterSearchContent(searchContent);
        // ASSERT???

    }

    @Test
    public void openButtonsPage() {
        openElementsPage();
        visibilityWait(elementsPage.getButtons());
        elementsPage.clickOnButtons();
        String buttonssURL = driver.getCurrentUrl();
        Assert.assertEquals(buttonssURL, "https://demoqa.com/buttons");

    }

    @Test
    public void successfulButtonsClicking() throws InterruptedException {
        openButtonsPage();
        buttonsPage.clickOnDoubleClickButton();
        buttonsPage.clickOnRightClickButton();
        buttonsPage.clickOnClickMeButton();

        Assert.assertTrue(buttonsPage.getDoubleclickMessage().isDisplayed());
        //Assert.assertEquals(buttonsPage.getDoubleclickMessage().getText(), "You have done a double click\n" + "\n" );

        Assert.assertTrue(buttonsPage.getRightclickMessage().isDisplayed());
       //Assert.assertEquals(buttonsPage.getRightclickMessage().getText(), "You have done a right click\n" + "\n" );

        Assert.assertTrue(buttonsPage.getClickmeMessage().isDisplayed());
        //Assert.assertEquals(buttonsPage.getClickmeMessage().getText(), "You have done a dynamic click\n" + "\n" );

    }

    @Test
    public void successfulClickingOnDoubleClickButton() throws InterruptedException {
        openButtonsPage();
        Thread.sleep(2000);
        buttonsPage.clickOnDoubleClickButton();
    Assert.assertTrue(buttonsPage.getDoubleclickMessage().isDisplayed());
    }

    @Test
    public void successfulClickingOnRightClickButton() throws InterruptedException {
        openButtonsPage();
        buttonsPage.clickOnRightClickButton();
        Thread.sleep(2000);
        Assert.assertTrue(buttonsPage.getRightclickMessage().isDisplayed());

    }

    @Test
    public void successfulClickingOnClickMeButton() {
        openButtonsPage();
        buttonsPage.clickOnClickMeButton();
        Assert.assertTrue(buttonsPage.getClickMeButton().isDisplayed());
    }

    @Test
    public void openLinksPage() {
        openElementsPage();
        visibilityWait(elementsPage.getLinks());
        elementsPage.clickOnLinks();
        String linksURL = driver.getCurrentUrl();
        Assert.assertEquals(linksURL, "https://demoqa.com/links");
    }

    @Test
    public void successfulClickOnHomeLinkAndOpenInNewTab() {
        openLinksPage();
        linksPage.clickOnHome();
        assert driver.getWindowHandles().size() == 2;
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
       // ASSERT STRANICE U NOVOM TABU ???

    }

    @Test
    public void successfulClickOnDynamicHomeLinkAndOpenInNewTab() throws InterruptedException {
        openLinksPage();
        Thread.sleep(2000);
        linksPage.clickOnHomeDynamic();
        assert driver.getWindowHandles().size() == 3;
// ASSERT STRANICE U NOVOM TABU ???

    }
@Test
    public void successfulClickOnCreatedLink() {
        openLinksPage();
        linksPage.clickOnCreated();
        Assert.assertEquals(linksPage.getResponseMessage().getText(), "Link has responded with staus 201 and status text Created\n" + "\n");
}

@Test
public void openBrokenLinksPage() throws InterruptedException {
    openElementsPage();
    Thread.sleep(2000);
    // visibilityWait(elementsPage.getBrokenLinksImages());
    //scrollIntoView(elementsPage.getBrokenLinksImages());
    elementsPage.clickOnBrokenLinksImages();
    String brokenlinkURL = driver.getCurrentUrl();
    Assert.assertEquals(brokenlinkURL, "https://demoqa.com/broken");
}

@Test
public void brokenLinkTest() throws InterruptedException {
        openBrokenLinksPage();
        scrollIntoView(brokenLinkPage.getBrokenLink());
        brokenLinkPage.clicnOnValidLink();
        Assert.assertEquals(driver.getCurrentUrl(), homepageURL);
        Thread.sleep(2000);
        driver.navigate().back();
        brokenLinkPage.clickOnBrokenLink();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), brokenLinkPage.getBrokenlinkURL());
}


@Test
public void openUploadDownloadPage() {
    openElementsPage();
    visibilityWait(elementsPage.getUploadAndDownload());
    elementsPage.clickOnUploadDownload();
    String uploaddownloadURL = driver.getCurrentUrl();
    Assert.assertEquals(uploaddownloadURL, "https://demoqa.com/upload-download");
}

@Test
public void successfulImageUpload() throws InterruptedException {
        File slika = new File("C:\\Users\\Korisnik\\Desktop\\slika1.jpg");
        openUploadDownloadPage();
        uploadDownloadPage.clickOnChooseFileButton();
        uploadDownloadPage.choosePictureToUpload();
        Assert.assertTrue(uploadDownloadPage.getUploadMessage().isDisplayed());
        Assert.assertTrue(slika.exists());

        Thread.sleep(2000);
        driver.navigate().back();
        uploadDownloadPage.clickDownloadButton();



}




@AfterMethod
    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
}

}
