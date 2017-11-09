import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.marionette", "/home/vladimir/geckodraver");
        WebDriver driver = new FirefoxDriver();


        driver.get("http://demo.guru99.com/selenium/newtours/");
        WebDriverWait wait = new WebDriverWait(driver,15);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("hui");
    }
}
