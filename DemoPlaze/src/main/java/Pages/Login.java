package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
        WebDriver driver;

        public Login(WebDriver driver) {
            this.driver = driver;
        }

        By Email = By.name("username");
        By Password = By.name("password");
         By login=By.id("sign-in-1");
         public void login(String email,String password)  {

    driver.findElement(Email).sendKeys(email);
    driver.findElement(Password).sendKeys(password);
    driver.findElement(login).click();


}


}