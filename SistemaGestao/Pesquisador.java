package unidade1;

import java.util.ArrayList;

public class Pesquisador
{
	String nome;
	String areaPesquisa;
	boolean recurso;
	String email;


	public Pesquisador(String nome, String areaPesquisa, boolean recurso, String email)
	{
		this.nome = nome;
		this.areaPesquisa = areaPesquisa;
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
	
	
}
