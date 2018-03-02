import java.util.ArrayList;


public class Amigo 
{
	private Conta amigo;
	private boolean conviteAceito;

	
	public void enviarConvite()
	{
		this.conviteAceito = false; 
	}
	public boolean getConvite()
	{
		return this.conviteAceito;
	}
	public String getNome()
	{
		return amigo.getNome();
	}
	public void printAmigos(ArrayList<String> amigos)
	{
		System.out.println("  Amigos");
		for(Amigo i: amigos)
		{
			System.out.println(i.getNome());
		}
	}
	
}
