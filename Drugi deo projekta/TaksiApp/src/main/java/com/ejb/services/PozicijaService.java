package com.ejb.services;
import java.util.List;
import com.jpa.entities.Pozicija;


public interface PozicijaService {

	public void addPozicija(String ataksiid,String alokacijaid);
    public void deletePozicija(String did);
    public List<Pozicija> spisakPozicija();
       
}