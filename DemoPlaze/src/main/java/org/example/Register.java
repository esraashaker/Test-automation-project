package org.example;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
    WebDriver driver;
    public Register(WebDriver driver){
        this.driver=driver;
    }
    By Email=By.name("email");
    By nName=By.id("sign-up-select");
    By fName=By.name("name.firstName");
    By KName=By.id("sign-up-select-2");
    By lName=By.name("name.lastName");
    By password=By.name("password");
    By cPassword=By.name("confirm_password");
    By createPassword=By.id("sign-up-1");
//Email...........................................................
    public void setEmail(String email){
        driver.findElement(Email).sendKeys(email);
    }
    //nickname.........................................
    public void nickName(){
WebElement element=driver.findElement(nName);
        Select option=new Select(element);
        option.selectByIndex(2);
    }
    //first name...........................................................
    public void setfName(String fname){
        driver.findElement(fName).sendKeys(fname);}
        //kname.........................................
        public void DName(){
            WebElement element=driver.findElement(KName);
            Select option=new Select(element);
            option.selectByIndex(5);
    }//last name...........................................................
    public void setlName(String lname){
        driver.findElement(lName).sendKeys(lname);
    }
    //password...........................................................
    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    //confirm..........................................................
    public void setcPassword(String cpass){
        driver.findElement(cPassword).sendKeys(cpass);
    }
    //button...........................................................
    public void clickOfbutton(){
        driver.findElement(createPassword).click();
    }


}
