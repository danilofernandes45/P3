package unidade1;

public class AdmTest 
{
	public static void main(String[] args)
	{
		Adm adm1 = new Adm("Larissa", 12345, true, "lss@gmail.com");
		System.out.printf("Nome %s CPF: %d%nEmail %s", adm1.nome, adm1.cpf, adm1.email);
	}
	
	
}
