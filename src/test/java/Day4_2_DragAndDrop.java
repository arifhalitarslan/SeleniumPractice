import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day4_2_DragAndDrop {

    protected WebDriver driver;
    @Test
    public void test(){
        driver = Driver.getDriver();
        driver.get("http://practice.cydeo.com/drag_and_drop");

        WebElement a = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[1]"));
        WebElement b = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(a,b).perform();
    }

}
