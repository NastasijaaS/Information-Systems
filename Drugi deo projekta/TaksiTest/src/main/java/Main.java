import serviceimpl.LokacijaServiceImpl;
import entities.Lokacija;

public class Main {
	
	
	public static void  main(String []args)
	{
		LokacijaServiceImpl m=new LokacijaServiceImpl();
		Lokacija l=m.vratiLokaciju(1);
		System.out.println(l.getNaziv());
	
	}

}
