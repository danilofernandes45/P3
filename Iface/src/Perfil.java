import java.util.ArrayList;
import java.util.Scanner;


public class Perfil 
{
	private String data_nascimento;
	private String apelido;
	private String sobre; 
	private Amigo amigo;
	
	//implementar set data
	public void setData()
	{
		System.out.println();
	}
	
	public void setApelido()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o apelido: ");
		this.apelido = input.nextLine();
	}
	
	public void setSobre()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Deseja escrever algo sobre voce? 1[sim] 0[nao]");
		int escolha = input.nextInt();
		
		if(escolha == 1)
			this.sobre = input.nextLine();
		else
			this.sobre = "nada a declarar";
	}
	
	public void editar()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Deseja editar: ");
		System.out.println("Digite 1[Data de nascimento]:");
		System.out.println("Digite 2[Apelido]: ");
		System.out.println("Digite 3[Sobre]");
		System.out.println("Digite 4[Nome] ");
		System.out.println("Digite 5[Login] ");
		System.out.println("Digite 6[Senha] ");
		int edite = input.nextInt();
		
		
		Conta novo = new Conta();
		switch(edite)
		{
			case 1:
				setData();
				break;
			case 2:
				setApelido();
				break;
			case 3:
				setSobre();
				break;
			case 4:
				novo.setNome();
				break;
			case 5:
				novo.setLogin();
				break;
			case 6:
				novo.setSenha();
				break;
			default:
				System.out.println("Opcao invalida.");
			
		}
	}
	
	public void setAmigos(ArrayList<Conta> contas, ArrayList<String> amigos)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome = input.nextLine();
		
		boolean resposta = false;
		for(Conta i: contas)
		{
			if(i.getNome().equals(nome))
			{
				this.amigo.enviarConvite();
				resposta = this.amigo.getConvite();
				if(resposta == true)
				{
					amigos.add(i.getNome());
				}
			}
		}
		
	}
	public Amigo getAmigo()
	{
		return this.amigo;
	}
	
	public void printPerfil()
	{
		System.out.println("Apelido: " + this.apelido);
		System.out.println("Data de nascimento: " + this.data_nascimento);
		System.out.println("Sobre: " + this.sobre);
	}

}


// criar e editar perfil