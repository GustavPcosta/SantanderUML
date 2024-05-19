
public class diagramClass {
	class IReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class IAparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class INavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet

    IReprodutorMusical <|-- iPhone
    IAparelhoTelefonico <|-- iPhone
    INavegadorInternet <|-- iPhone
}
