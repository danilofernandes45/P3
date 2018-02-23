package unidade1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Recurso
{
	int identificacao;

	int diaInicio;
	int diaTermino;
	
	int mesInicio;
	int mesTermino;
	int anoInicio;
	int anoTermino;

	int horaInicio;
	int horaTermino;
	int minutoInicio;
	int minutoTermino;

	String responsavel;
	String alocacao;


	public Recurso(int identificacao,  String alocacao)
	{
		this.identificacao = identificacao;
		this.alocacao = alocacao;
	}

	public int confirme()
	{
		int resposta;
		Scanner input = new Scanner(System.in);

		System.out.println("Deseja confirmar o proccesso?");
		System.out.println("Digite 1(Sim) ou 0(Nao)");
		resposta = input.nextInt();
		
		return resposta;
	}

	public void setData(int diaI,int mesI,int anoI, int diaT, int mesT, int anoT)
	{
		if((diaI > 0 && diaI <= 31) && (diaT > 0 && diaT <= 31))
		{
			this.diaInicio = diaI;
			this.diaTermino = diaT;
		}
		else
			System.out.println("Dia invalida");

		if(mesI == 0)
			mesI = 12;
		if(mesT == 0)
			mesT = 12;

		if((mesI > 0  && mesI <= 12) && mesT > 0 && mesT <= 12)
		{
			this.mesInicio = mesI;
			this.mesTermino = mesT;
		}
		else
			System.out.println("Mes invalido");

		if(anoI >= 0 && anoT >= 0)
		{
			this.anoInicio = anoI;
			this.anoTermino = anoT;
		}
		else
			System.out.println("Ano invalido");


	}	
	public int getDiaInicio()
	{
		return this.diaInicio;
	}
	public int getDiaTermino()
	{
		return this.diaTermino; 
	}
	public int getMesiniccio()
	{
		return this.mesInicio;
	}
	public int getMesTerminno()
	{
		return this.mesTermino;
	}
	public int getAnoInicio()
	{
		return this.anoInicio;
	}
	public int getAnoTermino()
	{
		return this.anoTermino;
	}

	public void setHora(int horaI, int minutoI, int horaT, int minutoT)
	{
		if((horaI > 0 && horaI <= 24) && (horaT > 0 && horaT <= 24))
		{
			this.horaInicio = horaI;
			this.horaTermino = horaT;
		}
		else
			System.out.println("Hora invalida");

		if((minutoI >= 0 && minutoI < 60) && (minutoT >= 0 && minutoT < 60))
		{
			this.minutoInicio = minutoI;
			this.minutoTermino = minutoT;
		}
		else
			System.out.println("Minutos invalidos");
	}
	public int getHoraInicio()
	{
		return this.horaInicio;
	}
	public int getHoraTermmino()
	{
		return this.horaTermino;
	}
	public int getMinutoInicio()
	{
		return this.minutoInicio;
	}
	public int getMinutoTermino()
	{
		return this.minutoTermino;
	}
	
	public boolean setResponsavel(String responsavel, String funcao, boolean recurso)
	{
		if(this.alocacao == "Em processo de alocacao" &&
				((funcao == "professor" && recurso == false) || (funcao == "pesquisador" && recurso == false) || (funcao == "adm" && recurso == false)))
		{
			this.responsavel = responsavel;
			recurso = true;
		}
		this.alocacao = funcao;
		return recurso;
	}
	public String getResponsavel()
	{
		return this.responsavel;
	}
	
	public void setIdentificacao(int identificacao)
	{
		this.identificacao = identificacao;
	}
	public int getIdentificacao()
	{
		return this.identificacao;
	}
	
	public void status()
	{
		System.out.println("Identificacao: " + this.identificacao);
		System.out.println("Responsavel: " + this.responsavel);
		System.out.printf("Hora de Inicio: %d:%d Data de inicio: %d/%d/%d%n", this.horaInicio, this.minutoInicio, this.diaInicio, this.mesInicio, this.anoInicio);
		System.out.printf("Hora de Termino: %d:%d Data de Termino: %d/%d/%d%n", this.horaTermino, this.minutoTermino, this.diaTermino, this.mesTermino, this.anoTermino);
		System.out.println("Estado: " + this.alocacao);
	}

	public void setEmProcessoDeAlocacao()
	{
		this.alocacao = "Em processo de alocacao";
	}
	public void setEmAndamentoAlocacao()
	{
		this.alocacao = "Em andamento";
	}
	public void setAlocado()
	{
		this.alocacao =  "Alocado";
	}
	public void setConcluido( )
	{
		int adm = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Adm? ");
		System.out.println("Digite 1(sim) ou 0(nao)");
		adm = input.nextInt();
		
		if(adm == 1)
		{
			this.alocacao  = "Concluido";
			System.out.println("Concluido");
		}
		else
			System.out.println("Acesso invalido!! Nao tem permissao concluir.");
	}
	public String getAlocacao()
	{
		return this.alocacao;
	}


	public boolean InstanteEquivalente(int dia, int mes, int ano, int hora, int minuto)
	{
		Date d = new Date();  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(d);
        
        int horaAtual, minutoAtual, diaAtual, mesAtual, anoAtual;
        anoAtual = cal.get(Calendar.YEAR); 
        mesAtual = cal.get(Calendar.MONTH);
        diaAtual = cal.get(Calendar.DAY_OF_MONTH);
        horaAtual = cal.get(Calendar.HOUR);
        minutoAtual = cal.get(Calendar.MINUTE);
        
        boolean continuar = true;
        if((ano <= anoAtual && mes <= mesAtual && dia <= diaAtual) && (hora <= horaAtual && minuto <= minutoAtual))
        {
        	if(confirme() == 1)
        		this.alocacao = "Em andamento";
        	else
        	{
        		this.alocacao = "Em processo de aloca��o";
        		System.out.println("Processo encerrado pelo usuario");
        		continuar = false;
        	}
        }
        return continuar;
	}
	
	public void procuraAdm(ArrayList<Adm> adms , String nome)
	{
		for(int i = 0; i < adms.size(); i+=1)
		{
			if(adms.get(i).nome.equals(nome))
			{
				System.out.println("Nome:" + adms.get(i).nome);
				System.out.println("CPF:"+ adms.get(i).cpf);
				System.out.println("Email:"+ adms.get(i).email);
			}
		}		
	}
	
	public void procuraProfessor(ArrayList<Professor> professores, String nome)
	{
		for(int i = 0; i < professores.size(); i+=1)
		{
			if(professores.get(i).nome.equals(nome))
			{
				System.out.println("Nome: " + professores.get(i).nome);
				System.out.println("Disciplina: "+ professores.get(i).disciplina);
				System.out.println("Email: "+ professores.get(i).email);
			}
		}
	}
	
	public void procuraPesquisador(ArrayList<Pesquisador> pesquisadores, String nome)
	{
		for(int i = 0; i < pesquisadores.size(); i+=1)
		{
			if(pesquisadores.get(i).nome.equals(nome))
			{
				System.out.println("Nome: "+ pesquisadores.get(i).nome);
				System.out.println("Area de Pesquisa: "+ pesquisadores.get(i).areaPesquisa);
				System.out.println("Email: "+ pesquisadores.get(i).email);
			}
		}
	}
	
	public void procuraAluno(ArrayList<Aluno> alunos, String nome)
	{
		for(int i =0; i < alunos.size(); i+=1)
		{
			if(alunos.get(i).nome.equals(nome))
			{
				System.out.println("Nome: " + alunos.get(i).nome);
				System.out.println("Matricula: " + alunos.get(i).matricula);
				System.out.println("Curso: " + alunos.get(i).curso);
				System.out.println("Email: " + alunos.get(i).email);

			}
		}		
	}
	
	public void contaAlocacao(ArrayList<Recurso> recursos, String estado)
	{
		int cont = 0;
		for(int i = 0; i < recursos.size(); i+=1)
		{
			if(recursos.get(i).alocacao.equals(estado))
				cont+=1;
		}
		System.out.printf("%s: %d\n" ,estado, cont);
	}
	
	public void totalAlocacao(ArrayList<Recurso> recursos)
	{
		int cont = 0;
		for(int i = 0; i < recursos.size(); i+=1)
			cont+=1;
		System.out.println("Total de alocacoes: "+ cont);
	}
}
