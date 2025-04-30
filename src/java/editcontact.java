import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditContactTest extends BaseTest {

    @Test
    public void testEditContact() {
        // Locate an existing contact and click edit
        WebElement editButton = driver.findElement(By.xpath("//td[contains(text(),'John Doe')]/following-sibling::td/button[text()='Edit']"));
        editButton.click();

        // Update phone number
        WebElement phoneField = driver.findElement(By.id("phone"));
        phoneField.clear();
        phoneField.sendKeys("9876543210");

        // Click Save
        driver.findElement(By.xpath("//button[text()='Save']")).click();

        // Verify changes
        WebElement updatedPhone = driver.findElement(By.xpath("//td[contains(text(),'9876543210')]"));
        Assert.assertTrue(updatedPhone.isDisplayed(), "Phone number was not updated successfully!");
    }
}
