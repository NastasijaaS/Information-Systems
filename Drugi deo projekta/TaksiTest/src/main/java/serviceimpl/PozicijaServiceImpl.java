package serviceimpl;
import entities.Pozicija;
import services.PozicijaService;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class PozicijaServiceImpl implements PozicijaService {
	@PersistenceContext(name = "TaksiApp")
	private EntityManager em;
		
	
	public void deletePozicija(String did)
	{  
		
		try{
			 
		 int pid =Integer.parseInt(did);
		    Pozicija p1 =em.find(Pozicija.class, pid);
		    em.remove(p1);
		        } catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		   
		  }
	
	
	
	public List<Pozicija> spisakPozicija() {

		List<Pozicija> svePozicije = em.createQuery("SELECT p FROM Pozicija p", Pozicija.class).getResultList();
		return svePozicije;
	}
	

	//private static final String USER_AGENT = "Mozilla/5.0";
	

	
	
	public void addPozicija(String ataksiid,String alokacijaid)
	{
		
		try
		{
			int pozid = Integer.parseInt(alokacijaid);
		    Pozicija p1 = new Pozicija(ataksiid,pozid);
		    em.persist(p1);
		 
		        } 
		catch(Exception ex)
		   {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		    
		  }
	
	}