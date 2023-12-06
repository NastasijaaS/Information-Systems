package com.ejb.servicesimpl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.ejb.services.LokacijaService;
import com.jpa.entities.Lokacija;


@Stateless
public class LokacijaServiceImpl implements LokacijaService {
	@PersistenceContext(name = "TaksiApp")
	private EntityManager em;

		

	@Override
	public void deleteLokacija(String dlokacijaid)
	{  
		try{
			 
		    int lid =Integer.parseInt(dlokacijaid);
		    Lokacija l1 =em.find(Lokacija.class, lid);
		    em.remove(l1);
		        } catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		   
		  }
	
	
	@Override
	public List<Lokacija> spisakLokacija() {

		List<Lokacija> sveLokacije = em.createQuery("SELECT l FROM Lokacija l", Lokacija.class).getResultList();
		return sveLokacije;
	}
	

	@Override
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


	
	@Override
	public void addLokacija(String alokacijaid,String anaziv_lokacije, String aadresa)
	{
		
		try
		{
		    int lokid = Integer.parseInt(alokacijaid);
		    Lokacija l1 = new Lokacija(lokid,anaziv_lokacije,aadresa);
		    em.persist(l1);
		 
		        } 
		catch(Exception ex)
		   {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		    
		  }
	
	}
	