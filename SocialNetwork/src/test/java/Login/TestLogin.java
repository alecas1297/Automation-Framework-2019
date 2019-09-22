package Login;

import Common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestLogin extends CommonAPI {

    @Test
    public void testLogin() {
        driver.findElement(By.id("email")).sendKeys("a@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("loginbutton")).click();
    }

}

