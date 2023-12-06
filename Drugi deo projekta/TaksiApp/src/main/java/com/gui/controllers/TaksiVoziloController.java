package com.gui.controllers;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import com.jpa.entities.TaksiVozilo;
import com.ejb.services.TaksiVoziloService;



@ManagedBean(name="taksiController")
public class TaksiVoziloController  {
    
	  private String id="";
	  private String aregistracija="";
	  private String aime_vlasnika="";
	  private String aadresaVlasnika="";
      private String astatus="";
      private String dregistracija="";
      private String ckstatus="";
      private String statusT="";
     
      
	@EJB
	private TaksiVoziloService service;
	
	
   public  String getAregistracija()
   {
			return aregistracija;
   }
   
   public void setAregistracija(String aregistracija) 
   {
      this.aregistracija=aregistracija;
   }
   
   public  String getAImeVlasnika() 
   {
	   return aime_vlasnika;
   }	
   
   public void setAImeVlasnika(String aime_vlasnika)
   {
	   this.aime_vlasnika=aime_vlasnika;
   }
   
   public  String getAadresaVlasnika() 
   {
	   return aadresaVlasnika;
   }	
   
   public void setAadresaVlasnika(String aadresaVlasnika)
   {
	   this.aadresaVlasnika=aadresaVlasnika;
   }
   
   public  String getAstatus()
   {
  		return astatus;
   }
   
   public void setAstatus(String astatus)
   {
  		this.astatus=astatus;
   }
    
   public  String getDregistracija()
   {
			return dregistracija;
   }
   
   public void setDregistracija(String dregistracija) 
   {
      this.dregistracija=dregistracija;
   }
   
   public  String getCkstatus()
   {
  		return ckstatus;
   }
   
   public void setCkstatus(String ckstatus)
   {
  		this.ckstatus=ckstatus;
   }
   
   public String getId() 
   {
	   return id;
   }
     
   public void setId(String id)
   {
	   this.id=id;
   }
  
   public String getS()
   {
	   return statusT;
   }
        
   public void setS(String status)
   {
	   this.statusT=status;
   } 
     
    public void deleteTaksi(String dregistracija)
    {
      service.deleteTaksi(dregistracija);
	}
    

	
	public void addTaksi(String aregistracija, String aime_vlasnika, String aadresaVlasnika) 
	{		
		service.addTaksi(aregistracija, aime_vlasnika, aadresaVlasnika);
	}
	
	
	  public List<TaksiVozilo> sviTaksiji()
	      {
    		List<TaksiVozilo> taksiji=service.spisakTaksija();
    		return taksiji;
     }
     
     public String checkStatus(String ckstatus)
     {
     	String res="";
     	res= service.checkStatus(ckstatus);
		return res;
     }
 }