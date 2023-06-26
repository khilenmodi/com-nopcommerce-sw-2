package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/register?returnUrl=%2Fgift-cards";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        WebElement registerLinks = driver.findElement(By.linkText("Register"));
        registerLinks.click();
        String expectedMessage = "Register";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Register", expectedMessage, actualMessage);
        /*driver.findElement(By.id("FirstName")).sendKeys("khilen");
        driver.findElement(By.id("LastName")).sendKeys("Modi");
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2003@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("khilen1234");
        driver.findElement(By.tagName("h1")).click();*/
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        WebElement registerLinks = driver.findElement(By.linkText("Register"));
        registerLinks.click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("khilen");
        driver.findElement(By.id("LastName")).sendKeys("Modi");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("15");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1982");
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2002@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("khilen1234");
        driver.findElement(By.id("register-button")).click();
        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(By.xpath("//div[text() = 'Your registration completed']")).getText();
        Assert.assertEquals("Your registration completed", expectedMessage, actualMessage);
    }

    @After
    public void tearDown(){
     //  closeBrowser();
    }
}
