import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Empregado 
{
	public int id;
	public  String nome;
	public String endereco;
	public String tipo;
	
	public float salarioHora;
	public float salarioFixo;
	public float salarioTotal;
	public float comissao;
	public String metodoPagam;
	public Date ultimoPagamento; 
	public boolean primeiroPagamento;
	
	public boolean sindicalizado;
	public int codigoSindicato;
	public float taxaSind;
	public float taxaServicos;

	public CartaoPonto cartao;
	public Venda venda;
	
	
	public Empregado(int id, String nome, String endereco) 
	{
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.primeiroPagamento = false;
		this.taxaServicos = 0;
		this.taxaSind = 0;
	}

	public void setAll(String tipo, float salarioHora, float salarioFixo, float comissao, String metodoPagam, boolean sindicalizado,
			int idSind, float taxaSind, float taxaServ)
	{
		this.tipo = tipo;
		this.salarioHora = salarioHora;
		this.salarioFixo = salarioFixo;
		this.salarioTotal = salarioFixo;
		this.comissao = comissao;
		this.metodoPagam = metodoPagam;
		this.sindicalizado = sindicalizado;
		this.codigoSindicato = idSind;
		this.taxaServicos = taxaServ;
		this.taxaSind = taxaSind;
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

	public void setPrimeiroPagamento(boolean pag )
	{
		this.primeiroPagamento = pag;
	}
	public boolean getPrimeiroPagamento()
	{
		return this.primeiroPagamento;
	}
	
	public void setTipo()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 1(por hora) 2(assalariado) 3 (comissionado)");
		int tipo = input.nextInt();
		
		if(tipo == 1)
		{
			this.tipo = "horista";
			CartaoPonto cartao = new CartaoPonto(this.id);
			this.cartao = cartao;
			System.out.println("Valor da hora trabalhada:");	
			this.salarioHora= input.nextFloat();
		}
		else if(tipo == 2)
		{
			this.tipo = "assalariado";					
			setSalarioFixo();
			this.salarioTotal = getSalarioFixo();
		}
		else if(tipo == 3)
		{
			this.tipo = "comissionado";
			setSalarioFixo();
			this.salarioTotal = getSalarioFixo();
		}
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

	public void setTaxaSind()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a taxa mensal do sindicato: ");
		this.taxaSind = input.nextFloat();
	}
	public float getTaxa()
	{
		return this.taxaSind;
	}

	public void setSindicalizado()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pertence ao sindicato?");
		System.out.println("Digite 1(sim) ou 0(nao)");
		int sindicatoInt = input.nextInt();
		
		if(sindicatoInt == 1)
		{
			this.sindicalizado = true;
		}
		else 
			this.sindicalizado = false;
	}
	public boolean getSindicalizado()
	{
		return this.sindicalizado;
	}

	public void setMetodo()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite 1(cheque) 2(conta bancaria): ");
		int metodo = input.nextInt();
		if(metodo == 1)
		{
			System.out.println("Receber por 1(correios) ou 2(em maos): ");
			int receber = input.nextInt();
			if(receber == 1)
				this.metodoPagam = "cheque pelos correios";
			else if(receber == 2)
				this.metodoPagam = "cheque em maos";
			else
			{
				System.out.println("Metodo invalido!");
			}	
		}
		else if(metodo == 2)
			this.metodoPagam = "conta bancaria";
		else
		{
			System.out.println("Metodo invalido!");
		}
	}
	public String getMetodo()
	{
		return this.metodoPagam;
	}

	public void PorHora(CartaoPonto cartao)
	{
		long horas = (cartao.saida.getTimeInMillis() - cartao.entrada.getTimeInMillis()) /  3600000;
		if(horas > 8)
			cartao.salarioDia = 8*this.salarioHora + (1.5f *this.salarioHora*(horas - 8)); 
		else
			cartao.salarioDia = this.salarioHora * horas;
	}

	public void setSalarioHora(float salario)
	{
		this.salarioHora = salario;
	}
	public float getSalarioHora()
	{
		return this.salarioHora;
	}
	
	public void setSalarioFixo()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o salario fixo: ");
		this.salarioFixo = input.nextFloat();
	}
	public float getSalarioFixo()
	{
		return this.salarioFixo;
	}
	
	public void setSalarioTotal(float salario)
	{
		this.salarioTotal = salario;
	}
	public float getSalarioTotal()
	{
		return this.salarioTotal;
	}	

	public void setUltimoPagamento(Date ultimo)
	{
		this.ultimoPagamento = ultimo;
	}
	public Date getUltimoPagamento()
	{
		return this.ultimoPagamento;
	}
	
	public void setEntrada(Calendar entrada)
	{
		this.cartao.entrada = entrada;
	}
	public void setSaida(Calendar saida)
	{
		this.cartao.saida = saida;
	}
}