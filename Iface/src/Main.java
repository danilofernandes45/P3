import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		realizarLogin();
	}

	private static void realizarLogin() 
	{
		Scanner input = new Scanner(System.in);
		
		Conta novoUsuario = new Conta();
		novoUsuario.abrirConta();
		
		ArrayList<String> amigos = new ArrayList<String>();
		ArrayList<Conta> contas = new ArrayList<Conta>();
		ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
		contas.add(novoUsuario);
		cadastrado(contas);
		
		
		System.out.println("Digite 1 para editar atributos ");
		System.out.println("Digite 2 para adicionar amigos ");
		System.out.println("Digite 3 para enviar mensagem ");
		System.out.println("Digite 4 para criar comunidade ");
		System.out.println("Digite 5 para se tornar membro ");
		System.out.println("Digite 6 para recuperar informações ");
		System.out.println("Digite 7 para desativar a conta ");
		int escolha = input.nextInt();
		
		switch(escolha)
		{
			case 1:
				novoUsuario.getPerfil().editar();
				break;
			case 2:
				novoUsuario.getPerfil().setAmigos(contas, amigos);
				break;
			case 3:
				novoUsuario.getMensagem(amigos);
				//mensagens.add(novoUsuario.getMensagem());
				break;
			case 4:
				novoUsuario.getComunidade().criarComunidade(novoUsuario.getNome());
				break;
			case 5:
				novoUsuario.getComunidade().addMembros(novoUsuario);
				break;
			case 6:
				novoUsuario.backup(amigos , contas);
			default:
				System.out.println("Opcao invalida");
		}
	}

	private static void cadastrado(ArrayList<Conta> contas) 
	{
		Conta novo = new Conta();
		novo.setInfo("chuck" , "norrys", "1234");
		contas.add(novo);
		
		Conta novo2 = new Conta();
		novo.setInfo("alorromora", "Rony", "934");
		contas.add(novo2);
	}
	
	

}
