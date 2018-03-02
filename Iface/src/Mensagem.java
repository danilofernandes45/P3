import java.util.ArrayList;
import java.util.Scanner;


public class Mensagem
{
	private String mensagem;
	private String remetente;
	private Conta destinatario;
	
	public void setRemetente(String nome)
	{
		this.remetente = nome;
	}
	public void setMensagem(ArrayList<String> amigos)
	{
	   System.out.println("Destinatario: ");
	   this.destinatario.setNome();
	   
	   Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a mensagem :");
		this.mensagem = input.nextLine();
	}
	
	public String getMensagem()
	{
		return this.mensagem;
	}
	public String getRemetente()
	{
		return this.remetente;
	}
	public Conta getDestinatario()
	{
		return this.destinatario;
	}
	
	public void printMensagem(ArrayList<Mensagem> mensagens)
	{
		for(Mensagem i: mensagens)
		{
			System.out.println(" ");
			System.out.println("Mensagem: " +i.getMensagem());
			System.out.println("Remetente: " + i.getRemetente());
			System.out.println("Destinatario: " + i.getDestinatario().getNome());
		}
	}
}
