package unidade1;

import java.util.ArrayList;

public class Atividade 
{
	int identificacao;
	String recurso;
	String tipo;
	String titulo;
	String descricao;
	String participantes;
	String material;
	String informacao;
	
	public Atividade(int ident, String recurso, String tipo, String titulo, String descricao, String material, String participantes) 
	{
		this.identificacao = ident;
		this.recurso = recurso;
		this.tipo = tipo;
		this.titulo = titulo;
		this.descricao = descricao;
		this.material = material;
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

	public void setParticipantes(String participantes)
	{
		this.participantes = participantes;
	}
	public String getParticipantes()
	{
		return this.participantes;
	}
	
	public void contaTipo(ArrayList<Atividade> atividades, String tipo)
	{
		int cont  =0;
		for(int i = 0; i < atividades.size(); i+=1)
		{
			if(atividades.get(i).tipo.equals(tipo))
				cont+=1;
		}
		System.out.printf("Quantidade de %s alocado(a): %d%n", tipo, cont);
	}
	

}
