import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpFunction {
    ChromeDriver driver;
    @BeforeTest
    public void Setup(){
        driver=new ChromeDriver();
        driver.navigate().to("https://indigoproviderportal.vercel.app/register");
        driver.manage().window().fullscreen();
    }
    @Test
    public void SignUp(){
      WebElement email= driver.findElement(By.name("email"));
      email.sendKeys("esraa@gmail.com");

    }

}
