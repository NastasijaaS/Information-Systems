package serviceimpl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import services.LokacijaService;
import entities.Lokacija;



@Stateless
public class LokacijaServiceImpl implements LokacijaService {
	@PersistenceContext(name = "TaksiApp")
	private EntityManager em;

		
	public LokacijaServiceImpl()
	{
		   EntityManagerFactory emf = Persistence
	               .createEntityManagerFactory("TaksiTest");
	       em = emf.createEntityManager();
	}
	
	public void deleteLokacija(int dlokacijaid)
	{  
		try{
			 
		
		    Lokacija l1 =em.find(Lokacija.class, dlokacijaid);
		    em.remove(l1);
		        } catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		   
		  }
	
	
	
	public List<Lokacija> spisakLokacija() {

		List<Lokacija> sveLokacije = em.createQuery("SELECT l FROM Lokacija l", Lokacija.class).getResultList();
		return sveLokacije;
	}
	

	//private static final String USER_AGENT = "Mozilla/5.0";
	

	
	public void updateLokacija(String ulokacijaid, String unaziv_lokacije, String uadresa)
	{
		try
		{

		    int idlokacija=Integer.parseInt(ulokacijaid);
		    Lokacija l1 =em.find(Lokacija.class, idlokacija);
		    System.out.println(unaziv_lokacije);
		    l1.setNaziv(unaziv_lokacije);
		    System.out.println(uadresa);
		    l1.setAdresa(uadresa);
		    
		 } 
		
		catch(Exception ex)
		{
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
	    }  
    }


	
	
	public void addLokacija(int alokacijaid,String anaziv_lokacije, String aadresa)
	{
		
		try
		{
		    
		    Lokacija l1 = new Lokacija(alokacijaid,anaziv_lokacije,aadresa);
		    em.persist(l1);
		 
		        } 
		catch(Exception ex)
		   {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		    
		  }
	
	public Lokacija vratiLokaciju(int id) {
		Lokacija p = em.find(Lokacija.class, id);
		return p;
	}
	
	public void dodajLokaciju(Lokacija p) {
	
		em.persist(p);
	

		// TODO Auto-generated method stub
		
	}
	
	
	}
	

	