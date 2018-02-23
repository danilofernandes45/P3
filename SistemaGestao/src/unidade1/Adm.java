package unidade1;

import java.util.ArrayList;

public class Adm
{
	String nome;
	int cpf;
	boolean recurso;
	String email;

	public Adm(String nome, int cpf, boolean recurso, String email)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.recurso = recurso;
		this.email = email;
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

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return this.nome;
	}

	public void  setCpf(int cpf)
	{
		this.cpf = cpf;
	}
	public int getCpf()
	{
		return cpf;
	}
	
	
}
