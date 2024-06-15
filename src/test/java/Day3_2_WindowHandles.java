import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class Day3_2_WindowHandles {

    protected WebDriver driver;
    @Test
    public void test(){
        driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/windows");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        for( String handle : windowHandles ){
            System.out.println(driver.switchTo().window(handle).getCurrentUrl());
            System.out.println(driver.switchTo().window(handle).getTitle());
        }
    }
}
