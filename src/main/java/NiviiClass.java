import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class NiviiClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.firefox.marionette","/home/vladimir/geckodraver");
        WebDriver driver = new FirefoxDriver();



        String baseUrl = "http://gazeta.lviv.ua/2013/08/30/ne-amerika-j-ne-gol-babi";
        String title = "Не Америка й не голі баби - ";

        driver.get(baseUrl);

        String actTitle = driver.getTitle();

        if (actTitle.contentEquals(title)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();




    }
}