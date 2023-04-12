package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFabrica {

    public static WebDriver driver;
    private WebDriverFabrica(){

    }
    public static WebDriver criarChormeDrive(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            driver = new ChromeDriver(options);

        }
        return driver;
    }
    public static WebDriver fecharDriver() {
        if (driver != null) {
            driver.quit();
        }
        return driver = null;
    }
}
