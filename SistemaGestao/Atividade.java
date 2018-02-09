package unidade1;

import java.util.ArrayList;

public class Atividade 
{
	String recurso;
	String tipo;
	String titulo;
	String descricao;
	String participantes;
	String material;
	String informacao;
	
	public Atividade(String recurso, String tipo, String titulo, String descricao, String participantes) 
	{
		this.recurso = recurso;
		this.tipo = tipo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.participantes = participantes;
	}
	
	public void setRecurso(String recurso)
	{
		this.recurso = recurso;
	}
	public String getRecurso()
	{
		return this.recurso;
	}
	
	
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	public String getTipo()
	{
		return this.tipo;
	}
	
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	public String getTitulo()
	{
		return this.titulo;
	}
	
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	public String getDescricao()
	{
		return  this.descricao;
	}
	
	public void setInfo(String info)
	{
		this.informacao = info;
	}
	public String getInfo()
	{
		return this.informacao;
	}
	
	public void  setMaterial(String material)
	{
		
	}

	public void contaTipo(ArrayList<Atividade> atividades, String tipo)
	{
		int cont  =0;
		for(int i = 0; i < atividades.size(); i+=1)
		{
			if(atividades.get(i).tipo.equals(tipo))
				cont+=1;
		}
		cont-=1;
		System.out.printf("Quantidade de %s alocado(a): %d%n", tipo, cont);
	}
	
	
}
