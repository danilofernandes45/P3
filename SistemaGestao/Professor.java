package unidade1;

import java.util.ArrayList;

public class Professor
{
	String nome;
	String disciplina;
	boolean recurso;
	String email;

	public Professor(String nome, String disciplina, boolean recurso, String email)
	{
		this.nome = nome;
		this.disciplina = disciplina;
		this.email = email;
		this.recurso = recurso;
	}

	public void setRecurso(boolean recurso)
	{
		this.recurso = recurso;
	}
	public boolean getRecurso()
	{
		return this.recurso;
	}
	
	public void setEmail(String email)
	{
		this.email  = email;
	}
	public String getEmail()
	{
		return this.email;
	}

	public void setDisciplina(String disciplina)
	{
		this.disciplina = disciplina;
	}
	public String getDisciplina()
	{
		return this.disciplina;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return this.nome;
	}

}
