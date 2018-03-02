import java.util.ArrayList;
import java.util.Scanner;


public class Comunidade 
{
	private String nome;
	private String descrição;
	private String adm;
	private ArrayList<Conta> membros;
	
	
	public void criarComunidade(String nome)
	{
		this.adm = nome;
		this.membros = new ArrayList<Conta>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome da comunidade:");
		this.nome = input.nextLine();
		System.out.println("Descreva a comunidade: ");
		this.descrição = input.nextLine();
	}
	
	public void addMembros(Conta usuario)
	{
		this.membros.add(usuario);
	}
	public void printComunidade()
	{
		System.out.println("  Comunidade ");
		System.out.println("Nome:" + this.nome);
		System.out.println("Adm: " + this.adm);
		System.out.println("Descricao: " + this.descrição);
		System.out.println("   Membros");
		for(Conta i: membros)
		{
			System.out.println("Nome: " + i.getNome());
		}
	}
	
}
