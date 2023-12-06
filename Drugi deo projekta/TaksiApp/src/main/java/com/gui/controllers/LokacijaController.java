package com.gui.controllers;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import com.jpa.entities.Lokacija;
import com.ejb.services.LokacijaService;


@ManagedBean
public class LokacijaController  {
    
	 private String alokacijaid="";//
     private String anaziv_lokacije="";
     private String aadresa=""; //  
     private String dlokacijaid="";  //
     private String ulokacijaid="";
     private String unaziv_lokacije="";
     private String uadresa="";
     
          
	@EJB
	private LokacijaService service;
	
		public  String getAAdresa() 
		{
			return aadresa;
		}
		
        public void setAAdresa(String aadresa)
        {	
        	this.aadresa=aadresa;
        }
        
       public  String getANazivLokacije()
       {
   			return anaziv_lokacije;
       }
       
       public void setANazivLokacije(String anaziv_lokacije) 
       {
          this.anaziv_lokacije=anaziv_lokacije;
       }
   	   
       public  String getALokacijaId()
       {
      		return alokacijaid;
       }
       
       public void setALokacijaId(String alokacijaid)
       {
      		this.alokacijaid=alokacijaid;
       }
        
       public  String getDLokacijaId() 
       {
    	   return dlokacijaid;
       }	
       
       public void setDLokacijaId(String dlokacijaid)
       {
    	   this.dlokacijaid=dlokacijaid;
       }
        
       public  String getUadresa() 
       {
    	   return uadresa;
       }	
       
       public void setUadresa(String uadresa)
       {
    	   this.uadresa=uadresa;
       }
       
        public  String getULokacijaId()
        {
    		return ulokacijaid;
    	}
        
        public void setULokacijaId(String ulokacijaid)
        {
    		this.ulokacijaid=ulokacijaid;
    	}
        
        public  String getUNazivLokacije()
        {
    			return unaziv_lokacije;
        }
        
        public void setUNazivLokacije(String unaziv_lokacije) 
        {
           this.unaziv_lokacije=unaziv_lokacije;
        }
        
             
       public void deleteLokacija(String dlokacijaid)
       {
    	   service.deleteLokacija(dlokacijaid);
	   }
    
       public void addLokacija(String alokacijaid,String anaziv_lokacije, String aadresa) 
       {	
    	   service.addLokacija(alokacijaid, anaziv_lokacije, aadresa);
       }
	
       public void updateLokacija(String ulokacijaid, String unaziv_lokacije, String uadresa)
       {
    	   service.updateLokacija(ulokacijaid, unaziv_lokacije, uadresa);
       }
        

        public List<Lokacija> sveLokacije()
        {
    		List<Lokacija> lokacije=service.spisakLokacija();
    		return lokacije;
    	}
        
    	


}