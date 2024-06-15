import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day2_2_AfterUtilities {


    @Test
    public void test1(){

        Driver.getDriver().get("https://www.google.com");

    Driver.getDriver().findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("muhemrekahrammmm");
     }
}
