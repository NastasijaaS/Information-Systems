package com.gui.controllers;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import com.jpa.entities.Zahtev;
import com.ejb.services.ZahtevService;


@ManagedBean
public class ZahtevController  {
    
	 private String aid="";
	 private String alokacijaid="";
     private String aregistracija="";
     private String astatus="";   
     private String did="";
     private String uid="";
     private String ulokacijaid="";
     private String uregistracija="";
     private String ustatus="";
     
           
	@EJB
	private ZahtevService service;
	
		public  String getAid() 
		{
			return aid;
		}
		
        public void setAid(String aid)
        {	
        	this.aid=aid;
        }
        
        public  String getAlokacijaid() 
		{
			return alokacijaid;
		}
		
        public void setAlokacijaid(String alokacijaid)
        {	
        	this.alokacijaid=alokacijaid;
        }
        
       public  String getAregistracija()
       {
   			return aregistracija;
       }
       
       public void setAregistracija(String aregistracija) 
       {
          this.aregistracija=aregistracija;
       }
   	   
       public  String getAstatus()
       {
      		return astatus;
       }
       
       public void setAstatus(String astatus)
       {
      		this.astatus=astatus;
       }
       
       public  String getDid() 
       {
    	   return did;
       }	
       
       public void setDid(String did)
       {
    	   this.did=did;
       }
       
       public  String getUid() 
       {
    	   return uid;
       }	
       
       public void setUid(String uid)
       {
    	   this.uid=uid;
       }
        
       public  String getULokacijaId() 
       {
    	   return ulokacijaid;
	   }
       
       
       public void setULokacijaId(String ulokacijaid) 
       {
    	   this.ulokacijaid=ulokacijaid;
	   }
        
       public  String getUregistracija() 
       {
    	   return uregistracija;
       }	
       
       public void setUregistracija(String uregistracija)
       {
    	   this.uregistracija=uregistracija;
       }
       
        
        public  String getUStatus()
        {
    			return ustatus;
        }
        
        public void setUStatus(String ustatus) 
        {
           this.ustatus=ustatus;
        }
        
             
        public void deleteZahtev(String did)
       {
    	   service.deleteZahtev(did);
	   }
    
       public void addZahtev(String aid, String alokacijaid)
       {	
    	   service.addZahtev(aid, alokacijaid);
       }
	
       public void updateZahtev(String uid, String ulokacijaid, String uregistracija, String ustatus)
       {
    	   service.updateZahtev(uid, ulokacijaid, uregistracija, ustatus);
       }
        

        public List<Zahtev> sviZahtevi()
        {
    		List<Zahtev> zahtevi=service.spisakZahteva();
    		return zahtevi;
    	}

}
