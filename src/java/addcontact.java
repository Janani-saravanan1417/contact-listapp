import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddContactTest extends BaseTest {

    @Test
    public void testAddContact() {
        // Click on 'Add Contact' Button
        WebElement addContactBtn = driver.findElement(By.xpath("//button[text()='Add Contact']"));
        addContactBtn.click();

        // Fill contact details
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("birthdate")).sendKeys("1990-05-15");
        driver.findElement(By.id("email")).sendKeys("johndoe@example.com");
        driver.findElement(By.id("phone")).sendKeys("1234567890");
        driver.findElement(By.id("street1")).sendKeys("123 Main St");
        driver.findElement(By.id("city")).sendKeys("New York");
        driver.findElement(By.id("stateProvince")).sendKeys("NY");
        driver.findElement(By.id("postalCode")).sendKeys("10001");
        driver.findElement(By.id("country")).sendKeys("USA");

        // Click Submit
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Verify Contact is Added
        WebElement contactName = driver.findElement(By.xpath("//td[contains(text(),'John Doe')]"));
        Assert.assertTrue(contactName.isDisplayed(), "Contact was not added successfully!");
    }
}
