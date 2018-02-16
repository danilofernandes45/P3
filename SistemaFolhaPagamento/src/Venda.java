public class Venda
{
	int id;
	int dia;
	int mes;
	int ano;
	float valor;
	float comissao;
	
	public Venda(int id, int dia, int mes, int ano, float valor, float comissao) 
	{
		super();
		this.id = id;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.valor = valor;
		this.comissao = comissao;
	}
	
	public float getValor(float salario)
	{
		return (salario + this.comissao* this.valor);
	}
}