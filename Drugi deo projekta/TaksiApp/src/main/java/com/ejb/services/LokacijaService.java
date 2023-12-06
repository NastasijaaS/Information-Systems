package com.ejb.services;
import java.util.List;
import com.jpa.entities.Lokacija;

public interface LokacijaService 
{

	 public void addLokacija(String alokacijaid,String anaziv_lokacije, String aadresa);
     public void deleteLokacija(String dlokacijaid);
     public void updateLokacija(String ulokacijaid, String unaziv_lokacije, String uadresa);
     public List<Lokacija> spisakLokacija();
  
	
}