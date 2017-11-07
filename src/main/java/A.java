import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class A {

    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.marionette", "/home/vladimir/geckodraver");
        WebDriver driver = new FirefoxDriver();


        String baseUrl = "http://gazeta.lviv.ua/2013/08/30/ne-amerika-j-ne-gol-babi";
        String tag = "";



        driver.get(baseUrl);

        tag = driver.findElement(By.id("black-studio-tinymce-29")).getTagName();
        System.out.println(tag);
        List<WebElement> s = driver.findElements(By.className("center"));


        s.forEach((x)-> System.out.println(x.getTagName()));

        //System.out.println(driver.getPageSource());

        driver.close();
    }
}
