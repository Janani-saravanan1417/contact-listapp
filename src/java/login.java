import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));

        emailField.sendKeys("test@example.com");
        passwordField.sendKeys("password123");
        loginButton.click();

        WebElement logoutButton = driver.findElement(By.xpath("//button[text()='Logout']"));
        Assert.assertTrue(logoutButton.isDisplayed(), "Login failed!");
    }
}
