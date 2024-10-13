package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends HomeTest{
    @Test
    public void Test(){
        var email="esraa@gmail.com";
        var firstName="esraa";
        var lastName="shaker";
        var password="esraa123456";
        var confirmPassword="esraa123456";
        registerpage.setEmail(email);
        registerpage.nickName();
        registerpage.setfName(firstName);
        registerpage.DName();
        registerpage.setlName(lastName);
        registerpage.setPassword(password);
        registerpage.setcPassword(confirmPassword);
        registerpage.clickOfbutton();
        Assert.assertEquals(email,"esraa@gmail.com","");
        Assert.assertEquals(firstName,"esraa","");
        Assert.assertEquals(lastName,"shaker","");
        Assert.assertEquals(password,"esraa123456","");
        Assert.assertEquals(confirmPassword,"esraa123456","");

    }
    @Test
    public void test2(){
        var email="esraa@gmail";
        var firstName="esraa";
        var lastName="shaker";
        var password="esraa123456";
        var confirmPassword="esraa123456";
        registerpage.setEmail(email);
        registerpage.nickName();
        registerpage.setfName(firstName);
        registerpage.DName();
        registerpage.setlName(lastName);
        registerpage.setPassword(password);
        registerpage.setcPassword(confirmPassword);
        registerpage.clickOfbutton();
        Assert.assertEquals(email,"esraa@gmail","");
        Assert.assertEquals(firstName,"esraa","");
        Assert.assertEquals(lastName,"shaker","");
        Assert.assertEquals(password,"esraa123456","");
        Assert.assertEquals(confirmPassword,"esraa123456","");

    }
    @Test
    public void test3(){
        var email="esraa@gmail.com";
        var firstName="esraa";
        var lastName="shaker";
        var password="esraa";
        var confirmPassword="esraa";
        registerpage.setEmail(email);
        registerpage.nickName();
        registerpage.setfName(firstName);
        registerpage.DName();
        registerpage.setlName(lastName);
        registerpage.setPassword(password);
        registerpage.setcPassword(confirmPassword);
        registerpage.clickOfbutton();
        Assert.assertEquals(email,"esraa@gmail.com","");
        Assert.assertEquals(firstName,"esraa","");
        Assert.assertEquals(lastName,"shaker","");
        Assert.assertEquals(password,"esraa","true");
        Assert.assertEquals(confirmPassword,"esraa","true");

    }
    @Test
    public void test4(){
        var email="";
        var firstName="";
        var lastName="";
        var password="";
        var confirmPassword="";
        registerpage.setEmail(email);
        registerpage.nickName();
        registerpage.setfName(firstName);
        registerpage.DName();
        registerpage.setlName(lastName);
        registerpage.setPassword(password);
        registerpage.setcPassword(confirmPassword);
        registerpage.clickOfbutton();
        Assert.assertEquals(email,"","");
        Assert.assertEquals(firstName,"","");
        Assert.assertEquals(lastName,"","");
        Assert.assertEquals(password,"","");
        Assert.assertEquals(confirmPassword,"","");

    }
    }

