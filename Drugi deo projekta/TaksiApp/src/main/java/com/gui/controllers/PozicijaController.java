package com.gui.controllers;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import com.jpa.entities.Pozicija;
import com.ejb.services.PozicijaService;


@ManagedBean
public class PozicijaController  {
    
	 private String ataksiid="";
	 private String alokacijaid="";   
     private String did=""; 
     
   
     
	@EJB
	private PozicijaService service;
	
		public  String getATaksiid() 
		{
			return ataksiid;
		}
		
        public void setATaksiid(String ataksiid)
        {	
        	this.ataksiid=ataksiid;
        }
   	   
       public  String getALokacijaId()
       {
      		return alokacijaid;
       }
       
       public void setALokacijaId(String alokacijaid)
       {
      		this.alokacijaid=alokacijaid;
       }
        
       public  String getDid() 
       {
    	   return did;
	   }
       
       public void setDid(String did) 
       {
    	   this.did=did;
	   }
        
       public void deletePozicija(String did)
       {
    	   service.deletePozicija(did);
	   }
    
       public void addPozicija(String ataksiid,String alokacijaid) 
       {	
    	   service.addPozicija(ataksiid, alokacijaid);
       }
       
        public List<Pozicija> svePozicije()
        {
    		List<Pozicija> pozicije=service.spisakPozicija();
    		return pozicije;
    	}
        
        
}

