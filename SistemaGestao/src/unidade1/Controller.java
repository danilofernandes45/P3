package unidade1;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller 
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String funcao, nome, email, info; 
		int id = 0, escolha, continuar = 1, realizar, consulta;
		Recurso a = new Recurso(0, "aaaa");
		Atividade b = new Atividade(id, "ana", "aaa", "aaaa", "aaaaa", "aaaa", "aa");
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Adm> adms = new ArrayList<Adm>();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Pesquisador> pesquisadores   =  new ArrayList<Pesquisador>();
		ArrayList<Recurso> recursos = new ArrayList<Recurso>();
		ArrayList<Atividade> atividades = new ArrayList<Atividade>();
		
		id = 1;
		while(continuar == 1)
		{
			System.out.println("Digite 1[alocar] ou 2[consultar]:");
			realizar = input.nextInt();
			
			if(realizar == 1)
			{	
				boolean recurso;
				recurso =  false;
				System.out.println("Escolha uma das funcoes abaixo:");
				System.out.println("Digite : 1(Adm) 2(Professor) 3(Pesquisador)  4(Aluno)");
				escolha = input.nextInt();
				input.nextLine();
				System.out.println("Digite seu  nome: ");
				nome = input.nextLine();
				System.out.println("Digite seu email:");
				email = input.nextLine();
				
				
				if(escolha == 1)
				{
					int cpf;
					funcao = "adm";
					System.out.println("Digite  seu cpf:");
					cpf  = input.nextInt();
					input.nextLine();
					Adm adm1 = new Adm(nome, cpf, recurso, email);
					adms.add(adm1);
				}
				else if(escolha == 2)
				{
					funcao = "professor";
					String disciplina;
					System.out.println("Digite a disciplina  que o senhor(a) leciona:");
					disciplina = input.nextLine();
					Professor professor1 = new Professor(nome, disciplina, recurso,email);
					professores.add(professor1);
				}
				else if(escolha == 3)
				{
					funcao = "pesquisador";
					String areaPesquisa;
					System.out.println("Digite o ramo de pesquisa:");
					areaPesquisa = input.nextLine();
					Pesquisador pesquisador1  =  new Pesquisador(nome, areaPesquisa, recurso, email);
					pesquisadores.add(pesquisador1);
				}
				else if(escolha == 4)
				{
					funcao = "aluno";
					String matricula, curso;
					System.out.println("Digite seu curso:");
					curso = input.nextLine();
					System.out.println("Digite sua matricula");
					matricula =  input.nextLine();
					Aluno  aluno1 =  new Aluno(nome, matricula, curso, email);
					alunos.add(aluno1);
				}
				else
					funcao = "Null";

				
				int hora1, hora2, min1, min2, dia1, dia2, mes1, mes2, ano1, ano2, atividadeInt;
				String alocar, atividade, titulo, descricao, participantes, material;
				System.out.println("Escolha o recurso a ser alocado:");
				alocar = input.nextLine();
				if(alocar.equals("laboratorio") || alocar.equals("sala de aula") || alocar.equals("projetor") || alocar.equals("auditorio"))
				{
					System.out.println("Digite a hora de inicio no formato h min ");
					hora1 =input.nextInt();
					min1 = input.nextInt();
					System.out.println("Digite a data de inicio no formato dd mm yyyy");
					dia1 = input.nextInt();
					mes1 = input.nextInt();
					ano1 = input.nextInt();
					System.out.println("Digite a hora de termino no formato h min");
					hora2 = input.nextInt();
					min2 = input.nextInt();
					System.out.println("Digite a data de termino no formato dd mm yyyy");
					dia2 = input.nextInt();
					mes2 = input.nextInt();
					ano2 = input.nextInt();
				}
				else
				{
					System.out.println("Recurso inexistente");
					continue;
				}
		
				
				if(funcao.equals("Null"))
					continue;
				else
				{
					Recurso novoRecurso = new Recurso(id, alocar);
					novoRecurso.setEmProcessoDeAlocacao();
					novoRecurso.setData(dia1, mes1, ano1, dia2, mes2, ano2);
					novoRecurso.setHora(hora1, min1, hora2, min2);
					recurso = novoRecurso.setResponsavel(nome, funcao, recurso);
					novoRecurso.setAlocado();
					recursos.add(novoRecurso);
					
					boolean continua  = novoRecurso.InstanteEquivalente(dia1, mes1, ano1, hora1, min1);
					if(continua == false)
						continue;
					System.out.println("Escolha a atividade a ser realizada");
					System.out.println("Digite: 1(Aula Tradicional) 2(Apresentacao) 3(Laboratorio)");
					atividadeInt = input.nextInt();
					
					if(atividadeInt == 1)
						atividade = "aula tradicional";
					else if(atividadeInt == 2)
						atividade = "apresentacao";
					else if(atividadeInt == 3)
						atividade = "laboratorio";
					else
						atividade = "Null";
					
					System.out.println("Digite o titulo:");
					input.nextLine();
					titulo = input.nextLine();
					System.out.println("Descreva a atividade:");
					descricao = input.nextLine();
					System.out.println("Quem sao os participantes?");
					participantes = input.nextLine();
					System.out.println("Qual material de apoio? ");
					material = input.nextLine();
					
					Atividade  novaAlocacao;
					if((atividade.equals("aula tradicional") || atividade.equals("laboratorio")) && funcao.equals("professor"))
					{
						novaAlocacao  = new  Atividade(id,alocar, atividade, titulo, descricao, material, participantes);
						System.out.println(id);
						atividades.add(novaAlocacao);
					}
					else if(atividade != "aula tradicional" && atividade != "laboratorio")
					{
					    novaAlocacao  = new  Atividade(id, alocar, atividade, titulo, descricao,  material, participantes);
					    System.out.println(id);
					    atividades.add(novaAlocacao);
					}
					else
					{
						System.out.println("Error! Voce nao tem permissao para tal alocacao");
						continue;
					}
					System.out.println("Informacao adicional sobre a atividade: 1(sim) 2(nao)");
					escolha = input.nextInt();
					if(escolha == 1)
					{
						input.nextLine();
						info = input.nextLine();
						novaAlocacao.setInfo(info);
					}
					novoRecurso.setConcluido();
				}
				id+= 1;
			}
			else
			{
				System.out.println("Escolha o tipo de consulta:");
				System.out.println("Digite 1[usuario] ou 2[recurso]:");
				consulta = input.nextInt();
				
				int tam;
				String array;
				if(consulta == 1)
				{
					System.out.println("Digite : 1(Adm) 2(Professor) 3(Pesquisador) 4(Aluno)");
					escolha = input.nextInt();
					input.nextLine();
					System.out.println("Digite seu  nome: ");	
					nome = input.nextLine();
					
					if(escolha == 1)
					{
						tam = adms.size();
						array = "adm";
					}
					else if(escolha == 2)
					{
						tam = professores.size();
						array = "professor";
					}
					else if(escolha == 3)
					{
						tam = pesquisadores.size();
						array = "pesquisador";
					}
					else if(escolha == 4)
					{
						tam = alunos.size();
						array = "aluno";
					}
					else 
					{
						continue;
					}
					
					for(int i =  0; i < tam; i++)
					{
						System.out.println(array);
						if(array.equals("adm"))
						{
							if(adms.get(i).nome.equals(nome))
							{
								System.out.println("Nome:  "+ adms.get(i).nome);
								System.out.println("Email: "+ adms.get(i).email);
							}
							else
								System.out.println("Nome inexistente");
						}
						else if(array.equals("professor"))
						{
							if(professores.get(i).nome.equals(nome))
							{
								System.out.println("Nome:  "+ professores.get(i).nome);
								System.out.println("Email: "+ professores.get(i).email);
							}
							else
								System.out.println("Nome inexistente");
						}
						else if(array.equals("pesquisador"))
						{
							if(pesquisadores.get(i).nome.equals(nome))
							{
								System.out.println("Nome:  "+ pesquisadores.get(i).nome);
								System.out.println("Email: "+ pesquisadores.get(i).email);
							}
							else
								System.out.println("Nome inexistente");
						}
						else if(array.equals("aluno"))
						{
							if(alunos.get(i).nome.equals(nome))
							{
								System.out.println("Nome:  "+ alunos.get(i).nome);
								System.out.println("Email: "+ alunos.get(i).email);
							}
							else
								System.out.println("Nome inexistente");
						}
						else
							continue;
								
						System.out.println("Historico de recursos:");
						int temR = 0;
						if(recursos.size() == 0)
							continue;
						for(int j = 0; j < recursos.size(); j++)
						{
							if(recursos.get(j).responsavel.equals(nome))
							{
									System.out.println("Recurso: " +  atividades.get(j).tipo);
									System.out.println("Alocacao: "+ recursos.get(j).alocacao);
									System.out.println("Id: " + recursos.get(j).identificacao);
									System.out.println("Atividade:" + atividades.get(j).tipo);
									System.out.println(" ");
									temR = 1;
									break;
							}
						 }
						if(temR == 0)
								System.out.println("Sem historico");
					}
				}
				else
				{
					int ident;
					String tipo;
					boolean tem = false;
					
					System.out.println("Digite o recurso:");
					input.nextLine();
					tipo = input.nextLine();
					
					System.out.println("Digite a identificacao do recurso:");
					ident = input.nextInt();
					
					if(recursos.size() == 0)
						continue;
					for(int i = 0 ; i < recursos.size(); i+=1)
					{
						if(recursos.get(i).identificacao ==  ident)
						{
							a.procuraAdm(adms, recursos.get(i).responsavel); 
							a.procuraAluno(alunos, recursos.get(i).responsavel);
							a.procuraPesquisador(pesquisadores, recursos.get(i).responsavel);
							a.procuraProfessor(professores, recursos.get(i).responsavel);
							
							for(int j = 0; j < atividades.size(); j++)
							{
								if(atividades.get(j).identificacao == ident && atividades.get(j).tipo.equals(tipo))
								{
									tem = true;
									System.out.println("Recurso: " + atividades.get(j).tipo);
									System.out.println("Alocacao: "+ recursos.get(i).alocacao);
									System.out.println("Atividade: "+ atividades.get(j).tipo);
									System.out.println("Participantes: " + atividades.get(j).participantes);
								}
							}
						}
					}
					if(tem == false)
						System.out.println("Sem historico");
				}
			}
			
			System.out.println("Deseja 0[encerrar] ou 1[continuar] ?");
			continuar = input.nextInt();
			
			
		}
		System.out.println("Relatorio:");
		System.out.println("Quantidade de usuarios:" + (adms.size() + professores.size() + alunos.size() + pesquisadores.size()));
		a.contaAlocacao(recursos, "Em processo de alocacao");
		a.contaAlocacao(recursos, "Alocado");
		a.contaAlocacao(recursos, "Em andamento");
		a.contaAlocacao(recursos, "Concluido");
		a.totalAlocacao(recursos);
		b.contaTipo(atividades, "laboratorio");
		b.contaTipo(atividades, "sala de aula");
		b.contaTipo(atividades, "projetor");
		b.contaTipo(atividades, "auditorio");
		
		
	}

}