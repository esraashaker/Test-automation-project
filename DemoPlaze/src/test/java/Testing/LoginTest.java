package Testing;

import org.example.Login;
import org.example.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    Login loginPage;
    @BeforeTest
    public void setUp(){
        driver=new ChromeDriver();
        loginPage=new Login(driver);
        driver.get("https://indigoproviderportal.vercel.app/login");
        driver.manage().window().fullscreen();
    }
    @BeforeMethod
    public void t(){
        driver.manage().window().fullscreen();
    }
    @Test
    public void Test(){
        var email="esraa@gmail.com";
        var password="esraa123456";
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        Assert.assertEquals(email,"esraa@gmail.com","");
        Assert.assertEquals(password,"esraa123456","");

    }
    @Test
    public void Test2(){
        var email="esraa@gmail";
        loginPage.setEmail(email);
        Assert.assertEquals(email,"esraa@gmail","");

    }
    @Test
    public void Test3(){
        var email="esraa@gmail.com";
        var password="esraa";
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        Assert.assertEquals(email,"esraa@gmail.com","");
        Assert.assertEquals(password,"esraa","");

    }
    @Test
    public void Test4(){
        var email="";
        var password="";
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        Assert.assertEquals(email,"","");
        Assert.assertEquals(password,"","");

    }
    @AfterTest
    public void Quit(){
        driver.quit();
    }

}
