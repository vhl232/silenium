import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Biki {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette", "/home/vladimir/geckodraver");
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver,5);
        driver.get("file:///home/vladimir/%D0%A1%D1%82%D1%96%D0%BB%D1%8C%D0%BD%D0%B8%D1%86%D1%8F/papka/index.Html");


        try {
            test1(driver);

            test2(driver);
            test3(driver,wait);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        driver.quit();



    }

    private static void test3(WebDriver driver,WebDriverWait wait) {

        WebElement element = driver.findElement(By.id("middle"));


        try{
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bik")));}
        catch (TimeoutException e){
            throw new RuntimeException("nevidim BIKA ");
        }






    }

    private static void test2(WebDriver driver) {

        WebElement element = driver.findElement(By.id("knopka"));
        element.click();
        Alert alert = driver.switchTo().alert();

        if(!alert.getText().equals("ti pidor")){
            throw new RuntimeException("ne tot text");

        }
        alert.accept();



    }

    private static void test1(WebDriver driver) {

        WebElement element = driver.findElement(By.id("middle"));

        if(!element.getText().equals("Колонка 2"))
            throw new RuntimeException("text ne sovpal--ne loshadi");


    }
}
