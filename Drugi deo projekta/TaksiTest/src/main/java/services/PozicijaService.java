package services;

import java.util.List;
import entities.Pozicija;


public interface PozicijaService {

	public void addPozicija(String ataksiid,String alokacijaid);
    public void deletePozicija(String did);
    public List<Pozicija> spisakPozicija();
       
}