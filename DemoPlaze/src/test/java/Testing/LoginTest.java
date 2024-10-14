package Testing;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest{
@DataProvider(name ="login_data")
public Object[][]loginData()
{
return new Object[][]{
        { "esraa@gmail.com","esraa123456"},
        { "esraa@gmail","esraa123456"},
        { "esraa@gmail.com","esraa"},
       { "",""}
};
    }
    @Test(dataProvider = "login_data")
    public void testLogin(String email, String password) throws InterruptedException {
        driver.get("https://indigoproviderportal.vercel.app/login");
        loginPage.login(email, password);
        Thread.sleep(500);

        if (email.equals("esraa@gmail.com") && password.equals("esraa123456")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("https://indigoproviderportal.vercel.app/login"), "Login should be successful.");
        } else if (email.isEmpty()) {
            // Assert for empty email input
            String errorMessage = driver.findElement(By.id("Email is required")).getText(); // Update with actual ID
            Assert.assertEquals(errorMessage, "Email is required", "Error message for empty email should match.");
        } else if (password.isEmpty()) {
            // Assert for empty password input
            String errorMessage = driver.findElement(By.id("Password is required")).getText(); // Update with actual ID
            Assert.assertEquals(errorMessage, "Password is required", "Error message for empty password should match.");
        } else if(email != "esraa@gmail.com") {
            // Assert for invalid email format
            String errorMessage = driver.findElement(By.id("Please enter a valid email")).getText(); // Update with actual ID
            Assert.assertEquals(errorMessage, "Please enter a valid email", "Error message for invalid email should match.");
       }

        driver.navigate().refresh();
    }
}


