import java.util.ArrayList;
import java.util.Scanner;


public class Conta 
{
	private String login;
	private String senha;
	private String nome;
	private Perfil perfil;
	private Mensagem mensagem;
	private Comunidade comunidade;
	
	public void abrirConta() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o login: ");
		this.login = input.nextLine();
		System.out.println("Digite a senha: ");
		this.senha = input.nextLine();
		System.out.println("Digite o nome: ");
		this.nome = input.nextLine();
		
		this.perfil = new Perfil();
	}
	
	public void setInfo(String login, String nome, String senha)
	{
		this.login = login;
		this.nome = nome;
		this.senha = senha;
	}
	public Perfil getPerfil()
	{
		return this.perfil;
	}
	
	public void setNome()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		this.nome = input.nextLine();
	}
	public String getNome()
	{
		return this.nome;
	}
	
	public void setSenha()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		this.senha = input.nextLine();
	}
	public String getSenha()
	{
		return this.senha;
	}
	
	public void setLogin()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o login: ");
		this.login = input.nextLine();
	}

	public Mensagem getMensagem(ArrayList<String> amigos)
	{
		this.mensagem.setRemetente(this.nome);
		this.mensagem.setMensagem(amigos);
		return this.mensagem;
	}

	public String getLogin()
	{
		return this.login;
	}
	public Comunidade getComunidade()
	{
		return this.comunidade;
	}
	public void backup(ArrayList<String> amigos, ArrayList<Conta> contas)
	{
		System.out.println("Nome: " + this.nome);
		this.perfil.printPerfil();
		this.comunidade.printComunidade();
		this.perfil.getAmigo().printAmigos(amigos);
		//this.mensagem.printMensagem(mensagens);
	}
}
