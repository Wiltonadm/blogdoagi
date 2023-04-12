package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elemento {
    WebDriver driver = WebDriverFabrica.criarChormeDrive();

    public void clicar(By locator) {
        WebElement elemento = driver.findElement(locator);
        elemento.click();
    }

    public void digitar(By locator, String texto) {
        WebElement elemento = driver.findElement(locator);
        elemento.clear();
        elemento.sendKeys(texto);
    }

    public String ExtrairTexto(By locator) {
        WebElement elemento = driver.findElement(locator);
        return elemento.getText();
    }
}
