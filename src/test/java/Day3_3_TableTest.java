import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Day3_3_TableTest {

    protected WebDriver driver;

    @Test
    public void test(){
        driver= Driver.getDriver();
        driver.get("https://practice.cydeo.com/web-tables");

        List<WebElement> tableHeads = driver.findElements(By.xpath("//th"));
        for (WebElement head: tableHeads){
            System.out.println(head.getText());
        }

        List<WebElement> names = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        for (WebElement name: names){
            System.out.println(name.getText());
        }

    }

}
