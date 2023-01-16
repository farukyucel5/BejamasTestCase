package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BejamasPage extends ReuseableAbstractClass{

    public BejamasPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='FeaturedProductstyle__ProductImageWrapper-b7938p-0 epCavU']")
    public WebElement photoOfTheDay;
    @FindBy(xpath = "//*[@*='style__Column-sc-4ctdae-1 jlvejm']")
    public List<WebElement> webElementList;
    @FindBy(xpath = "//button[text()='Add to Cart']")
    public List<WebElement> addToCartList;
}
