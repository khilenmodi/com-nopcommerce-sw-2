package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // click on the login link
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        String expected = "Welcome, Please Sign In!";
        String actual = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Redirected to the login page ", expected, actual);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // user should login with valid credential
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2003@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
       // driver.findElement(By.xpath("//a[text() = 'Log out']")).click();
        String expectedMessage = "Log out";
        String actualMessage = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        Assert.assertEquals("log out", expectedMessage, actualMessage);

    }
    @Test
    public void verifyTheErrorMessage() {
        // user should login with valid credential
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2005@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen123");
        driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n"+
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div [@class = 'message-error validation-summary-errors']")).getText();
        Assert.assertEquals("login was unsuccessful", expectedMessage, actualMessage);

    }
    @After
        public void tearDown() {
        //  closeBrowser();
    }


}
