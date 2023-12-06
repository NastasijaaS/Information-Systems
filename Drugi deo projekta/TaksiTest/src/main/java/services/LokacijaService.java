package services;

import java.util.List;
import entities.Lokacija;

public interface LokacijaService 
{

	 public void addLokacija(int alokacijaid,String anaziv_lokacije, String aadresa);
     public void deleteLokacija(int dlokacijaid);
     public void updateLokacija(String ulokacijaid, String unaziv_lokacije, String uadresa);
     public List<Lokacija> spisakLokacija();
     public Lokacija vratiLokaciju(int id);
     public void dodajLokaciju(Lokacija p);


	//public void sendGET(String ckid) throws IOException;   
	
}
