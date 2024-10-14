package Testing;

import Pages.Login;
import Pages.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;
    Register registerpage;
    Login loginPage;

    @BeforeTest
    public void setUp(){
    driver=new ChromeDriver();
    registerpage=new Register(driver);
    loginPage=new Login(driver);
       driver.get("https://indigoproviderportal.vercel.app/register");

        driver.manage().window().fullscreen();
}
@BeforeMethod
    public void t(){
    driver.manage().window().fullscreen();
}
@AfterTest
    public void Quit(){
    driver.quit();
}
}
