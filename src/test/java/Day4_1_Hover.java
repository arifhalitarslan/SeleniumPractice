import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Day4_1_Hover {

    protected WebDriver driver;
    @Test
    public void test() throws InterruptedException {
        driver = Driver.getDriver();
        driver.get("http://practice.cydeo.com/hovers");
        Actions actions = new Actions(driver);

        List<WebElement> hovers = driver.findElements(By.className("figure"));

        for (WebElement hover : hovers){
            actions.moveToElement(hover).perform();
            Thread.sleep(1000);
        }


    }
}
