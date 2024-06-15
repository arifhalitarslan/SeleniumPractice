import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day1_2_SelectListeleme {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");

        List<WebElement> selectList  = driver.findElements(By.xpath("/html/body/main/div/div/div[2]/div[2]/select"));

        for (int i = 0; i <selectList.size() ; i++) {
            System.out.println(selectList.get(i).getText());
        }
    }
}
