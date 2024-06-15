import Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3_1_Frame {

    protected WebDriver driver;
    @Test
    public void test(){

        driver=Driver.getDriver();

     driver.get("https://practice.cydeo.com");
     driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[23]/a")).click();
     driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();

     WebElement iFrame = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
     driver.switchTo().frame(iFrame);
     WebElement textInFrame = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));

        System.out.println(textInFrame.getText());

        driver.switchTo().parentFrame();


    }

}
