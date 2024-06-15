import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Day2_1_Practice {

WebDriver driver;

    @Before
    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        driver.get("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=154611856018&hvpone=&hvptwo=&hvadid=674177764078&hvpos=&hvnetw=g&hvrand=7497413669672501655&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012783&hvtargid=kwd-10573980&hydadcr=12932_2354400&language=tr_TR");
        WebElement gLink = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div[1]/input"));
        gLink.sendKeys("telefon");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // System.out.println(gLink.getText());

        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[4]/div/span/input")).click();

        List <WebElement> listsOfPhone = driver.findElements(By.className("a-size-base-plus"));
        List <WebElement> listsOfPhonePrices = driver.findElements(By.className("a-price-whole"));



        for (int i = 0; i < listsOfPhone.size(); i++) {
            System.out.println(listsOfPhone.get(i).getText());
            System.out.println(listsOfPhonePrices.get(i).getText());
            System.out.println("\n");
        }



    }

    @After
    public void close(){
        driver.close();
        driver.quit();
    }




}
