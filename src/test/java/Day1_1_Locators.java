import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_1_Locators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertecacademy.com/");
        Dimension dimension = new Dimension(600, 400); //sayfayı küçülltür.
        driver.manage().window().setSize(dimension);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/a/div")).click();
    }
}
