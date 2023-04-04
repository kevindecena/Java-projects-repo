import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/KevinDecena/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement name = driver.findElement(new By.ByName("q"));
        name.click();
        name.sendKeys("Cheetah");

        WebElement button = driver.findElement(new By.ByName("btnK"));
        button.click();


        driver.quit();

    }

}