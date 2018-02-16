import java.util.Calendar;
import java.util.Date;


public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar atual = Calendar.getInstance();
		Date a1 = new Date();
		Date a2 = new Date();
		
		 a1.setDate(16);
		 a1.setMonth(2);
		a1.setYear(2018);
		 
		a2.setDate(17);
		a2.setMonth(2);
		a2.setYear(2018);
		long t = a2.getTime() - a1.getTime();
		
		System.out.println(t);
		
		System.out.println(atual.DAY_OF_WEEK);
	}

}
