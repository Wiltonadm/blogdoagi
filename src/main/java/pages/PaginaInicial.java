package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFabrica;

public class PaginaInicial {

//    Acessar a paginal inicial do blog
    WebDriver driver = WebDriverFabrica.criarChormeDrive();

    public void abrirNavegadorPaginalIncialBlog(){
        driver.get("https://blogdoagi.com.br/");
    }
}
