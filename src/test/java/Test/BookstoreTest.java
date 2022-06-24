package Test;

import Base.BaseTest;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookstoreTest extends BaseTest {

@BeforeMethod
    public void pageSetUp() {
    driver.manage().window().maximize();
    driver.navigate().to(homepageURL);

}

@Test
public void openBookstoreAppPage() {
    scrollIntoView(homepagePage.getBookstoreAplication());
    homepagePage.clickOnBookstoreApplication();
    visibilityWait(bookStorePage.getLoginButton());
    scrollIntoView(bookStorePage.getLoginButton());
    visibilityWait(loginPage.getLoginButton());
    bookStorePage.clickOnLoginButton();
}

@Test
    public void successfulLogIn() {
    String validUsername = excelReader.getStringData("Login", 1, 0);
    String validPassword = excelReader.getStringData("Login", 1, 1);

    openBookstoreAppPage();
    loginPage.insertUsername(validUsername);
    loginPage.insertPassword(validPassword);
    loginPage.clickOnLoginButton();

    visibilityWait(bookStorePage.getLogoutButton());
    Assert.assertTrue(bookStorePage.getLogoutButton().isDisplayed());
    Assert.assertTrue(bookStorePage.getUserNameField().isDisplayed());
    Assert.assertEquals(bookStorePage.getUsernameValue().getText(), validUsername);
}
@Test
    public void unsuccessfulLoginWrongUsernameAndPassword() {
    String invalidUsername = excelReader.getStringData("Login", 1, 2);
    String invalidPassword = excelReader.getStringData("Login", 1, 3);

    openBookstoreAppPage();
    loginPage.insertUsername(invalidUsername);
    loginPage.insertPassword(invalidPassword);
    loginPage.clickOnLoginButton();

    boolean check = false;
    try {
        check = bookStorePage.getLogoutButton().isDisplayed();
    } catch (Exception e) { Assert.assertFalse(check); }

    Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
    Assert.assertEquals(loginPage.getErrorMessage().getText(), "Invalid username or password!");
}

@Test
        public void unsuccessfulLoginWrongUsername() {
        String invalidUsername = excelReader.getStringData("Login", 1, 2);
        String validPassword = excelReader.getStringData("Login", 1, 1);

        openBookstoreAppPage();
        loginPage.insertUsername(invalidUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickOnLoginButton();

        boolean check =false;
        try { check=bookStorePage.getLogoutButton().isDisplayed();}
        catch(Exception e) { Assert.assertFalse(check);}

        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage().getText(), "Invalid username or password!");
    }

@Test
        public void unsuccessfulLoginWrongPassword() {
        openBookstoreAppPage();
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String invalidPassword = excelReader.getStringData("Login", 1, 3);

        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(invalidPassword);
        loginPage.clickOnLoginButton();

        boolean check =false;
        try { check=bookStorePage.getLogoutButton().isDisplayed();}
        catch(Exception e) { Assert.assertFalse(check);}

        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
        Assert.assertEquals(loginPage.getErrorMessage().getText(), "Invalid username or password!");
    }


}


