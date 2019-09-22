package TestHome;

import Common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSpecialFares extends CommonAPI {

    @Test
    public void test1()
    {
        clickOnElement("img-responsive");
    }
    @Test
    public void test2()
    {
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("alecas.1297@gmail.com");

    }
    @Test
    public void test3() {
        driver.findElement(By.xpath("//a[@href='#thflight']")).click();
    }
}
