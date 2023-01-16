package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;

public abstract class  ReuseableAbstractClass {
    private WebDriver driver = Driver.getDriver();



    public void clickFunction(WebElement clickElement){

        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){

        sendKeysElement.sendKeys(value);
    }

    public void selectElementFromDropdown(WebElement dropdown,String element){

        Select slc = new Select(dropdown);

        slc.selectByVisibleText(element);

    }


    public void assertion(WebElement actual,String expected){
        Assert.assertEquals(actual.getText(),expected);
        System.out.println(actual.getText() +" is visible at the top of the list");

    }
    public void assertion(String actual,String expected){
        Assert.assertEquals(actual,expected);

    }
    public void assertion(List<WebElement> actual,int expected){
        Assert.assertEquals(expected,actual.size());

    }
    public void hoveringFunction(List<WebElement> webElementList,List<WebElement> addToCartList){
        List<WebElement> addToCart=addToCartList.subList(1,addToCartList.size());
        //I took the sublist of the addToCartList starting index 1 because this list have 5 items and first of the items belong
        //to the featured product at the very top of the page
        Actions actions=new Actions(driver);
        webElementList.forEach(n1->{
            int count=0;
            actions.moveToElement(n1).perform();
            Assert.assertTrue(addToCart.get(count).isDisplayed());
        });
    }


    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1070)", "");
    }

}
