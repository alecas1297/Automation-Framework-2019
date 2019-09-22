package HomePageHelper;

import Common.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    @FindBy(id = "gh-ac")public static WebElement searchBox;
    @FindBy(id = "gh-btn")public static WebElement search;
    @FindBy(xpath = "//a[@href='https://cart.payments.ebay.com/sc/view']")public static WebElement cart;
    @FindBy(className = "hl-cat-nav__js-tab")public static WebElement deals;
    @FindBy(className = "gh-p")public static WebElement sell;
    @FindBy(xpath = "//a[@href='https://ocsnext.ebay.com/ocs/home']")public static WebElement help;

    public HomePage(){}
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
  }

    public void searchItem()
    {
        searchBox.sendKeys("laptop");
        search.click();
    }
    public void cart()
    {
        cart.click();
    }
    public void deals() {
        deals.click();

    }
    public void sell() {
        sell.click();
    }
    public void help() {
        help.click();
    }
}
