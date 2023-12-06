package com.ejb.servicesimpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.ZahtevService;
import com.jpa.entities.Zahtev;
import com.jpa.entities.TaksiVozilo;
import com.jpa.entities.*;


@Stateless
public class ZahtevServiceImpl implements ZahtevService
{
	@PersistenceContext(name = "TaksiApp")
	private EntityManager em;
	
	String s0="ceka";
	String s1="prihvacen";
	String s2="odbijen";
	

	@Override
	public void addZahtev(String aid, String alokacijaid)
	{
		

		int pid = Integer.parseInt(alokacijaid);
		
		Pozicija pozicijaL = new Pozicija();
        pozicijaL= em.find(Pozicija.class, pid);
        
        String reg=pozicijaL.getTaksiId();
        TaksiVozilo taxi=em.find(TaksiVozilo.class, reg);
        String statusTaxi= taxi.getStatus();
        String regTaxi=taxi.getRegistracija();
        
        		
     
        int zid = Integer.parseInt(aid);
		int lokid=Integer.parseInt(alokacijaid);

		
	
        if(statusTaxi.equals("slobodan")) 
       {
       	try
		{
            System.out.println(s1);
	
		    Zahtev z1 = new Zahtev(zid,lokid,regTaxi,s1);
		     em.persist(z1);
		 
		        } 
		catch(Exception ex)
		   {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		    
       }
        else 
        {
        	try
    		{
                System.out.println(s2);
    		    Zahtev z1 = new Zahtev(zid,lokid,regTaxi,s2);
    		    System.out.println(z1);
    		    em.persist(z1);
    		 
    		        } 
    		catch(Exception ex)
    		   {
    			
    			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
    			
    			} 
        	}
        	
        
        }






	public void updateZahtev(String uid, String ulokacijaid, String uregistracija, String ustatus) 
	{
		
		
	
		try
		{

		   int upid=Integer.parseInt(uid);
		   int lokacija=Integer.parseInt(ulokacijaid);
		Zahtev z1=em.find(Zahtev.class, upid);
		z1.setLokacija(lokacija);
		    
		 } 
		
		catch(Exception ex)
		{
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
	    }  
    
	}
	
	
	private static final String USER_AGENT = "Mozilla/5.0";
	
 
		public String sendGET(String ckid) throws IOException {
			String res="";
			URL obj = new URL("http://192.168.99.101/?ckid="+ckid);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);
			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					 response.append(inputLine);
				}
				in.close();

				
				// print result
				System.out.println(response.toString());
				return response.toString();
			} else {
				System.out.println("GET request not worked");
				return res;
			}

		}
		

		@Override
		public void deleteZahtev(String did)
		{				
			try{
				 
			    int zid =Integer.parseInt(did);
			    Zahtev z1 =em.find(Zahtev.class, zid);
			    em.remove(z1);
			        } catch(Exception ex) {
				
				System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
				
				}  
			   
			  }
		
		
		@Override
		public List<Zahtev> spisakZahteva() {

			List<Zahtev> sviZahtevi = em.createQuery("SELECT z FROM Zahtev z", Zahtev.class).getResultList();
			return sviZahtevi;
		}


}

