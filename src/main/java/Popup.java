import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {
    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.marionette","/home/vladimir/geckodraver");

        WebDriver driver = new FirefoxDriver();


        driver.get("http://demo.guru99.com/selenium/deprecated.html");

        driver.switchTo().frame("classFrame");

        driver.findElement(By.linkText("Deprecated")).click();



        driver.quit();










    }
}
