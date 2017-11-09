import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class HatHunterUA {

    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.marionette","/home/vladimir/geckodraver");
        WebDriver driver = new FirefoxDriver();



        String baseUrl = "https://hh.ua/account/login?backurl=%2F";
        //String title = "Не Америка й не голі баби - ";

        driver.get(baseUrl);
        autorize(driver);
        driver.close();




    }

    private static void autorize(WebDriver driver){


        WebElement elements = driver.findElement(By.name("username"));

        //elements.forEach((x)-> System.out.println(x.getTagName()+" / "+x.getText()));

        elements.sendKeys("login");
        elements = driver.findElement(By.name("password"));
        elements.sendKeys("password");
        elements = driver.findElement(By.className("bloko-button"));
        elements.click();
    }
}