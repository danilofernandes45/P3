import java.util.ArrayList;


public class Empregado 
{
	public int id;
	public  String nome;
	public String endereco;
	public String tipo;
	public int hora;
	public int minuto;
	public float salarioHora;
	public float salarioMensal;
	public float comissao;
	public boolean sindicalizado;
	public int codigoSindicato;
	public float taxaSind;//
	public String metodoPagam;
	public CartaoPonto cartao;
	public Venda venda;
	
	
	public Empregado(int id, String nome, String endereco) 
	{
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void setHora(int hora, int minuto)
	{
		if(hora > 0 && hora <= 24)
		{
			this.hora = hora;
			if(minuto >= 0 && minuto < 60)
				this.minuto = minuto;
			else
				System.out.println("Hora invalida");
		}
		else
			System.out.println("Hora invalida");	
	}
	public int getHora()
	{
		return this.hora;
	}
	public int getMinuto()
	{
		return this.minuto;
	}
	
	public void removerEmpregado(ArrayList<Empregado> empregados,  int id)
	{
		for(int i = 0; i < empregados.size(); i++)
		{
			if(id == empregados.get(i).id)
			{
				empregados.get(i).id = 0;
				empregados.get(i).nome = "null";
				break;
			}
		}
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getNome()
	{
		return this.nome;
	}
	
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	public String getEndereco()
	{
		return this.endereco;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	public String getTipo()
	{
		return this.tipo;
	}
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}
	
	public void setIdSindicado(int id)
	{
		this.codigoSindicato = id;
	}
	public int getIdSindicato()
	{
		return this.codigoSindicato;
	}

	public void setTaxaSind(float taxa)
	{
		this.taxaSind = taxa;
	}
	public float getTaxa()
	{
		return this.taxaSind;
	}

	public void setSindicalizado(boolean sind)
	{
		this.sindicalizado = sind;
	}
	public boolean getSindicalizado()
	{
		return this.sindicalizado;
	}

	public void setMetodo(String metodo)
	{
		this.metodoPagam = metodo;
	}
	public String getMetodo()
	{
		return this.metodoPagam;
	}

	public float PorHora(CartaoPonto cartao, float valor, float taxaNormal)
	{
		float salario=0, horas;
		
		//calcular a q_horas
		
		/*if(horas > 8)
		{
			salario = 8*valor + (1.5f *taxaNormal*horas); //Mudar	
		}
		else
			salario = 8*valor;*/
		return salario;
	}

	public float comissionado(float venda, float salario, float percentual)
	{
		salario += (venda * percentual);
		return salario;
	}
	
	public void setSalarioHora(float salario)
	{
		this.salarioHora = salario;
	}
	public float getSalarioHora()
	{
		return this.salarioHora;
	}
	
	public void setSalarioMensal(float salario)
	{
		this.salarioMensal = salario;
	}
	public float getSalarioMensal()
	{
		return this.salarioMensal;
	}
	
	public void lancarCartao(CartaoPonto cartao, int id, ArrayList<Empregado> empregados)
	{
		for(int i = 0; i < empregados.size(); i++)
		{
			if(id == empregados.get(i).id)
			{
				this.cartao = cartao; 
			}
		}
	}
	
	public void lancarVenda(Venda venda, int id, ArrayList<Empregado> empregados)
	{
		for(int i = 0; i < empregados.size(); i++)
		{
			if(id == empregados.get(i).id)
			{
				this.venda = venda;
			}
		}
	}

}
