#enconding: UTF-8
#language: pt

@BlogDoAgi
Funcionalidade: Realizar pesquisa no blog

  @ValidarPesquisarInformacao
  Esquema do Cenario: Realizar a pesquisa de informação no blog
    Dado Que estou na pagina inical do blog do agi
    Quando clicar na lupa
    E Na barra de pesquisa informar: <InformacaoBuscada>
    Então na tela de resultado da pequisa devera retornar a mensagem: <ResultadoEsperado>
    E fechar o navegador

    Exemplos: Informação a serem buscadas
    |             InformacaoBuscada                      |                          ResultadoEsperado                                |
    |   "Adsasasdasd"                                    |   "Nenhum resultado"                                                      |
    |   "Comece sua carreira em tecnologia com o Agi!"   |   "Resultados da busca por: Comece sua carreira em tecnologia com o Agi!" |

    @ValidarFecharBarraPesquisa
    Cenario: Validar fechar barra de pesquisa
      Dado Que estou na pagina inicial do blog agi
      Quando clicar na lupa
      E na barra de pesquisa clicar no X
      Entao a barra de pesquisa devera ser fechada
      E fechar o  navegador
