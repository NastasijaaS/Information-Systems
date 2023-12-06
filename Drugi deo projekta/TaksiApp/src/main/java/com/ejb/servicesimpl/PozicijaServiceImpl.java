package com.ejb.servicesimpl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.ejb.services.PozicijaService;
import com.jpa.entities.Pozicija;


@Stateless
public class PozicijaServiceImpl implements PozicijaService {
	@PersistenceContext(name = "TaksiApp")
	private EntityManager em;
		
	@Override
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
	
	
	@Override
	public List<Pozicija> spisakPozicija() {

		List<Pozicija> svePozicije = em.createQuery("SELECT p FROM Pozicija p", Pozicija.class).getResultList();
		return svePozicije;
	}
	


	
	@Override
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