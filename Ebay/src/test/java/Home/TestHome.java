package Home;

import Common.CommonAPI;
import HomePageHelper.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends HomePage {

    HomePage homePage;

    @BeforeMethod
    public void initElements()
    {
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @Test
    public void testSearchBar()
    {
       searchItem();
    }
    @Test
    public void testMyCart()
    {
        cart();
    }
    @Test
    public void testDeals() {
        deals();
    }
    @Test
    public void testSell() {
        sell();
    }
    @Test
    public void testHelp() {
        help();
    }


}
