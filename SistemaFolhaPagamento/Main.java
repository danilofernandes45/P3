import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{

	public Main() 
	{
		int id = 1, realizar, tipo,  metodo, receber, horas, sindicatoInt, continuar, escolha;
		boolean sindicato;
		ArrayList<Empregado> empregado1 = new ArrayList<Empregado>();
		
		String nome, endereco, metodoString;
		float valor, salario, taxaNormal, comissao, taxaSind;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite 1(empregado) ou 2(folha)");
		realizar = input.nextInt();
		
		continuar = 1;
		while(continuar != 0)
		{
			if(realizar == 1)
			{
				System.out.println("Digite 1(incluir) ou 2(editar) ou 3(remover)");
				escolha = input.nextInt();
				
				System.out.println("Digite seu nome:");
				input.nextLine();
				nome = input.nextLine();
				System.out.println("digite seu endereco:");
				endereco = input.nextLine();
				
				Empregado emp = new Empregado(id, nome, endereco);
					
				if(escolha == 1)
				{
					System.out.println("Digite 1(por hora) 2(assalariado) 3 (comissionado)");
					tipo = input.nextInt();
					
					if(tipo == 1)
					{
						emp.setTipo("por hora");
						CartaoPonto cartao = new CartaoPonto(id);
							
						System.out.println("Valor da hora trabalhada:");	
						valor = input.nextFloat();
						
						System.out.println("Digite a hora de entrada no formato h min");
						cartao.horaInicio = input.nextInt();
						cartao.minutoInicio = input.nextInt();
						System.out.println("Digite a data de entrada no formato dd mm yyyy");
						cartao.diaInicio = input.nextInt();
						cartao.mesInicio = input.nextInt();
						cartao.anoInicio = input.nextInt();
						
						System.out.println("Digite a hora de saida no formato h min: ");
						cartao.horaSaida = input.nextInt();
						cartao.minutoSaida = input.nextInt();
						System.out.println("Digite a data de saida no formato dd mm yyyy");
						cartao.diaSaida = input.nextInt();
						cartao.mesSaida = input.nextInt();
						cartao.anoSaida = input.nextInt();
						
						
						System.out.println("Digite a taxa normal");
						taxaNormal = input.nextFloat();
						salario = emp.PorHora(cartao, valor, taxaNormal);
						//dia pagamento
						emp.setSalarioHora(valor);
						emp.setSalarioMensal(salario);
						
					}
					else if(tipo == 2)
					{
						emp.setTipo("assalariado");
						
						salario = 1500f;
						emp.setSalarioMensal(salario);
					}
					else if(tipo == 3)
					{
						emp.setTipo("comissionado");
						
						int dia, mes, ano;
						System.out.println("Digite a data da venda no formato dd mm yyyy");
						dia = input.nextInt();
						mes = input.nextInt();
						ano = input.nextInt();
						
						System.out.println("Digite o valor da venda:");
						valor = input.nextFloat();
						comissao = 0.1f;
						
						salario = emp.comissionado(valor, 1500f, comissao);	
						emp.setSalarioMensal(salario);
					}
					System.out.println("Digite 1(cheque) 2(conta bancaria): ");
					metodo = input.nextInt();
					if(metodo == 1)
					{
						System.out.println("Receber por 1(correios) ou 2(em maos): ");
						receber = input.nextInt();
						if(receber == 1)
							metodoString = "cheque pelos correios";
						else if(receber == 2)
							metodoString = "cheque em maos";
						else
						{
							System.out.println("Metodo invalido!");
							continue;
						}	
					}
					else if(metodo == 2)
						metodoString = "conta bancaria";
					else
					{
						System.out.println("Metodo invalido!");
						continue;
					}
					emp.setMetodo(metodoString);
					
					System.out.println("Pertence ao sindicato?");
					System.out.println("Digite 1(sim) ou 0(nao)");
					sindicatoInt = input.nextInt();
					
					if(sindicatoInt == 1)
					{
						emp.setSindicalizado(true);
					}
					else 
						emp.setSindicalizado(false);
					
					
				}
				
				
				
				
			    //taxa sindicato	
				
			}
			id+=1;
			System.out.println("Deseja: 1(continuar) ou 0(encerrar) ");
			continuar = input.nextInt();
		}
		
	}

}
