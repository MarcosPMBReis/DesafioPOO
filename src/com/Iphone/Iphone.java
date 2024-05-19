package com.Iphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
	
	public void tocar() {
		System.out.println("Reproduzindo musica");
	}
	
	public void pausar() {
		System.out.println("Musica pausada");
	}
	public void selecionarMusica(String musica) {
		System.out.println("Reproduzindo a musica ".concat(musica));
	}
	
	public void ligar(String numero) {
		System.out.println("Ligando para o numero ".concat(numero));
	}
	public void atender() {
		System.out.println("Ligação na linha");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Seu correio de voz foi iniciado");
	}
	
	public void exibirPagina(String url) {
		System.out.println("Carregando a página ".concat(url));
	}
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
	}
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}
}
