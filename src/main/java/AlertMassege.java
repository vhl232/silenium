import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AlertMassege {

    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.marionette", "/home/vladimir/geckodraver");
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "http://jsbin.com/usidix/1";

        String alert = "";

        driver.get(baseUrl);

        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        Alert alert1 = driver.switchTo().alert();
        alert = alert1.getText();

        alert1.accept();



        driver.close();
        System.out.println(alert);
    }
}
