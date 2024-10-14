package Testing;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    @DataProvider(name = "register-data")
    public Object[][]regdata(){
        return new Object[][]{
                {"esraa@gmail.com","esraa","shaker","esraa123456","esraa123456"} ,
                {"esraa@gmail","esraa","shaker","esraa123456","esraa123456"} ,
                {"esraa@gmail.com","esraa","shaker","esraa","esraa"} ,
                {"","","","",""}

        };
    }
    @Test(dataProvider = "register-data")
    public void testRegister(String email, String firstName, String lastName, String password, String confirmPassword) throws InterruptedException {
        registerpage.RegisterFun(email, firstName, lastName, password, confirmPassword);
        Thread.sleep(500);

        if (email.equals("esraa@gmail.com") && password.equals("esraa123456") && firstName.equals("esraa") && lastName.equals("shaker")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("https://indigoproviderportal.vercel.app/register")
                    , "Sign up should be successful.");
        } else if (email.isEmpty()) {
            // Assert for empty email input...........................
            String errorMessage = driver.findElement(By.id("Email is required")).getText();
            Assert.assertEquals(errorMessage, "Email is required", "Error message for empty email should match.");
        } else if (password.isEmpty()) {
            // Assert for empty password input..............................
            String errorMessage = driver.findElement(By.id("Password is required")).getText();
            Assert.assertEquals(errorMessage, "Password is required",
                    "Error message for empty password should match.");
        }
        else if (firstName.isEmpty() && lastName.isEmpty()) {
            String errorMessage = driver.findElement(By.id("sign-in-Either first name or last name is required")).getText();
            Assert.assertEquals(errorMessage, "sign-in-Either first name or last name is required",
                    "Error message for empty password should match.");
        }
        else if(email != "esraa@gmail.com") {
            // Assert for invalid email format
            String errorMessage = driver.findElement(By.id("Please enter a valid email")).getText(); // Update with actual ID
            Assert.assertEquals(errorMessage, "Please enter a valid email",
                    "Error message for invalid email should match.");
        }

        driver.navigate().refresh();
    }
}



