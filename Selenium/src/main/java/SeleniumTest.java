import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    @Test
    public void openGooglePage(){
        System.setProperty("webdriver.chrome.driver","C:\\Selenium-drivers\\Chrome\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.firefox.driver","C:\\Selenium-drivers\\Firefox\\geckodriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.onet.pl/");

    }
}
