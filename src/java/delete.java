import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteContactTest extends BaseTest {

    @Test
    public void testDeleteContact() {
        // Locate the contact and click delete
        WebElement deleteButton = driver.findElement(By.xpath("//td[contains(text(),'John Doe')]/following-sibling::td/button[text()='Delete']"));
        deleteButton.click();

        // Confirm deletion in alert popup
        driver.switchTo().alert().accept();

        // Verify contact is deleted
        boolean isContactDeleted = driver.findElements(By.xpath("//td[contains(text(),'John Doe')]")).isEmpty();
        Assert.assertTrue(isContactDeleted, "Contact was not deleted successfully!");
    }
}
