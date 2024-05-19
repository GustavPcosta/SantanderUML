package Interfaces;

public interface Interface {
	public interface IReprodutorMusical {
	    void tocar();
	    void pausar();
	    void selecionarMusica(String musica);
	}

	// IAparelhoTelefonico.java
	public interface IAparelhoTelefonico {
	    void ligar(String numero);
	    void atender();
	    void iniciarCorreioVoz();
	}

	// INavegadorInternet.java
	public interface INavegadorInternet {
	    void exibirPagina(String url);
	    void adicionarNovaAba();
	    void atualizarPagina();
	}
}
