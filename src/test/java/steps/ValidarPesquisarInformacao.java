package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.PaginaInicial;
import utils.Elemento;
import utils.Screenshot;
import utils.WebDriverFabrica;


public class ValidarPesquisarInformacao {
    PaginaInicial paginaInicial = new PaginaInicial();
    Elemento elemento = new Elemento();

    @Dado("Que estou na pagina inical do blog do agi")
    public void queEstouNaPaginaInicalDoBlogDoAgi() {
        paginaInicial.abrirNavegadorPaginalIncialBlog();
    }

    @Quando("clicar na lupa")
    public void clicarNaLupa() {
        elemento.clicar(By.id("search-open"));

    }
    @Quando("Na barra de pesquisa informar: {string}")
    public void naBarraDePesquisaInformar(String InformacaoBuscada) {
        elemento.digitar(By.className("search-field"), InformacaoBuscada);
    }
    @Quando("clicar no botão pesquisar")
        public void clicarNoBotaoPesquisar() {
        elemento.clicar(By.className("search-submit"));
    }
    @Então("na tela de resultado da pequisa devera retornar a mensagem: {string}")
    public void naTelaDeResultadoDaPequisaDeveraRetornarAMensagem(String mensagemRetornada) {
        Assert.assertEquals(mensagemRetornada, elemento.ExtrairTexto(By.className("entry-header")));

    }
    @Entao("gravar evidencia")
    public void gravarEvidencia() {
        Screenshot.tirarScreenshot(WebDriverFabrica.driver, "ValidarPesquisarInformacao");
    }
    @Entao("fechar navegador")
    public void fecharNavegador() {
        WebDriverFabrica.fecharDriver();
    }
}
