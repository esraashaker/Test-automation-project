package Pages;

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
    public void RegisterFun(String email,String fname,String lname ,String pass ,String cpass ){
        //email...........................................
        driver.findElement(Email).sendKeys(email);
        //first name..........................................
        driver.findElement(fName).sendKeys(fname);
        //nickName.................................
        WebElement element=driver.findElement(nName);
        Select option=new Select(element);
        option.selectByIndex(2);
        //kname.......................................
        WebElement element1=driver.findElement(KName);
        Select option1=new Select(element1);
        option1.selectByIndex(5);
        //list name..................................
        driver.findElement(lName).sendKeys(lname);
        //pasword....................................
        driver.findElement(password).sendKeys(pass);
        //confirm......................................
        driver.findElement(cPassword).sendKeys(cpass);
        driver.findElement(createPassword).click();

    }

}











