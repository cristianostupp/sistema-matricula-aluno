package br.com.wyden.poo.modelo;

public class Disciplina {
	
	private String codigo;
	private String nome;

	public Disciplina(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Disciplina() {
		
	}
		
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
