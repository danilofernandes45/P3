package unidade1;

import java.util.ArrayList;

public class Aluno
{
	String nome;
	String matricula;
	String curso;
	String email;

	public Aluno(String nome, String matricula, String curso, String email)
	{
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.email = email;
	}
	
	public void setEmail(String email)
	{
		this.email  = email;
	}
	public String getEmail()
	{
		return this.email;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return this.nome;
	}

	void status()
	{
		System.out.println("Nome: " + this.nome );
		System.out.println("Matr�cula: " + this.matricula);
		System.out.println("Curso: " + this.curso);
		System.out.println("Turma: " + this.email);
	}	
	
	
}
