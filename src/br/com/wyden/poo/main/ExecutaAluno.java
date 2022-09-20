package br.com.wyden.poo.main;

import java.util.Scanner;

import br.com.wyden.poo.modelo.Aluno;
import br.com.wyden.poo.modelo.Disciplina;

public class ExecutaAluno {

	public static void main(String[] args) {

		Aluno objAluno = new Aluno("Pedrinho", 
								   20, 
								   "Computa��o", 
								   "Noturno",
								   "Wellington");

		objAluno.setIdade(18);
		objAluno.matricular();
		
		System.out.println(objAluno.getNome() + 
				" tem " +
				objAluno.getIdade() +
				" anos e cursa " +
				objAluno.getCurso().getNome() +
				" que � no per�odo " +
				objAluno.getCurso().getPeriodo());

		Disciplina objDisciplina = new Disciplina(
										"ARA0066", 
										"Programa��o Orientada a Objetos");
		
		objAluno.setDisciplina(objDisciplina);
		objDisciplina = null;
		
		System.out.println(objAluno.getNome() + 
				" est� matriculado na disciplina " +
				objAluno.getDisciplina().getCodigo() + " " +
				objAluno.getDisciplina().getNome());
		
	}
}
