package Interfaces;

import Interfaces.Interface.IAparelhoTelefonico;
import Interfaces.Interface.INavegadorInternet;
import Interfaces.Interface.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
	    


	    @Override
	    public void tocar() {
	        System.out.println("Reproduzindo música...");
	    }

	    @Override
	    public void pausar() {
	        System.out.println("Música pausada.");
	    }

	    @Override
	    public void selecionarMusica(String musica) {
	        System.out.println("Selecionando a música: " + musica);
	    }

	  
	    @Override
	    public void ligar(String numero) {
	        System.out.println("Ligando para: " + numero);
	    }

	    @Override
	    public void atender() {
	        System.out.println("Atendendo a chamada...");
	    }

	    @Override
	    public void iniciarCorreioVoz() {
	        System.out.println("Iniciando correio de voz...");
	    }

	   
	    @Override
	    public void exibirPagina(String url) {
	        System.out.println("Exibindo página: " + url);
	    }

	    @Override
	    public void adicionarNovaAba() {
	        System.out.println("Adicionando nova aba...");
	    }

	    @Override
	    public void atualizarPagina() {
	        System.out.println("Atualizando página...");
	    }

	    public static void main(String[] args) {
	        Iphone meuIphone = new Iphone();
	        meuIphone.tocar();
	        meuIphone.pausar();
	        meuIphone.selecionarMusica("Imagine - John Lennon");

	        meuIphone.ligar("123456789");
	        meuIphone.atender();
	        meuIphone.iniciarCorreioVoz();

	        meuIphone.exibirPagina("http://www.example.com");
	        meuIphone.adicionarNovaAba();
	        meuIphone.atualizarPagina();
	    }
	}


