package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2003@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
        driver.findElement(By.xpath("//a[text()='Computers ']")).click();
        String expectedMessage = "Computers";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Computers ", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2003@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
        driver.findElement(By.xpath("//a[text() = 'Electronics ']")).click();
        String expectedMessage = "Electronics";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Electronics", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2003@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
        driver.findElement(By.xpath("//a[text() = 'Apparel ']")).click();
        String expectedMessage = "Apparel";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Apparel", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2003@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
        driver.findElement(By.xpath("//a[text() = 'Digital downloads ']")).click();
        String expectedMessage = "Digital downloads";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Digital downloads", expectedMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2003@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
        driver.findElement(By.xpath("//a[text() = 'Books ']")).click();
        String expectedMessage = "Books";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Books", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2003@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
        driver.findElement(By.xpath("//a[text() = 'Jewelry ']")).click();
        String expectedMessage = "Jewelry";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Jewelry", expectedMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        WebElement loginLinks = driver.findElement(By.linkText("Log in"));
        loginLinks.click();
        driver.findElement(By.id("Email")).sendKeys("khilenmodi2003@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("khilen1234");
        driver.findElement(By.xpath("//button[text() = 'Log in'] ")).click();
        driver.findElement(By.xpath("//a[text() = 'Gift Cards ']")).click();
        String expectedMessage = "Gift Cards";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Gift Cards", expectedMessage, actualMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
