package br.com.wyden.poo.modelo;

public class Aluno {

	private String nome;
	private int idade;
	private Curso curso;
	private Disciplina disciplina; 

	public Aluno(String nome, 
			     int idade, 
			     String nomeDoCurso,
			     String periodoDoCurso,
			     String coordenadorDoCurso) {
		
		this.nome = nome;
		this.idade = idade;
		
		Curso objCurso = new Curso(nomeDoCurso, 
								   periodoDoCurso, 
								   coordenadorDoCurso);
		
		this.curso = objCurso;
		
		objCurso = null;
		
	}

	
	public Aluno(String nome, 
			     int idade,
			     Curso curso) {
		
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
	}
	
	public Aluno() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void matricular() {
		
	}
	
	void retirarLivro() {
		System.out.println("EM CONSTRU��O");
	}
	
}
