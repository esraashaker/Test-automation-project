package org.example;

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


    //Email...........................................................
        public void setEmail(String email) {
            driver.findElement(Email).sendKeys(email);
        }
    //password...........................................................
    public void setPassword(String password) {
        driver.findElement(Password).sendKeys(password);
    }
    //button...........................................................
    public void clickOfbutton(){
        driver.findElement(login).click();
    }


}