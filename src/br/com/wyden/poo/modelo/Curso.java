package br.com.wyden.poo.modelo;

public class Curso {
	
	private String nome;
	private String periodo;
	private String coordenador;
	
	public Curso(String nome, String periodo, String coordenador) {
		this.nome = nome;
		this.periodo = periodo;
		this.coordenador = coordenador;
	}
	
	public Curso() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public String getCoordenador() {
		return coordenador;
	}
	
	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

}
